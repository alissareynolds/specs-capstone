package spec.alissa.backend.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import spec.alissa.backend.models.Favorites;

public interface FavoritesRepository extends JpaRepository<Favorites, Integer> {

}
