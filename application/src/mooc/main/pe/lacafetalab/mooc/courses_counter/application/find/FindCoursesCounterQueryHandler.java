package pe.lacafetalab.mooc.courses_counter.application.find;

import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.query.QueryHandler;

@Service
public final class FindCoursesCounterQueryHandler implements QueryHandler<FindCoursesCounterQuery, CoursesCounterResponse> {
    private final CoursesCounterFinder finder;

    public FindCoursesCounterQueryHandler(CoursesCounterFinder finder) {
        this.finder = finder;
    }

    @Override
    public CoursesCounterResponse handle(FindCoursesCounterQuery query) {
        return finder.find();
    }
}
