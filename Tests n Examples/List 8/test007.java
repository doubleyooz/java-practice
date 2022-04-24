import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
    Em caso de empate o sistema automaticamente dará vitória para o candidato com o maior index do array.
    Os votos são adulterados e a soma total sempre será igual 4999.
    Existe uma aleatoriedade programada visando minimizar os indícios de fraude.

    O sistema quebra caso a soma dos elementos do array arr seja diferente de 4999;
    
*/

public class test007 {
    
    public static boolean isInteger(String str) {
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public static void main (String[]args) throws InterruptedException, IOException{
        int max=4999, vote = 5;
        String temp = "";
        Integer[] arr = {0, 0, 0, 0, 0};
        //Integer [] arr = {1520, 1520, 1520, 542, 10};
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        for (int i=0; i < max; i++){
            System.out.println("VOTAÇÃO DO CA");
            System.out.println("1 - Candidato A");
            System.out.println("2 - Candidato B");
            System.out.println("3 - Candidato C");
            System.out.println("4 - Branco");
            System.out.println("5 - Nulo\n");

            temp = scan.nextLine();
            if(isInteger(temp)){
                vote = Integer.parseInt(temp);
            }

            switch(vote){
                case 1:
                    arr[0]++;
                    break;
                case 2:
                    arr[1]++;
                    break;
                case 3:
                    arr[2]++;
                    break;
                case 4:
                    arr[3]++;
                    break;
                default:
                    arr[4]++;
                    break;
            
            }
            System.out.println("VOTO COMPUTADO.");
            Thread.sleep(5000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
      
        Integer orig[] = new Integer[arr.length];
    
        // Copy elements of a[] to b[]
        for (int i = 0; i < arr.length; i++)
            orig[i] = arr[i];

        //System.out.printf("Original arr[] : %s\n", Arrays.toString(arr));
        arr[3] = arr[4] = 0;
        Arrays.sort(arr);
        //System.out.printf("Modified arr[] : %s\n", Arrays.toString(arr));
        
        if (arr[4].intValue() == arr[3].intValue()){
            if (arr[3].intValue() == arr[2].intValue())
                orig[(Arrays.asList(orig).indexOf(arr[2]))] -= random.nextInt(20 - 10) + 10;
            orig[Arrays.asList(orig).indexOf(arr[3])] -= random.nextInt(30 - 20) + 20;
            
        }
        
        switch (Arrays.asList(orig).indexOf(arr[4])){
            case 0:
                System.out.println("O vencedor é o candidato A");
                break;

            case 1:
                System.out.println("O vencedor é o candidato B");
                break;

            case 2:
                System.out.println("O vencedor é o candidato C");
                break;

            default:
                break;
        }

      
        double tampering = (max - (orig[0] + orig[1] + orig[2])) * Math.random();
        System.out.printf("Votos brancos: %.0f\n", tampering);
        System.out.printf("Votos nulos: %.0f\n", (max - (orig[0] + orig[1] + orig[2])) - tampering);
        System.out.printf("Quantidade de eleitores: %d\n", max);

        char letters[] = {'A', 'B', 'C'};
     
        for (int i=0; i < 3; i++){
            System.out.printf("Candidato %c: %d votos.\n", letters[i], orig[i]);
            
        }
        scan.close();
        
    }
}
