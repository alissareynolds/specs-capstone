package spec.alissa.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import spec.alissa.backend.controllers.requests.RegisterRequest;
import spec.alissa.backend.models.Users;
import spec.alissa.backend.repository.UsersRepository;

@Service
public class AuthService {

    @Autowired
    UsersRepository usersRepository;

    public Users registerAnAccount(RegisterRequest registerRequest) {
        Users user = new Users(0, registerRequest.getFirstName(), registerRequest.getUsername(), registerRequest.getPassword(), registerRequest.getEmail());
        usersRepository.save(user);
        return user;
    }
}
