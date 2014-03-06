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
public class StorePurchase implements Transaction{
    
    private String id;
    private String time;

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }
    
     private StorePurchase(){}   
    
        
 private StorePurchase(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private String time;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder time(String value)
        {
            time = value;
            return this;
        }
        
        public StorePurchase build()
        {
        return new StorePurchase(this);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
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
