package pl.piotrlenar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrlenar.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
