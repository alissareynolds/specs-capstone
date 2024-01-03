package spec.alissa.backend.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animalId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String breed;
    @Column(nullable = false)
    private String birthdate;
    @Column(nullable = false)
    private String thumbnail;
    private String height;
    private String color;
    private String weight;
    @Column(length = 50000, nullable = false)
    private String info;
    @Column(nullable = false)
    private String species_name;

    public Animals(int animalId, String name, String gender, String breed, String birthdate, String thumbnail, String height, String color, String weight, String info, String species_name) {
        this.animalId = animalId;
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.birthdate = birthdate;
        this.thumbnail = thumbnail;
        this.height = height;
        this.color = color;
        this.weight = weight;
        this.info = info;
        this.species_name = species_name;
    }

    public Animals() {
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }
}
