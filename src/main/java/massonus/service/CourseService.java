package massonus.service;

import massonus.repositories.CourseRepo;
import massonus.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public void saveCourse(final Course course) {
        courseRepo.save(course);
    }

    public List<Course> findAll() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourse(final Long id) {
        return courseRepo.findById(id);
    }

    public void createCoursesBeforeStart(String name, Integer value) {

            final Course course = new Course();

            course.setName(name);
            course.setValue(value);

            courseRepo.save(course);

    }


}
