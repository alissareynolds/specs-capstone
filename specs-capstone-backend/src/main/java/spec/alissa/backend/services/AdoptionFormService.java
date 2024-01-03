package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.alissa.backend.models.AdoptionForm;
import spec.alissa.backend.models.Users;
import spec.alissa.backend.repository.AdoptionFormRepository;
import spec.alissa.backend.repository.UsersRepository;
import spec.alissa.backend.requests.AdoptionFormRequest;

import java.util.Optional;

@Service
public class AdoptionFormService {

    @Autowired
    AdoptionFormRepository adoptionFormRepository;

    @Autowired
    UsersRepository usersRepository;

    public AdoptionForm addAdoptionForm(Integer userId, AdoptionFormRequest adoptionFormRequest) {
        Optional<Users> user = usersRepository.findById(userId);
        AdoptionForm adoptionForm = new AdoptionForm(null, adoptionFormRequest.getFullName(), adoptionFormRequest.getStreetAddress(),
                adoptionFormRequest.getPhoneNumber(), adoptionFormRequest.getEmail(), adoptionFormRequest.getOccupation(),
                adoptionFormRequest.getAnimalName(), adoptionFormRequest.getAnimalBreed());
        adoptionFormRepository.save(adoptionForm);
        return adoptionForm;
    }
}
