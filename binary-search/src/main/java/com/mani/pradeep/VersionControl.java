package com.mani.pradeep;

public  class   VersionControl {
    static boolean isBadVersion(int version) {
        if (version == 4)
            return true;
        if (version == 3)
            return false;
        if (version == 5)
            return true;
        return false;
    }
}
