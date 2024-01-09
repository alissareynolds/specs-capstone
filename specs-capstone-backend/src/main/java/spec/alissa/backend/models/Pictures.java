package spec.alissa.backend.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Pictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pictureId;

    private String url;

    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "id")
    private Animal animal;

    public Pictures(int pictureId, String url, Animal animal) {
        this.pictureId = pictureId;
        this.url = url;
        this.animal = animal;
    }

    public Pictures() {
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Animal getAnimalId() {
        return animal;
    }

    public void setAnimalId(Animal animal) {
        this.animal = animal;
    }
}
