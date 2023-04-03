public class SignUpDialogBox implements UIMediator {
    private TextBox usernameBox = new TextBox();
    private TextBox passwordBox = new TextBox();
    private CheckBox termsBox = new CheckBox();
    private Button submitButton = new Button();

    public SignUpDialogBox() {
        usernameBox.setContent("");
        passwordBox.setContent("");
        termsBox.setChecked(false);
        submitButton.setEnabled(false);
        usernameBox.attach(this);
        passwordBox.attach(this);
        termsBox.attach(this);
    }

    public void enterUsername(String username) {
        this.usernameBox.setContent(username);
    }

    public void enterPassword(String password) {
        this.passwordBox.setContent(password);
    }

    public void confirmTerms(boolean confirm) {
        this.termsBox.setChecked(confirm);
    }

    public void clickSubmit() {
        System.out.println("Username: " + this.usernameBox.getContent());
        System.out.println("Password: " + this.passwordBox.getContent());
        System.out.println("Terms checked: " + this.termsBox.isChecked());
        if (this.submitButton.isEnabled()) {
            System.out.println("Information submitted successfully!");
        }
        else {
            System.out.println("Signup button disabled.");
        }
    }

    public void notifyMediator(UIControl sender, String event) {
        if ((sender == this.usernameBox || sender == this.passwordBox) && event.length() == 0) {
            this.submitButton.setEnabled(false);
        } else if (sender == this.termsBox && event == "false") {
            this.submitButton.setEnabled(false);
        } else if (this.usernameBox.getContent().length() > 0 && 
                   this.passwordBox.getContent().length() > 0 && 
                   this.termsBox.isChecked()) {
            this.submitButton.setEnabled(true);
        }
    }
}