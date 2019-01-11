package nandu;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MaxRepeatedWordsFromFile {
 public static void main(String[] args) {
  FileInputStream fis;
  DataInputStream dis;
  BufferedReader reader = null;
  Map < String, Integer > wordMap = new HashMap < String, Integer > ();
  String line = null;
  try {
   fis = new FileInputStream(new File("InterviewQuestions_Selenium.txt"));
   dis = new DataInputStream(fis);
   reader = new BufferedReader(new InputStreamReader(dis));
   while ((line = reader.readLine()) != null) {
    StringTokenizer strToken = new StringTokenizer(line, "");
    while (strToken.hasMoreTokens()) {
     String tmp = strToken.nextToken().toLowerCase();
     if (wordMap.containsKey(tmp)) {
      wordMap.put(tmp, wordMap.get(tmp) + 1);
     } else {
      wordMap.put(tmp, 1);
     }
    }
   }
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } finally {
   try {
    if (reader != null) reader.close();
   } catch (Exception ex) {}
  }
 }

}