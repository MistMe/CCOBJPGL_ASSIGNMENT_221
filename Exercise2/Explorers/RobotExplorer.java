package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Loading instructions from system... exploring Neptune. Activating Underwater mode");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Planet exploration data collection complete. Submitting results back to home");
    }
}