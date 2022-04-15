package br.com.cases.pixmanagement.fixtures.dto.response;

import br.com.cases.pixmanagement.controllers.converters.dto.response.RegisterKeyResponseDTO;

/**
 * Class responsible for mocking the data masses for response-specific test scenarios.
 */
public class RegisterKeyResponseDTOFixture {

    /**
     * Method responsible for mocking the default data of a new PIX key registration response.
     *
     * @return DTO with the mocked data.
     */
    public static RegisterKeyResponseDTO defaultValues() {
        return RegisterKeyResponseDTO.builder()
                .id("480919c3-1b18-4239-b055-0f9278d1dcbd")
                .build();
    }
}