package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter @Setter
@Entity
@Table(name = "drug")
public class BarCodeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String itemname ;

    @Column(nullable = false)
    private String standardcode ;
}
