package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spec.alissa.backend.models.Animal;
import spec.alissa.backend.repository.AnimalRepository;
import spec.alissa.backend.repository.UserRepository;
import spec.alissa.backend.services.AnimalService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @Autowired
    AnimalRepository animalsRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/animals")
    public List<Animal> getAnimals() {
        return animalsRepository.findAll();
    }

    @GetMapping("/api/animals/profile/{id}")
    public Animal getAnimalById(@PathVariable int id) {
        Optional<Animal> optional = animalsRepository.findById(id);
        return optional.get();
    }

    @GetMapping("/api/species/{species}")
    public List<Animal> getAnimalsBySpecies(@PathVariable String species) {
        return animalService.getAnimalsBySpecies(species);
    }

    @GetMapping("/api/animals/favorite/{userId}")
    public List<Animal> getAllFavoritesByUser(@PathVariable Integer userId) {
        return userRepository.findById(userId).map()
    }

    @PostMapping("/api/animals/favorite/{userId}/{animalId}")
    public Animal addFavoriteAnimal(@PathVariable Integer userId, @PathVariable Integer animalId) {
        return animalService.addAnimalsByUserId(userId, animalId);
    }
}
