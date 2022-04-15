package br.com.cases.pixmanagement.controllers.validators;

import br.com.cases.pixmanagement.controllers.converters.dto.validators.KeyFieldsValidator;
import br.com.cases.pixmanagement.fixtures.dto.request.RegisterKeyRequestDTOFixture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.validation.ConstraintValidatorContext;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

/**
 * Class responsible for unit testing the forms of validation of the fields of a request.
 */
@RunWith(MockitoJUnitRunner.class)
public class KeyFieldsValidatorUnitTest {

    @InjectMocks
    private KeyFieldsValidator keyFieldsValidator;

    @Mock
    private ConstraintValidatorContext constraintValidatorContext;

    /**
     * Method responsible for successfully validating the type of account when "Current Account" is informed in
     * the request.
     */
    @Test
    public void testIsValidWhenAccountTypeIsCorrente() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenAccountTypeIsCorrente(),
                        constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for successfully validating the type of account when "Savings Account" is informed in
     * the request.
     */
    @Test
    public void testIsValidWhenAccountTypeIsPoupanca() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenAccountTypeIsPoupanca(),
                        constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for invalidating a non-existent account type when informed in the request.
     */
    @Test
    public void testIsInvalidAccountType() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidAccountType(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for successfully validating the key type when "Celular" is informed in the request.
     */
    @Test
    public void testIsValidWhenKeyTypeIsCelular() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenKeyTypeIsCelular(), constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for invalidating a type of key when "Celular" is informed in the request and the DDD
     * is invalid.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsCelular() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeCelular(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for invalidating a type of key when "Celular" is informed in the request and the
     * country code is invalid.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsCelularWhenInvalidCountryCode() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeCelular().toBuilder()
                        .valorChave("+8827902467007")
                        .build(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for invalidating a type of key when "Celular" is informed in the request and the telephone
     * number contains more than 14 digits.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsCelularWhenIsGreaterThanFourteenDigits() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeCelular().toBuilder()
                        .valorChave("+5527902467007999")
                        .build(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for successfully validating the type of key when "Email" is informed in the request.
     */
    @Test
    public void testIsValidWhenKeyTypeIsEmail() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenKeyTypeIsEmail(), constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for invalidating a type of key when "Email" is informed in the request and the format
     * is invalid.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsEmail() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeIsEmail(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for successfully validating the type of key when "CPF" is informed in the request.
     */
    @Test
    public void testIsValidWhenKeyTypeIsCpf() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenKeyTypeIsCpf(), constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for invalidating a type of key when "CPF" is informed in the request and the format
     * is invalid.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsCpf() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeIsCpf(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for successfully validating the type of key when "CNPJ" is informed in the request.
     */
    @Test
    public void testIsValidWhenKeyTypeIsCnpj() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenKeyTypeIsCnpj(), constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for invalidating a type of key when "CNPJ" is informed in the request and the format
     * is invalid.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsCnpj() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeIsCnpj(), ctx);

        assertFalse(isValid);
    }

    /**
     * Method responsible for successfully validating the key type when "EVP" is informed in the request.
     */
    @Test
    public void testIsValidWhenKeyTypeIsEvp() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenKeyTypeIsEvp(), constraintValidatorContext);

        assertTrue(isValid);
    }

    /**
     * Method responsible for invalidating a key type when "EVP" is informed in the request and the format is invalid.
     */
    @Test
    public void testIsInvalidWhenKeyTypeIsEvp() {
        final ConstraintValidatorContext ctx = mock(ConstraintValidatorContext.class);
        final ConstraintValidatorContext.ConstraintViolationBuilder builder =
                mock(ConstraintValidatorContext.ConstraintViolationBuilder.class);

        doReturn(builder)
                .when(ctx).buildConstraintViolationWithTemplate(anyString());
        doReturn(mock(ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext.class))
                .when(builder).addPropertyNode(anyString());

        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenInvalidKeyTypeIsEvp(), ctx);

        assertFalse(isValid);
    }
}