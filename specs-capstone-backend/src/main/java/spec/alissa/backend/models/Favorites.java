package spec.alissa.backend.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Favorites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int favoriteId;

    @OneToMany
    private List<Animals> favAnimals;
    private int userId;

    public Favorites(int favoriteId, List<Animals> favAnimals, int userId) {
        this.favoriteId = favoriteId;
        this.favAnimals = favAnimals;
        this.userId = userId;
    }

    public Favorites() {
    }

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public List<Animals> getFavAnimals() {
        return favAnimals;
    }

    public void setFavAnimals(List<Animals> favAnimals) {
        this.favAnimals = favAnimals;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
