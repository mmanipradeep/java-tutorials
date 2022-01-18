package com.mani.pradeep;

public class FindBadVersion extends VersionControl{
    public static void main(String[] args) {

    }

    public static int BinarySearch(int n){

            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
    }


}
