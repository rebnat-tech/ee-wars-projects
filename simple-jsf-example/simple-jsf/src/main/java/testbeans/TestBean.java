package testbeans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TestBean {

	public String getMessage() {
		return "Hello Darling";
	}
	
}
