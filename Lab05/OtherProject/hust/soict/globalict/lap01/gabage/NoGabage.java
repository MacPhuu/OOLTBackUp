public class NoGabage {
    
    public static void main(String[] args){
        StringBuffer r = new StringBuffer();  
        for (long i = 0; i < 100000; i++){
            r.append("Someword");
       }
    }
    
}
