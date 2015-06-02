/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.util.List;
import secondhandcars.domain.OffVersion.Order;

/**
 *
 * @author Baku
 */
public class TireVacation extends Order{
    private int durationDays;
    private List<TireSet> tireSets;

    public TireVacation(int durationDays, List<TireSet> tireSets) {
        this.durationDays = durationDays;
        this.tireSets = tireSets;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public List<TireSet> getTireSets() {
        return tireSets;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public void setTireSets(List<TireSet> tireSets) {
        this.tireSets = tireSets;
    }
}
