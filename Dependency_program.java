import java.lang.reflect.Constructor;

//service interface
interface MessageService{
    String getMessage();
}

//implementation of message service
class EmailService implements MessageService{
    @Override
    public String getMessage(){
        return "Email Message";
    }
}

//class that depends on the messageservice through constructor injection
class MessageProcessor {
    private final MessageService messageService;

//    Constructor injection
    public MessageProcessor(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMessage(){
        String message = messageService.getMessage();
        System.out.println(message);
    }
}
public class Dependency_program {
    public static void main(String[] args){
//        create an instance of messageservice dependency
        MessageService emailService = new EmailService();
//        injecting the dependency into message processor
        MessageProcessor messageProcessor = new MessageProcessor(emailService);
        messageProcessor.processMessage();
    }
}
