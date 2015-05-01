package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServiceInterface {

	@WebMethod
	public String authenticate(String macAddress, String key);
}
