package br.com.cases.pixmanagement.fixtures.dto.request;

import br.com.cases.pixmanagement.controllers.converters.dto.request.RegisterKeyRequestDTO;

/**
 * Class responsible for mocking the data masses for request-specific test scenarios.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
public class RegisterKeyRequestDTOFixture {

    /**
     * Method responsible for mocking the test scenario of a request when the account type is "Corrente".
     *
     * @return DTO with the data mocked for the scenario.
     */
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

    /**
     * Method responsible for mocking the test scenario of a request when the account type is "Poupança".
     *
     * @return DTO with the data mocked for the scenario.
     */
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

    /**
     * Method responsible for mocking the test scenario of a request when the invalid account type.
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenInvalidAccountType() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CPF")
                .valorChave("03215777010")
                .tipoConta("test")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the key type is "Celular".
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenKeyTypeIsCelular() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CELULAR")
                .valorChave("+5527902467007")
                .tipoConta("poupança")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the invalid key cellular type.
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenInvalidKeyTypeCelular() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CELULAR")
                .valorChave("+5526902467007")
                .tipoConta("poupança")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the key type is "Email".
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenKeyTypeIsEmail() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("EMAIL")
                .valorChave("joedoe@mybank.com.br")
                .tipoConta("poupança")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the invalid key email type.
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenInvalidKeyTypeIsEmail() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("EMAIL")
                .valorChave("joedoemybank.com.br")
                .tipoConta("poupança")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the key type is "CPF".
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenKeyTypeIsCpf() {
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

    /**
     * Method responsible for mocking the test scenario of a request when the invalid key "CPF" type.
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenInvalidKeyTypeIsCpf() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CPF")
                .valorChave("032.157.770-10")
                .tipoConta("corrente")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the key type is "CNPJ".
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenKeyTypeIsCnpj() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CNPJ")
                .valorChave("07737037000146")
                .tipoConta("corrente")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the invalid key "CNPJ" type.
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenInvalidKeyTypeIsCnpj() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("CNPJ")
                .valorChave("07.737.037/0001-46")
                .tipoConta("corrente")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the key type is "EVP".
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenKeyTypeIsEvp() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("EVP")
                .valorChave("91e07263-f137-4b1d-b1cd-96cd4ee5481d")
                .tipoConta("corrente")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }

    /**
     * Method responsible for mocking the test scenario of a request when the invalid key "EVP" type.
     *
     * @return DTO with the data mocked for the scenario.
     */
    public static RegisterKeyRequestDTO defaultValuesWhenInvalidKeyTypeIsEvp() {
        return RegisterKeyRequestDTO.builder()
                .tipoChave("EVP")
                .valorChave("91e07263-f137-4b1d-b1cd-96cd4ee5481d12345674841111000")
                .tipoConta("corrente")
                .numeroAgencia("0001")
                .numeroConta("225123")
                .nomeCorrentista("Joe Doe")
                .sobrenomeCorrentista("da Silva")
                .build();
    }
}