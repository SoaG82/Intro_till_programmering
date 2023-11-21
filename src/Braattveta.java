public class Braattveta {
    public static void main(String[] args) {
        //Scope! Vår variabel lever enbart inom sitt scope!

        int num3 = 0; //<--- Om vi skapar och initialserar en variabel innan loopen
//Så kan vi ändra på dess värde inuti loopen och spara det nya värdet utan problem.
        for (int i = 0; i < 1; i++){
            int num1 = 1;
            System.out.print(num1 + ",");
            //System.out.println(num2); <---Vi kan inte skriva ut num2,
            // eftersom den inte finns ännu! Den skapas i nästa for loop!
            for (int j = 0; j < 1; j++){
                int num2 = 2; // <--- Vi skapar num2 och kan enbart komma
                // åt din inom denna for loops "Måsvingar"
                System.out.println(num1); //<--- Num 1 kan vi komma åt,
                // eftersom den skapades högre upp i koden (Förra for loopen)
                num3 = 3; //<-- Vi kan ändra värdet här och ändå behålla det!

            }
        }
//System.out.println(num2); //<--- Vi kan inte skriva ut num 2, eftersom den
//Enbart existerar inom den andra for loopen.
        System.out.println(num3);
    }

}
