package br.com.cases.pixmanagement.controllers.converters.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Class responsible for handling the output information of a new PIX key registration request.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class RegisterKeyResponseDTO {

    private String id;

}