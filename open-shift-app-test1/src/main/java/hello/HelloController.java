package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/test1/")
    public String index() {
    	
    	String out="";
    	for(String k : System.getenv().keySet()) {
    		String v=System.getenv(k);
    		if(k!=null) out+=k+'='+v+"<br>";
    	}
        return "Greetings from Spring Boot!<br>"+out;
    }
    
}
