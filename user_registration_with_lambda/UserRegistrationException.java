/**
 * 
 */
package user_registration_with_lambda;

/**
 * @author MD_AFROZ
 *
 */
@SuppressWarnings("serial")
public class UserRegistrationException extends Throwable {

	public ExceptionType exceptionType;
	public String message;

	public enum ExceptionType {
		EMPTY, NULL, INVALID;
	}

	public UserRegistrationException(String message, ExceptionType exceptionType) {
		this.message = message;
		this.exceptionType = exceptionType;
	}

	@Override
	public String toString() {
		return "UserRegistrationException{" + "exceptionType=" + exceptionType + ", message='" + message + '\'' + '}';
	}

}
