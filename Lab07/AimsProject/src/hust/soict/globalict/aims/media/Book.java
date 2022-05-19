
package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private String type ="Book";
    
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost) {
        super.title = title;
        super.category = category;
        super.cost =cost;
    }


   
    public void addAuthor(String authorName){
        for(String s : authors){
            if(s.equals(authorName)){
                System.out.println("Existed!");
                return;
            }
        }
        authors.add(authorName);
    }
    public void removeAuthor(String authorName){
        int i = -1; 
        i = authors.indexOf(authorName);
        if(i == -1 ) {
            System.out.println("Not exist!");
            return;
        }
        authors.remove(i);

    }
    @Override
    public String getType(){
        return type;
    }
}
    
