/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entity;

/**
 *
 * @author Masaomi
 */
public abstract class Lifeline {
    
    private boolean isAvailable;

    public Lifeline() {
        this.isAvailable = true;
    }
    
    abstract public void execute();
    
    public void disable () {
        this.isAvailable = false;
    }
}
