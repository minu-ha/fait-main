package kr.kro.faitmain.service.order;

import kr.kro.faitmain.model.dao.order.OrderList;
import kr.kro.faitmain.model.domain.cart.CartList;
import kr.kro.faitmain.model.dto.OrderInfo;
import kr.kro.faitmain.service.login.LoginService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public interface OrderService{

    public String order(CartList cart, OrderInfo info, LoginService user, HttpSession session);

    long orderPriceCheck( CartList cartList );

    // 주문목록
    List< OrderList > orderList( long userId);

    // 주문목록 상세보기
    OrderList orderListDetail(String orderNum);


}
