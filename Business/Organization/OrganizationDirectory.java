/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.GovernmentEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LogisticEnterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createHospitalOrganization(HospitalEnterprise.Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            
            organization = new PharmacyOrganization();
            System.out.println("pharmacy "+organization.getOrganizationID());
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createNGOOrganization(NGOEnterprise.Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Health.getValue())){
            organization = new HealthOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Education.getValue())){
            organization = new EducationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createGovernmentOrganization(GovernmentEnterprise.Type type){
        Organization organization = null;
        if(type.getValue().equals(Type.Analytics.getValue())){
            organization = new AnalyticsOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createLogisticOrganization(LogisticEnterprise.Type type){
        Organization organization = null;
        if(type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}