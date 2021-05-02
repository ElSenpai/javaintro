package gameProject;

public class CheckUserManager implements CheckUserService {

	@Override
	public boolean isExist(String tcNo) {
		if(tcNo=="12345")
			return true;
		else
			return false;
		
	}
	

}
