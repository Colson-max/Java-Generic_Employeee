package Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public  static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("colson",30000, new MyDate(2001,11,4)));
        employees.add(new Employee("Tommy",20000, new MyDate(2000,3,25)));
        employees.add(new Employee("Ather",10000, new MyDate(2002,5,14)));

        System.out.println("employees = " + employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                /**
                 *  先按照 name 排序，如果 name 相同，则按生日日期的先后排序
                 *  先对传入的参数进行验证
                 */
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确..");
                    return 0;
                }
                //比较 name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0){
                    return i;
                }
                //封装后，将来可维护性和复用性，就大大增强
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("===== 对雇员进行排序 =====");
        System.out.println(employees);
    }
}




