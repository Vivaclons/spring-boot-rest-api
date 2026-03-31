package com.userapi.service;

import com.userapi.dto.AuthRequest;
import com.userapi.dto.AuthResponse;
import com.userapi.dto.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(AuthRequest request);
}
