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
public final class XboxGame implements Console{

    private String id;
    private String consoleType; 
    private String name;
    
    public String determineType() {
        if(consoleType=="1")
        consoleType = "Xbox 360";
        else if(consoleType=="2")
            consoleType = "XboxOne";
        return consoleType;
    }

    public String getId() {
        return id;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getName() {
        return name;
    }
    
     private XboxGame(){}   
    
        
 private XboxGame(Builder builder){
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
        
        public XboxGame build()
        {
        return new XboxGame(this);
        }
    
}

    @Override
    public int hashCode() {
        int hash = 3;
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
        final XboxGame other = (XboxGame) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
        
        
        
}
