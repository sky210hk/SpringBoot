package com.coding404.myweb.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductVO {

	
	private Integer prod_id;//Pk이면서 자동증가값
	private LocalDateTime prod_regdate;//디폴트로 현재시간이 들어가게 설정을 해놔서 신경 안써도 오늘날짜ㅏ가 들어감
	private String  prod_enddate;
	private String  prod_category;
	private String  prod_writer;
	private String  prod_name;
	private Integer prod_price;
	private Integer prod_count;
	private Integer prod_discount;
	private String  prod_purchase_yn;
	private String  prod_content;
	private String  prod_comment;
}
