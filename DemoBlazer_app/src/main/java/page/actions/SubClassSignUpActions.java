package page.actions;

public class SubClassSignUpActions extends SignUpActions {
	
	@Override
	public void SignUpLink() {

		signUpLocators.SignUpLink.click();

	}
	@Override
	public void EnterUserName(String UsernameFromDataTable) {

		signUpLocators.EnterUsername.sendKeys(UsernameFromDataTable);

	}
	@Override
	public void EnterPassword (String PasswordFromDataTable) {

		signUpLocators.EnterPassword.sendKeys(PasswordFromDataTable);

	}
	@Override
	public void ClickSignUp () {

		signUpLocators.ClickSignUp.click();

	}
	@Override
	public void EnterUserNameBlank() {

		signUpLocators.EnterUsername.clear();;

	}
	@Override
	public void EnterPasswordBlank () {

		signUpLocators.EnterPassword.clear();;

	}

}
