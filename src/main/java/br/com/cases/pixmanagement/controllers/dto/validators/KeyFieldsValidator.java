package br.com.cases.pixmanagement.controllers.dto.validators;

import br.com.cases.pixmanagement.controllers.dto.enums.AccountTypeEnum;
import br.com.cases.pixmanagement.controllers.dto.request.RegisterKeyRequestDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class KeyFieldsValidator implements ConstraintValidator<KeyFields, RegisterKeyRequestDTO> {

    private static final String TIPO_CONTA = "tipoConta";
    private static final String TIPO_CONTA_INVALID_MESSAGE = "{key.tipoConta.invalid}";

    @Override
    public boolean isValid(final RegisterKeyRequestDTO registerKeyRequestDTO,
                           final ConstraintValidatorContext constraintValidatorContext) {

        return validateKeyFields(registerKeyRequestDTO, constraintValidatorContext);
    }

    private boolean validateKeyFields(final RegisterKeyRequestDTO registerKeyRequestDTO,
                                      final ConstraintValidatorContext constraintValidatorContext) {

        boolean isValid = true;

        if (!validateAccountType(registerKeyRequestDTO.getTipoConta())) {
            isValid = false;
            setContextMessage(TIPO_CONTA, TIPO_CONTA_INVALID_MESSAGE, constraintValidatorContext);
        }

        return isValid;
    }


    private boolean validateAccountType(final String accountType) {
        if (Objects.isNull(AccountTypeEnum.fromValue(accountType))) {
            return false;
        }

        return true;
    }

    private void setContextMessage(final String field,
                                   final String message,
                                   final ConstraintValidatorContext context) {
        context.buildConstraintViolationWithTemplate(message)
                .addPropertyNode(field)
                .addConstraintViolation();
    }
}