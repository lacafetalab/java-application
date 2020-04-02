package pe.lacafetalab.backoffice.auth.application.authenticate;

import pe.lacafetalab.backoffice.auth.domain.AuthPassword;
import pe.lacafetalab.backoffice.auth.domain.AuthUsername;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.command.CommandHandler;

@Service
public final class AuthenticateUserCommandHandler implements CommandHandler<AuthenticateUserCommand> {
    private final UserAuthenticator authenticator;

    public AuthenticateUserCommandHandler(UserAuthenticator authenticator) {
        this.authenticator = authenticator;
    }

    @Override
    public void handle(AuthenticateUserCommand command) {
        AuthUsername username = new AuthUsername(command.username());
        AuthPassword password = new AuthPassword(command.password());

        authenticator.authenticate(username, password);
    }
}
