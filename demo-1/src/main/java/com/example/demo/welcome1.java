package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;

    @RestController
    public class welcome1 {

        @GetMapping("/wel")
        public String welcome() {
            return "welcome to spring boot app development.0001.";
        }
        
    	
    	    @PostMapping("/encrypt")
    	    public Response encrypt(@RequestBody String plainJsonRequest) {
    	        try {
    	            // Replace with your actual public key file path
    	            String publicKeyPath = "E:\\pdl_encript\\public_crt_key.pem";
    	          //  return encryption.encryptFraudReportJsonRequest(plainJsonRequest, publicKeyPath);
    	            Response res=new Response(200,plainJsonRequest,encryption.encryptFraudReportJsonRequest(plainJsonRequest, publicKeyPath));
    	            return res;
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	            return new Response(0,plainJsonRequest,"");
    	        }
    	    }

    	    @PostMapping("/decrypt")
    	    public String decrypt(@RequestBody String encryptedResponse) {
    	        try {
    	            // Replace with your actual private key file path
    	            String privateKeyPath = "E:\\pdl_encript\\private_key.pem";
    	            return encryption.decryptFraudReportJsonResponse(encryptedResponse, privateKeyPath);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	            return "Error decrypting the response.";
    	        }
    	    }
    	
    
    }

    	
   