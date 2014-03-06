/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.model.Item;

/**
 *
 * @author Wesley
 */
public class Accessory implements Console{
    
    private String id;
    private String name;
    private String type;
    
    public String determineType() {
         if(type=="1")
        type = "Xbox 360";
        else if(type=="2")
            type = "XboxOne";
        else if(type=="3")
            type = "PC";
        return type;
       
    }
    
     public String getId() {
        return id;
    }

    public String getConsoleType() {
        return type;
    }

    public String getName() {
        return name;
    }
    
     private Accessory(){}   
    
        
 private Accessory(Builder builder){
     id = builder.id;
     
 }
 
 
        public static class Builder
        {
            private String id;
            private String name;
            
            public Builder(String id)
            {
                this.id = id;
            }
                        
        
        
        public Builder name(String value)
        {
            name = value;
            return this;
        }
        
        public Accessory build()
        {
        return new Accessory(this);
        }
    
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
        final Accessory other = (Accessory) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
        
        
    
}
