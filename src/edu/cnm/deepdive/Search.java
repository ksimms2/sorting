package edu.cnm.deepdive;

public class Search {

  public static int linearSearch(int needle, int[] haystack){ // goes through each item to get to the number in the array
    for (int i = 0; i < haystack.length; i++) {
      if(haystack[i] == needle){
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int needle, int[] haystack){ // kinda splits the array in two and then searches through
    return binarySearch(needle, haystack, 0, haystack.length);
  }

  private static int binarySearch(int needle, int[] haystack, int from, int to){
    if(from >= to){
      return - (from + 1);
    }
    int midpoint = (from + to) / 2;
    if(haystack[midpoint] == needle){
      return midpoint;
    }
    if(haystack[midpoint] < needle){
      return binarySearch(needle, haystack, midpoint + 1, to);
    }
    return binarySearch(needle, haystack, from, midpoint);
  }
}
