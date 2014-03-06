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
public class PreOrder implements Transaction{
    private String id;
    private String releaseDate;
    private String status;

    public String getId() {
        return id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getStatus() {
        return status;
    }
    
    private PreOrder(){}   
    
        
 private PreOrder(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private String status;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder status(String value)
        {
            status = value;
            return this;
        }
        
        public PreOrder build()
        {
        return new PreOrder(this);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
