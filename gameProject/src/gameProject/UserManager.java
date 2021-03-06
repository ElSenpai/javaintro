package gameProject;

public class UserManager implements UserService{

	private CheckUserService check;
	public UserManager(CheckUserService check) {
		
		this.check = check;
	}

	@Override
	public void add(User user) {

      if(check.isExist(user.getTcNo())) {
    	  System.out.println("Yeni kullanıcı eklendi :"+ user.getFirstName());
      }else {
    	  
    	  System.out.println("Tc Kimlik bulunmuyor");
      }
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanıcı güncellendi :"+ user.getFirstName());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("kullanıcı silindi :"+ user.getFirstName());
	}

}
