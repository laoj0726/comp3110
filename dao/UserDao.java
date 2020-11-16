package dao;

import domain.User;

public interface UserDao {

    public abstract void reg(User user);
    //register
    public abstract boolean isLogin(String userName,String passWord);
    //Log in

}