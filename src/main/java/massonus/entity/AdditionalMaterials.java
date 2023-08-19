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
public class AdditionalMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "name can not be Blank")
    private String name;

    @NotBlank(message = "lectureId can not be Blank")
    private Integer lectureId;

    @NotBlank(message = "video can not be Blank")
    private String video;

    @NotBlank(message = "Name can not be Blank")
    private String book;

    ResourceType resourceType;

    public AdditionalMaterials() {
    }


}
