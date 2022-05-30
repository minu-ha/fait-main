package kr.kro.faitmain.model.domain.live;

import lombok.Data;

@Data
public class LiveBook {
	private int bookNo;
	private String storeId;
	private String storeName;
	private int productNumber;
	private String productName;
	private String liveImage;
	private String storeLogo;
	private String liveTitle;
	private String liveDetail;
}
