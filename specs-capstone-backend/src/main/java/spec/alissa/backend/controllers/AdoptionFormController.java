package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spec.alissa.backend.models.AdoptionForm;
import spec.alissa.backend.models.User;
import spec.alissa.backend.repository.AdoptionFormRepository;
import spec.alissa.backend.repository.UserRepository;
import spec.alissa.backend.requests.AdoptionFormRequest;
import spec.alissa.backend.services.AdoptionFormService;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class AdoptionFormController {

    @Autowired
    AdoptionFormRepository adoptionFormRepository;

    @Autowired
    UserRepository usersRepository;

    @Autowired
    AdoptionFormService adoptionFormService;

    @GetMapping("/api/adoption-form/{id}")
    public Optional<AdoptionForm> getAdoptionForm(@PathVariable Long id) {
        return adoptionFormRepository.findById(id);
    }

    @PostMapping("/api/adoption-form/add/{userId}")
    public AdoptionForm postAdoptionForm(@PathVariable Integer userId, @RequestBody AdoptionFormRequest adoptionFormRequest) {
        Optional<User> user = usersRepository.findById(userId);
        if (user.isPresent()) {
            return adoptionFormService.addAdoptionForm(userId, adoptionFormRequest);
        }
        return null;
    }
}
