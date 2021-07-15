package co.micol.prj.service; 

import java.util.List;

import co.micol.prj.vo.MemberVO;

public interface MemberService { //질문지
	List<MemberVO> memberSelectList(); 
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
}

