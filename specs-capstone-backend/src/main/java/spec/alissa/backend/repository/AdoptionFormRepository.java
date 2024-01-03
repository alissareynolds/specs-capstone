package spec.alissa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spec.alissa.backend.models.AdoptionForm;

public interface AdoptionFormRepository extends JpaRepository<AdoptionForm, Long> {
}
