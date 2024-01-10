package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spec.alissa.backend.requests.LoginRequest;
import spec.alissa.backend.requests.RegisterRequest;
import spec.alissa.backend.models.User;
import spec.alissa.backend.services.AuthService;

@CrossOrigin(origins = "*")

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/api/login")
    public User loginToAccount(@Validated @RequestBody LoginRequest loginRequest) {
        return authService.loginToAnAccount(loginRequest);
    }

    @PostMapping("/api/register")
    public User registerAccount(@Validated @RequestBody RegisterRequest registerRequest) {
        return authService.registerAnAccount(registerRequest);
    }
}
