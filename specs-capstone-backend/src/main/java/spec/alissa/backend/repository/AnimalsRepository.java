package spec.alissa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spec.alissa.backend.models.Animals;

public interface AnimalsRepository extends JpaRepository<Animals, Integer> {

}
