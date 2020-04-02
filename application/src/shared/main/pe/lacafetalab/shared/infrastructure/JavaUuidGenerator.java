package pe.lacafetalab.shared.infrastructure;

import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.UuidGenerator;

import java.util.UUID;

@Service
public final class JavaUuidGenerator implements UuidGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
