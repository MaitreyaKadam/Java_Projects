import java.util.Scanner;
public class Main
{
    public static void login_verify(String[] users,String[] users_password,String[] admin)
    {
            Scanner sc=new Scanner(System.in);
            System.out.print("Please Enter your username: ");
            String user_name=sc.nextLine();
            System.out.print("Please Enter your password: ");
            String user_password=sc.nextLine();
            // Please try to match the user input username and password, I have been trying it but i can't find where is the loophole
            for (int i=0; i<users.length; i++)
            {
                if (user_name==users[i] || user_password==users_password[i])
                {
                    System.out.println("Successfull Login");
                }
            }
    }
    public static void main(String[] args)
    {
        String[] users = {"Maitreya", "Ashutosh", "Atharva"};
        String[] users_password={"1234","5678","357"};
        String[] admin= {"Neeta","Manisha Joshi","Arti Sawant"};
        Scanner sc=new Scanner(System.in);
        System.out.println("*************************** Welcome to Pai Friends Library ***************************");
        System.out.println("Would you like to proceed for login..??"+"\n"+"Yes or No..??");
        String user_choice=sc.nextLine();
        if (user_choice=="Yes") //After Getting the user input the code control flow is not going to the function
        {
            login_verify(users,users_password,admin);
        }

    }
}