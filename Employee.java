class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager is managing the team");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer is coding");
    }
}

class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer is designing");
    }
    public class EmployeeMain {
        public static void main(String[] args) {
            Manager manager = new Manager("Nurul Khafidoh");
            Developer developer = new Developer("Anggita Faolina");
            Designer designer = new Designer("Nadlyne Aurora");

            // Memanggil metode work() pada setiap objek
            System.out.println(manager.getName() + ":");
            manager.work();
            System.out.println();

            System.out.println(developer.getName() + ":");
            developer.work();
            System.out.println();

            System.out.println(designer.getName() + ":");
            designer.work();
            System.out.println();
    }
}
}