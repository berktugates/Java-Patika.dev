public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    int tax(){
        if(this.salary < 1000){
            System.out.println("Employees with a salary of less than 1000 TL are exempt from tax.");
            return this.salary;
        } else if(this.salary >= 1000) {
            int tax = (this.salary * 3) / 100;
            System.out.println("Tax: " + tax);
            return this.salary = this.salary - (this.salary * 3)/100;
        }
        return 0;
    }

    int bonus(){
        if(this.workHours > 40){
            System.out.println("Bonus: " + this.workHours * 30);
            return this.salary = this.salary + this.workHours * 30;
        }
        return this.salary;
    }

    int raiseSalary(){
        int duration = 2021 - this.hireYear;
        if(duration < 10){
            return this.salary = this.salary + (this.salary* 5) /100;
        }
        else if(duration > 9 && duration< 20){
            return this.salary = this.salary + (this.salary * 10) / 100;
        }
        else if(duration > 19){
            this.salary = this.salary + (this.salary * 15) / 100;
        }
        return 0;
    }

    void employeeInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
    }

}
