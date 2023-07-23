package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
@Entity
@Table (name = "aMaterials")
@Data
public class AdditionalMaterials implements Comparator<AdditionalMaterials>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer lectureId;

    private String url;

    private String video;

    private String book;

    ResourceType resourceType;

    private Lecture lecture;

    public AdditionalMaterials() {
    }

    public AdditionalMaterials(Integer id, String name, Integer lectureId, ResourceType resourceType, Lecture lecture) {
        this.id = id;
        this.name = name;
        this.lectureId = lectureId;
        this.resourceType = resourceType;
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lectureId=" + lectureId +
                ", url='" + url + '\'' +
                ", video='" + video + '\'' +
                ", book='" + book + '\'' +
                ", resourceType=" + resourceType +
                ", lecture=" + lecture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalMaterials that = (AdditionalMaterials) o;
        return id.equals(that.id) && name.equals(that.name) && lectureId.equals(that.lectureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lectureId);
    }

    @Override
    public int compare(AdditionalMaterials o1, AdditionalMaterials o2) {
        return this.name.compareTo(o1.name);
    }


}
