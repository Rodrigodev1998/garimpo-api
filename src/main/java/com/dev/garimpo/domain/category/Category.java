package com.dev.garimpo.domain.category;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "categories")
@Entity(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String type;

    public Category (CategoryRequestDTO data){
        this.type = data.type();
    }
}
