package innerclass;

public class ConfigurationManager {
	static class DatabaseConfig {
		private static String url;
		private static String username;
		private static String password;

		public static void setConfig(String url, String username, String password) {
			DatabaseConfig.url = url;
			DatabaseConfig.username = username;
			DatabaseConfig.password = password;
		}

		public static String getConnectionString() {
			return "URL: " + url + ", Username: " + username + ", Password: " + password;
		}
	}
}
