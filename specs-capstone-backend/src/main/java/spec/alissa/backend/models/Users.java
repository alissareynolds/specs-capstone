package spec.alissa.backend.models;

import jakarta.persistence.*;

@Entity
public class Users {

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

    public Users(int userId, String first_name, String username, String password_hash
    , String email) {
        this.userId = userId;
        this.email = email;
        this.first_name = first_name;
        this.username = username;
        this.password_hash = password_hash;
    }

    public Users() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }
}
