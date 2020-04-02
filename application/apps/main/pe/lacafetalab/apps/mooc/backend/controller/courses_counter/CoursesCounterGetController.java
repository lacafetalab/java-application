package pe.lacafetalab.apps.mooc.backend.controller.courses_counter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.lacafetalab.mooc.courses_counter.application.find.CoursesCounterResponse;
import pe.lacafetalab.mooc.courses_counter.application.find.FindCoursesCounterQuery;
import pe.lacafetalab.shared.domain.DomainError;
import pe.lacafetalab.shared.domain.bus.command.CommandBus;
import pe.lacafetalab.shared.domain.bus.query.QueryBus;
import pe.lacafetalab.shared.domain.bus.query.QueryHandlerExecutionError;
import pe.lacafetalab.shared.infrastructure.spring.ApiController;

import java.util.HashMap;

@RestController
public final class CoursesCounterGetController extends ApiController {
    public CoursesCounterGetController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @GetMapping("/courses-counter")
    public HashMap<String, Integer> index() throws QueryHandlerExecutionError {
        CoursesCounterResponse response = ask(new FindCoursesCounterQuery());

        return new HashMap<String, Integer>() {{
            put("total", response.total());
        }};
    }

    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() {
        return null;
    }
}
