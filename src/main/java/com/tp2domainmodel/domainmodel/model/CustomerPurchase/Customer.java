/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.model.CustomerPurchase;

/**
 *
 * @author student
 */
public final class Customer {
    
    private String id;
    private String fName;

 private Customer(){}   
    
        
 private Customer(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private String fName;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder fName(String value)
        {
            fName = value;
            return this;
        }
        
        public Customer build()
        {
        return new Customer(this);
        }
        
        
}
        
        
        public String getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
        
    
    
    }   
    
    
    
    

