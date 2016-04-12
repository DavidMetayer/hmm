/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msgpackage;

/**
 *
 * @author c0640891
 */
public class Message {
    int id;
    String title;
    String contents;
    String author;
    String senttime;
    
    public void setId(int a){
        this.id = a;
    }
    public void setTitle(String s){
        this.title = s;
    }
    public void setContents(String s){
        this.contents = s;
    }
    public void setAuthor(String s){
        this.author = s;
    }
    public void setTime(String s){
        this.senttime = s;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getContents(){
        return contents;
    }
    public String getAuthor(){
        return author;
    }
    public String getTime(){
        return senttime;
    }
    
    
    
}
