/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6se;

import java.util.Date;

/**
 *
 * @author 1301147
 */
public class MonthlyInvoiceDisplay implements Observer {
    double monthlyAmount;
    Date monthlyDate;
    String monthlyRecipient;
    private Subject monthlyData;
    
    @Override
    public void update(double newMonthlyAmount, Date newMonthlyDate, String newMonthlyRecipient) {
         this.monthlyAmount = newMonthlyAmount;
        this.monthlyDate = newMonthlyDate;
        this.monthlyRecipient = newMonthlyRecipient;
        display();
    }

    @Override
    public void display() {
       System.out.println("Amount = " + monthlyAmount + "\n" + "Date = " + monthlyDate  + "\n" + "Recipient = " + monthlyRecipient);
    }
    
}
