/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.model.Rentals;

/**
 *
 * @author student
 */
public class RentalInvoice {
    private String id;
    private String dateRented;
    private String dateReturned;

    public String getId() {
        return id;
    }

    public String getDateRented() {
        return dateRented;
    }

    public String getDateReturned() {
        return dateReturned;
    }
    
        private RentalInvoice(){}   
    
        
 private RentalInvoice(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private String dateRented;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder dateRented(String value)
        {
            dateRented = value;
            return this;
        }
        
        public RentalInvoice build()
        {
        return new RentalInvoice(this);
        }
    
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final RentalInvoice other = (RentalInvoice) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
        
        

 
    
}
