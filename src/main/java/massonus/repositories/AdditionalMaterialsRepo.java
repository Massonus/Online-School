package massonus.repositories;

import massonus.entity.AdditionalMaterials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalMaterialsRepo extends JpaRepository<AdditionalMaterials, Long> {

}
