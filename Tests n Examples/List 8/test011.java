public class test011 {
   
    public static void main(String[]args) {
        int spaces=7, t=1, counter=1;
        String text = "*";
       
        while(counter < 14){
            for(int i=0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int i=0; i < t; i++){
                System.out.print(text);
            }
            System.out.println();
            if(counter < 14/2){
                spaces -= 1;
                t += 2;
            } else{
                spaces += 1;
                t -= 2;
            }
            counter++;
        }
    }
}
