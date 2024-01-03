package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import spec.alissa.backend.exceptions.AnimalDoesNotExistException;
import spec.alissa.backend.models.Animals;
import spec.alissa.backend.models.Favorites;
import spec.alissa.backend.repository.AnimalsRepository;
import spec.alissa.backend.repository.FavoritesRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class FavoritesController {

    @Autowired
    AnimalsRepository animalsRepository;

    @Autowired
    FavoritesRepository favoritesRepository;

    @GetMapping("/api/favorites")
    public List<Favorites> getFavorites() {
        return favoritesRepository.findAll();
    }


//    @PostMapping("/api/favorite/{id}")
//    public void addFavorites(@PathVariable int id) {
//        Optional<Animals> optional = animalsRepository.findById(id);
//        if(optional.isPresent()){
//            Animals animal = optional.get();
//            Favorites favorites = new Favorites(null,animal,1);
//        }else{
//            try {
//                throw new AnimalDoesNotExistException("Animal with the name " + optional.get().getName() + " does not exist");
//            } catch (AnimalDoesNotExistException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }


}
