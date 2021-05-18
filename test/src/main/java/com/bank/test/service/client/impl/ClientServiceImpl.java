package com.bank.test.service.client.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.test.core.exception.NotFoundClientException;
import com.bank.test.dao.client.ClientDao;
import com.bank.test.entities.Client;
import com.bank.test.service.client.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	private static final Logger log = LoggerFactory.getLogger(ClientServiceImpl.class);

	@Autowired
	private ClientDao clientDao;

	@Override
	public Client getClient(Long id) {
		log.info("get client id {}", id);
		return clientDao.getClient(id).orElseThrow(() -> new NotFoundClientException(id));
	}

}
