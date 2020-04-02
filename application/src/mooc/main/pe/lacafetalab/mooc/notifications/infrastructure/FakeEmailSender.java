package pe.lacafetalab.mooc.notifications.infrastructure;

import pe.lacafetalab.mooc.notifications.domain.Email;
import pe.lacafetalab.mooc.notifications.domain.EmailSender;
import pe.lacafetalab.shared.domain.Service;

@Service
public final class FakeEmailSender implements EmailSender {
    @Override
    public void send(Email email) {
        // In the future...
    }
}
