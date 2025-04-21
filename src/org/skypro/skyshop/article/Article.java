package org.skypro.skyshop.article;

import org.skypro.skyshop.interfaces.Searchable;

import java.util.Objects;

public class Article implements Searchable {
    private String name;
    private String article;

    public Article(String name, String article) {
        this.name = name;
        this.article = article;
    }

    @Override
    public String toString(){
        return name + "\n" + article;

    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getSearchTerm() {
        return name + " " + article;
    }

    public String getArticle() {
        return article;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Article article1 = (Article) object;
        return Objects.equals(name, article1.name) && Objects.equals(article, article1.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, article);
    }
}
