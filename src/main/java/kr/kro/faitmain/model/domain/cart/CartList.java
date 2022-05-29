package kr.kro.faitmain.model.domain.cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CartList {
    private long storeId;
    private String storeName;
    int cartTotal;
    private int deleveryTip;

    List<Cart> cart;
}
