package com.pepsico.pipeline.pipelinedemo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class CAPost {

    public static void main(String[] args)
    {
        //ClientHttpRequestFactory requestFactory = getClientHttpRequestFactory();

        for(int i=0;i<300;i++)
        {
            try{
                RestTemplate restTemplate = new RestTemplate();
                String fooResourceUrl = "http://cf-po1pocnodejs-busy-lynx.apps.pcf.dev.azure.intra.pepsico.com/api/Orders";
                HttpEntity<Order> order = new HttpEntity<>(new Order());
               // ResponseEntity<Order> response = restTemplate.postForEntity(fooResourceUrl,order,Order.class);

            }
            catch (Exception e)
            {
                System.out.println("Error "+i);
            }
        }


    }
}
