package pe.lacafetalab.mooc.students.application.search_all;

import pe.lacafetalab.mooc.students.application.StudentsResponse;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.query.QueryHandler;

@Service
public final class SearchAllStudentsQueryHandler implements QueryHandler<SearchAllStudentsQuery, StudentsResponse> {
    private final AllStudentsSearcher searcher;

    public SearchAllStudentsQueryHandler(AllStudentsSearcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public StudentsResponse handle(SearchAllStudentsQuery query) {
        return searcher.search();
    }
}
