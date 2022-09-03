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
public class FansThai implements MyObserver {

    @Override
    public void update(Source o) {
        System.out.println(
        "THAI - live result: Thai " + 
                ((Referee)o).getThaiScore() + "-" + 
                ((Referee)o).getUAEScore() + " UAE");
    }
    
}
