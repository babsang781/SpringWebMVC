package kr.smhrd.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {

	private int idx;
	private String title;
	private String writer;
	private String contents;
	private String writingDate;
	private String revisingDate;
	private int	sawCount;
	
}
