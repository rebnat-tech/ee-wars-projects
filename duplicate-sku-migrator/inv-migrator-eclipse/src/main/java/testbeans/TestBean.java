package testbeans;

import javax.inject.Named;

@Named
@javax.faces.view.ViewScoped
public class TestBean {

	int i = 0;

	public String getMessage() {
		return "[" + i++ + "] Hello Darling";
	}

}
