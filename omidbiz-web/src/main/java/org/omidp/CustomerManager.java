package org.omidp;

import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.log.Log;
import org.omidbiz.ejb.CustomerAction;
import org.omidbiz.model.Customer;

@Name("customerManager")
@Scope(ScopeType.EVENT)
public class CustomerManager {

	@In(create=true)
	CustomerAction customerAction;
	
	@RequestParameter
	Long customerId;
	
	@Logger
	Log log;

	public List<Customer> getCustomers() {
		List<Customer> custs = customerAction.findAll();
		log.info("Customer Size is : " + custs.size());
		return custs;
	}
	
	public String doPrint(){
		log.info("This is Action with CustomerId " + customerId);
		return null;
	}
	

}
