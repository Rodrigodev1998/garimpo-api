package com.dev.garimpo.domain.assistance;

import com.dev.garimpo.domain.category.Category;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "Assistance")
@Entity(name = "Assistance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Assistance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;



    public Assistance(AssistanceRequestDTO data){
        this.name = data.name();
        this.price = data.price();
    }
}
