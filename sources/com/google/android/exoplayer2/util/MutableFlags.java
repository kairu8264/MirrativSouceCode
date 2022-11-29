package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public class MutableFlags {
    private final SparseBooleanArray flags = new SparseBooleanArray();

    public void add(int i10) {
        this.flags.append(i10, true);
    }

    public void clear() {
        this.flags.clear();
    }

    public boolean contains(int i10) {
        return this.flags.get(i10);
    }

    public boolean containsAny(int... iArr) {
        for (int i10 : iArr) {
            if (contains(i10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutableFlags) {
            return this.flags.equals(((MutableFlags) obj).flags);
        }
        return false;
    }

    public int get(int i10) {
        Assertions.checkArgument(i10 >= 0 && i10 < size());
        return this.flags.keyAt(i10);
    }

    public int hashCode() {
        return this.flags.hashCode();
    }

    public int size() {
        return this.flags.size();
    }
}
