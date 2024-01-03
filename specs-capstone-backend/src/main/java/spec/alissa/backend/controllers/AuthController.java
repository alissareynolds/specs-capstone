package spec.alissa.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spec.alissa.backend.controllers.requests.RegisterRequest;
import spec.alissa.backend.models.Users;
import spec.alissa.backend.services.AuthService;

@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/api/login")
    public Users loginToAccount() {
        return null;
    }

    @PostMapping("/api/register")
    public Users registerAccount(@Validated @RequestBody RegisterRequest registerRequest) {
        return authService.registerAnAccount(registerRequest);
    }
}
