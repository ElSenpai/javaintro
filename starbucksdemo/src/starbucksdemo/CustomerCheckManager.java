package starbucksdemo;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(String nationalId) {
		System.out.println("M��teri Id do�ruland�");
		return true;
	}

	

}
