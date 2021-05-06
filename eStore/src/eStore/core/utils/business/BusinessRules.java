package eStore.core.utils.business;

public class BusinessRules {

	public static boolean run(  boolean logics[]) {
		
		for (boolean logic : logics) {
			
			if(!logic) {
				
				return logic ;
			}
			
		}
		return false;
	}
}
