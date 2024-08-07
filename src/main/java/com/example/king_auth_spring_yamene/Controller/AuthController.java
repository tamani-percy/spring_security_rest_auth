package com.example.king_auth_spring_yamene.Controller;


import com.example.king_auth_spring_yamene.Payload.Request.LoginRequest;
import com.example.king_auth_spring_yamene.Payload.Request.SignupRequest;
import com.example.king_auth_spring_yamene.Payload.Response.JwtResponse;
import com.example.king_auth_spring_yamene.Payload.Response.MessageResponse;
import com.example.king_auth_spring_yamene.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(maxAge = 3600, origins = "http://192.168.0.101:5173")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<MessageResponse> registerUser(@Validated @RequestBody SignupRequest signupRequest) {
        return authService.registerUser(signupRequest);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> loginUser(@Validated @RequestBody LoginRequest loginRequest) {
        return authService.loginUser(loginRequest);
    }

}
