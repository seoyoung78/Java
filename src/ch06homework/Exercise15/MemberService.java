package ch06homework.Exercise15;

public class MemberService {
	boolean login (String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		}
		return false;
	}
	
	void logout (String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}