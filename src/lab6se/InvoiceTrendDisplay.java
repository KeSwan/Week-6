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
public class InvoiceTrendDisplay  implements Observer{

    double currentInvoiceAmount;
    double lastInvoiceAmount;
    double previousInvoiceAmount;
    double trendAmount;
    Date trendDate;
    String trendRecipient;
    private Subject trendData;
    
    @Override
    public void update(double newTrendAmount, Date newTrendDate, String newTrendRecipient) {
       this.trendAmount = newTrendAmount;
        this.trendDate = newTrendDate;
        this.trendRecipient = newTrendRecipient;
        display();
    }

    @Override
    public void display() {
        System.out.println("Amount = " + trendAmount + "\n" + "Date = " + trendDate  + "\n" + "Recipient = " + trendRecipient);
    }
    
}
