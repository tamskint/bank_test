package com.bank.test.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.bank.test.core.model.Versionable;

@MappedSuperclass
public class VersionedBusinessIdentifiedEntity extends BusinessIdentifiedEntity implements Versionable {

	@Column(nullable = false)
	@Version
	private Long version;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
