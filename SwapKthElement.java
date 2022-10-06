package GFG.Arrays;

class swapKthElement {
    String longest(String names[], int n) {
       int max = 0;
        for (int j = 1; j < n; j++) {
            if (names[j].length() > names[max].length()) {
                max = j;
            }
        }
        return names[max]; 
    }
}