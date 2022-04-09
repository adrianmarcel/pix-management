package br.com.cases.pixmanagement.controllers.validators;

import br.com.cases.pixmanagement.controllers.dto.validators.KeyFieldsValidator;
import br.com.cases.pixmanagement.fixtures.dto.request.RegisterKeyRequestDTOFixture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidatorContext;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class KeyFieldsValidatorUnitTest {

    @InjectMocks
    private KeyFieldsValidator keyFieldsValidator;

    @InjectMocks
    private ConstraintValidatorContext constraintValidatorContext;

    @Test
    public void testIsValidWhenValidateAccountTypeCorrente() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenAccountTypeIsCorrente(),
                        constraintValidatorContext);

        assertNotNull(isValid);
        assertTrue(isValid);
    }

    @Test
    public void testIsValidWhenValidateAccountTypePoupanca() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenAccountTypeIsPoupanca(),
                        constraintValidatorContext);

        assertNotNull(isValid);
        assertTrue(isValid);
    }

    @Test
    public void testIsValidWhenInvalidAccountType() {
        final boolean isValid = keyFieldsValidator
                .isValid(RegisterKeyRequestDTOFixture.defaultValuesWhenAccountTypeIsInvalid(),
                        constraintValidatorContext);

        assertNotNull(isValid);
        assertFalse(isValid);
    }
}