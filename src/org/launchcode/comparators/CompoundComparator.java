package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    private List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> city){
        comparators.add(city);
    }

    @Override
    public int compare(City o1, City o2){
        String currentState = o1.getState();
        while (o2.getState().equals(currentState)){
            return o2.getPopulation() - o1.getPopulation();
        } if (!o2.getState().equals(currentState)){
            currentState = o2.getState();
        } return o1.getState().compareTo(o2.getState());
    }

}