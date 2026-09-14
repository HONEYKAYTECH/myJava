class Student{
    int age;
    String fullname,bvn,nin,phone;

    Student(String name, String bvn, String nin, String phone, int age){
        this.fullname = name;
        this.bvn = bvn;
        this.nin = nin;
        this.phone = phone;
        this.age = age;
    }

    void getBioData(){
        System.out.println("Student Fullname :" + this.fullname);
        System.out.println("Student BVN :" + this.bvn);
        System.out.println("Student NIN :" + this.nin);
        System.out.println("Student Phone :" + this.phone);
        System.out.println("Student Age :" + this.age);
    }
    
}

class StudentBioData{
        public static void main(String[] args){
            Student mariam = new Student(" Tiamiyu Mariam Oyinkansola ", "21234", "321321", "08122222", 10);
            mariam.getBioData();
        }
    }