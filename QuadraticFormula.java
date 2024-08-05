import java.util.Scanner;

class QuadraticFormula {
    
    public static void main(String[] args) {
        Scanner formInput  = new Scanner(System.in);
        System.out.println("Enter value for a, b, and c:");

        double valA = formInput.nextDouble();
        double valB = formInput.nextDouble();
        double valC = formInput.nextDouble();
        double root1 = 0;
        double root2 = 0;

        double discr = Math.pow(valB, 2) - 4 * valA * valC;

        System.out.print("Discriminant: ");
        System.out.print(discr);
        
        if(discr > 0){
            root1 = (-valB + Math.sqrt(discr)) / (2 * valA); 
            root2 = (-valB - Math.sqrt(discr)) / (2 * valA);
            System.out.println();
            System.out.println("Root 1: " + root1);
            System.out.print("Root 2: " + root2);
        }
        else if(discr == 0){
            root1 = (-valB + Math.sqrt(discr)) / (2 * valA); 
            System.out.println();
            System.out.print("Root: " + root1);
        }
        else{
            System.out.println();
            System.out.print("No Real Solutions");
        }
        
        formInput.close();
    }
}