package org.omidbiz.ejb;

import java.util.List;

import javax.ejb.Local;

import org.omidbiz.model.Customer;

@Local
public interface CustomerAction {

	public void save();

	public List<Customer> findAll();

}
