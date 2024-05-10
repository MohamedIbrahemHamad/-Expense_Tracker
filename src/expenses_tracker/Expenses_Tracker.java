
package expenses_tracker;

import java.util.* ;

public class Expenses_Tracker {

    public static void main(String [] args) {
        
        Expenses_Operation tracker = new Expenses_Operation() ;
        Scanner input = new Scanner (System. in) ;
        
       Print_Char(42 , '#') ;
       System.out.println("# Welcome in Expenses tracker application #");
       Print_Char(42 , '#') ;
       System.out.println();
       
        System.out.println("First ,Please enter your total budget : ");
       double bud = input.nextDouble() ;
        Print_Char(42 , '_') ;
       tracker.initialize_budget(bud);
         System.out.println("your budget is successfully saved !");
        Print_Char(42 , '_') ;
        
        int flag = 100 ;
        
      while(flag > 0) {
        
            System.out.println("MENUE : ");
            System.out.println("1. Add new Expense ");
            System.out.println("2. Delete exsist Expense ");
            System.out.println("3. Display All expenses ");
            System.out.println("4. Display by specific category");
            System.out.println("5. Display Total spending");
            System.out.println("6. Display Total Saved");
            System.out.println("7. Exit");
             Print_Char(42 , '_') ;
            System.out.println("Please ,Enter your choice : ");
              int choice = input.nextInt() ;
             Print_Char(42 , '_') ;
             
       
           switch (choice) {
               
               case 1:
                    
                   System.out.println("Please ,Enter amount of expense: ");
                   double val = input.nextDouble() ;
                     Print_Char(42 , '_') ;
                     
                     System.out.println("Select category of expense : ");
                     System.out.println("1. Food ");
                     System.out.println("2. Transportation ");
                     System.out.println("3. Personal ");
                     System.out.println("4. Entertainment");
                     System.out.println("5. Othor");
                      Print_Char(42 , '_') ;
    
                     int category = input.nextInt() ;
                    
                     switch(category){ 
                         
                          case 1 :
                             
                             if (tracker.Check_budget(val)){
                             tracker.Add_Expense(val, "Food");
                              System.out.println("your expense is successfully added !");
                              flag -- ;
                                Print_Char(42 , '_') ;}
                            else {
                                 System.out.println("this expense is exceeds our budget ,failed to added !");
                                  Print_Char(42 , '_') ;
                             }
                             
                             break ;
                             
                          case 2 :
                                  
                            if (tracker.Check_budget(val)){
                             tracker.Add_Expense(val, "Transportation");
                              System.out.println("your expense is successfully added !");
                              flag -- ;
                                Print_Char(42 , '_') ;}
                             else {
                                 System.out.println("this expense is exceeds our budget ,failed to added !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                              
                          case 3 :
                                  
                            if (tracker.Check_budget(val)){
                             tracker.Add_Expense(val, "Personal");
                              System.out.println("your expense is successfully added !");
                              flag -- ;
                                Print_Char(42 , '_') ;}
                            else {
                                 System.out.println("this expense is exceeds our budget ,failed to added !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                              
                              
                              
                          case 4 :
                             if (tracker.Check_budget(val)){
                             tracker.Add_Expense(val, "Entertainment");
                              System.out.println("your expense is successfully added !");
                              flag -- ;
                                Print_Char(42 , '_') ;}
                             else {
                                 System.out.println("this expense is exceeds our budget ,failed to added !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                             
                          case 5 :
                                  
                             if (tracker.Check_budget(val)){
                             tracker.Add_Expense(val, "Othor");
                              System.out.println("your expense is successfully added !");
                              flag -- ;
                                Print_Char(42 , '_') ;}
                            else {
                                 
                                 System.out.println("this expense is exceeds our budget ,failed to added !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                              
                          default:
                               System.out.println("Invalid choice ,Please enter valid category !");
                               Print_Char(42 , '_') ;
                               
                     }//nested switch
                     
                    break ;
                  
               case 2:
                      System.out.println("Please ,Enter amount of expense that you want to delete : ");
                      val = input.nextDouble() ;
                     Print_Char(42 , '_') ;
                     
                     
                     System.out.println("Select category of expense that you want to delete : ");
                     System.out.println("1. Food ");
                     System.out.println("2. Transportation ");
                     System.out.println("3. Personal ");
                     System.out.println("4. Entertainment");
                     System.out.println("5. Othor");
                      Print_Char(42 , '_') ;
    
                      category = input.nextInt() ;
                    
                     switch(category){ 
                         case 1 :
                             if (tracker.Delete_Expense(val, "Food")) {
                              System.out.println("your expense is successfully deleted !");
                              flag ++ ; 
                               Print_Char(42 , '_') ;
                             }
                             else 
                             {
                                 System.out.println("this expense does not exsist ,failed to deleted !");
                                  Print_Char(42 , '_') ;
                             }
                             
                             break ;
                             
                             
                         case 2 :
                              if (tracker.Delete_Expense(val, "Transportation")) {
                              System.out.println("your expense is successfully deleted !");
                              flag ++ ; 
                              Print_Char(42 , '_') ;
                             }
                             else 
                             {
                                 System.out.println("this expense does not exsist ,failed to deleted !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                              
                              
                         case 3 :
                             if (tracker.Delete_Expense(val, "Personal")) {
                              System.out.println("your expense is successfully deleted !");
                              flag ++ ; 
                               Print_Char(42 , '_') ;
                             }
                             else 
                             {
                                 System.out.println("this expense does not exsist ,failed to deleted !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                              
                              
                         case 4 :
                              if (tracker.Delete_Expense(val, "Entertainment")) {
                              System.out.println("your expense is successfully deleted !");
                              flag ++ ; 
                               Print_Char(42 , '_') ;
                             }
                             else 
                             {
                                 System.out.println("this expense does not exsist ,failed to deleted !");
                                  Print_Char(42 , '_') ;
                             }
                              break ;
                             
                              
                         case 5 :
                              if (tracker.Delete_Expense(val, "Othor")) {
                              System.out.println("your expense is successfully deleted !");
                              flag ++ ; 
                               Print_Char(42 , '_') ;
                             }
                             else 
                             {
                                 System.out.println("this expense does not exsist ,failed to deleted !");
                                  Print_Char(42 , '_') ;
                             }
                                
                              break ;
                              
                         default:
                               System.out.println("Invalid choice ,Please enter valid category !");
                                Print_Char(42 , '_') ;
                                
                     }//nested switch

                  
                    break;
                    
                    
               case 3:
                    System.out.println("EXPENSES LIST :");
                    Print_Char(42 , '*') ;
                   tracker.Display_All_expense();
                    Print_Char(42 , '*') ;
                    
                    break;
                    
                    
               case 4:
                   
                     System.out.println("Select category that you want to display : ");
                     System.out.println("1. Food ");
                     System.out.println("2. Transportation ");
                     System.out.println("3. Personal ");
                     System.out.println("4. Entertainment");
                     System.out.println("5. Othor");
                      Print_Char(42 , '_') ;
                      
                      category = input.nextInt() ;
                    
                     switch(category){ 
                         
                         case 1 :
                            System.out.println("Food Expenses List  : ");
                             tracker.Display_by_category("Food");
                              Print_Char(42 , '*') ;
                             break ;
                             
                         case 2 :
                              System.out.println("Transportation Expenses List  : ");
                             tracker.Display_by_category("Transportation");
                               Print_Char(42 , '*') ;
                              break ;
                              
                         case 3 :
                            System.out.println("Personal Expenses List  : ");
                             tracker.Display_by_category("Personal");
                               Print_Char(42 , '*') ;
                              break ;
                              
                              
                         case 4 :
                            System.out.println("Entertainment Expenses List  : ");
                             tracker.Display_by_category("Entertainment");
                               Print_Char(42 , '*') ;
                              break ;
                             
                         case 5 :
                            System.out.println("Othor Expenses List  : ");
                             tracker.Display_by_category("Othor");
                               Print_Char(42 , '*')  ;
                              break ;
                              
                         default:
                               System.out.println("Invalid choice ,Please enter valid category !");
                               Print_Char(42 , '_') ;
                               
                     }//nested switch
    
                   
                    break;
                    
                    
                    
               case 5:
                   
                      System.out.println("Your total spending until now is  : " +tracker.Total_spending() );
                      Print_Char(42 , '_') ;
                    break;
                    
                    
               case 6:
                   
                    System.out.println("You are saved until now : " + tracker.Total_Saving() );
                      Print_Char(42 , '_') ;
                    break;
                    
                    
               case 7:
                   
                       Print_Char(42 , '_') ;
                        System.out.println("Great , You are saved : " + tracker.Total_Saving() );
                        System.out.println("Thanks for using our Expenses tracker application !");
                        Print_Char(50 , '#') ;
                       flag = 0  ;
                    break;
                    
                    
                default:
                    System.out.println("Invalid choice , Please enter valid choice !");
                    Print_Char(42 , '_') ;
                    
            }//switch
             
    }//while 
    
    }//main 
    
    
    
    public static void Print_Char(int n , char c) {
        
    for(int i = 0  ; i <= n ; i ++ ) 
        System.out.print(c);
        System.out.println();
    }
    
}// class
