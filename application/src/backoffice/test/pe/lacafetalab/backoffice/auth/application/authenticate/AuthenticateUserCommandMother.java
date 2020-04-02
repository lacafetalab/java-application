package pe.lacafetalab.backoffice.auth.application.authenticate;

import pe.lacafetalab.backoffice.auth.domain.AuthPassword;
import pe.lacafetalab.backoffice.auth.domain.AuthPasswordMother;
import pe.lacafetalab.backoffice.auth.domain.AuthUsername;
import pe.lacafetalab.backoffice.auth.domain.AuthUsernameMother;

public final class AuthenticateUserCommandMother {
    public static AuthenticateUserCommand create(AuthUsername username, AuthPassword password) {
        return new AuthenticateUserCommand(username.value(), password.value());
    }

    public static AuthenticateUserCommand random() {
        return create(AuthUsernameMother.random(), AuthPasswordMother.random());
    }
}
