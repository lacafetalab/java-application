package pe.lacafetalab.mooc.students.infrastructure;

import pe.lacafetalab.mooc.students.domain.Student;
import pe.lacafetalab.mooc.students.domain.StudentRepository;
import pe.lacafetalab.mooc.students.domain.StudentId;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.UuidGenerator;

import java.util.Arrays;
import java.util.List;

@Service
public final class InMemoryStudentRepository implements StudentRepository {
    private UuidGenerator generator;

    public InMemoryStudentRepository(UuidGenerator generator) {
        this.generator = generator;
    }

    @Override
    public List<Student> searchAll() {
        return Arrays.asList(
            new Student(new StudentId(generator.generate()), "name", "surname", "email@mail.com"),
            new Student(new StudentId(generator.generate()), "Other name", "Other surname", "another@mail.com")
        );
    }
}
