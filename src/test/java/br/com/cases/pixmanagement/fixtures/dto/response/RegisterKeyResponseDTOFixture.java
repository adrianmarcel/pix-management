package br.com.cases.pixmanagement.fixtures.dto.response;

import br.com.cases.pixmanagement.controllers.dto.response.RegisterKeyResponseDTO;

public class RegisterKeyResponseDTOFixture {

    public static RegisterKeyResponseDTO defaultValues() {
        return RegisterKeyResponseDTO.builder()
                .id("480919c3-1b18-4239-b055-0f9278d1dcbd")
                .build();
    }
}