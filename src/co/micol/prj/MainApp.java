package co.micol.prj;

import co.micol.prj.app.Menu;

public class MainApp {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.run();
		
//		MemberService dao = new MemberServiceImpl();// dao역활
//		List<MemberVO> list = new ArrayList<MemberVO>();
//
//		list = dao.memberSelectList(); //전체리스트
//		MemberVO vo = new MemberVO(); //한라인뽑아오기
//		vo.setId("park2"); //어플리케이션에서는 오토커밋
//		
//		
//		vo.setPassword("4321");
//		vo.setName("박차고가자");
//		vo.setAddress("둘리시에 사는 가수");
//		vo.setTel("010");
//		vo.setAge(21);
//		
//		int n = dao.memberDelete(vo);
//		if(n != 0) {
//			System.out.println("정상적으로 수정");
//		}else {
//			System.out.println("실패");
//		}
//		
//		
//		vo = dao.memberSelect(vo);
//		
//		System.out.println(vo.toString());
//
//		for (MemberVO vo : list) {
//			vo.toString();
//		}
	}

}
