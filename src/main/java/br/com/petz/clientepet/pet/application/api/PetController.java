package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.application.service.PetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
    private final PetService petService;
    @Override
    public PetResponse postPet(UUID idCliente, PetRequest petRequest) {
        log.info("[inicia] PetController - postPet");
        log.info("[inicia] {}", idCliente);
        PetResponse pet = petService.criaPet(idCliente, petRequest);
        log.info("[finaliza] PetController - postPet");
        return pet;
    }
}