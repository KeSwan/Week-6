/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6se;


import java.util.Date;


public class CurrentInvoiceDisplay implements Observer{
    double invoiceAmount;
    Date invoiceDate;
    String invoiceRecipient;
    private Subject invoiceData;

    public CurrentInvoiceDisplay(Subject newInvoiceData) {
        this.invoiceData = newInvoiceData;
        newInvoiceData.registerObserver(this);
    }
    
    @Override
    public void update(double newInvoiceAmount, Date newInvoiceDate, String newInvoiceRecipient) {
        this.invoiceAmount = newInvoiceAmount;
        this.invoiceDate = newInvoiceDate;
        this.invoiceRecipient = newInvoiceRecipient;
        display();
    }

    @Override
    public void display(){
        System.out.println("Amount = " + invoiceAmount + "\n" + "Date = " + invoiceDate  + "\n" + "Recipient = " + invoiceRecipient);
}    
    
}
