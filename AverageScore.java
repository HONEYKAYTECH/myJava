class AverageScore{
    public static double getAverageScore(int a, int b, int c){
        double sum  = a + b + c;
        double ave = sum/3;
        return ave;
    }
    public static void main(String[] args){
        double std_result1 = getAverageScore(10,15,20); 
        double std_result2 = getAverageScore(20,30,40);
        System.out.println("StdAveScore1:" + std_result1); 
        System.out.println("StdAveScore2:" + std_result2); 
    }
}