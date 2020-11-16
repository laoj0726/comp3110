package daoimpl;

import java.util.ArrayList;
import dao.UserDao;
import domain.User;

public class UserDaoImpl implements UserDao{


    static ArrayList<User> users=new ArrayList<User>();

    @Override
    public void reg(User user) {
        // TODO Auto-generated method stub
        users.add(user);
    }
    // Registration function: store user information in array list.

    @Override
    public boolean isLogin(String userName, String passWord) {
        // TODO Auto-generated method stub
        boolean flag = false;
        for (User user : users) {
            if(userName.equals(user.getUserName())&&passWord.equals(user.getPassWord())){
                flag = true;
                break;
            }
        }
        return flag;
    }
    //Login function: Check if the username and password are correct.

}