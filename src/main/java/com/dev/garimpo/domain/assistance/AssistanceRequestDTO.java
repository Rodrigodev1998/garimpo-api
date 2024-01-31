package com.dev.garimpo.domain.assistance;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AssistanceRequestDTO(
        @NotBlank
        String name,

        @NotNull
        Integer price

) {
}
