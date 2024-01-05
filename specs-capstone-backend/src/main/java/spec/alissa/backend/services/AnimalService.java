package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.alissa.backend.models.Animal;
import spec.alissa.backend.repository.AnimalsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalsRepository animalsRepository;
    public List<Animal> getAnimalsBySpecies(String species) {
        List<Animal> animalsList = animalsRepository.findAll();
        List<Animal> animalsBySpecies = new ArrayList<>();

        for (int i = 0; i < animalsList.size(); i++) {
            if (animalsList.get(i).getSpecies_name().equals(species)) {
                animalsBySpecies.add(animalsList.get(i));
            }
        }
        return animalsBySpecies;
    }
}
