package edu.ntnu.iir.bidata;

import java.time.LocalDateTime;


/**
 * Denne klassen DiaryEntry representerer ett dagbokinnlegg med tittel, tekst og dato.
 * Den har ansvaret for å lagre, vise og validere denne informasjonen.
 * **Informasjon og datatyper**:
 * - title (String): tittel på selve dagbokinnlegget.
 * String er valgt fordi det skal bestå av bokstaver og ord.
 * - content (String): Selve teksten i dagboken. String passer på grunn av fritekst.
 * - date (LocalDateTime): datoen og tiden innlegget ble skrevet.
 * LocalDateTime er valgt fordi det lagrer dato med klokkeslett.
 *
 */
public class DiaryEntry {
  private final LocalDateTime dateTime; // Skal ikke endres etter opprettelsen.
  private final Author author;
  private String title;
  private String content;

  /**
   * jdneufnenfue.
   * * @param title tittelen på dagbokinnlegget (Kan ikke være tom)
   *
   * @param content  innholdet i dagbokinnlegget
   * @param dateTime datoen og tiden innlegget ble skrevet
   */
  public DiaryEntry(Author author, String title, String content, LocalDateTime dateTime) {
    setTitle(title);
    setContent(content);
    this.author = author;
    this.dateTime = dateTime;
  }

  /**
   * for å hente tittelen på dagbokinnlegget.
   *
   * @return title
   */
  public String getTitle() {
    if (title == null || title.isEmpty()) {
      throw new IllegalArgumentException("title cannot be empty");
    }
    return title;
  }

  /**
   * innholdet i dagbokinnlegget.
   *
   * @return content
   */
  public String getContent() {
    if (content == null || content.isEmpty()) {
      throw new IllegalArgumentException("content cannot be empty");
    }
    return content;
  }

  /**
   * datoen og tiden innlegget ble skrevet.
   *
   * @return dateTime
   */
  public LocalDateTime getDateTime() {
    if (dateTime == null) {
      throw new NullPointerException("dateTime cannot be null");
    }
    return dateTime;
  }

  /**
   * Endrer tittelen i dagbokinnlegget.
   *
   * @param title tittelen.
   */
  public void setTitle(String title) {
    if (title == null || title.isEmpty()) {
      throw new IllegalArgumentException("title cannot be empty");
    }
    this.title = title;
  }

  /**
   * Endrer innholdet i dagbokinnlegget.
   *
   * @param content innholdet
   */
  public void setContent(String content) {
    if (content == null || content.isEmpty()) {
      throw new IllegalArgumentException("content cannot be empty");
    }
    this.content = content;
  }

  /**
   * Navnet på forfatteren.
   * Henter navnet.
   */
  public Author getAuthor() {
    return this.author;
  }

  // todo make throw-exception for each method so the diarytest will work.
}
