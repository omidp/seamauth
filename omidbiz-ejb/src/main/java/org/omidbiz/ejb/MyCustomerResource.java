package org.omidbiz.ejb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customer")
public class MyCustomerResource {

	@GET
	@Path("/{customerId}")
	@Produces("text/plain")
	public String getCustomer(@PathParam("customerId") int id) {

		return "askldj";

	}

}
