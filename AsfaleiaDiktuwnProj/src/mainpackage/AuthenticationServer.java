package mainpackage;

import javax.xml.ws.Endpoint;

import webservice.WebServiceImpl;

public class AuthenticationServer {

	public static void main(String[] args) {
		//http://localhost:9995/authserver?wsdl
		Endpoint.publish("http://0.0.0.0:9995/authserver", new WebServiceImpl());
	}
}
