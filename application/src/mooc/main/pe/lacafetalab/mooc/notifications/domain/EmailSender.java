package pe.lacafetalab.mooc.notifications.domain;

public interface EmailSender {
    void send(Email email);
}
