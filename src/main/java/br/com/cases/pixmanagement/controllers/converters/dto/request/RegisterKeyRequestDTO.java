package br.com.cases.pixmanagement.controllers.converters.dto.request;

import br.com.cases.pixmanagement.controllers.converters.dto.validators.KeyFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Class responsible for handling the input information of a new PIX key registration request.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Getter
@KeyFields
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class RegisterKeyRequestDTO {

    @JsonProperty(value = "tipoChave")
    @NotNull(message = "Tipo de chave não pode ser nulo")
    @NotEmpty(message = "Tipo de chave não pode ser vazio")
    @ApiModelProperty(value = "Tipo da chave (Celular | E-mail | CPF | CNPJ | EVP (aleatória))", required = true)
    private String tipoChave;

    @JsonProperty(value = "valorChave")
    @NotNull(message = "Valor da chave não pode ser nulo")
    @NotEmpty(message = "Valor da chave não pode ser vazio")
    @ApiModelProperty(value = "Valor da chave", required = true)
    private String valorChave;

    @Size(min = 1, max = 10)
    @JsonProperty(value = "tipoConta")
    @NotNull(message = "Tipo da conta não pode ser nulo")
    @NotEmpty(message = "Tipo da conta não pode ser vazio")
    @ApiModelProperty(value = "Tipo da conta (Corrente | Poupança)", required = true)
    private String tipoConta;

    @Size(min = 1, max = 4)
    @JsonProperty(value = "numeroAgencia")
    @NotNull(message = "Número da agência não pode ser nulo")
    @NotEmpty(message = "Número da agência não pode ser vazio")
    @ApiModelProperty(value = "Número da agência", required = true)
    private String numeroAgencia;

    @Size(min = 1, max = 8)
    @JsonProperty(value = "numeroConta")
    @NotNull(message = "Número da conta não pode ser nulo")
    @NotEmpty(message = "Número da conta não pode ser vazio")
    @ApiModelProperty(value = "Número da conta", required = true)
    private String numeroConta;

    @Size(min = 1, max = 30)
    @JsonProperty(value = "nomeCorrentista")
    @NotNull(message = "Nome do correntista não pode ser nulo")
    @NotEmpty(message = "Nome do correntista não pode ser vazio")
    @ApiModelProperty(value = "Nome do correntista", required = true)
    private String nomeCorrentista;

    @Size(max = 45)
    @JsonProperty(value = "sobrenomeCorrentista")
    @ApiModelProperty(value = "Sobrenome do correntista")
    private String sobrenomeCorrentista;
}