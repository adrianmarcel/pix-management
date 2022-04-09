package br.com.cases.pixmanagement.controllers.dto.enums;

import lombok.Getter;

/**
 * Enum responsible for storing the values related to the type of key.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Getter
public enum KeyTypeEnum {
    CPF("CPF"),
    CNPJ("CNPJ"),
    EMAIL("e-mail"),
    EVP("aleatoria"),
    CELULAR("celular");

    private final String value;

    KeyTypeEnum(final String value) {
        this.value = value;
    }

    /**
     * Method responsible for receiving and validating the type of key.
     *
     * @param keyType String containing the key type.
     * @return String with validated key type.
     */
    public static KeyTypeEnum fromType(final String keyType) {
        for (KeyTypeEnum keyTypeEnum : KeyTypeEnum.values()) {
            if (keyTypeEnum.name().equalsIgnoreCase(keyType)) {
                return keyTypeEnum;
            }
        }

        return null;
    }

    /**
     * Method responsible for receiving and validating the type of key.
     *
     * @param keyType String containing the key type.
     * @return String with validated key type.
     */
    public static String fromValue(final String keyType) {
        for (KeyTypeEnum keyTypeEnum : KeyTypeEnum.values()) {
            if (keyTypeEnum.getValue().equalsIgnoreCase(keyType)) {
                return keyTypeEnum.getValue();
            }
        }

        return null;
    }
}