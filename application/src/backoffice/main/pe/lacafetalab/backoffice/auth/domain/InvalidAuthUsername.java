package pe.lacafetalab.backoffice.auth.domain;

public final class InvalidAuthUsername extends RuntimeException {
    public InvalidAuthUsername(AuthUsername username) {
        super(String.format("The user <%s> does not exist", username.value()));
    }
}
