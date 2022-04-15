package br.com.cases.pixmanagement.controllers.enums;

import br.com.cases.pixmanagement.controllers.converters.dto.enums.KeyTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Class responsible for unit testing valid key types scenarios.
 */
@RunWith(MockitoJUnitRunner.class)
public class KeyTypeEnumUnitTest {

    /**
     * Method responsible for testing the CPF key type when it is informed in the upper case request, waiting for an
     * enumerator to return.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsCpfAndUpperCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("CPF");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.CPF, keyType);
    }

    /**
     * Method responsible for testing the CPF key type when it is informed in the lower case request, waiting for an
     * enumerator to return.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsCpfAndLowerCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("cpf");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.CPF, keyType);
    }

    /**
     * Method responsible for testing the CPF key type when it is informed in the upper case request, expecting
     * a string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsCpfAndUpperCase() {
        final String keyType = KeyTypeEnum.fromValue("CPF");

        assertNotNull(keyType);
        assertEquals("CPF", keyType);
    }

    /**
     * Method responsible for testing the CPF key type when it is informed in the lower case request, expecting the
     * return of a string.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsCpfAndLowerCase() {
        final String keyType = KeyTypeEnum.fromValue("cpf");

        assertNotNull(keyType);
        assertEquals("CPF", keyType);
    }

    /**
     * Method responsible for testing the CNPJ key type when it is informed in the upper case request, waiting for an
     * enumerator to return.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsCnpjAndUpperCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("CNPJ");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.CNPJ, keyType);
    }

    /**
     * Method responsible for testing the CNPJ key type when it is informed in the lower case request, expecting the
     * return of an enumerator.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsCnpjAndLowerCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("cnpj");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.CNPJ, keyType);
    }

    /**
     * Method responsible for testing the CNPJ key type when it is informed in the upper case request, expecting a
     * string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsCnpjAndUpperCase() {
        final String keyType = KeyTypeEnum.fromValue("CNPJ");

        assertNotNull(keyType);
        assertEquals("CNPJ", keyType);
    }

    /**
     * Method responsible for testing the CNPJ key type when it is informed in the lower case request, expecting the
     * return of a string.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsCnpjAndLowerCase() {
        final String keyType = KeyTypeEnum.fromValue("cnpj");

        assertNotNull(keyType);
        assertEquals("CNPJ", keyType);
    }

    /**
     * Method responsible for testing the EMAIL key type when it is informed in the upper case request, expecting the
     * return of an enumerator.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsEmailAndUpperCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("EMAIL");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.EMAIL, keyType);
    }

    /**
     * Method responsible for testing the EMAIL key type when it is informed in the lower case request, expecting
     * the return of an enumerator.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsEmailAndLowerCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("email");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.EMAIL, keyType);
    }

    /**
     * Method responsible for testing the EMAIL key type when it is informed in the upper case request, expecting a
     * string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsEmailAndUpperCase() {
        final String keyType = KeyTypeEnum.fromValue("E-MAIL");

        assertNotNull(keyType);
        assertEquals("e-mail", keyType);
    }

    /**
     * Method responsible for testing the EMAIL key type when it is informed in the lower case request, expecting a
     * string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsEmailAndLowerCase() {
        final String keyType = KeyTypeEnum.fromValue("e-mail");

        assertNotNull(keyType);
        assertEquals("e-mail", keyType);
    }

    /**
     * Method responsible for testing the EVP key type when it is informed in the upper case request waiting for an
     * enumerator to return.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsEvpAndUpperCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("EVP");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.EVP, keyType);
    }

    /**
     * Method responsible for testing the EVP key type when it is informed in the lower case request, expecting the
     * return of an enumerator.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsEvpAndLowerCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("evp");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.EVP, keyType);
    }

    /**
     * Method responsible for testing the EVP key type when it is informed in the upper case request, expecting a
     * string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsEvpAndUpperCase() {
        final String keyType = KeyTypeEnum.fromValue("ALEATORIA");

        assertNotNull(keyType);
        assertEquals("aleatoria", keyType);
    }

    /**
     * Method responsible for testing the EVP key type when it is informed in the lower case request, expecting a
     * string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsEvpAndLowerCase() {
        final String keyType = KeyTypeEnum.fromValue("aleatoria");

        assertNotNull(keyType);
        assertEquals("aleatoria", keyType);
    }

    /**
     * Method responsible for testing the CELULAR key type when it is informed in the upper case request waiting for
     * an enumerator to return.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsCelularAndUpperCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("CELULAR");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.CELULAR, keyType);
    }

    /**
     * Method responsible for testing the CELLULAR key type when it is informed in the lower case request, expecting
     * the return of an enumerator.
     */
    @Test
    public void testFromTypeWithSuccessWhenKeyTypeIsCelularAndLowerCase() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("celular");

        assertNotNull(keyType);
        assertEquals(KeyTypeEnum.CELULAR, keyType);
    }

    /**
     * Method responsible for testing the CELULAR key type when it is informed in the upper case request, expecting
     * a string to be returned.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsCelularAndUpperCase() {
        final String keyType = KeyTypeEnum.fromValue("CELULAR");

        assertNotNull(keyType);
        assertEquals("celular", keyType);
    }

    /**
     * Method responsible for testing the CELULAR key type when it is informed in the lower case request, expecting the
     * return of a string.
     */
    @Test
    public void testFromValueWithSuccessWhenKeyTypeIsCelularAndLowerCase() {
        final String keyType = KeyTypeEnum.fromValue("celular");

        assertNotNull(keyType);
        assertEquals("celular", keyType);
    }

    /**
     * Method responsible for testing an invalid key type waiting for an enumerator to return.
     */
    @Test
    public void testFromTypeWhenInvalidKeyType() {
        final KeyTypeEnum keyType = KeyTypeEnum.fromType("teste");

        assertNull(keyType);
    }

    /**
     * Method responsible for testing an invalid key type expecting a string to be returned.
     */
    @Test
    public void testFromValueWhenInvalidKeyType() {
        final String keyType = KeyTypeEnum.fromValue("teste");

        assertNull(keyType);
    }
}