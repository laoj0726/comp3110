package test;

import java.io.IOException;
import java.util.Scanner;

import daoimpl.UserDaoImpl;
import domain.User;
import game.mindQuiz;

public class Login {
    public static void main(String[] args) {
        while(true){

        System.out.println("Welcome to Gamize£º");
        System.out.println("1.Register");
        System.out.println("2.Log in");
        System.out.println("3.Exit");
        // Prompts the user to log in or register
        UserDaoImpl uid= new UserDaoImpl();

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        switch (choice) {
        case "1":
            System.out.println("Registration");
            System.out.println("Please enter your user name£º");
            String userName = sc.nextLine();
            System.out.println("Please enter your password£º");
            String passWord = sc.nextLine();
            // Encapsulate user name and password into a user class object
            User user = new User(userName,passWord);
            // Call the registration function through the user manipulation class object
            uid.reg(user);
            System.out.println("Register successfully£¡");
            break;
        case "2":
            System.out.println("Log in");
            System.out.println("Please enter your user name£º");
            String inputUserName = sc.nextLine();
            System.out.println("Please enter your password£º");
            String inputPassWord = sc.nextLine();
            // Call the Login function through the user manipulation class object.
            boolean flag = uid.isLogin(inputUserName,inputPassWord);
            if (flag) {
                System.out.println("Log in successfully and play the game!");
                try {
					mindQuiz.main(args);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }else{
                System.out.println("Failed login!");
            }   
            break;
        case "3":
        default:
            System.exit(0);
            break;
        }

    }
    }
}