package massonus.service;

import massonus.entity.Lecture;
import massonus.repositories.LectureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectureService {
    private final LectureRepo lectureRepo;

    @Autowired
    public LectureService(LectureRepo lectureRepo) {
        this.lectureRepo = lectureRepo;
    }

    public void saveLectures(final Lecture lecture) {
        lectureRepo.save(lecture);
    }
    public List<Lecture> findAll() {
        return lectureRepo.findAll();
    }

    public Optional<Lecture> getLectures(final Long id) {
        return lectureRepo.findById(id);
    }

    public void createLecturesBeforeStart(String name, String description) {

       final Lecture lecture = new Lecture();

        lecture.setName(name);
        lecture.setDescription(description);

    }
}

