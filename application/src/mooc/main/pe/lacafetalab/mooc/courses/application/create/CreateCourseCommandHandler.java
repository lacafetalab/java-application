package pe.lacafetalab.mooc.courses.application.create;

import pe.lacafetalab.mooc.courses.domain.CourseDuration;
import pe.lacafetalab.mooc.courses.domain.CourseId;
import pe.lacafetalab.mooc.courses.domain.CourseName;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.bus.command.CommandHandler;

@Service
public final class CreateCourseCommandHandler implements CommandHandler<CreateCourseCommand> {
    private final CourseCreator creator;

    public CreateCourseCommandHandler(CourseCreator creator) {
        this.creator = creator;
    }

    @Override
    public void handle(CreateCourseCommand command) {
        CourseId id       = new CourseId(command.id());
        CourseName name     = new CourseName(command.name());
        CourseDuration duration = new CourseDuration(command.duration());

        creator.create(id, name, duration);
    }
}
