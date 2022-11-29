package jf;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class v implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final String f38016w;

    /* renamed from: x  reason: collision with root package name */
    public final String f38017x;

    /* renamed from: y  reason: collision with root package name */
    public final int f38018y;

    /* renamed from: z  reason: collision with root package name */
    public final List<a0> f38019z;

    public v(String str, String str2, int i10, List<a0> list) {
        jo.p.h(str, "title");
        jo.p.h(str2, "artists");
        jo.p.h(list, "lyrics");
        this.f38016w = str;
        this.f38017x = str2;
        this.f38018y = i10;
        this.f38019z = list;
    }

    public final List<a0> a() {
        return this.f38019z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return jo.p.c(this.f38016w, vVar.f38016w) && jo.p.c(this.f38017x, vVar.f38017x) && this.f38018y == vVar.f38018y && jo.p.c(this.f38019z, vVar.f38019z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f38016w.hashCode() * 31) + this.f38017x.hashCode()) * 31) + Integer.hashCode(this.f38018y)) * 31) + this.f38019z.hashCode();
    }

    public String toString() {
        return "KaraokeModel(title=" + this.f38016w + ", artists=" + this.f38017x + ", songTotalTime=" + this.f38018y + ", lyrics=" + this.f38019z + ')';
    }
}
