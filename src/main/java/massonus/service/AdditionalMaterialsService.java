package massonus.service;

import massonus.entity.AdditionalMaterials;
import massonus.repositories.AdditionalMaterialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdditionalMaterialsService {

    private final AdditionalMaterialsRepo additionalMaterialsRepo;

    @Autowired
    public AdditionalMaterialsService(AdditionalMaterialsRepo additionalMaterialsRepo) {
        this.additionalMaterialsRepo = additionalMaterialsRepo;
    }

    public void saveMaterials(final AdditionalMaterials additionalMaterials) {
        additionalMaterialsRepo.save(additionalMaterials);
    }
    public List<AdditionalMaterials> findAll() {
        return additionalMaterialsRepo.findAll();
    }

    public Optional<AdditionalMaterials> getMaterials(final Long id) {
        return additionalMaterialsRepo.findById(id);
    }

    public void createMaterialsBeforeStart(String name, Integer lectureId, String video, String book) {

            final AdditionalMaterials additionalMaterials = new AdditionalMaterials();

            additionalMaterials.setName(name);
            additionalMaterials.setLectureId(lectureId);
            additionalMaterials.setVideo(video);
            additionalMaterials.setBook(book);

            additionalMaterialsRepo.save(additionalMaterials);

    }



}
