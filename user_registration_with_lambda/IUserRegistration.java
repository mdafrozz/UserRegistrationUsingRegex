/**
 * 
 */
package user_registration_with_lambda;

/**
 * @author MD_AFROZ
 *
 */
@FunctionalInterface
public interface IUserRegistration {

	 boolean validate(String value) throws UserRegistrationException;
}
