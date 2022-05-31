package kr.kro.faitmain.model.domain.live;

import java.util.Date;

import lombok.Data;

@Data
public class LiveReservation {
	private int liveReservationNumber;
	private String storeId;
	private Date reservationDate;
}
