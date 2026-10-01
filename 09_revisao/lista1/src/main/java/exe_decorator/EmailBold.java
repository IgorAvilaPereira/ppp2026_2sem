package exe_decorator;

public class EmailBold extends EmailDecorator {

    public EmailBold(Email email) {
        super(email);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getMensagem() {
        return "<b>"+this.email.getMensagem()+"</b>";
        
    }

}
