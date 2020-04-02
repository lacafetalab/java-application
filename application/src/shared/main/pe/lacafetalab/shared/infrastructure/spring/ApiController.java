package pe.lacafetalab.shared.infrastructure.spring;

import org.springframework.http.HttpStatus;
import pe.lacafetalab.shared.domain.DomainError;
import pe.lacafetalab.shared.domain.bus.command.Command;
import pe.lacafetalab.shared.domain.bus.command.CommandBus;
import pe.lacafetalab.shared.domain.bus.command.CommandHandlerExecutionError;
import pe.lacafetalab.shared.domain.bus.query.Query;
import pe.lacafetalab.shared.domain.bus.query.QueryBus;
import pe.lacafetalab.shared.domain.bus.query.QueryHandlerExecutionError;

import java.util.HashMap;

public abstract class ApiController {
    private final QueryBus   queryBus;
    private final CommandBus commandBus;

    public ApiController(QueryBus queryBus, CommandBus commandBus) {
        this.queryBus   = queryBus;
        this.commandBus = commandBus;
    }

    protected void dispatch(Command command) throws CommandHandlerExecutionError {
        commandBus.dispatch(command);
    }

    protected <R> R ask(Query query) throws QueryHandlerExecutionError {
        return queryBus.ask(query);
    }

    abstract public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping();
}
