package spec.alissa.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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

    @ManyToMany(mappedBy="animals")
    @JsonIgnoreProperties({"animals"})
    private List<User> users = new ArrayList<>();



}