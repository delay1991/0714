package co.micol.prj.vo;

public class MemberVO { //새로운타입으로 내가만든다.
	private String id;
	private String password;
	private String name;
	private String address;
	private String tel;
	private int age;
	
	public MemberVO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		
		System.out.println(id+" : "+password+" : "+name+" : "+address+" : "+tel);
		return null;
	}
	
	
	
}
