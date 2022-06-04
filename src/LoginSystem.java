import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String systemUserName = "patika";
        String systemPassword = "java";
        System.out.print("Please Enter User Name..:");
        String userName = scanner.nextLine();
        System.out.print("Please Enter Password..:");
        String userPassword = scanner.nextLine();

        if (userName.equals(systemUserName) && userPassword.equals(systemPassword)) {
            System.out.println("Login Successfully.Welcome");
        } else if (!userName.equals(systemUserName) && userPassword.equals(systemPassword)) {
            System.out.println("User name is wrong please try again");
        } else if (userName.equals(systemUserName) && !userPassword.equals(systemPassword)){
            System.out.println("Password wrong. Would you like reset your password. (YES=>Y) , (NO => N)");
            char isResetSelection = scanner.next().charAt(0);
            if (isResetSelection == 'Y') {
                System.out.print("Enter a new password..:");
                String newPassword = scanner.next();
                if (newPassword.equals(systemPassword) || newPassword.equals(userPassword)) {
                    System.out.println("Password does not update please try again");
                } else {
                    System.out.println("Password is updated.");
                }
            } else {
                System.out.println("Password does not reset.");
            }
        }else{
            System.out.println("User name & password is wrong please try again");
        }
    }
}
