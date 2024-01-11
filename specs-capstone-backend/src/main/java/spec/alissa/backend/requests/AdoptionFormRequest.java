package spec.alissa.backend.requests;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionFormRequest {

    private String animalName;
    private String animalBreed;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String birthdate;
    private String occupation;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private boolean hasPet;

}
