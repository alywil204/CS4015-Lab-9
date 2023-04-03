public class Demo {
    public static void main(String[] args) {
        SignUpDialogBox dialog = new SignUpDialogBox();
        dialog.clickSubmit();

        dialog.enterUsername("user");
        dialog.enterPassword("pass");
        dialog.confirmTerms(true);
        dialog.clickSubmit();

        dialog.enterUsername("");
        dialog.clickSubmit();
        dialog.enterUsername("user");

        dialog.enterPassword("");
        dialog.clickSubmit();
        dialog.enterPassword("pass");

        dialog.confirmTerms(false);
        dialog.clickSubmit();
        dialog.confirmTerms(true);

        dialog.enterUsername("");
        dialog.enterPassword("");
        dialog.clickSubmit();
        dialog.enterUsername("user");
        dialog.enterPassword("pass");

        dialog.clickSubmit();
    }
}