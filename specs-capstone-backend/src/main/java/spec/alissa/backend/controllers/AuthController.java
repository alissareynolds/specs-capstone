package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spec.alissa.backend.requests.LoginRequest;
import spec.alissa.backend.requests.RegisterRequest;
import spec.alissa.backend.models.Users;
import spec.alissa.backend.services.AuthService;

@CrossOrigin(origins = "http://127.0.0.1:5501")

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/api/login")
    public Users loginToAccount(@Validated @RequestBody LoginRequest loginRequest) {
        return authService.loginToAnAccount(loginRequest);
    }

    @PostMapping("/api/register")
    public Users registerAccount(@Validated @RequestBody RegisterRequest registerRequest) {
        return authService.registerAnAccount(registerRequest);
    }
}
