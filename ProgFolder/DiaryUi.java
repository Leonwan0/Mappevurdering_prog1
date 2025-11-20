package edu.ntnu.iir.bidata;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Hovedklassen for brukergrensesnittet for Dagbok-applikasjonen.
 * Denne klassen håndterer brukerinteraksjoner, visning av menyer,
 * og behandling av brukerinndata for å administrere dagbokføringer.
 */
public class DiaryUi {
  /**
   *
   * Initialiserer brukergrensesnittet og eventuelle nødvendige ressurser.
   *
   */

  public void init() {
    // DiaryEntry entry1 = new DiaryEntry("leon", "", "content", LocalDateTime.now());
    // System.out.println(entry1);
  }


  /**
   * Starter hovedløkken for dagbokapplikasjonen.
   * Viser menyen, håndterer brukerens valg, og utfører tilsvarende handlinger.
   * Denne metoden kjører kontinuerlig til brukeren velger å avslutte applikasjonen.
   *
   *
   */
  public void start() {

    Scanner inputReader = new Scanner(System.in);

    boolean userInteraction = false;
    System.out.println("Welcome to diary app");
    System.out.println("Enter '0' to go to diary menu.");

    int startChoice = inputReader.nextInt();
    inputReader.nextLine();

    if (startChoice != 0) {
      System.out.println("Invalid choice. Program ends.");
      return;
    }

    if (startChoice == 0) {
      userInteraction = true;
    }

    while (userInteraction) {
      System.out.println("\n===== DIARTY MENU =====");
      System.out.println("1. Add New content");
      System.out.println("2. View all entries");
      System.out.println("3. Delete Entry");
      System.out.println("4. Exit");
      System.out.print("Enter a number in the list: ");

      int choice = inputReader.nextInt();
      inputReader.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Welcome! Enter new title: ");
          String title = inputReader.nextLine();
          System.out.println("Enter new content: ");
          String content = inputReader.nextLine();
          break;
        case 2:
        case 3:
        case 4:
          System.out.println("Exiting diary application. Goodbye!");
          while (choice == 4)
            System.exit(0);
          break;
        default:
          userInteraction = false;
          System.out.println("Invalid choice. Please try again.");

      }
    }
  }
}


