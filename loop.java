/*public class loop{
    public static void main(String args[]){
        for(int line =1; line<=4; line++){ // this takes no. of lines as imput
            for(int j = 1; j <= line; j++){  // this return no.of characters as an output
                System.out.print("*");    // print the character
            }
            System.out.println(); // print new line
        }

    }
}

public class loop{
    public static void main(String args[]){
        char ch ='A';
        for(int line = 1; line<=4; line++){
            for(int star =1; star<=line; star++){
                System.out.print(ch); // print the character A b c d and so on
                ch++; // increment the character 
            }
            System.out.println();
        }
    }
}*/

public class loop{
    public static void specialtriangle(int n){
        for(int line = 1; line<=n; line++){
            for(int j = 1; j<=line; j++){  // this loop runs and give no.of char = no.of lines
                if((line+j) % 2==0){  // checing if the sum of i and j is even
                    System.out.print("1"); // if even print 1
                }
                else{
                     System.out.print("0"); // else 0
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        specialtriangle(5);  //function call
    }
}