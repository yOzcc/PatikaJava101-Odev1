public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear = 2021;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary >=1000){
            double tax = this.salary*0.03;
            return tax;
        }
        if (this.salary>0 && this.salary <1000){
            return 0;}
        return 0;
    }
    double bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }

    double raiseSalary(){
        int thisYear = 2021;
        if (thisYear-this.hireYear <=10){
            return (this.salary*0.05);
        }
        if (thisYear-this.hireYear>10 && thisYear-this.hireYear<20){
            return (this.salary*0.10);
        }
        if (thisYear-this.hireYear>=20){
            return (this.salary*0.15);
        }
        return 0;
    }

    public String toString(){
        return "Name : " + this.name + "\nSalary : " + this.salary + "\nWork hours : " + this.workHours + "\nHiring year : "
                + this.hireYear + "\nTax : " + tax() + "\nBonus : " + bonus() + "\nRaise salary : " + raiseSalary() + "\nSalary with taxes and bonuses : " + (this.salary - tax() + bonus()) +
                "\nTotal salary : " + (this.salary - tax() + bonus() + raiseSalary());
    }
}
