package massonus.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Homework {

    public static LocalDateTime deadline = LocalDateTime.now().plusHours(19);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "task can not be Blank")
    private String task;
    public Homework() {
    }

}


