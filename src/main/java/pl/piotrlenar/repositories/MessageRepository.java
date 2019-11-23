package pl.piotrlenar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrlenar.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
