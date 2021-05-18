package com.bank.test.service.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.test.core.exception.NotFoundClientException;
import com.bank.test.dao.client.ClientDao;
import com.bank.test.entities.Client;
import com.bank.test.service.client.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDao clientDao;

	@Override
	public Client getClient(Long id) {
		return clientDao.getClient(id).orElseThrow(() -> new NotFoundClientException(id));
	}

}
