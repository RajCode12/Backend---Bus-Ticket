package exception;

public class GravityException extends RuntimeException {
	GravityException(String message) {
		System.out.println(message);
	}
}
