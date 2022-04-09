package br.com.cases.pixmanagement.controllers.enums;

import br.com.cases.pixmanagement.controllers.dto.enums.AccountTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountTypeEnumUnitTest {

    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaCorrenteAndUpperCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("CONTA_CORRENTE");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_CORRENTE, accountType);
    }

    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaCorrenteAndLowerCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("conta_corrente");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_CORRENTE, accountType);
    }

    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaCorrenteAndUpperCase() {
        final String accountType = AccountTypeEnum.fromValue("CORRENTE");

        assertNotNull(accountType);
        assertEquals("corrente", accountType);
    }

    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaCorrenteAndLowerCase() {
        final String accountType = AccountTypeEnum.fromValue("corrente");

        assertNotNull(accountType);
        assertEquals("corrente", accountType);
    }

    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaPoupancaAndUpperCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("CONTA_POUPANCA");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_POUPANCA, accountType);
    }

    @Test
    public void testFromTypeWithSuccessWhenAccountTypeIsContaPoupancaAndLowerCase() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("conta_poupanca");

        assertNotNull(accountType);
        assertEquals(AccountTypeEnum.CONTA_POUPANCA, accountType);
    }

    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaPoupancaAndUpperCase() {
        final String accountType = AccountTypeEnum.fromValue("POUPANÇA");

        assertNotNull(accountType);
        assertEquals("poupança", accountType);
    }

    @Test
    public void testFromValueWithSuccessWhenAccountTypeIsContaPoupancaAndLowerCase() {
        final String accountType = AccountTypeEnum.fromValue("poupança");

        assertNotNull(accountType);
        assertEquals("poupança", accountType);
    }

    @Test
    public void testFromTypeWhenInvalidAccountType() {
        final AccountTypeEnum accountType = AccountTypeEnum.fromType("teste");

        assertNull(accountType);
    }

    @Test
    public void testFromValueWhenInvalidAccountType() {
        final String accountType = AccountTypeEnum.fromValue("teste");

        assertNull(accountType);
    }
}