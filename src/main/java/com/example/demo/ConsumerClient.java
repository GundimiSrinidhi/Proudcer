package com.example.demo;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ConsumerClient {

	public static HttpEntity<?> getHeader()
	{
		HttpHeaders h=new HttpHeaders();
		h.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(h);
	}
	public void getEmp() throws RestClientException ,IOException
	{
		String url="http://localhost:7008/emp";
		RestTemplate r=new RestTemplate();
		
		ResponseEntity<String> result=null;
		try {
			
			result=r.exchange(url, HttpMethod.GET,getHeader(),String.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(result.getBody());
	}
	
}
