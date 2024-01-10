package spec.alissa.backend.models;

import jakarta.persistence.*;

@Entity
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pictureId;

    private String url;

    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "animalId")
    private Animal animal;

    public Picture(int pictureId, String url, Animal animal) {
        this.pictureId = pictureId;
        this.url = url;
        this.animal = animal;
    }

    public Picture() {
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
