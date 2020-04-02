package pe.lacafetalab.mooc.notifications.application.send_new_courses_newsletter;

import pe.lacafetalab.shared.domain.bus.command.Command;

public final class SendNewCoursesNewsletterCommand implements Command {
    private final String id;

    public SendNewCoursesNewsletterCommand(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
