package pe.lacafetalab.mooc.students.application.search_all;

import pe.lacafetalab.mooc.students.domain.StudentRepository;
import pe.lacafetalab.mooc.students.application.StudentResponse;
import pe.lacafetalab.mooc.students.application.StudentsResponse;
import pe.lacafetalab.shared.domain.Service;

import java.util.stream.Collectors;

@Service
public final class AllStudentsSearcher {
    private final StudentRepository repository;

    public AllStudentsSearcher(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentsResponse search() {
        return new StudentsResponse(
            repository.searchAll().stream().map(StudentResponse::fromAggregate).collect(Collectors.toList())
        );
    }
}
