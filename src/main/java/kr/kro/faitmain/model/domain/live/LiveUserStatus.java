package kr.kro.faitmain.model.domain.live;

import lombok.Data;

@Data
public class LiveUserStatus {
	private int liveNumer;
	private String id;
	private boolean alarmStatus;
	private boolean kickStatus;
	private boolean dumbStatus;
}
