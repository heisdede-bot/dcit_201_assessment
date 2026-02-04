public class GradeReport {
   public static void executeGradeReport(double score){

    boolean valid = validateScore(score);
    if(valid){
        char grade = calculateGradeLetter(score);
        displayPerformanceMessage(grade);
    }else{
        System.out.println("Invalid Score");
    }
   }

   public static boolean validateScore(double score){
    return score >= 0 && score <= 100;
   }

    public static char calculateGradeLetter(double score){
        if(score >= 80){
            return 'A';
        }else if (score >= 70 && score < 80) {
            return 'B';
        }else if (score  >= 65 && score < 70) {
            return 'C';
        }else if (score >= 60 && score < 65) {
            return 'D';
        }else if (score  >= 50 && score < 60) {
            return 'E';
        }else{
            return 'F';
        }
        
    }
    public static void displayPerformanceMessage(char grade){
        switch (grade) {
            case 'A':
                System.out.println("EXCELLENT");
                break;
            case 'B':
                System.out.println("VERY GOOD");
                break;
            case 'C':
                System.out.println("GOOD");
                break;
            case 'D':
                System.out.println("CREDIT");
                break;
            case 'E':
                System.out.println("PASS");
                break;
            case 'F':
                System.out.println("FAIL");
        }
    }
    public static double getFinalGPA(char grade){
        switch (grade){
            case 'A':
                return 4.0;
            case 'B':
                return 3.5;
            case 'C':
                return 3.0;
            case 'D':
                return 2.5;
            case 'E':
                return 2.0;
            default:
                return 0.0;
        }

    }

     public static void main(String[] args) {
        executeGradeReport(90);
        System.out.println("GPA:" +getFinalGPA('F'));
    }
}
