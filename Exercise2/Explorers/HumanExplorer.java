package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Deploying tools specific to Neptune... let's go swimming");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Time to return home");
    }
}