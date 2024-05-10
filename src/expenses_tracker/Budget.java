
package expenses_tracker;


public class Budget {
    
    private double Initial_budget;
    private double current_budget;


    public void set_budget(double budget)
    {
        if (budget >= 0)
        {
            this.Initial_budget = budget;
            this.current_budget = budget;
        }
        else
        {
            System.out.println("Error: Budget cannot be negative.");
        }
    }
    
    public double get_budget()
    {
        return current_budget;

    }


    public void  modify_budget(double value, char modifier)
    {
        if (modifier == '+')
        {
            this.current_budget += value;
        }
        else if (modifier == '-')
        {
            if (current_budget - value >= 0)
            {
                this.current_budget -= value;
            }
            else
            {

                System.out.println("Error: Insufficient budget for subtraction.");

            }


        }
        else
        {
            System.out.println("Error: Invalid modifier. Use '+' or '-' Only.");
        }
    }
    
    public boolean limitation_test ()
    {
        return (current_budget>=0);
    }

    
}
