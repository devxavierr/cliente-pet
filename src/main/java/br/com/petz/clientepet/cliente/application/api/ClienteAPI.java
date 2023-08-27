package br.com.petz.clientepet.cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
@PostMapping
@ResponseStatus(code = HttpStatus.ACCEPTED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);


}
