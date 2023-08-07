package massonus.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
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

    private String task;
    public Homework() {
    }

}


