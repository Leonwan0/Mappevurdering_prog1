package edu.ntnu.iir.bidata;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Register class that holds an overview
 */
public class AuthorRegister {

  private final List<Author> authors;

  public AuthorRegister() {
    authors = new ArrayList<>();
  }

  public void addAuthor(Author author) {
    authors.add(author);
  }

  public void removeAuthor(Author author) {
    authors.remove(author);
  }

  public void clearAuthors() {
    authors.clear();
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void addAuthors(List<Author> authors) {
    this.authors.addAll(authors);
  }
}

