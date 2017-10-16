package helloWorld;

import javax.jws.WebService;


@WebService
public class TestWebService {

	/*public void constructor(){
		
	}*/
	public String hello(String name){
		//Test
		return "Hello "+name;
	}
}
