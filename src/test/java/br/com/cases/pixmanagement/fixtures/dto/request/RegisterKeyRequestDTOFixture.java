package br.com.cases.pixmanagement.fixtures.dto.request;

import br.com.cases.pixmanagement.controllers.dto.request.RegisterKeyRequestDTO;

public class RegisterKeyRequestDTOFixture {

    public static RegisterKeyRequestDTO defaultValuesWhenAccountTypeIsCorrente() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CPF")
                .valorChave("03215777010")
                .tipoConta("corrente")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    public static RegisterKeyRequestDTO defaultValuesWhenAccountTypeIsPoupanca() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CPF")
                .valorChave("03215777010")
                .tipoConta("poupança")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    public static RegisterKeyRequestDTO defaultValuesWhenAccountTypeIsInvalid() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CPF")
                .valorChave("03215777010")
                .tipoConta("teste")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }
}