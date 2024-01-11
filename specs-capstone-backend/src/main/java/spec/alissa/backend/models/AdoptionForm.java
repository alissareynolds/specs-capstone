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
    @Column(nullable = false)
    private String streetAddress;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String zipCode;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private boolean hasPet;
}
