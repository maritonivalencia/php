public class Chromium {

    public static void main(String[] args) {
  
        System.out.println("Hello, World");
        
        boolean doContinue = true;
        int continueCount = 0;
        
        while(doContinue) {
            
           if(continueCount < 10) {
               
               doContinue = false;
               
           }
            
           System.out.println("Loop de loop");
            
           continueCount++;
            
        }
  
    }
  
}
