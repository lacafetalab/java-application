package pe.lacafetalab.mooc.courses.application.find;

import pe.lacafetalab.shared.domain.bus.query.Query;

public final class FindCourseQuery implements Query {
    private final String id;

    public FindCourseQuery(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
