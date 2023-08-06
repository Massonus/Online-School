package massonus.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table (name = "add_materials")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AdditionalMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private Integer lectureId;

    private String video;

    private String book;

    ResourceType resourceType;

    public AdditionalMaterials() {
    }


}
