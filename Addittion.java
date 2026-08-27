class Addittion{
    public static void main(String[] args){
        //display of 1-20 y skipping only 5,10,15
        // for(int i = 1; i <= 20; i++){
        //     if(i == 5 || i == 10 || i == 15){
        //         continue; //skip the numbers 5,10,15
        //     }
        //     System.out.println(i);
        // }

        // calculate the sum of even numbers from 1-20  skipping 4 and 10
        int total = 0;
        for(int i = 1; i <= 20; i++){
            if(i == 4 || i == 10){
               continue; 
            }
            if(i % 2 == 0){
                total = total + i;
            } 
        }
        System.out.println("The total sum is: " + total);

        // int[]ages = {30,20,25,18,16,40};
        // int lowest = ages[0];
        // for(int num : ages){
        // if(num < lowest){
        //     lowest = num;
        //     }
        // }
        // System.out.println(lowest);
            
    }

 

}