package kr.kro.faitmain.model.domain.live;

import kr.kro.faitmain.model.Product;
import lombok.Data;

@Data
public class LiveProductList {
	private int liveProductNumber;
	private int liveNumber;
	private int liveReservationNumber;
	private Product liveProduct;
}
