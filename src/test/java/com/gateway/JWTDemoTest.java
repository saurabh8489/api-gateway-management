package com.gateway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.gateway.api.model.AuthenticationRequest;
import com.gateway.security.service.JWTService;

import io.jsonwebtoken.Claims;

public class JWTDemoTest {

	private static final Logger logger = LogManager.getLogger();

	// Create a simple JWT, decode it, and assert the claims

	@Test public void createAndDecodeJWT() {
	  
	  String jwtId = "SOMEID1234"; String jwtIssuer = "JWT Demo"; String jwtSubject
	  = "Andrew"; int jwtTimeToLive = 800000;
	  
	  String jwt = new JWTService().createJWT(new AuthenticationRequest("Vai", jwtIssuer, jwtSubject, jwtTimeToLive));
	  
	  logger.info("jwt = \"" + jwt.toString() + "\"");
	  
	  Claims claims = JWTService.decodeJWT(jwt);
	  
	  logger.info("claims = " + claims.toString());
	  
	  System.out.println(jwtId + " : " + claims.getId());
	  System.out.println(jwtIssuer + " : " + claims.getIssuer());
	  System.out.println(jwtSubject + " : " + claims.getSubject());
	  
	  }

}