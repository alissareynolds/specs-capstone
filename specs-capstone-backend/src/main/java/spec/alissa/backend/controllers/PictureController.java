package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spec.alissa.backend.models.Animal;
import spec.alissa.backend.models.Picture;
import spec.alissa.backend.repository.AnimalRepository;
import spec.alissa.backend.repository.PictureRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class PictureController {

    @Autowired
    PictureRepository picturesRepository;

    @Autowired
    AnimalRepository animalsRepository;

    @GetMapping("/api/pictures/{id}")
    public List<Picture> getAllPictures(@PathVariable Integer id) {
        Optional<Animal> optionalAnimal = animalsRepository.findById(id);
        if (optionalAnimal.isPresent()) {
            return picturesRepository.findByAnimal(optionalAnimal.get());
        }
       return null;
    }
}
