/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerfootball;

/**
 *
 * @author prosf
 */
public interface Source {
    public void notifyObserver();
    public void register(MyObserver o);

}
