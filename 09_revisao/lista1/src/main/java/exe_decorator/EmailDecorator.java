package exe_decorator;

public abstract class EmailDecorator extends Email {
    protected Email email;

    public EmailDecorator(Email email) {
        this.email = email;
    }

    public abstract String getMensagem();


}
