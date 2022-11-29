package com.dena.mirrorman.unity;

import jo.p;

/* loaded from: classes3.dex */
public final class UnityMiniGameInputHeader {
    public static final int $stable = 0;
    private final String key;
    private final String value;

    public UnityMiniGameInputHeader(String str, String str2) {
        p.h(str, "key");
        p.h(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ UnityMiniGameInputHeader copy$default(UnityMiniGameInputHeader unityMiniGameInputHeader, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unityMiniGameInputHeader.key;
        }
        if ((i10 & 2) != 0) {
            str2 = unityMiniGameInputHeader.value;
        }
        return unityMiniGameInputHeader.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final UnityMiniGameInputHeader copy(String str, String str2) {
        p.h(str, "key");
        p.h(str2, "value");
        return new UnityMiniGameInputHeader(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityMiniGameInputHeader) {
            UnityMiniGameInputHeader unityMiniGameInputHeader = (UnityMiniGameInputHeader) obj;
            return p.c(this.key, unityMiniGameInputHeader.key) && p.c(this.value, unityMiniGameInputHeader.value);
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "UnityMiniGameInputHeader(key=" + this.key + ", value=" + this.value + ')';
    }
}
