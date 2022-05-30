package kr.kro.faitmain.mapper;

import kr.kro.faitmain.model.domain.order.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper{

    void insertOrder( Order order );
}
