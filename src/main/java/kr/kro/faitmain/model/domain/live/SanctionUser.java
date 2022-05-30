package kr.kro.faitmain.model.domain.live;

import java.util.Date;

import lombok.Data;

@Data
public class SanctionUser {
	private int sanctionNumber;
	private String userId;
	private String userNickname;
	private Date registerDate;
	private String sanctionDetail;
	private char sancCondition;
}
