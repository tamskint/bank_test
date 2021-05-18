/**
 * 
 */
package com.bank.test.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author user
 *
 */
@Entity
@DiscriminatorValue("CA")
public class CurrentAccount extends Account {
	private double overdraft;

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

}
