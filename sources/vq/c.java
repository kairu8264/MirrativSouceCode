package vq;

import jo.p;

/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f57541a;

    public c(String str) {
        p.h(str, "value");
        this.f57541a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p.c(getValue(), ((c) obj).getValue());
    }

    @Override // vq.a
    public String getValue() {
        return this.f57541a;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue();
    }
}
