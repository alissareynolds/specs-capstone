package spec.alissa.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formId;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String streetAddress;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String occupation;
    @Column(nullable = false)
    private String animalName;
    @Column(nullable = false)
    private String animalBreed;
}
