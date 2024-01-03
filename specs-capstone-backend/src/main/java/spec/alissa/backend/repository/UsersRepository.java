package spec.alissa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spec.alissa.backend.models.Users;

import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByUsername(String username);
}
