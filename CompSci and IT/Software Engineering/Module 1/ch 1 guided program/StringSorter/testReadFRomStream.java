public void testReadFromStream() throws IOException {
    Reader in = new FileReader ("in.txt");
    StringSorter ss = new StringSorter();
    ArrayList<String> l = make123();
    ss.readFromStream(in);

    assertEquals(l, ss.lines); //verifies that the input in arraylist "l" is equal to the input in "lines" from the StringSorter
}