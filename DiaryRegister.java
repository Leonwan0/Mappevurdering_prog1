package edu.ntnu.iir.bidata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creates a Hashmap to store keys and Strings for date and author name of entries by Authors.
 */
public class DiaryRegister {

  private final Map<String, List<Author>> entry = new HashMap<>();

  HashMap<String, Integer> authors = new HashMap<>();

  //authors.put("date", List<Author>);

}
