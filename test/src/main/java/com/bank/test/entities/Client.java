/**
 * 
 */
package com.bank.test.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * @author user
 *
 */
@Entity
public class Client extends VersionedBusinessIdentifiedEntity implements Serializable {
	private String fisrtName;
	private String lastName;
	private String email;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Account> accounts;

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
