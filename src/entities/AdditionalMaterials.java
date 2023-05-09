package entities;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class AdditionalMaterials implements Comparator<AdditionalMaterials>, Serializable{

    private Integer id;

    private String name;

    private Integer lectureId;

    ResourceType resourceType;

    public AdditionalMaterials() {
    }

    public AdditionalMaterials(Integer id, String name, Integer lectureId, ResourceType resourceType) {
        this.id = id;
        this.name = name;
        this.lectureId = lectureId;
        this.resourceType = resourceType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lectureId=" + lectureId +
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
