public class Intern extends Employee{
    private final double SALARY_LIMIT=20000;



    public Intern(String name, String email, int age, double salary) {

            super (name, email, age, salary);
    }






    @Override
    public void setSalary(double salary) {

        if (salary>SALARY_LIMIT){
            this.setSalary(-1);
            System.out.println("Salary's Inters must be lower than 20000. Intern has not been created");

        }else{
            super.setSalary(salary);
        }
    }
}
