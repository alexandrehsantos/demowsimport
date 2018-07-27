package br.com.test.soap;

import javax.xml.ws.Endpoint;

public class PublicaService {

	public static void main(String[] args) {

		HelloWeb helloWeb = new HelloWeb();
		Endpoint.publish("http://localhost:8080/hello", helloWeb);
	}

}
