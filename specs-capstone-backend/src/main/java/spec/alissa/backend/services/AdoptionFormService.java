package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.alissa.backend.models.AdoptionForm;
import spec.alissa.backend.models.User;
import spec.alissa.backend.repository.AdoptionFormRepository;
import spec.alissa.backend.repository.UserRepository;
import spec.alissa.backend.requests.AdoptionFormRequest;

import java.util.Optional;

@Service
public class AdoptionFormService {

    @Autowired
    AdoptionFormRepository adoptionFormRepository;

    @Autowired
    UserRepository usersRepository;

//    public AdoptionForm addAdoptionForm(Integer userId, AdoptionFormRequest adoptionFormRequest) {
//        Optional<User> user = usersRepository.findById(userId);
//        AdoptionForm adoptionForm = new AdoptionForm(null, adoptionFormRequest.getFullName(), adoptionFormRequest.getStreetAddress(),
//                adoptionFormRequest.getPhoneNumber(), adoptionFormRequest.getEmail(), adoptionFormRequest.getOccupation(),
//                adoptionFormRequest.getAnimalName(), adoptionFormRequest.getAnimalBreed());
//        adoptionFormRepository.save(adoptionForm);
//        return adoptionForm;
//    }
}
