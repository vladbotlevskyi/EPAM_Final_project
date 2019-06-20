package view;

import controller.Buspark;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class OnShowAllBuses implements ActionListener {

    private final String[] columns = {"Bus id", "Bus name", "Route id", "Route name"};
    private Buspark buspark;
    private List<Integer> rangeToSelect;

    public OnShowAllBuses(Buspark buspark, List<Integer> rangeToSelect) {
        this.buspark = buspark;
        this.rangeToSelect = rangeToSelect;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new AllEntitiesWindow(buspark.getAllBusesInfo(rangeToSelect.get(0), rangeToSelect.get(1)),
                columns, "All Buses");
    }
}
