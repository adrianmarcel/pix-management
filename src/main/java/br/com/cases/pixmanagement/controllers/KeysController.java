package br.com.cases.pixmanagement.controllers;

import br.com.cases.pixmanagement.controllers.converters.RegisterKeyConverter;
import br.com.cases.pixmanagement.controllers.converters.dto.request.RegisterKeyRequestDTO;
import br.com.cases.pixmanagement.controllers.converters.dto.response.RegisterKeyResponseDTO;
import br.com.cases.pixmanagement.services.RegisterKey;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Class responsible for controlling APIs for registration, query, alteration, deletion of PIX keys.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Slf4j
@Validated
@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1")
public class KeysController {

    @Autowired
    private RegisterKey registerKey;

    /**
     * Method responsible for managing the API for registering a new PIX key.
     *
     * @param request DTO with the input parameters.
     * @return ResponseEntity with the service's response json.
     */
    @ApiOperation(value = "Register a new key.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Key created successfully."),
            @ApiResponse(code = 422, message = "A field validation error occurred while adding the key."),
            @ApiResponse(code = 500, message = "Internal server error."),
            @ApiResponse(code = 502, message = "External server error.")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/pixmanagement/key")
    public ResponseEntity<RegisterKeyResponseDTO> registerKey(@Valid @RequestBody final RegisterKeyRequestDTO request) {

        log.info("Receiving a new request to create a new PIX key.");

        final RegisterKeyResponseDTO response = RegisterKeyConverter
                .toResponse(registerKey.execute(RegisterKeyConverter.toService(request)));

        log.info("Returning the response of creating the new PIX key.");

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
