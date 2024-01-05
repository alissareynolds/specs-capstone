package spec.alissa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spec.alissa.backend.models.Animal;

public interface AnimalsRepository extends JpaRepository<Animal, Integer> {

}
