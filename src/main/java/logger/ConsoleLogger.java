package logger;

public class ConsoleLogger implements LoggerInterface {
	@Override
	public void print(String msg) {
		System.out.println(msg);
	}
}
