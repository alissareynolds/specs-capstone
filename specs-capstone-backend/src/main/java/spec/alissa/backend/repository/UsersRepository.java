package spec.alissa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spec.alissa.backend.models.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
