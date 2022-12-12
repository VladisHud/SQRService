package ru.netology.sqr;

public class SQRService {
    public int squarerange(int downlimit, int uplimit) {
        int meter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrnumb = i * i;
            if (sqrnumb >= downlimit) {
                if (sqrnumb <= uplimit) {
                    meter++;
                }
            }
        }
        return meter;
    }
}