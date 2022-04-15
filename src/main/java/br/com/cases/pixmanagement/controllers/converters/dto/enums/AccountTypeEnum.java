package br.com.cases.pixmanagement.controllers.converters.dto.enums;

import lombok.Getter;

/**
 * Enum responsible for storing the values related to the type of account.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Getter
public enum AccountTypeEnum {
    CONTA_CORRENTE("corrente"),
    CONTA_POUPANCA("poupança");

    private final String value;

    AccountTypeEnum(final String value) {
        this.value = value;
    }

    /**
     * Method responsible for receiving and validating the type of account.
     *
     * @param accountType String containing the account type.
     * @return String with validated account type.
     */
    public static AccountTypeEnum fromType(final String accountType) {
        for (AccountTypeEnum accountTypeEnum : AccountTypeEnum.values()) {
            if (accountTypeEnum.name().equalsIgnoreCase(accountType)) {
                return accountTypeEnum;
            }
        }

        return null;
    }

    /**
     * Method responsible for receiving and validating the type of account.
     *
     * @param accountType String containing the account type.
     * @return String with validated account type.
     */
    public static String fromValue(final String accountType) {
        for (AccountTypeEnum accountTypeEnum : AccountTypeEnum.values()) {
            if (accountTypeEnum.getValue().equalsIgnoreCase(accountType)) {
                return accountTypeEnum.getValue();
            }
        }

        return null;
    }
}