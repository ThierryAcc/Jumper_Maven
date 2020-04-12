package logger;

public class LoggerUser {
	// Abhängigkeit
	LoggerInterface loggerInterface;

	public LoggerUser(LoggerInterface loggerInterface) {
		this.loggerInterface = loggerInterface;
	}
	
	public void doSomething() {
		loggerInterface.print("doSomething was called.");
	}

}
