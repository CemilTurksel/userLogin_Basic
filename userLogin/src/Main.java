import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String username, password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = scanner.nextLine();

        System.out.println("Enter password: ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123"))
        {
            System.out.println("Login is successful.");
        }
        else{
            System.out.println("Password is wrong, do want to change it ? : ");
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                System.out.println("Enter your new password: ");
                String newPassword = scanner.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Password could not be changed. It is same as the before");
                }
                else {
                    password = newPassword;
                    System.out.println("Password is successfully changed! New password is: " + newPassword);
                }
            }
            else{
                    System.out.println("Program is finished.");
                }

            }
        }


    }