package Shop_33.service;

import Shop_33.SalesRoom;
import Shop_33.interfaces.DepartmentInterface;
import Shop_33.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface){
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }

        return null;
    }


}
