package massonus.service;

import massonus.repositories.PersonRepo;
import massonus.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePersons(final Person person) {
        personRepo.save(person);
    }
    public List<Person> findAll() {
        return personRepo.findAll();
    }

    public Optional<Person> getPersons(final Long id) {
        return personRepo.findById(id);
    }

    public void createPersonsBeforeStart(String firstName, String lastName, String phone) {

        final Person person = new Person();

        person.setFirstname(firstName);
        person.setLastname(lastName);
        person.setPhone(phone);

    }
}
