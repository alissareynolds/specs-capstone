package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.alissa.backend.requests.LoginRequest;
import spec.alissa.backend.requests.RegisterRequest;
import spec.alissa.backend.models.Users;
import spec.alissa.backend.repository.UsersRepository;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    UsersRepository usersRepository;

    public Users registerAnAccount(RegisterRequest registerRequest) {
        Users user = new Users(0, registerRequest.getFirstName(), registerRequest.getUsername(), registerRequest.getPassword(), registerRequest.getEmail());
        usersRepository.save(user);
        return user;
    }

    public Users loginToAnAccount(LoginRequest loginRequest) {
        Optional<Users> user = usersRepository.findByUsername(loginRequest.getUsername());
        if (user.isPresent()) {
            if (loginRequest.getPassword().equals(user.get().getPassword_hash())) {
                // successful login
                return user.get();
            }
        } else {
            try {
                throw new Exception("Login was not successful");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
