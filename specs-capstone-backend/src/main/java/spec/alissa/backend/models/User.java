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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "user_id")
    private int userId;
    @Column(length = 60)
    private String email;
    @Column(length = 50)
    private String first_name;
    @Column(length = 50)
    private String username;
    @Column(length = 100)
    private String password_hash;

    @ManyToMany
    @JoinTable(name = "user_animal",
            joinColumns = { @JoinColumn(name = "FK_user") },
            inverseJoinColumns = { @JoinColumn(name = "FK_animal") })
    @JsonIgnoreProperties({"users"})
    private List<Animal> animals = new ArrayList<>();
}
