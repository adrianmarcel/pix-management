package br.com.cases.pixmanagement.controllers;

import br.com.cases.pixmanagement.controllers.dto.response.RegisterKeyResponseDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1")
public class KeysController {

    public ResponseEntity<RegisterKeyResponseDTO> registerKey() {
        return null;
    }

}
