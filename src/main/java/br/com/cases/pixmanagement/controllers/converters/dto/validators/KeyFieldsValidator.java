package br.com.cases.pixmanagement.controllers.converters.dto.validators;

import br.com.cases.pixmanagement.controllers.converters.dto.enums.AccountTypeEnum;
import br.com.cases.pixmanagement.controllers.converters.dto.enums.KeyTypeEnum;
import br.com.cases.pixmanagement.controllers.converters.dto.request.RegisterKeyRequestDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

import static java.util.Arrays.stream;

/**
 * Class responsible for implementing the KeyFields interface.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
public class KeyFieldsValidator implements ConstraintValidator<KeyFields, RegisterKeyRequestDTO> {

    private static final String TIPO_CONTA = "tipoConta";
    private static final String VALOR_CHAVE = "valorChave";
    private static final String TIPO_CONTA_INVALID_MESSAGE = "{key.tipoConta.invalid}";
    private static final String VALOR_CHAVE_INVALID_MESSAGE = "{key.valorChave.invalid}";

    /**
     * Method responsible for aggregating all application key validations.
     *
     * @param registerKeyRequestDTO      DTO with all pre-validated fields from the request.
     * @param constraintValidatorContext Javax validation interface.
     * @return Boolean where true all fields are valid and false are invalid.
     */
    @Override
    public boolean isValid(final RegisterKeyRequestDTO registerKeyRequestDTO,
                           final ConstraintValidatorContext constraintValidatorContext) {

        return validateKeyFields(registerKeyRequestDTO, constraintValidatorContext);
    }

    /**
     * Method responsible for all types of keys existing in the request.
     *
     * @param registerKeyRequestDTO      DTO with all pre-validated fields from the request.
     * @param constraintValidatorContext Javax validation interface.
     * @return Boolean where true all fields are valid and false are invalid.
     */
    private boolean validateKeyFields(final RegisterKeyRequestDTO registerKeyRequestDTO,
                                      final ConstraintValidatorContext constraintValidatorContext) {

        boolean isValid = true;

        if (!validateAccountType(registerKeyRequestDTO.getTipoConta())) {
            isValid = false;
            setContextMessage(TIPO_CONTA, TIPO_CONTA_INVALID_MESSAGE, constraintValidatorContext);
        }

        if (!validatePhoneKey(registerKeyRequestDTO.getTipoChave(), registerKeyRequestDTO.getValorChave())) {
            isValid = false;
            setContextMessage(VALOR_CHAVE, VALOR_CHAVE_INVALID_MESSAGE, constraintValidatorContext);
        }

        if (!validateEmailKey(registerKeyRequestDTO.getTipoChave(), registerKeyRequestDTO.getValorChave())) {
            isValid = false;
            setContextMessage(VALOR_CHAVE, VALOR_CHAVE_INVALID_MESSAGE, constraintValidatorContext);
        }

        if (!validateCpfKey(registerKeyRequestDTO.getTipoChave(), registerKeyRequestDTO.getValorChave())) {
            isValid = false;
            setContextMessage(VALOR_CHAVE, VALOR_CHAVE_INVALID_MESSAGE, constraintValidatorContext);
        }

        if (!validateCnpjKey(registerKeyRequestDTO.getTipoChave(), registerKeyRequestDTO.getValorChave())) {
            isValid = false;
            setContextMessage(VALOR_CHAVE, VALOR_CHAVE_INVALID_MESSAGE, constraintValidatorContext);
        }

        if (!validateEvpKey(registerKeyRequestDTO.getTipoChave(), registerKeyRequestDTO.getValorChave())) {
            isValid = false;
            setContextMessage(VALOR_CHAVE, VALOR_CHAVE_INVALID_MESSAGE, constraintValidatorContext);
        }

        return isValid;
    }

    /**
     * Method responsible for validating the type of account.
     *
     * @param accountType String with the information received in the account type request.
     * @return Boolean true if the account type is valid and false if it is invalid.
     */
    private boolean validateAccountType(final String accountType) {
        return !Objects.isNull(AccountTypeEnum.fromValue(accountType));
    }

    /**
     * Method responsible for validating the type of the cell key.
     *
     * @param tipoChave   String with the key type information to validate if it is indeed a cell phone.
     * @param phoneNumber String with the value of the cell key informed.
     * @return Boolean true if the cell key type is valid and false if it is invalid.
     */
    private boolean validatePhoneKey(final String tipoChave, final String phoneNumber) {
        if (KeyTypeEnum.CELULAR.equals(KeyTypeEnum.fromType(tipoChave))) {
            if (phoneNumber.length() == 14) {
                final String countryCode = phoneNumber.substring(0, 3);

                if (!countryCode.equalsIgnoreCase("+55")) {
                    return false;
                }

                final String areaCode = phoneNumber.substring(3, 5);
                final String[] areaCodes = {"11", "12", "13", "14", "15", "16", "17", "18", "19", "21", "22", "24",
                        "27", "28", "31", "32", "33", "34", "35", "37", "38", "41", "42", "43", "44", "45", "46", "47",
                        "48", "49", "51", "53", "54", "55", "61", "62", "63", "64", "65", "66", "67", "68", "69", "71",
                        "73", "74", "75", "77", "79", "81", "82", "83", "84", "85", "86", "87", "88", "89", "91", "92",
                        "93", "94", "95", "96", "97", "98", "99"};

                if (stream(areaCodes).noneMatch(a -> a.equalsIgnoreCase(areaCode))) {
                    return false;
                }

                final String number = phoneNumber.substring(5, 14);
                return number.startsWith("9");

            } else {
                return false;
            }
        }

        return true;
    }


    /**
     * Method responsible for validating a key of type email.
     *
     * @param tipoChave String with the information sent in the request containing the type of the key.
     * @param email     String with the information sent in the request containing an email.
     * @return Boolean true if the email is valid and false if it is invalid.
     */
    private boolean validateEmailKey(final String tipoChave, final String email) {
        if (KeyTypeEnum.EMAIL.equals(KeyTypeEnum.fromType(tipoChave))) {
            return email.contains("@") && email.length() <= 77;
        }

        return true;
    }

    /**
     * Method responsible for validating a cpf type key.
     *
     * @param tipoChave String with the information sent in the request containing the type of the key.
     * @param cpf       String with the information sent in the request containing a cpf.
     * @return Boolean true if the cpf is valid and false if it is invalid.
     */
    private boolean validateCpfKey(final String tipoChave, final String cpf) {
        if (KeyTypeEnum.CPF.equals(KeyTypeEnum.fromType(tipoChave))) {
            return !cpf.contains(".") && !cpf.contains("-") && cpf.length() >= 11;
        }

        return true;
    }

    /**
     * Method responsible for validating a key of type cnpj.
     *
     * @param tipoChave String with the information sent in the request containing the type of the key.
     * @param cnpj      String with the information sent in the request containing a cnpj.
     * @return Boolean true if the cnpj is valid and false if it is invalid.
     */
    private boolean validateCnpjKey(final String tipoChave, final String cnpj) {
        if (KeyTypeEnum.CNPJ.equals(KeyTypeEnum.fromType(tipoChave))) {
            return !cnpj.contains(".") && !cnpj.contains("-") && !cnpj.contains("/") && cnpj.length() >= 11;
        }

        return true;
    }

    /**
     * Method responsible for validating a key of type evp.
     *
     * @param tipoChave String with the information sent in the request containing the type of the key.
     * @param evp       String with the information sent in the request containing a cnpj.
     * @return Boolean true if the cnpj is valid and false if it is invalid.
     */
    private boolean validateEvpKey(final String tipoChave, final String evp) {
        if (KeyTypeEnum.EVP.equals(KeyTypeEnum.fromType(tipoChave))) {
            return evp.length() == 36;
        }

        return true;
    }

    /**
     * Method responsible for sending field validation error messages to the application context.
     *
     * @param field   String with the value of the validated field.
     * @param message String with the message value of the validated field.
     * @param context Application context.
     */
    private void setContextMessage(final String field,
                                   final String message,
                                   final ConstraintValidatorContext context) {
        context.buildConstraintViolationWithTemplate(message)
                .addPropertyNode(field)
                .addConstraintViolation();
    }
}