package com.dev.garimpo.domain.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequestDTO(
        @NotBlank
        String type

) {
}
