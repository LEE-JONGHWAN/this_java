package verify.exam14;

public class MemberServiceGood {
	public boolean login(String id, String password) {
		if("hong".equals(id) && "12345".equals(password)) {
			return true;
		} else {
			return false;
		}
	}		
		public void logout(String id) {
			System.out.println(id + "로그아웃되었습니다.");
	}
}
