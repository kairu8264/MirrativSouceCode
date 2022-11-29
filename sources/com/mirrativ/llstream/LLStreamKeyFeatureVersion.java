package com.mirrativ.llstream;

import jo.p;
import so.a;
import so.n;
import so.q;

/* loaded from: classes4.dex */
public final class LLStreamKeyFeatureVersion {
    private final String versionString;

    public LLStreamKeyFeatureVersion(String str) {
        p.h(str, "version");
        this.versionString = str;
    }

    public final int getRawValue$llstream_release() {
        if (this.versionString.length() == 2 && n.C(this.versionString, "x", false, 2, null)) {
            return Integer.parseInt(q.M0(this.versionString, 1), a.a(16));
        }
        return -1;
    }

    public final String getVersionString$llstream_release() {
        return this.versionString;
    }
}
