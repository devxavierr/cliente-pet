package br.com.petz.clientepet.pet.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idPet;
    @NotBlank
    private  String nomePet;
    @Enumerated(EnumType.STRING)
    private Porte porte;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoPet tipoPet;
    private String microchip;
    @NotBlank
    private String raca;
    @Enumerated(EnumType.STRING)
    @NotNull
    private SexoPet sexo;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;
}
