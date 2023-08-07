package massonus.service;

import massonus.repositories.TeacherRepo;
import massonus.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepo teacherRepo;

    @Autowired
    public TeacherService(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void saveTeachers(final Teacher teacher) {
        teacherRepo.save(teacher);
    }
    public List<Teacher> findAll() {
        return teacherRepo.findAll();
    }

    public Optional<Teacher> getTeachers(final Long id) {
        return teacherRepo.findById(id);
    }

    public void createTeachersBeforeStart(String firstName, String lastName) {

        final Teacher teacher = new Teacher();

        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);

    }
}
