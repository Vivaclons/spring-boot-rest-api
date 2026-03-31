package com.userapi.controller;

import com.userapi.dto.AuthRequest;
import com.userapi.dto.AuthResponse;
import com.userapi.dto.RegisterRequest;
import com.userapi.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller depends on AuthService interface, not on implementation.
 * This follows SOLID — Dependency Inversion Principle (DIP).
 * Spring injects AuthServiceImpl automatically via @Service annotation.
 */
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    // Depends on interface, not on AuthServiceImpl directly
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
