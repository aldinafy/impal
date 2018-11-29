/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class addslashes {
    public String addslash(String x){
        int idx=x.length();
        while(idx>0){
            if(x.charAt(idx-1)=='\\') x = x.substring(0, idx-1)+'\\'+x.substring(idx-1, x.length());
            else if(x.charAt(idx-1)=='\'') x = x.substring(0, idx-1)+'\\'+x.substring(idx-1, x.length());
            idx--;
        }
        return x;
    }
    public boolean isnumber(String x){
        try{
            Integer.parseInt(x);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
