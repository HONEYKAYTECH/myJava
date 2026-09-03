class StdGreetings{
   public static String sayHi(String name){
        // System.out.println("Hi:" + name);
        return "Hi:" + name;
    }
    public static void main(String[] args){
        // sayHi("idris");
        String result = sayHi("idris");
        System.out.println(result);
    }
}
