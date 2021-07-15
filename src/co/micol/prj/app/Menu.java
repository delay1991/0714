package co.micol.prj.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.micol.prj.service.MemberService;
import co.micol.prj.serviceImpl.MemberServiceImpl;
import co.micol.prj.vo.MemberVO;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();

	private void menuTitle() {
		System.out.println("=========================");
		System.out.println("==== 회원정보 관리 시스템 ===");
		System.out.println("====   1.회원 목록 조회 ===");
		System.out.println("====   2.회원 정보 조회 ===");
		System.out.println("====   3.회원 정보 등록 ===");
		System.out.println("====   4.회원 정보 수정 ===");
		System.out.println("====   5.회원 정보 삭제 ===");
		System.out.println("====   6.종        료 ===");
		System.out.println("========================");
		System.out.println("=원하는 작업번호를 선택하세요?=");

	}

	private void mainMenu() {
		int jobNo;
		boolean b = false;

		do {
			menuTitle();
			switch (jobNo = sc.nextInt()) {
			case 1:
				memberSelectList();
				break;
			case 2:
				memberSelect();
				break;
			case 3:
				memberInsert();
				break;
			case 4:
				memberUpdate();
				break;
			case 5:
				memberDelete();
				break;
			case 6:
				b = true;
				System.out.println("== Good Bye!!! ==");
				break;
			}
		} while (!b);
		{

		}
	}

	private void memberUpdate() {
		// 데이터수정
		MemberVO vo = new MemberVO(); 
		System.out.println("변경할 ID입력: ");
		vo.setId(sc.next());sc.nextLine();
		System.out.println("변경할 주소입력: ");
		vo.setAddress(sc.next());sc.nextLine();
		System.out.println("변결할 전화번호: ");
		vo.setTel(sc.next());sc.nextLine();
		System.out.println("변경할 이름: ");
		vo.setName(sc.next());sc.nextLine();
		int n = dao.memberUpdate(vo);
		if (n != 0) {
			System.out.println("정상변경");
		} else {
			System.out.println("변경실패");
		}
		
	}

	private void memberDelete() {
		// 데이터삭제
		MemberVO vo = new MemberVO(); 
		System.out.println("삭제할 ID입력: ");
		vo.setId(sc.next());sc.nextLine();
		int n = dao.memberDelete(vo);
		if (n != 0) {
			System.out.println("정상삭제");
		} else {
			System.out.println("삭제실패");
		}
		
	}

	private void memberInsert() {
		// 한명 데이터 삽입
		MemberVO vo = new MemberVO(); // 컨트롤스페이스 적극활용
		System.out.print("ID입력: ");
		vo.setId(sc.next());
		sc.nextLine(); // 버퍼의 캐리지리턴값지우기
		System.out.print("PASSWORD입력: ");
		vo.setPassword(sc.next());
		sc.nextLine();
		System.out.print("이름입력: ");
		vo.setName(sc.next());
		sc.nextLine();
		System.out.print("주소입력: ");
		vo.setAddress(sc.next());
		sc.nextLine();
		System.out.println("전화번호입력: ");
		vo.setTel(sc.next());
		sc.nextLine();
		System.out.println("나이입력: ");
		vo.setAge(sc.nextInt());

		int n = dao.memberInsert(vo);
		if (n != 0) {
			System.out.println("정상입력");
		} else {
			System.out.println("입력실패");
		}
	}

	private void memberSelect() {
		// 한명 데이터 조회
		MemberVO vo = new MemberVO();
		System.out.println("검색할 ID를 입력하세요.");
		vo.setId(sc.next());
		sc.nextLine();
		vo = dao.memberSelect(vo);
		vo.toString();
	}

	private void memberSelectList() {
		// 회원전체목록 조회
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();
		for (MemberVO member : members) {
			member.toString();
		}

	}

	public void run() {
		mainMenu();
		sc.close();
	}
}
