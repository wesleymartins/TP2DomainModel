/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.model.ItemsForSale;

/**
 *
 * @author Wesley
 */
public class Item {
    
    private String id;
    private String type;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
    
    private Item(){}   
    
        
 private Item(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private String type;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder type(String value)
        {
            type = value;
            return this;
        }
        
        public Item build()
        {
        return new Item(this);
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
