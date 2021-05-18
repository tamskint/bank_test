package com.bank.test.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import com.bank.test.core.model.Identifiable;

@MappedSuperclass
public class BusinessIdentifiedEntity extends BaseEntity implements Identifiable<Long> {

	@Id
	@SequenceGenerator(name = "TEC_BUSSINESSID_GENERATOR", sequenceName = "TEC_BUSSINESSID", allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEC_BUSSINESSID_GENERATOR")
	@Column(nullable = false)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
