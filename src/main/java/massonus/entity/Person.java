package massonus.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "courseId can not be Blank")
    private String courseId;

    private Role role;

    @NotBlank(message = "firstname can not be Blank")
    private String firstname;

    @NotBlank(message = "lastname can not be Blank")
    private String lastname;

    @NotBlank(message = "phone can not be Blank")
    private String phone;

    @NotBlank(message = "email can not be Blank")
    private String email;

    public Person() {
    }
}

