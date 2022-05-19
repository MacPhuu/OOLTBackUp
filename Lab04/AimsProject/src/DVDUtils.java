public class DVDUtils {
  
    public static DigitalVideoDisk compareCost(DigitalVideoDisk dvd1,DigitalVideoDisk dvd2){
        if(dvd1.getCost() > dvd2.getCost()) return dvd2;
        else return dvd1; 
    }  
    public static DigitalVideoDisk compareTitle(DigitalVideoDisk dvd1,DigitalVideoDisk dvd2){
        if(dvd1.getTitle().compareTo(dvd2.getTitle()) > 0) return dvd2;
        else return dvd1; 
    }  
    public static void sortByCost(DigitalVideoDisk [] dvdList){
        for(int i = 0; i < dvdList.length - 1; i++){
            if(dvdList[i] == null) break;
            for (int j = i; j < dvdList.length; j++){
                if(dvdList[j] == null) break;
                if(dvdList[i].getCost() > dvdList[j].getCost()){
                    DigitalVideoDisk tmp = dvdList[i];
                    dvdList[i]= dvdList[j];
                    dvdList[j] = tmp;
                }   
                
            }
        }
        for(int i = 0; i < dvdList.length; i++){
            if(dvdList[i] == null) break;
            System.out.println(dvdList[i].getTitle() + " " + dvdList[i].getCost());
            
        }
    }
    public static void sortByTitle(DigitalVideoDisk [] dvdList){
        for(int i = 0; i < dvdList.length - 1; i++){
            if(dvdList[i] == null) break;
            for (int j = i; j < dvdList.length; j++){
                if(dvdList[j] == null) break;
                if(compareTitle(dvdList[i], dvdList[j]) == dvdList[j]){
                    DigitalVideoDisk tmp = dvdList[i];
                    dvdList[i]= dvdList[j];
                    dvdList[j] = tmp;
                }   
                
            }
        }
        for(int i = 0; i < dvdList.length; i++){
            if(dvdList[i] == null) break;
            System.out.println(dvdList[i].getTitle() + " " + dvdList[i].getCost());
            
        }
    }
}

// DigitalVideoDisk tmp = new DigitalVideoDisk(dvdList[i].getTitle(),dvdList[i].getCategory(),dvdList[i].getDirector(), dvdList[i].getLength(),dvdList[i].getCost());
//                     dvdList[j].setTitle(dvdList[i].getTitle());
//                     dvdList[j].setCategory(dvdList[i].getCategory());
//                     dvdList[j].setDirector(dvdList[i].getDirector());
//                     dvdList[j].setLength(dvdList[i].getLength());
//                     dvdList[j].setCost(dvdList[i].getCost());

//                     dvdList[i].setTitle(tmp.getTitle());  
//                     dvdList[i].setCategory(tmp.getCategory());
//                     dvdList[i].setDirector(tmp.getDirector());
//                     dvdList[i].setLength(tmp.getLength());
//                     dvdList[i].setCost(tmp.getCost());