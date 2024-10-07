
public class StringTools
{
     public String lastLetter(String str){
         return str.substring(str.length()-1); 
        
     }
     
     public String formatPhoneNumber(String str1){
         return "(" + str1.substring(0, 3) + ") - " + str1.substring(3, 6) + " - " + str1.substring(6, 10);
         
     }
     
     public String middleThree (String str3){
         int middleIndex = str3.length()/2;
         return str3.substring(middleIndex - 1, middleIndex + 2) ;
         
         
     }
     
     public String swapLastTwo (String str4){
         int lastLetter1 = str4.length()-1;
         int secondLastLetter = str4.length() -2;
         
         return str4.substring(0, secondLastLetter) + str4.substring(lastLetter1) + str4.substring(secondLastLetter, secondLastLetter+1);
         
     }
    
     public boolean frontAgain(String str5, int n){
         String back = str5.substring(str5.length() -n);
         String front = str5.substring(0, n);
         
         return back == front;
      
        
     }
   
}
