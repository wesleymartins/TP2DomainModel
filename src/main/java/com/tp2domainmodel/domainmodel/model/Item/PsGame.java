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
public class PsGame implements Console{
 private String id;
    private String consoleType; 
    private String name;
    
    public String determineType() {
         if(consoleType=="1")
        consoleType = "Playstation 3";
        else if(consoleType=="2")
            consoleType = "Playstation 4";
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
    
     private PsGame(){}   
    
        
 private PsGame(Builder builder){
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
        
        public PsGame build()
        {
        return new PsGame(this);
        }
    
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final PsGame other = (PsGame) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
        
        
    
}
