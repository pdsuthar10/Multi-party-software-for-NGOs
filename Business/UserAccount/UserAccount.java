/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Employee.Volunteer;
import static Business.Organization.Organization.Type.Volunteer;
import Business.Medicine;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    //private HashMap<String,Integer> medicineList;
    private List<Medicine> medicineHistory;
    private List<Medicine> medicineList;
    
    

    public UserAccount() {
        workQueue = new WorkQueue();
        medicineList = new ArrayList<Medicine>();
        medicineHistory = new ArrayList<Medicine>();
    }

    public List<Medicine> getMedicineHistory() {
        return medicineHistory;
    }

    public void setMedicineHistory(List<Medicine> medicineHistory) {
        this.medicineHistory = medicineHistory;
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public Volunteer getVolunteer() {
        return (Volunteer) employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
   

    
    public boolean checkDuplicates(WorkRequest r){
        for(WorkRequest comp : workQueue.getWorkRequestList()){
            if(comp == r){
                return true;
            }  
        }
        
        return false;
    }

    
    
    @Override
    public String toString() {
        return employee.getName();
    }
    
    
    
}