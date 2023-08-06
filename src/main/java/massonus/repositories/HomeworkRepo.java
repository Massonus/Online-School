package massonus.repositories;

import massonus.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkRepo extends JpaRepository<Homework, Long> {

}
