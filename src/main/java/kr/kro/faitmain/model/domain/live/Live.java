package kr.kro.faitmain.model.domain.live;

import java.util.List;

import kr.kro.faitmain.model.Product;
import lombok.Data;

@Data
public class Live {
	private int liveNumber;
	private String storeId;
	private String storeName;
	private LiveChat liveChat;
	private SanctionUser sanctionUser;
	private Alarm alarm;
	private List<Product> liveProduct;
	private String liveTitle;
	private String liveInfo;
	private String imageName;
}
