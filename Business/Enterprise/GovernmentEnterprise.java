/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepgamit
 */
public class GovernmentEnterprise extends Enterprise {
    
    public enum Type{
        Analytics("Analytics Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    
    public GovernmentEnterprise(String name){
        super(name,EnterpriseType.Government);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
