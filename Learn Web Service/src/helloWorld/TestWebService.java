package helloWorld;

import javax.jws.WebService;


@WebService
public class TestWebService {

	/*public void constructor(){
		
	}*/
	public String hello(String name){
		//Testing
		return "Hello "+name;
	}
}
