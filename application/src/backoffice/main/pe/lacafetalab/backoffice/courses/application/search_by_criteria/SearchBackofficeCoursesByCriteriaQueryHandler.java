package pe.lacafetalab.backoffice.courses.application.search_by_criteria;

import pe.lacafetalab.backoffice.courses.application.BackofficeCoursesResponse;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.query.QueryHandler;
import pe.lacafetalab.shared.domain.criteria.Filters;
import pe.lacafetalab.shared.domain.criteria.Order;

@Service
public final class SearchBackofficeCoursesByCriteriaQueryHandler implements QueryHandler<SearchBackofficeCoursesByCriteriaQuery, BackofficeCoursesResponse> {
    private final BackofficeCoursesByCriteriaSearcher searcher;

    public SearchBackofficeCoursesByCriteriaQueryHandler(BackofficeCoursesByCriteriaSearcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public BackofficeCoursesResponse handle(SearchBackofficeCoursesByCriteriaQuery query) {
        Filters filters = Filters.fromValues(query.filters());
        Order   order   = Order.fromValues(query.orderBy(), query.orderType());

        return searcher.search(filters, order, query.limit(), query.offset());
    }
}
