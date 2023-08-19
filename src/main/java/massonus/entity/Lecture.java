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
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "task can not be Blank")
    private String name;

    @NotBlank(message = "task can not be Blank")
    private String description;

    public Lecture() {
    }
}
