//this class tests the StringSorter method using JUnit

import java.util.*;
import java.io.*;
import junit.framework.TestCase;

public class TestStringSorter extends TestCase {
    private ArrayList<String> make123() {
        ArrayList<String> l = new ArrayList<String>();
        l.add("one");
        l.add("two");
        l.add("three");

        return l;
    }
}