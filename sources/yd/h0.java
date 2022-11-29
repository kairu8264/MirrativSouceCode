package yd;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f61733a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61734b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61735c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61736d;

    public h0(String str, int i10, int i11, int i12) {
        jo.p.h(str, "initial");
        this.f61733a = str;
        this.f61734b = i10;
        this.f61735c = i11;
        this.f61736d = i12;
    }

    public final String a() {
        return this.f61733a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return jo.p.c(this.f61733a, h0Var.f61733a) && this.f61734b == h0Var.f61734b && this.f61735c == h0Var.f61735c && this.f61736d == h0Var.f61736d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f61733a.hashCode() * 31) + Integer.hashCode(this.f61734b)) * 31) + Integer.hashCode(this.f61735c)) * 31) + Integer.hashCode(this.f61736d);
    }

    public String toString() {
        return "InitialData(initial=" + this.f61733a + ", startIndex=" + this.f61734b + ", endIndex=" + this.f61735c + ", total=" + this.f61736d + ')';
    }
}
