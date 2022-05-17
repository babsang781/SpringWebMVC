package kr.smhrd.web1;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.smhrd.dao.*;

@Controller
public class BoardController {
	
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		
		BoardVO vo1 = new BoardVO(1, "첫트", "1인", "1111111111", "2022-05-16", "2022-05-16", 0);
		BoardVO vo2 = new BoardVO(2, "콩", "2인자", "콜 까지마!!", "2022-05-16", "2022-05-16", 0);
		BoardVO vo3 = new BoardVO(3, "3트 입니다.", "남바 쓰리", "333333", "2022-05-16", "2022-05-16", 0);
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		
		// RequestDispatcher -> forward()
		model.addAttribute("list", list); // 객체 바인딩 (특정 메모리에  객체를 연결하는 기술)
		
		return "boardList"; //test9
	}

}
