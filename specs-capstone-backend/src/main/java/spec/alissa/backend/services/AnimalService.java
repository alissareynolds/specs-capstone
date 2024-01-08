package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.alissa.backend.models.Animal;
import spec.alissa.backend.models.User;
import spec.alissa.backend.repository.AnimalsRepository;
import spec.alissa.backend.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    AnimalsRepository animalsRepository;

    @Autowired
    UsersRepository usersRepository;

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

    public List<Animal> getAllAnimalsByUser(Integer userId) {
        Optional<User> optionalUser = usersRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return user.getAnimals();
        }
        return null;
    }

    public Animal addAnimalsByUserId(Integer userId, Integer animalId) {
        Optional<User> optionalUser = usersRepository.findById(userId);
        Optional<Animal> optionalAnimal = animalsRepository.findById(animalId);
        if (optionalAnimal.isPresent() && optionalUser.isPresent()) {
            User user = optionalUser.get();
            Animal animal = optionalAnimal.get();
            user.getAnimals().add(animal);
            usersRepository.save(user);
            return animal;
        }
        return null;
    }
}
