package d_variablesObjects04022023;

public class TypesOfVariables {
int a = 5; //I am the Global/Instance Variable, not the static one.
// I am stored in the heap memory and good for memory optimisation.
//    You cannot access me in Main class without object creation

static int workExperienceInYears = 5; //I am the Static Variable,
// but I will consume memory, I am accessible in main class without object creation

        public static void main(String[] args) {
            String myJobTitle = "QC Team Leader"; //I am the Local Variable,
            // residence of this area.
            System.out.println(myJobTitle);
            System.out.println(workExperienceInYears);
        }
}
