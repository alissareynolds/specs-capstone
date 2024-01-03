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

    private String fullName;
    private String streetAddress;
    private String phoneNumber;
    private String email;
    private String occupation;
    private String animalName;
    private String animalBreed;
}
