package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spec.alissa.backend.models.Animals;
import spec.alissa.backend.repository.AnimalsRepository;
import spec.alissa.backend.services.AnimalService;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class AnimalsController {

    @Autowired
    AnimalService animalService;

    @Autowired
    AnimalsRepository animalsRepository;

    @GetMapping("/api/animals")
    public List<Animals> getAnimals() {
        return animalsRepository.findAll();
    }

    @GetMapping("/api/animals/{id}")
    public Animals getAnimalById(@PathVariable int id) {
        Optional<Animals> optional = animalsRepository.findById(id);
        return optional.get();
    }

    @GetMapping("/api/species/{species}")
    public List<Animals> getAnimalsBySpecies(@PathVariable String species) {
        return animalService.getAnimalsBySpecies(species);
    }
}
