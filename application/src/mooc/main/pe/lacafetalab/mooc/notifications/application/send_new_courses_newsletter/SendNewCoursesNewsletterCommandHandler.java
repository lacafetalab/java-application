package pe.lacafetalab.mooc.notifications.application.send_new_courses_newsletter;

import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.command.CommandHandler;

@Service
public final class SendNewCoursesNewsletterCommandHandler implements CommandHandler<SendNewCoursesNewsletterCommand> {
    private final NewCoursesNewsletterSender sender;

    public SendNewCoursesNewsletterCommandHandler(NewCoursesNewsletterSender sender) {
        this.sender = sender;
    }

    @Override
    public void handle(SendNewCoursesNewsletterCommand command) {
        sender.send();
    }
}
