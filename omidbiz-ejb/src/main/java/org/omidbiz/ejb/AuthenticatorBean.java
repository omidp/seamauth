package org.omidbiz.ejb;

import javax.ejb.Stateless;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

/**
 * @author omid pourhadi : omidpourhadi AT gmail DOT com
 * @version 1.0
 * 
 */
@Stateless
@Name("authenticator")
public class AuthenticatorBean implements Authenticator
{
    @Logger
    private Log log;

    @In
    Identity identity;

    @In
    Credentials credentials;

    public boolean authenticate()
    {
        log.info("authenticating {0}", credentials.getUsername());
        return false;
    }

}
