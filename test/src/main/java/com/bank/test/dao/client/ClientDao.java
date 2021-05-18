/**
 * 
 */
package com.bank.test.dao.client;

import java.util.Optional;

import com.bank.test.entities.Client;

/**
 * @author user
 *
 */
public interface ClientDao {
	Optional<Client> getClient(Long id);

}
