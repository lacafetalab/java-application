package pe.lacafetalab.backoffice.auth.infrastructure.persistence;

import pe.lacafetalab.backoffice.auth.domain.AuthPassword;
import pe.lacafetalab.backoffice.auth.domain.AuthRepository;
import pe.lacafetalab.backoffice.auth.domain.AuthUser;
import pe.lacafetalab.backoffice.auth.domain.AuthUsername;
import pe.lacafetalab.shared.domain.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public final class InMemoryAuthRepository implements AuthRepository {
    private final HashMap<AuthUsername, AuthPassword> users = new HashMap<AuthUsername, AuthPassword>() {{
        put(new AuthUsername("javi"), new AuthPassword("barbitas"));
        put(new AuthUsername("rafa"), new AuthPassword("pelazo"));
    }};

    @Override
    public Optional<AuthUser> search(AuthUsername username) {
        return users.containsKey(username)
            ? Optional.of(new AuthUser(username, users.get(username)))
            : Optional.empty();
    }
}
