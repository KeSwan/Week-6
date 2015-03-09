/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6se;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceData implements Subject {
    private ArrayList observers;
    private double invoiceAmount;
    private Date invoiceDate;
    private String invoiceRecipient;

    public InvoiceData() {
        observers = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(invoiceAmount, invoiceDate, invoiceRecipient);
        }
    }
    
    public void invoiceDataChanged(){
        notifyObservers();
    }
    
    public void setInvoiceData(double newInvoiceAmount, Date newInvoiceDate, String newInvoiceRecipient) {
        this.invoiceAmount = newInvoiceAmount;
        this.invoiceDate = newInvoiceDate;
        this.invoiceRecipient = newInvoiceRecipient;
        invoiceDataChanged();
    }
    
}
