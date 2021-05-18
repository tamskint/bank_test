package com.bank.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.test.entities.Client;
import com.bank.test.service.client.ClientService;

@RestController
@RequestMapping(value = "bank/test/api/clients", produces = MediaType.APPLICATION_JSON_VALUE)
public class Clientcontroller {

	@Autowired
	private ClientService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> getClient(@PathVariable("id") Long id) {
		return ResponseEntity.ok(service.getClient(id));
	}

}
