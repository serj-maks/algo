package org.serjmaks.algo.first_bad_version;

public class FirstBadVersion2 extends VersionControl {

    public static int run(int n) {
        int left = 1;
        int right = n;
        int midpoint;
        int result = n;

        while (left <= right) {
            midpoint = left + (right - left) / 2;

            if (isBadVersion(midpoint)) {
                result = midpoint;
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }

        return result;
    }
}
