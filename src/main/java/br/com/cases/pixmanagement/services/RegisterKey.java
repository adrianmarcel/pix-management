package br.com.cases.pixmanagement.services;

import br.com.cases.pixmanagement.entities.Key;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Class responsible for being the service layer between the API controller and the database.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Slf4j
@Service
@AllArgsConstructor
public class RegisterKey {

    /**
     * Method responsible for calling the application's repository layer to persist a new PIX key in the database.
     *
     * @param key Key entity mapped to persistence in the database.
     * @return String containing the id of the persisted key.
     */
    public String execute(final Key key) {
        return "";
    }

}
