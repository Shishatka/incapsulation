package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.comparator.SearchableComparator;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {
    private final Set<Searchable> set = new HashSet<>();

    public Set<Searchable> searchSet(String input) throws BestResultNotFound {
        Set<Searchable> output = new TreeSet<>(new SearchableComparator());

        output = set.stream().filter(i -> i.getSearchTerm().contains(input)).collect(Collectors.toSet());
        return output;
    }

    public void addSet(Searchable searchable) {
        set.add(searchable);
    }
}
