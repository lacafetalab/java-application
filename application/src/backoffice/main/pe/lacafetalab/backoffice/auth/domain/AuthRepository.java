package pe.lacafetalab.backoffice.auth.domain;

import java.util.Optional;

public interface AuthRepository {
    Optional<AuthUser> search(AuthUsername username);
}
