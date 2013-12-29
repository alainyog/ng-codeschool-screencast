package org.tw.spike.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class BulletinClient {

    public static void main(String[] args) {
        String url = "http://localhost:9090/bulletin/rest/post";

        try {

            Client client = com.sun.jersey.api.client.Client.create();
            WebResource webResource = client.resource(url);

            String input = "{\"title\":\"Movies\",\"body\":\"Movies lorem ipsum\"}";

            ClientResponse response = webResource.type("application/json")
                    .post(ClientResponse.class, input);

            if (response.getStatus() > 299) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);
            System.out.println("Output from Server: \n" + output + "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
