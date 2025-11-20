package edu.ntnu.iir.bidata;

import java.util.Objects;

/**
 * This class represents an author in the diary system.
 * The class stores basic information about the author.
 */
public class Author {
  private final String name;

  /**
   * Creates a throw-exception loop of if name is null or blank.
   *
   * @param name is a String.
   * @throws IllegalArgumentException if the name is invalid.
   */
  public Author(String name) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Author name is null or blank");
    }
    this.name = name;
  }


  public String getName() {
    return name;
  }

  /**
   * Marks that this method overrides the method in the Author class
   *
   * @return the name tha was initialized.
   */
  @Override
  public String toString() {
    return this.name;
  }

  /**
   * If the author name is the same as another author, it will be
   * considered as equal.
   *
   *
   * @param obj the reference object with which to compare.
   * @return the name which equals the other name.
   */
  @Override
  public boolean equals(Object obj) {
    // If both object points at the same object.
    if (this == obj) {
      return true;
    }
    // if obj is not the same as Author, return false.
    if (!(obj instanceof Author)) {
      return false;
    }
    // Redo obj to an Author object.
    Author other = (Author) obj;

    // Check if the names are equal (ignores big/small characters).
    return this.name.equalsIgnoreCase(other.name);
  }

  /**
   * Returns the hash code for this author.
   * Used by collections such as HashMap and HashSet to quickly find objects.
   * The hash code is based on the name in lowercase, so that
   * authors with the same name (regardless of case)
   * get the same hash value. This ensures consistency with the equals() method.
   *
   * @return Hashcode for the author.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name.toLowerCase());
  }

}
