package pe.lacafetalab.mooc.courses.application.find;

import pe.lacafetalab.mooc.courses.domain.CourseId;
import pe.lacafetalab.mooc.courses.domain.CourseNotExist;
import pe.lacafetalab.mooc.courses.application.CourseResponse;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.query.QueryHandler;

@Service
public final class FindCourseQueryHandler implements QueryHandler<FindCourseQuery, CourseResponse> {
    private final CourseFinder finder;

    public FindCourseQueryHandler(CourseFinder finder) {
        this.finder = finder;
    }

    @Override
    public CourseResponse handle(FindCourseQuery query) throws CourseNotExist {
        return finder.find(new CourseId(query.id()));
    }
}
