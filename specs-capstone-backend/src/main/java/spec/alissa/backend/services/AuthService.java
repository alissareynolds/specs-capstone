package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.alissa.backend.exceptions.InvalidUserException;
import spec.alissa.backend.requests.LoginRequest;
import spec.alissa.backend.requests.RegisterRequest;
import spec.alissa.backend.models.User;
import spec.alissa.backend.repository.UserRepository;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    UserRepository usersRepository;

    public User registerAnAccount(RegisterRequest registerRequest) {
        User user = new User(0, registerRequest.getEmail(), registerRequest.getFirstName(), registerRequest.getUsername(), registerRequest.getPassword(), null);
        usersRepository.save(user);
        return user;
    }

    public User loginToAnAccount(LoginRequest loginRequest){
        Optional<User> user = usersRepository.findByUsername(loginRequest.getUsername());
        if (user.isPresent()) {
            if (loginRequest.getPassword().equals(user.get().getPassword_hash())) {
                return user.get();
            }
        }
        throw new InvalidUserException("Login was not successful");
    }
}
