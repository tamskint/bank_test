/**
 * 
 */
package com.bank.test.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author user
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OPERATION_TYPE", discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation extends VersionedBusinessIdentifiedEntity implements Serializable {
	private double amount;
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_NUMBER")
	private Account account;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
