package service;


import dao.UserDaoimp;


public class UserServiceimp implements UserService{


	@Override
	public void addone() {
		UserDaoimp ud = new UserDaoimp();
		ud.add();
	}
}
