package spec.alissa.backend.models;

import jakarta.persistence.*;

@Entity
public class Favorites {
    @Id
    private int animalId;

    private int userId;

    public Favorites() {
    }

    public Favorites(int animalId, int userId) {
        this.animalId = animalId;
        this.userId = userId;
    }

    public int getAnimalIdList() {
        return animalId;
    }

    public void setAnimalIdList(int animalId) {
        this.animalId = animalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
