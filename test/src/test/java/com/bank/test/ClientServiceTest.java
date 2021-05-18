package com.bank.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import com.bank.test.dao.client.ClientDao;
import com.bank.test.entities.Client;
import com.bank.test.service.client.impl.ClientServiceImpl;

@RunWith(SpringRunner.class)
public class ClientServiceTest {
	@Mock
	private ClientDao dao;
	@InjectMocks
	private ClientServiceImpl service;

	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void get_one_client_test() {
		given(dao.getClient(anyLong())).willReturn(expectedData());
		Client result = service.getClient(1L);
		assertThat(result.getFisrtName()).isEqualTo("testName");
	}

	private Optional<Client> expectedData() {
		Client client = new Client();
		client.setId(1L);
		client.setFisrtName("testName");
		return Optional.ofNullable(client);
	}

}
