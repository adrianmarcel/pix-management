package br.com.cases.pixmanagement.controllers.converters.dto.validators;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Interface responsible for validating PIX registry key fields.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {KeyFieldsValidator.class})
public @interface KeyFields {
}
