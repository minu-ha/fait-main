package kr.kro.faitmain.dao.order;

import kr.kro.faitmain.domain.cart.Cart;
import kr.kro.faitmain.domain.order.OrderDetail;
import kr.kro.faitmain.dto.OrderInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDao{

    // 주문 정보 입력
    void order( OrderInfo info);

    // 주문 상세정보 입력
    void orderDetail( OrderDetail[] detail, long userId);


    // 메뉴 총합가격 계산시 배달팁 가져오기
    int getDeleveryTip(long storeId);

    //	메뉴 총합가격 계산시 음식가격
    List<Integer> foodPriceList( List<Cart> cartList);

    //	메뉴 총합가격 계산시 음식 추가 옵션가격
    List<Integer> optionPriceList(List< Cart > cart);

    List<OrderList> orderList(long userId);

    // 주문목록 상세보기 페이지
    OrderList orderListDetail(String orderNum);

}
