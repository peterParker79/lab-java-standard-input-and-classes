import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Creo los empleados. El último no debe aparecer en el fichero de texto generado


        Employee employee1 = new Employee("Alfonso Suarez", "asuarez@empresa.com", 34, 21000);
        Employee employee2 = new Employee("Beatriz Rodriguez", "brodriguezz@empresa.com", 30, 18000);
        Employee employee3 = new Employee("Jaime Palau", "jpalau@empresa.com", 46, 43000);
        Employee employee4 = new Employee("Sofia Castro", "scastro@empresa.com", 24, 23000);
        Employee employee5 = new Employee("Candela Pena", "cpena@empresa.com", 54, 18000);

        Employee employee6 = new Intern("Roman Rodriguez", "rrodriguez@empresa.com", 44, 18000);
        Employee employee7 = new Intern("Cristina Sanchez", "csanchez@empresa.com", 35, 19000);
        Employee employee8 = new Intern("Lorena Sanz", "lsanz@empresa.com", 29, 16000);
        Employee employee9 = new Intern("Miriam Ojeda", "mojeda@empresa.com", 51, 14000);

        // Ejemplo de usuario que no va a ser creado. Se muestra mensaje por consola y no se escribe en fichero.
        Employee employee10 = new Intern("Saul Martin", "smartin@empresa.com", 64, 21000);

        // Agrego los empleados a un array de empleados
        Employee[] employeeList=     {employee1, employee2, employee3, employee4, employee5,
                                    employee6, employee7, employee8, employee9, employee10};





        FileWriter myFileWriter = new FileWriter("employees.txt");
        String lineEmployee= "";
            for (Employee empl: employeeList) {
                lineEmployee =
                        "\nNombre: " + empl.getName() +
                        "\nEmail: " + empl.getEmail() +
                        "\nEdad; " + empl.getAge() +
                        "\nSalario " + empl.getSalary() +
                        "\n\n";
                // si es Employee escribo sus datos en el fichero
                if (!(empl instanceof Intern)) myFileWriter.write(lineEmployee);
                // Si es un Intern escribo en el fichero según salario
                if (empl instanceof Intern && empl.getSalary()!=-1.0) myFileWriter.write(lineEmployee);

            }

            myFileWriter.close();






} //end method



} //end class




