package edu.ntnu.iir.bidata;

/**
 * Hovedutgangspunktet for applikasjonen. Denne klassen oppretter
 * instansen av hovedklassen som starter applikasjonen.
 */
public class DiaryApp {
  /**
   * Starter applikasjonen.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    DiaryUi ui = new DiaryUi();
    ui.init();
    ui.start();

  }
}
