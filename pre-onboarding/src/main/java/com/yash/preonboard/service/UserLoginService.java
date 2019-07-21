package com.yash.preonboard.service;


import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import javax.naming.ldap.InitialLdapContext;

import org.springframework.stereotype.Service;

import com.yash.preonboard.bean.UserCredential;



@Service
public class UserLoginService {

	public InitialDirContext checkUSerCredential(UserCredential userCredential){
	
		InitialDirContext initialDirContext=null;
		String ldapAdServer="ldap://inhydctlr01.yash.com:389";
	 	
		Hashtable<String, Object> environmentHashTable = new Hashtable<String, Object>();
       
		environmentHashTable.put(Context.SECURITY_AUTHENTICATION, "simple");
        
        if( null!=userCredential.getUsername()) {
        	
        	environmentHashTable.put(Context.SECURITY_PRINCIPAL, userCredential.getUsername());
        }
        if(null!=userCredential.getPassword()) {
        	environmentHashTable.put(Context.SECURITY_CREDENTIALS, userCredential.getPassword());
        }
        environmentHashTable.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        
        environmentHashTable.put(Context.PROVIDER_URL, ldapAdServer);
        
    
      try {
    	  initialDirContext = new InitialLdapContext(environmentHashTable, null);
    	  		return initialDirContext;
		   } 
      catch (NamingException e)
      	{
				return initialDirContext;
		}
	}
}
