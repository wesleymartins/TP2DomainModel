/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.model.TradeIns;

/**
 *
 * @author student
 */
public class TradeItem {
    
    private String id;
    private String name;
    private double cashBack;
    private String tradeTate;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashBack() {
        return cashBack;
    }

    public String getTradeTate() {
        return tradeTate;
    }
    
    private TradeItem(){}   
    
        
 private TradeItem(Builder builder){
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
        
        public TradeItem build()
        {
        return new TradeItem(this);
        }
    
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final TradeItem other = (TradeItem) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
        
        
    
}
