package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.*;

public class SearchEngine {
    private Map<String, Searchable> map = new HashMap<>();

    public Map<String, Searchable> searchMap(String input) throws BestResultNotFound {
        Map<String, Searchable> output = new TreeMap<>();

        for (Searchable i: map.values()) {
            if (i != null && i.getSearchTerm().contains(input)) {
                output.put(i.getSearchTerm(), i);
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
}
