package com.gateway.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.api.model.AuthenticationRequest;
import com.gateway.api.model.AuthenticationResponse;
import com.gateway.security.service.JWTService;



@RestController
@RequestMapping("/v1/api")
public class GatewayController {
	
	@Autowired
    private JWTService service;
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest requestBody) throws Exception {
		String token;
		try {
			 token = service.createJWT(requestBody);
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

		return ResponseEntity.ok(new AuthenticationResponse(token));
	}

	
}
