package webservice;

import globaldata.GlobalData;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface {
	
	@Override
	public String authenticate(String macAddress, String key) {
		
		if((key != null/* && macAddress != null*/) && (GlobalData.sharedSecretKey.equals(key) /*&& GlobalData.userMacAddress.equals(macAddress)*/))
			return GlobalData.ON_AUTHENTICATION_SUCCESSFUL;
		
		return GlobalData.ON_AUTHENTICATION_UNSUCCESSFUL;
	}

}
