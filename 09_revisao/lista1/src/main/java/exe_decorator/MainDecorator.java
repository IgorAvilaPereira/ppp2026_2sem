package exe_decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Email email = new Email();
        email.setMensagem("oi");

        // email = new EmailUpper(email);

        // System.out.println(email.getMensagem());

        email = new EmailBold(email);

        System.out.println(email.getMensagem());
    }

}
