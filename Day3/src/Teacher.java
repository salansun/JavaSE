class Employee {
    int workYear;

    Employee() {
        workYear = 1;
    }

    void printInfo() {
        System.out.println("employee work year: " + workYear);//1
    }
}

public class Teacher extends Employee {

    int classHour;

    public Teacher() {
//        super();
        classHour = 96;
    }

    @Override
    void printInfo() {
        System.out.println("teacher work year: " + workYear);//?
        System.out.println("teacher class hour: " + classHour);//96
    }

    public static void main(String[] args) {
        Employee a = new Employee();
        a.printInfo();
        a = new Teacher();//***
        a.printInfo();
    }
}
