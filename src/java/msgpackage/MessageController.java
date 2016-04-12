/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msgpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import msgpackage.Message;
/**
 *
 * @author c0640891
 */
@ApplicationScoped
public class MessageController {
    List<Message> message = new ArrayList<>();
    
    public Message getById(int id){
        for(Message unique : message){
            if(unique.getId() == id){
                return unique;
            }
        }
        return null;
    }
    
    public Message getByDate(Date start, Date end){
        for(Message unique : message){
            if((unique.getTime().after(start)) && unique.getTime().before(end)){
                    return unique;
                }
            }
        return null;
    }

    Iterable<Message> getAllmessages() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
