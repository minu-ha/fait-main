package kr.kro.faitmain.model.domain.live;

import java.util.Date;

import lombok.Data;

@Data
public class Alarm {
	private int alarmNumber;
	private String userId;
	private Date alarmDate;
	private String storeName;
	
}
