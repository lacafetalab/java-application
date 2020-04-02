package pe.lacafetalab.backoffice.courses.domain;

import pe.lacafetalab.shared.domain.UuidMother;
import pe.lacafetalab.shared.domain.WordMother;

public final class BackofficeCourseMother {
    public static BackofficeCourse create(String id, String name, String duration) {
        return new BackofficeCourse(id, name, duration);
    }

    public static BackofficeCourse create(String name, String duration) {
        return new BackofficeCourse(UuidMother.random(), name, duration);
    }

    public static BackofficeCourse random() {
        return create(UuidMother.random(), WordMother.random(), WordMother.random());
    }
}
