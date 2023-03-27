package Lv10_clone;

class UserManager{
	// 1. 생성자를 Private으로 정의
		private UserManager() {}
		
	// 2. 클래스 내부에서 new 키워드
	// ㄴ> 단일한 인스턴스를 static 메모리에 생성
		private static UserManager instance = new UserManager();
		
	// 3. public getter 제공 : static 메소드
		public static UserManager getInstance() {
			return instance;
		}
}

public class Day61_ex02_SIngletone_개념 {
	public static void main(String[] args) {
		UserManager usermanager = UserManager.getInstance();
	}
}
