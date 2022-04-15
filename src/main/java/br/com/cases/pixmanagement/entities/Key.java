package br.com.cases.pixmanagement.entities;

import br.com.cases.pixmanagement.controllers.converters.dto.enums.AccountTypeEnum;
import br.com.cases.pixmanagement.controllers.converters.dto.enums.KeyTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Class responsible for representing the entity that stores the data of a PIX key in the database.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class Key {

    private String idKey;
    private String valorChave;
    private String numeroConta;
    private String numeroAgencia;
    private KeyTypeEnum tipoChave;
    private String nomeCorrentista;
    private AccountTypeEnum tipoConta;
    private String sobrenomeCorrentista;

}