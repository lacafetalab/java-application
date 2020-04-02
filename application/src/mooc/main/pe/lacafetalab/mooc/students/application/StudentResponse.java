package pe.lacafetalab.mooc.students.application;

import pe.lacafetalab.mooc.students.domain.Student;
import pe.lacafetalab.shared.domain.bus.query.Response;

public final class StudentResponse implements Response {
    private final String id;
    private final String name;
    private final String surname;
    private final String email;

    public StudentResponse(String id, String name, String surname, String email) {
        this.id      = id;
        this.name    = name;
        this.surname = surname;
        this.email   = email;
    }

    public static StudentResponse fromAggregate(Student student) {
        return new StudentResponse(student.id().value(), student.name(), student.surname(), student.email());
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public String email() {
        return email;
    }
}
