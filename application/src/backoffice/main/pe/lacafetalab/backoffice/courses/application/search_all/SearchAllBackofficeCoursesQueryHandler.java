package pe.lacafetalab.backoffice.courses.application.search_all;

import pe.lacafetalab.backoffice.courses.application.BackofficeCoursesResponse;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.query.QueryHandler;

@Service
public final class SearchAllBackofficeCoursesQueryHandler implements QueryHandler<SearchAllBackofficeCoursesQuery, BackofficeCoursesResponse> {
    private final AllBackofficeCoursesSearcher searcher;

    public SearchAllBackofficeCoursesQueryHandler(AllBackofficeCoursesSearcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public BackofficeCoursesResponse handle(SearchAllBackofficeCoursesQuery query) {
        return searcher.search();
    }
}
