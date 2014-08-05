package org.omidbiz.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

@Entity
@Table(name = "customers")
@Name("customer")
@AutoCreate
public class Customer implements Serializable {

	private long id;
	private String cname;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
