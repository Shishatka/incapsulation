package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchEngine {
    private ArrayList<Searchable> arrayList = new ArrayList<>();
    private Map<String, Searchable> map = new HashMap<>();

    public ArrayList<Searchable> search(String input) throws BestResultNotFound {
        ArrayList<Searchable> output = new ArrayList<>();

        for (Searchable item : arrayList) {
            if (item != null && item.getSearchTerm().contains(input)) {
                output.add(item);
            }
        }
        if (output.isEmpty()) {
            throw new BestResultNotFound("Ничего не найдено");
        }
        return output;
    }

    public Map<String, Searchable> searchMap(String input) throws BestResultNotFound {
        Map<String, Searchable> output = new HashMap<>();
        for (String i: map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
            if (map.get(i) != null & map.get(i).getSearchTerm().contains(input)) {
                output.put(i, map.get(i));
            }
        }
        if (output.isEmpty()) {
            throw new BestResultNotFound("Ничего не найдено");
        }
        return output;
    }

    public void addMap(Searchable searchable) {
        map.put(searchable.getSearchTerm(), searchable);
    }

    public void add(Searchable searchable) {
        arrayList.add(searchable);
    }
}
