package AppUtils;

public class LoginUtils {
	
	public static UserType authentifyUser(String username, String password) {
		if (username == "admin") {
			return UserType.ADMIN;
		}
		return UserType.CLIENT;
	}
	
	
}
