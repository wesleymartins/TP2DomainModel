/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.model.CustomerPurchase;

/**
 *
 * @author Wesley
 */
public class Cash implements Payment{
    private String id;
    private double cashTendered;
    private double itemPrice;
    
    public double calcAmount() {
        
        return itemPrice;
    }

    public String getId() {
        return id;
    }

    public double getCashTendered() {
        return cashTendered;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    
    private Cash(){}   
    
        
 private Cash(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private double cashTendered;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder cashTendered(double value)
        {
            cashTendered = value;
            return this;
        }
        
        public Cash build()
        {
        return new Cash(this);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
            final Builder other = (Builder) obj;
            if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
                return false;
            }
            return true;
        }
        
        
    
    
}
        
}
