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
public interface Observer {
    
    void update(double amount, Date date, String recipient);
    void display();
    
}
