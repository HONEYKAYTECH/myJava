 class Student{

    private String name;
    private int rollNumber;
    private int pinNumber;
    // Getter
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public int	getPinNumber(){
        return	pinNumber;
    }
      //Setter - with validation
    public void setName(String newName){
        if(newName != null && !newName.isEmpty()){
            name = newName;
        }
    }
    public void setRollNumber(int newRollNumber){
        if(newRollNumber > 0){
            rollNumber = newRollNumber;
        }
    }
    public void setPinNumber(int newPinNumber){
        if(newPinNumber	> 0 && newPinNumber > 999 && newPinNumber < 10000){
        pinNumber = newPinNumber;
        }
    }
}
 class Encapsulation{
    public static void main(String[] args){
        Student stdOne = new Student();
        stdOne.setName("Tiamiyu Mariam Oyinkansola");//setter
        String stdName  = stdOne.getName();//getter
        stdOne.setRollNumber(201);//setter
        int stdRollNo   = stdOne.getRollNumber();//getter
        stdOne.setPinNumber(4343);//setter
        int stdPinNumber  = stdOne.getPinNumber();//getter
        System.out.println(stdName); 
        System.out.println(stdRollNo); 
        System.out.println(stdPinNumber); 

    }
}
    