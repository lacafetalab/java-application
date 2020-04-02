package pe.lacafetalab.backoffice.auth.domain;

import pe.lacafetalab.shared.domain.WordMother;

public final class AuthUsernameMother {
    public static AuthUsername create(String value) {
        return new AuthUsername(value);
    }

    public static AuthUsername random() {
        return create(WordMother.random());
    }
}
