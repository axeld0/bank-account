import java.util.Scanner;

public class Main {

    static Scanner scan;
    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int option = 0;
        Account newAccount = null;

        System.out.println("***************************************************\n");
        System.out.println("             Welcome to AXELDO's ATM.\n");
        System.out.println("***************************************************\n");

        do{
        System.out.println("Please, select an option :\n");
        System.out.println("1)Create an empty account.\n");
        System.out.println("2)Create an account with money in it.\n");
        System.out.println("3)Insert some money.\n");
        System.out.println("4)Withdraw money.\n");
        System.out.println("5)See balance.\n");
        System.out.println("6)exit.\n");
        option = scan.nextInt();

        switch (option){
            case 1 :
                newAccount = new Account(0);
                System.out.println("Congratulations! Now, your soul belongs to us. I mean, You've successfully created a bank account! :)");

                break;
            case 2 :
                System.out.println("Ok. How much money do you want to have on your account? Don't be greedy ;)\n");
                double initialMoney = scan.nextInt();
                newAccount = new Account(initialMoney);
                System.out.println("Great! Now you have a REAL bank account with $ ["+initialMoney+"] in it. Please, buy yourself something nice :) ");

                break;
            case 3 :
                if(newAccount!=null){
                    System.out.println("How much money do yo want to insert?");
                    double insertedMoney = scan.nextInt();
                    newAccount.insertMoney(insertedMoney);}
                else{
                    System.out.println("Wrong. Please create an account first.");
                }

                break;
            case 4:
                if(newAccount!=null){
                    System.out.println("How much money do yo want to withdraw?");
                    double withdrawedMoney = scan.nextInt();
                    newAccount.withdrawMoney(withdrawedMoney);}
                else{
                    System.out.println("Wrong. Please create an account first.");
                }

                break;
            case 5:
                if(newAccount != null)
                {
                    System.out.println( newAccount.toString());
                }

                break;


        }
        }while (option != 6);

    }
}