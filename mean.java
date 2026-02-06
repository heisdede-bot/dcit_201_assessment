public class Average {
    public static double calculateClassAverage(double score1,double score2){
        double average;
        average = (score1 + score2)/2;
        return Math.ceil(average*100.00)/100.00;
    }
    public static double calculateClassAverage(double score1,double score2,double score3){
        double average;
        average = (score1 + score2 + score3)/3;
        return Math.ceil(average*100.00)/100.00;
    }
    public static double calculateClassAverage(double[] scores){
        double average;
        if (scores == null || scores.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double  score : scores) {
            sum += score;
        }
        average = sum/scores.length;
        return Math.ceil(average*100.00)/100.00;
    }

    public static void main(String[] args) {
        double [] arrayScores = {2.99,5.55,4.7,9.8,7.9};
        double [] emptyScores = {};

        System.out.println("Average of scores(2.45,3.55):" + calculateClassAverage(2.45,3.55));
        System.out.println("Average of scores(2.45,3.55,6.9):" + calculateClassAverage(2.45,3.55,6.9));
        System.out.println("Average of empty scores:" + calculateClassAverage(emptyScores));
        System.out.println("Average of list of scores{2.99,5.55,4.7,9.8,7.9}:" + calculateClassAverage(arrayScores));
    }
    
}
