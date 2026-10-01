package exe_decorator;

public class EmailUpper extends EmailDecorator {

    public EmailUpper(Email email) {
        super(email);
    }

    @Override
    public String getMensagem() {
        return this.email.getMensagem().toUpperCase();
    }

}
