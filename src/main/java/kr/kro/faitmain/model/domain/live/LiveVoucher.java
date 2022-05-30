package kr.kro.faitmain.model.domain.live;

import java.util.Date;

import lombok.Data;

@Data
public class LiveVoucher {
	private int voucherNumber;
	private String storeId;
	private Date effectiveDate;
	private Date dueDate;
}
