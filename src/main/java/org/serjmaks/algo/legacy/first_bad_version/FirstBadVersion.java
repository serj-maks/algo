package org.serjmaks.algo.legacy.first_bad_version;

public class FirstBadVersion extends VersionControl {

    public static int run(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int midpoint = left + (right - left) / 2;

            if (isBadVersion(midpoint)) {
                right = midpoint;
            } else {
                left = midpoint + 1;
            }
        }

        if (left == right && isBadVersion(left)) {
            return left;
        }

        return -1;
    }
}
