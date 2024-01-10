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
    private String animalName;
    @Column(nullable = false)
    private String animalBreed;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String email;
    private String birthdate;
    @Column(nullable = false)
    private String occupation;
    private String streetAddress;


    public AdoptionForm(Object o, String animalName, String animalBreed, String fullName, String phoneNumber, String email, String occupation, String streetAddress) {
    }
}
