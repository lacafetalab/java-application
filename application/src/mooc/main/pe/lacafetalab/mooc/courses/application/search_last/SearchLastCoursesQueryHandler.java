package pe.lacafetalab.mooc.courses.application.search_last;

import pe.lacafetalab.mooc.courses.application.CoursesResponse;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.query.QueryHandler;

@Service
public final class SearchLastCoursesQueryHandler implements QueryHandler<SearchLastCoursesQuery, CoursesResponse> {
    private final LastCoursesSearcher searcher;

    public SearchLastCoursesQueryHandler(LastCoursesSearcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public CoursesResponse handle(SearchLastCoursesQuery query) {
        return searcher.search(query.total());
    }
}
