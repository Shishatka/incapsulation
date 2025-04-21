package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.comparator.SearchableComparator;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.*;

public class SearchEngine {
    private Set<Searchable> set = new HashSet<>();

    public Set<Searchable> searchSet(String input) throws BestResultNotFound {
        Set<Searchable> output = new TreeSet<>(new SearchableComparator());

        for (Searchable i: set) {
            if (i != null && i.getSearchTerm().contains(input)) {
                output.add(i);
            }
        }
        if (output.isEmpty()) {
            throw new BestResultNotFound("Ничего не найдено");
        }
        return output;
    }

    public void addSet(Searchable searchable) {
        set.add(searchable);
    }
}
