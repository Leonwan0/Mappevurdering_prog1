package edu.ntnu.iir.bidata;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DiaryEntryTest {
  // Arrange
  Author author1 = new Author("Leon");
  Author author2 = new Author("Jan");
  DiaryEntry entry = new DiaryEntry(author1, "title", "content", LocalDateTime.now());
  DiaryEntry entry2 = new DiaryEntry(author2, "Title", "Hello", LocalDateTime.now());

  /**
   * Positive testing.
   * Testing getters and setters for positive results.
   */
  @Test
  void testValidGetValues() {
    assertEquals(author1, entry.getAuthor());
    assertEquals("title", entry.getTitle());
    assertEquals("content", entry.getContent());
  }

  @Test
  void testIfSettersUpdateFields() {
    // act
    entry2.setTitle("Trening");
    entry2.setContent("Push");

    // assert
    assertEquals(author2, entry2.getAuthor());
    assertEquals("Push", entry2.getContent());
    assertEquals("Trening", entry2.getTitle());
  }


  @Test
  void testNullorEmptyTitleThrowsException() {
    assertThrows(IllegalArgumentException.class, () ->
        new DiaryEntry(author2, "", "content", LocalDateTime.now()));
    // entry.setTitle(null);
  }

  @Test
  void testNullorEmptyContentThrowsException() {
    assertThrows(IllegalArgumentException.class, () ->
        new DiaryEntry(author2, "title", "", LocalDateTime.now()));
    // entry2.setContent("hei");
  }

}



