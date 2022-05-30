package kr.kro.faitmain.model.domain.live;

import java.util.Date;

import lombok.Data;

@Data
public class LiveChat {
	private int liveChatNumber;
	private String userId;
	private String userNickname;
	private String message;
	private Date registerDate; 
}
