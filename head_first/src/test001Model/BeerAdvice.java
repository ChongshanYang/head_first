package test001Model;

import java.util.ArrayList;
import java.util.List;

public class BeerAdvice {
	public List getAdvice(String color){
		List advice = new ArrayList();
		if("1".equals(color)){
			advice.add("advice==1");
		}else{
			advice.add("advice==2");
			advice.add("advice==3");
		}		
		return advice;
		
	}
}
