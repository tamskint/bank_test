/**
 * 
 */
package com.bank.test.dao.client.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.test.entities.Client;

/**
 * @author user
 *
 */
interface ClientRepository extends JpaRepository<Client, Long>{

}
