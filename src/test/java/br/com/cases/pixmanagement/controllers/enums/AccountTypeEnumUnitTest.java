package br.com.cases.pixmanagement.controllers.enums;

import br.com.cases.pixmanagement.controllers.converters.dto.enums.AccountTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Class responsible for unit testing conversion test scenarios for available account types.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@RunWith(MockitoJUnitRunner.class)
public class AccountTypeEnumUnitTest {

    /**
     * Method responsible for testing the success scenario by returning an enumerator when the account type is
     * "Conta Corrente" and is written in upper case.
     */
    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaCorrenteAndUpperCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("CONTA_CORRENTE");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_CORRENTE, accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning an enumerator when the account type is
     * "Conta Corrente" and is written in lower case.
     */
    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaCorrenteAndLowerCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("conta_corrente");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_CORRENTE, accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning a string when the account type is
     * "Conta Corrente" and is written in upper case.
     */
    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaCorrenteAndUpperCase() {
        final String accountType = AccountTypeEnum.fromValue("CORRENTE");

        assertNotNull(accountType);
        assertEquals("corrente", accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning a string when the account type is
     * "Conta Corrente" and is written in lower case.
     */
    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaCorrenteAndLowerCase() {
        final String accountType = AccountTypeEnum.fromValue("corrente");

        assertNotNull(accountType);
        assertEquals("corrente", accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning an enumerator when the account type is
     * "Conta Poupança" and is written in upper case.
     */
    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaPoupancaAndUpperCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("CONTA_POUPANCA");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_POUPANCA, accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning an enumerator when the account type is
     * "Conta Poupança" and is written in lower case.
     */
    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaPoupancaAndLowerCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("conta_poupanca");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_POUPANCA, accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning a string when the account type is
     * "Conta Poupança" and is written in upper case.
     */
    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaPoupancaAndUpperCase() {
        final String accountType = AccountTypeEnum.fromValue("POUPANÇA");

        assertNotNull(accountType);
        assertEquals("poupança", accountType);
    }

    /**
     * Method responsible for testing the success scenario by returning a string when the account type is
     * "Conta Poupança" and is written in lower case.
     */
    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaPoupancaAndLowerCase() {
        final String accountType = AccountTypeEnum.fromValue("poupança");

        assertNotNull(accountType);
        assertEquals("poupança", accountType);
    }

    /**
     * Method responsible for testing the scenario of an invalid account type waiting for an enumerator to return.
     */
    @Test
    public void testFromTypeWhenInvalidAccountType() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("teste");

        assertNull(accountType);
    }

    /**
     * Method responsible for testing the scenario of an invalid account type waiting for a string to be returned.
     */
    @Test
    public void testFromValueWhenInvalidAccountType() {
        final String accountType = AccountTypeEnum.fromValue("teste");

        assertNull(accountType);
    }
}