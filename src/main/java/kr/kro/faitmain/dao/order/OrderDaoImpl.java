package kr.kro.faitmain.dao.order;

import kr.kro.faitmain.domain.cart.Cart;
import kr.kro.faitmain.domain.order.OrderDetail;
import kr.kro.faitmain.dto.OrderInfo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDaoImpl implements OrderDao{
    @Autowired
    private SqlSession sql;

    @Override
    public void order( OrderInfo info) {
        sql.insert("order.order", info);
    }

    @Override
    public void orderDetail( OrderDetail[] detail, long userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("detail", detail);
        sql.insert("order.orderDetail", map);
    }


    @Override
    public int getDeleveryTip(long storeId) {
        return sql.selectOne("order.getDeleveryTip", storeId);
    }

    @Override
    public List<Integer> foodPriceList(List<Cart> cartList) {
        return sql.selectList("order.foodPriceList", cartList);
    }

    @Override
    public List<Integer> optionPriceList(List<Cart> cart) {
        return sql.selectList("order.optionPriceList", cart);
    }

    @Override
    public List<OrderList> orderList(long userId) {
        return sql.selectList("order.orderList", userId);
    }

    @Override
    public OrderList orderListDetail(String orderNum) {
        return sql.selectOne("order.orderListDetail", orderNum);
    }

}
