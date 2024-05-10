
package expenses_tracker;

public class Expenses_Operation {
    
     
    private Budget budget = new Budget() ;
    private Expense [] All_expenses = new Expense[100] ;
    private  int count = 0 ;
    private  double total=0;

    public void  initialize_budget(double b) {
        budget.set_budget ( b ) ;

    }


    public void  Add_Expense(double v , String c) {
        if( Check_budget(v)) {
            budget. modify_budget ( v , '-') ;
            All_expenses[count] = new Expense ( v ,  c ) ;
            count++ ;
            total+= v;
        }

    }


    public boolean Delete_Expense (double v , String c ){
        boolean exsist = false ;
        
        for(int i=0 ; i<count ; i++) {
            if( All_expenses[i].category == c && All_expenses[i].value==v ) {
                All_expenses[i].category=All_expenses[count-1].category ;
                All_expenses[i].value=All_expenses[count-1].value ;
                budget. modify_budget ( v , '+') ;
                total-= v;
                count--;
                exsist = true ; 
                break;
            }
        }
        return exsist ; 
    }


    public boolean Check_budget ( double v)  {
        if(v>0 && v<=budget.get_budget ())
        return ( true ) ;
        else
            return (false) ;
    }



    public void Display_All_expense () {
        for(int i=0 ; i<count ; i++) {
            System.out.println ("category = " +All_expenses[i].category +" | price = " +All_expenses[i].value  );
        }

        System.out.println ("current_budget= " + budget.get_budget ()   + "  total spending = " +total  );
    }



    public void Display_by_category (String c) {
        double t=0 ;
        System.out.println ("category : " + c  ) ;
        for(int i=0 ; i<count ; i++) {
            if(All_expenses[i].category ==c ) {
                System.out.println ("price = " +All_expenses[i].value  );
                t+=All_expenses[i].value ;
            }
        }
        System.out.println ( c + " total expenses is :  " + t );

    }


    public double Total_spending( ) {
        return total ;
    }


    public double Total_Saving( ) {
        return (budget.get_budget ()) ;
    }

    
}
