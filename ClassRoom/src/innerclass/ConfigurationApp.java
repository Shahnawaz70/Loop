package innerclass;

public class ConfigurationApp {
	public static void main(String[] args) {
        ConfigurationManager.DatabaseConfig.setConfig("jdbc:mysql://localhost:3306/mydb", "admin", "password123");
        System.out.println("Initial Configuration:");
        System.out.println(ConfigurationManager.DatabaseConfig.getConnectionString());

        ConfigurationManager.DatabaseConfig.setConfig("jdbc:postgresql://localhost:5432/newdb", "user", "newpass456");
        System.out.println("\nUpdated Configuration:");
        System.out.println(ConfigurationManager.DatabaseConfig.getConnectionString());
    }
}
