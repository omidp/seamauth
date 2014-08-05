package org.omidbiz.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * @author omid pourhadi : omidpourhadi AT gmail DOT com
 * @version 1.0
 * 
 */
@Remote
public interface Authenticator
{

    boolean authenticate();

}
