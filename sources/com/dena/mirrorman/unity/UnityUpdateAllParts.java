package com.dena.mirrorman.unity;

import jo.p;

/* loaded from: classes3.dex */
public final class UnityUpdateAllParts {
    public static final int $stable = 0;
    private final String key;
    private final int slot;

    public UnityUpdateAllParts(String str, int i10) {
        p.h(str, "key");
        this.key = str;
        this.slot = i10;
    }

    public static /* synthetic */ UnityUpdateAllParts copy$default(UnityUpdateAllParts unityUpdateAllParts, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unityUpdateAllParts.key;
        }
        if ((i11 & 2) != 0) {
            i10 = unityUpdateAllParts.slot;
        }
        return unityUpdateAllParts.copy(str, i10);
    }

    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.slot;
    }

    public final UnityUpdateAllParts copy(String str, int i10) {
        p.h(str, "key");
        return new UnityUpdateAllParts(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityUpdateAllParts) {
            UnityUpdateAllParts unityUpdateAllParts = (UnityUpdateAllParts) obj;
            return p.c(this.key, unityUpdateAllParts.key) && this.slot == unityUpdateAllParts.slot;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getSlot() {
        return this.slot;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + Integer.hashCode(this.slot);
    }

    public String toString() {
        return "UnityUpdateAllParts(key=" + this.key + ", slot=" + this.slot + ')';
    }
}
