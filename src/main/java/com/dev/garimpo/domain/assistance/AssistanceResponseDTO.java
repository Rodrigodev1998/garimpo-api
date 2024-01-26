package com.dev.garimpo.domain.assistance;

public record AssistanceResponseDTO(String id, String name, Integer price) {

    public AssistanceResponseDTO(Assistance assistance) { this(assistance.getId(), assistance.getName(), assistance.getPrice());}
}
