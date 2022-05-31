package kr.kro.faitmain.model.domain.live;

import lombok.Data;

@Data
public class Live {
	private int liveNumber;
	private String storeId;
	private String liveTitle;
	private String liveIntro;
	private String liveImage;
	private boolean chattingStatus;
}
