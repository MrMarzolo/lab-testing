/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author master
 */
public class ArithmaticClass {
    
    public int Number1;
    public int Number2;
    //private
    int Results; 
    
    public ArithmaticClass()
    {}
    
    public void AddNumbers()
    {
        Results = Number1 + Number2;
    }

    public int GetResults()
    {
        return Results;
    }
}
