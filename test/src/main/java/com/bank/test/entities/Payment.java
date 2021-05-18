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
@DiscriminatorValue("P")
public class Payment extends Operation {

}
