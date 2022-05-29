package kr.kro.faitmain.service.order;

import com.google.gson.Gson;
import kr.kro.faitmain.dao.admin.AdminDao;
import kr.kro.faitmain.dao.order.OrderDao;
import kr.kro.faitmain.domain.cart.Cart;
import kr.kro.faitmain.domain.cart.CartList;
import kr.kro.faitmain.domain.order.OrderDetail;
import kr.kro.faitmain.dto.OrderInfo;
import kr.kro.faitmain.service.login.LoginService;
import kr.kro.faitmain.util.UserInfoSessionUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;


    @Transactional
    @Override
    public long orderPriceCheck( CartList cartList ){

        System.out.println( "cartDetail = " + cartList );

        List< Cart > cart = cartList.getCart();
        List< Integer > foodPriceList = orderDao.foodPriceList( cart );
        List< Integer > optionPriceList = orderDao.optionPriceList( cart );
        int deleveryTip = orderDao.getDeleveryTip( cartList.getStoreId() );
        System.out.println( "foodPriceList = " + foodPriceList );
        System.out.println( "optionPriceList = " + optionPriceList );

        int sum = 0;

        for ( int i = 0; i < cart.size(); i++ ) {
            int foodPrice = foodPriceList.get( i );
            int amount = cart.get( i ).getAmount();
            int optionPrice = optionPriceList.get( i );

            sum += ( foodPrice + optionPrice ) * amount;
        }

        return sum + deleveryTip;
    }

    @Transactional
    @Override
    public String order(CartList cart, OrderInfo info, LoginService user, HttpSession session) {
        Gson gson = new Gson();

        System.out.println("info = " + info);

        int total = cart.getCartTotal();

        info.setStoreId(cart.getStoreId());
        info.setTotalPrice(total);

        long userId = 0;
        if (user != null) {
            userId = user.getUser().getId();
            info.setUserId(userId);
        }

        List<Cart> cartList = cart.getCart();

        OrderDetail[] detail = new OrderDetail[cartList.size()];


        for(int i=0;i<detail.length;i++) {
            String cartJSON = gson.toJson(cartList.get(i));
            detail[i] = new OrderDetail(info.getOrderNum(), cartJSON);
        }

        orderDao.order(info);
        orderDao.orderDetail(detail, userId);

        // 회원 포인트 적립
        if (user != null) {
            String storeName = cart.getStoreName();
            int point = (int)(total * 0.01);
            int result = AdminDao.pointUpdate(userId, storeName, point);
            if(result == 1) {
                UserInfoSessionUpdate.sessionUpdate(point+"", "point", user, session);
            }
        }

        // 로그인 사용자가 포인트 사용했을때
        if(info.getUsedPoint() != 0 ) {
            String storeName =  cart.getStoreName();
            int usedPoint =  -info.getUsedPoint();
            int result = AdminDao.pointUpdate(userId, storeName, usedPoint);

            if(result == 1) {
                UserInfoSessionUpdate.sessionUpdate(usedPoint+"", "point", user, session);
            }
        }



        return null;
    }

    @Override
    public List<OrderList> orderList(long userId) {
        return orderDao.orderList(userId);
    }

    @Override
    public OrderList orderListDetail(String orderNum) {
        return orderDao.orderListDetail(orderNum);
    }


}
