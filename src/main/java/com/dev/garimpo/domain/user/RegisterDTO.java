package com.dev.garimpo.domain.user;

public record RegisterDTO (String email, String password, UserRole role) {
}
