import java.util.Scanner;
import java.util.HashSet;
public class lottery_draw_program
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int bonusBall = 0;
        String num = "";
        int duplicate = 0;
        
        String[] tempnumChosen;
        int[] numChosen;
        double[] numRand;
        String[] strnumRand;
        int[] numRand1;
        
        HashSet<Integer> nonDuplicates= new HashSet<Integer>();
        HashSet<Integer> Duplicates= new HashSet<Integer>();
        
        strnumRand = new String[7];
        tempnumChosen = new String[7];
        numRand = new double[7];
        numRand1 = new int[7];
        numChosen = new int[10];
        
        do{
            nonDuplicates = new HashSet<Integer>();
            Duplicates = new HashSet<Integer>();
            
            System.out.println("Pick 7 numbers in (n,n,n,n,n,n,n) format, between 1 and 49");
            num = sc.nextLine(); 
            
            num = num.replace(",", "                                                           ");
            num += "                                                           ";
            
            tempnumChosen[0] = num.substring(0,28).trim();
            tempnumChosen[1] = num.substring(28,88).trim();
            tempnumChosen[2] = num.substring(88,153).trim();  
            tempnumChosen[3] = num.substring(153,225).trim();  
            tempnumChosen[4] = num.substring(225,291).trim();  
            tempnumChosen[5] = num.substring(291,350).trim();
           
           for(int y = 0; y < 6; y++){
               numChosen[y] = Integer.parseInt(tempnumChosen[y]); 
               
                }  
           for(int integer : numChosen){
            if(!nonDuplicates.contains(integer)){
                nonDuplicates.add(integer);
            }else{
                Duplicates.add(integer);
            }   
            }
           duplicate = Duplicates.size();
           //System.out.println("D " + duplicate);
            }while(numChosen[0] > 49 || numChosen[0] < 1 || numChosen[1] > 49 || numChosen[1] < 1 || numChosen[2] > 49 || numChosen[2] < 1 || numChosen[3] > 49 || numChosen[3] < 1 || numChosen[4] > 49 || numChosen[4] < 1 || numChosen[5] > 49 || numChosen[5] < 1 || duplicate > 1);
        
        System.out.println("The lucky numbers are: ");
        for(int x = 0; x < 7; x++){
            numRand[x] = Math.ceil(Math.random() * 49);
            System.out.print(numRand[x] + ",   ");   
        }
        
        
        for(int z = 0; z < 6; z++){
            if(numChosen[z] == numRand[0]){
            count++;
            }
            if(numChosen[z] == numRand[1]){
            count++;
            }
            if(numChosen[z] == numRand[2]){
            count++;
            }
            if(numChosen[z] == numRand[3]){
            count++;
            }
            if(numChosen[z] == numRand[4]){
            count++;
            }
            if(numChosen[z] == numRand[5]){
            count++;
            }
            if(numChosen[z] == numRand[6]){
            count++;
            bonusBall = 1;
            }
        }
        //System.out.println("\n" + "Matches: " + count);
 
        if(count == 3 && bonusBall ==0){
            System.out.println("You have won £10");
        }else if(count == 4 && bonusBall == 0){
           System.out.println("You have won £100");
        }else if(count == 5 && bonusBall == 0){
            System.out.println("You have won £10,000");
        }else if(count == 6 && bonusBall == 1){
            System.out.println("You have won £100,000");
        }else if(count == 6 && bonusBall == 0){
            System.out.println("You have won a whopping £1,000,000!");
        }
        
    }  
}


          
    
    


