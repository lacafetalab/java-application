package pe.lacafetalab.mooc.students.application;

import pe.lacafetalab.mooc.students.domain.StudentId;
import pe.lacafetalab.mooc.students.domain.StudentIdMother;
import pe.lacafetalab.shared.domain.EmailMother;
import pe.lacafetalab.shared.domain.WordMother;

public final class StudentResponseMother {
    public static StudentResponse create(StudentId id, String name, String surname, String email) {
        return new StudentResponse(id.value(), name, surname, email);
    }

    public static StudentResponse random() {
        return create(StudentIdMother.random(), WordMother.random(), WordMother.random(), EmailMother.random());
    }
}
