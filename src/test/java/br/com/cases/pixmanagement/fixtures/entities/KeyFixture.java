package br.com.cases.pixmanagement.fixtures.entities;

import br.com.cases.pixmanagement.controllers.converters.dto.enums.AccountTypeEnum;
import br.com.cases.pixmanagement.controllers.converters.dto.enums.KeyTypeEnum;
import br.com.cases.pixmanagement.entities.Key;

/**
 * Class responsible for mocking PIX key database entity data.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
public class KeyFixture {

    /**
     * Method responsible for mocking the default values a PIX key entity.
     *
     * @return Key entity with mocked data.
     */
    public static Key defaultValues() {
        return Key.builder()
                .numeroAgencia("0001")
                .numeroConta("225123")
                .valorChave("03215777010")
                .nomeCorrentista("Joe Doe")
                .tipoChave(KeyTypeEnum.CPF)
                .sobrenomeCorrentista("da Silva")
                .tipoConta(AccountTypeEnum.CONTA_CORRENTE)
                .idKey("1cc5ec21-31c0-4974-8fcf-1fdcff9377b7")
                .build();
    }
}
