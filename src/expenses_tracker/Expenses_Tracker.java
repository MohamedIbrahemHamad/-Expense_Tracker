
package expenses_tracker;
import java.util.*;
import java.util.InputMismatchException;

public class Expenses_Tracker {

    public static void runApp() {

        Expenses_Operation tracker = new Expenses_Operation();
        Scanner input = new Scanner(System.in);

        Print_Char(42, '*');
        System.out.println("* Welcome in Expenses tracker application *");
        Print_Char(42, '*');
        System.out.println();

        boolean validInput = false;
        double bud = 0.0;
        
        while (!validInput) {
            try {
                System.out.println("please enter your total budget: ");
                bud = input.nextDouble();
             boolean v = false ; 
              while (!v) {
                    if (bud > 0.0)
                        v = true;
                    else {
                        System.out.println("Out of the Rang : the budget must be positive");
                        bud = input.nextDouble();
                    }
                }//nested while
                    
                validInput = true;
            } 
            catch (InputMismatchException e) {
                System.out.println("HOOP HOOP! budget numeric value");
                input.next();
            }
        }//while

        Print_Char(42, '_');
        tracker.initialize_budget(bud);
        System.out.println("Your budget is successfully saved!");
        Print_Char(42, '_');

        int flag = 100;
        while (flag > 0)  {

            System.out.println("MENU : ");
            System.out.println("1. Add new Expense ");
            System.out.println("2. Delete an existing expense ");
            System.out.println("3. Display All expenses ");
            System.out.println("4. Display by specific category");
            System.out.println("5. Display Total spending");
            System.out.println("6. Display Total Saved");
            System.out.println("7. Exit");
            Print_Char(42, '_');
           
            int choice = 0;
            boolean valid_Input = false;
            boolean valid_Input_two = false;

            while (!valid_Input) {

                try {
                    System.out.println("To select from MENU Enter your choice from 1 to 7 : ");
                    choice = input.nextInt();
                    while (!valid_Input_two) {

                        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7)
                            valid_Input_two = true;
                        else {
                            System.out.println("Out of the Rang : the choose from MENU must be from 1 to 7 ");
                            choice = input.nextInt();
                        }
                    }//while loop
                    valid_Input = true;
                } 
                catch (InputMismatchException e) {
                    System.out.println(" HOOP HOOP! choice must be numeric value ");
                    input.next();
                }
            }

            Print_Char(42, '_');

            boolean flag_two = false;
            boolean vld_Input = false;
            boolean vd_Input = false;
            double val = 0;
            int category = 0;

            switch (choice) {

                case 1:

                    while (!vld_Input) {

                        try {
                            System.out.println("Please ,Enter amount of expense: ");
                            val = input.nextDouble();
                            vld_Input = true;
                        } catch (InputMismatchException e) {
                            System.out.println(" HOOP HOOP!amount must be numeric value ");
                            input.next();
                        }
                    }//while loop

                    Print_Char(42, '_');
                    System.out.println("category of expense : ");
                    System.out.println("1. Food ");
                    System.out.println("2. Transportation ");
                    System.out.println("3. Personal ");
                    System.out.println("4. Entertainment");
                    System.out.println("5. Other");
                    Print_Char(42, '_');

                    while (!vd_Input) {

                        try {
                            System.out.println("Select category of expense by choose number from 1 to 5 : ");
                            category = input.nextInt();
                            while (!flag_two) {

                                if (category == 1 || category == 2 || category == 3 || category == 4 || category == 5)
                                    flag_two = true;
                                else {
                                    System.out.println("Out of the Rang : Selection must be from 1 to 5 ");
                                    category = input.nextInt();
                                }
                                vd_Input = true;
                            }

                        } catch (InputMismatchException e) {
                            System.out.println(" HOOP HOOP! category must be numeric value");
                            input.next();
                        }
                    }//while loop

                    switch (category) {

                        case 1:

                            if (tracker.Check_budget(val)) {
                                tracker.Add_Expense(val, "Food");
                                System.out.println("your expense is successfully added !");
                                flag--;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense is exceeds our budget ,failed to added !");
                                Print_Char(42, '_');
                            }

                            break;

                        case 2:

                            if (tracker.Check_budget(val)) {
                                tracker.Add_Expense(val, "Transportation");
                                System.out.println("your expense is successfully added !");
                                flag--;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense is exceeds our budget ,failed to added !");
                                Print_Char(42, '_');
                            }
                            break;

                        case 3:

                            if (tracker.Check_budget(val)) {
                                tracker.Add_Expense(val, "Personal");
                                System.out.println("your expense is successfully added !");
                                flag--;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense is exceeds our budget ,failed to added !");
                                Print_Char(42, '_');
                            }
                            break;

                        case 4:
                            if (tracker.Check_budget(val)) {
                                tracker.Add_Expense(val, "Entertainment");
                                System.out.println("your expense is successfully added !");
                                flag--;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense is exceeds our budget ,failed to added !");
                                Print_Char(42, '_');
                            }
                            break;

                        case 5:

                            if (tracker.Check_budget(val)) {
                                tracker.Add_Expense(val, "Other");
                                System.out.println("your expense is successfully added !");
                                flag--;
                                Print_Char(42, '_');
                            } else {

                                System.out.println("this expense is exceeds our budget ,failed to added !");
                                Print_Char(42, '_');
                            }
                            break;

                        default:
                            System.out.println("Invalid choice ,Please enter valid category !");
                            Print_Char(42, '_');

                    }//nested switch

                    break;

                case 2:
                    boolean isEnabled = false;
                    while (!isEnabled) {

                        try {
                            System.out.println("Please ,Enter amount of expense that you want to delete : ");
                            val = input.nextDouble();
                            isEnabled = true;
                        } catch (InputMismatchException e) {
                            System.out.println(" HOOP HOOP!amount must be numeric value ");
                            input.next();
                        }
                    }//while loop

                    Print_Char(42, '_');
                    System.out.println("category  : ");
                    System.out.println("1. Food ");
                    System.out.println("2. Transportation ");
                    System.out.println("3. Personal ");
                    System.out.println("4. Entertainment");
                    System.out.println("5. Other");
                    Print_Char(42, '_');

                    boolean valid_Inapt = false;
                    boolean fg = false;

                    while (!valid_Inapt) {

                        try {
                            System.out.println("Select category of expense that you want to delete by choose number from 1 to 5 : ");
                            category = input.nextInt();
                            while (!fg) {

                                if (category == 1 || category == 2 || category == 3 || category == 4 || category == 5)
                                    fg = true;
                                else {
                                    System.out.println("Out of the Range : Selection must be from 1 to 5 ");
                                    category = input.nextInt();
                                }
                                valid_Inapt = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(" HOOP HOOP! category must be numeric value ");
                            input.next();
                        }
                    } //while loop

                    switch (category) {
                        case 1:
                            if (tracker.Delete_Expense(val, "Food")) {
                                System.out.println("your expense is successfully deleted !");
                                flag++;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense does not exists ,failed to deleted !");
                                Print_Char(42, '_');
                            }
                            break;


                        case 2:
                            if (tracker.Delete_Expense(val, "Transportation")) {
                                System.out.println("your expense is successfully deleted !");
                                flag++;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense does not exists ,failed to deleted !");
                                Print_Char(42, '_');
                            }
                            break;


                        case 3:
                            if (tracker.Delete_Expense(val, "Personal")) {
                                System.out.println("your expense is successfully deleted !");
                                flag++;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense does not exists ,failed to deleted !");
                                Print_Char(42, '_');
                            }
                            break;

                        case 4:
                            if (tracker.Delete_Expense(val, "Entertainment")) {
                                System.out.println("your expense is successfully deleted !");
                                flag++;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense does not exists ,failed to deleted !");
                                Print_Char(42, '_');
                            }
                            break;

                        case 5:
                            if (tracker.Delete_Expense(val, "Other")) {
                                System.out.println("your expense is successfully deleted !");
                                flag++;
                                Print_Char(42, '_');
                            } else {
                                System.out.println("this expense does not exists ,failed to deleted !");
                                Print_Char(42, '_');
                            }
                            break;

                        default:
                            System.out.println("Invalid choice ,Please enter valid category !");
                            Print_Char(42, '_');

                    }//nested switch

                    break;

                case 3:
                    System.out.println("EXPENSES LIST :");
                    Print_Char(42, '*');
                    tracker.Display_All_expense();
                    Print_Char(42, '*');
                    break;

                case 4:

                    System.out.println("category :");
                    System.out.println("1. Food ");
                    System.out.println("2. Transportation ");
                    System.out.println("3. Personal ");
                    System.out.println("4. Entertainment");
                    System.out.println("5. Other");
                    Print_Char(42, '_');

                    boolean flags = false;
                    boolean isCorrect = false;

                    while (!flags) {

                        try {
                            System.out.println(" Enter Selection of category that you want to display : ");
                            category = input.nextInt();

                            while (!isCorrect) {

                                if (category == 1 || category == 2 || category == 3 || category == 4 || category == 5)
                                    isCorrect = true;
                                else {
                                    System.out.println("warning : Selection must be from 1 to 5 ");
                                    category = input.nextInt();
                                }
                                flags = true;

                            }

                        } catch (InputMismatchException e) {

                            System.out.println(" HOOP HOOP! Selection must be numeric value ");
                            input.next();
                        }
                    }

                    switch (category) {

                        case 1:
                            System.out.println("Food Expenses List  : ");
                            tracker.Display_by_category("Food");
                            Print_Char(42, '*');
                            break;

                        case 2:
                            System.out.println("Transportation Expenses List  : ");
                            tracker.Display_by_category("Transportation");
                            Print_Char(42, '*');
                            break;

                        case 3:
                            System.out.println("Personal Expenses List  : ");
                            tracker.Display_by_category("Personal");
                            Print_Char(42, '*');
                            break;

                        case 4:
                            System.out.println("Entertainment Expenses List  : ");
                            tracker.Display_by_category("Entertainment");
                            Print_Char(42, '*');
                            break;

                        case 5:
                            System.out.println("Other Expenses List  : ");
                            tracker.Display_by_category("Other");
                            Print_Char(42, '*');
                            break;

                        default:
                            System.out.println("Invalid choice ,Please enter valid category !");
                            Print_Char(42, '_');

                    }//nested switch

                    break;

                case 5:

                    System.out.println("Your total spending until now is  : " + tracker.Total_spending());
                    Print_Char(42, '_');
                    break;

                case 6:

                    System.out.println("You are saved until now : " + tracker.Total_Saving());
                    Print_Char(42, '_');
                    break;

                case 7:

                    Print_Char(42, '_');
                    System.out.println("Great , You are saved : " + tracker.Total_Saving());
                    System.out.println("Thanks for using our Expenses tracker application !");
                    Print_Char(50, '#');
                    flag = 0;
                    break;

                default:

                    System.out.println("Invalid choice , Please enter valid choice !");
                    Print_Char(42, '_');
            }//switch
        }//while
    }//runApp


    public static void Print_Char(int n, char c) {

        for (int i = 0; i <= n; i++)
            System.out.print(c);
        System.out.println();
    }//print_char 


    public static void main(String[] args) {
        runApp();
    }//main


}//class
