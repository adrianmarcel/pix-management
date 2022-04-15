package br.com.cases.pixmanagement.controllers.converters;

import br.com.cases.pixmanagement.controllers.converters.dto.enums.AccountTypeEnum;
import br.com.cases.pixmanagement.controllers.converters.dto.enums.KeyTypeEnum;
import br.com.cases.pixmanagement.controllers.converters.dto.request.RegisterKeyRequestDTO;
import br.com.cases.pixmanagement.controllers.converters.dto.response.RegisterKeyResponseDTO;
import br.com.cases.pixmanagement.entities.Key;

/**
 * Class responsible for handling the data of entities and DTOs.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
public class RegisterKeyConverter {

    public static RegisterKeyResponseDTO toResponse(final String idKey) {
        return RegisterKeyResponseDTO.builder()
                .id(idKey)
                .build();
    }

    public static Key toService(final RegisterKeyRequestDTO request) {
        return Key.builder()
                .valorChave(request.getValorChave())
                .numeroConta(request.getNumeroConta())
                .numeroAgencia(request.getNumeroAgencia())
                .nomeCorrentista(request.getNomeCorrentista())
                .sobrenomeCorrentista(request.getSobrenomeCorrentista())
                .tipoChave(KeyTypeEnum.fromType(request.getTipoChave()))
                .tipoConta(AccountTypeEnum.fromType(request.getTipoConta()))
                .build();
    }
}