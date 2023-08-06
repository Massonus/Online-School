package massonus.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String courseId;

    private Role role;

    private String firstname;

    private String lastname;

    private String phone;

    private String email;

    public Person() {
    }
}

