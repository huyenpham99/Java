/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryItYourself;

/**
 *
 * @author 84122
 */
public class EmployeeOfSale {

    private int EmployeeID;
    private String EmployeeName;
    private String Designation;
    private int BasicSalary;
    private int SalesDone;
    private int Commission;
    private int TotalSalary;
    
    public EmployeeOfSale(int EmployeeID, String EmployeeName, String Designation,int BasicSalary, int SalesDone, int Commission, int TotalSalary){
        this.EmployeeID = EmployeeID;
        this.Designation = Designation;
        this.EmployeeName = EmployeeName;
        this.BasicSalary = BasicSalary;
        this.SalesDone = SalesDone;
        this.Commission = Commission;
        this.TotalSalary = TotalSalary;    
    }
    
    public void TotalSalary(){
        if(SalesDone>=10000){
            TotalSalary = (int) (BasicSalary *1.3);
        }else if(SalesDone>=8000){
            TotalSalary = (int) (BasicSalary *1.3);
        }else if(SalesDone>=6000){
            TotalSalary = (int) (BasicSalary *1.2);
        }else if(SalesDone>=4000){
            TotalSalary = (int) (BasicSalary *1.1);
        }else if(SalesDone<4000){
            TotalSalary = (int) (BasicSalary*0.9);
        }
        System.out.println("Tong luong "+TotalSalary);
    }
    public static void main(String[] args) {
        EmployeeOfSale obj1 = new EmployeeOfSale(1,"Dat","THA",10,11000,1,0);
        EmployeeOfSale obj2 = new EmployeeOfSale(2,"Cuong","QG",20,5000,1,0);
    }
}
