package massonus.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "teachers")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    public Teacher() {
    }

    @OneToMany(mappedBy = "teacher",
                    cascade = CascadeType.ALL,
                    orphanRemoval = true)
    @ToString.Exclude
    private List<Student> students = new ArrayList<>();


}
