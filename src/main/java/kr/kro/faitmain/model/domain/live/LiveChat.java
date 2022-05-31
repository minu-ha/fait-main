package kr.kro.faitmain.model.domain.live;

import java.util.Date;

import lombok.Data;

@Data
public class LiveChat {
	private int liveChatNumber;
	private String writer;
	private String chattingMessage;
	private Date sendDate;
}
