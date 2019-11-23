package pl.piotrlenar.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotBlank
    private User user;

    @ManyToOne
    @NotBlank
    private Tweet tweet;

    @NotBlank
    private LocalDateTime created;

    @Max(60)
    @NotBlank
    private String text;

    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
    }
}
