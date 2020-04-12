package logger;

public class Main {
	public static void main(String[] args) {
		ConsoleLogger consoleLogger = new ConsoleLogger();
		FileLogger fileLogger = new FileLogger();
		
		// Dependency Injection
		// Dependency wird von aussen dem Objekt zur Verfügung gestellt.
		LoggerUser loggerUser = new LoggerUser(fileLogger);
		loggerUser.doSomething();
	}
}
