class inheritence{
    String SchooName = "ABC School";
}
class Maths extends inheritence{
    String Subject = "Maths";
    void display(){
        System.out.println("School Name: " + SchooName);
        System.out.println("Subject: " + Subject);
        
    }
    public static void main(String[] args) {
        Maths m = new Maths();
        m.display();
    }
}

