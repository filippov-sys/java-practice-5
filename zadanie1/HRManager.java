import java.util.*;

public class HRManager {
      private String name;

      public HRManager(String name) {
            this.name = name;
      }

      public String getName() {
            return name;
      }

      public int rollDice() {
            Random random = new Random();
            int randomInt = random.nextInt(1, 7);
            return randomInt;
      }

      public void applySalaryChange(Employee employee) {
            int chosenDice = rollDice();
            String nameEmployee = employee.getName();
            double salaryEmployee = employee.getSalary();

            if (chosenDice == 3 || chosenDice == 6) {
                  salaryEmployee *= 0.8;
            }
            
            System.out.println("имя эйчара: " + name + ", имя сотрудника: " + nameEmployee + ". Результат броска был: " + chosenDice + ", ваша зарплата теперь: " + salaryEmployee);
      }
}