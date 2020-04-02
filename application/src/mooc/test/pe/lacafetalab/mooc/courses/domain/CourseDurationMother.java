package pe.lacafetalab.mooc.courses.domain;

import pe.lacafetalab.shared.domain.IntegerMother;
import pe.lacafetalab.shared.domain.RandomElementPicker;

public final class CourseDurationMother {
    public static CourseDuration create(String value) {
        return new CourseDuration(value);
    }

    public static CourseDuration random() {
        return create(
            String.format(
                "%s %s",
                IntegerMother.random(),
                RandomElementPicker.from("months", "years", "days", "hours", "minutes", "seconds")
            )
        );
    }
}
