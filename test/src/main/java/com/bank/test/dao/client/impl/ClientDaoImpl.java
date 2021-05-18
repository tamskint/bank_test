/**
 * 
 */
package com.bank.test.dao.client.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.test.dao.client.ClientDao;
import com.bank.test.entities.Client;

/**
 * @author user
 *
 */
@Repository
public class ClientDaoImpl implements ClientDao {

	@Autowired
	private ClientRepository repository;

	@Override
	public Optional<Client> getClient(Long id) {
		return repository.findById(id);
	}

}
