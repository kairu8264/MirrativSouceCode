package jf;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class z implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final List<b> f38030w;

    /* renamed from: x  reason: collision with root package name */
    public final List<q0> f38031x;

    public z(List<b> list, List<q0> list2) {
        jo.p.h(list, "characterInfoList");
        jo.p.h(list2, "rubyInfoList");
        this.f38030w = list;
        this.f38031x = list2;
    }

    public final List<b> a() {
        return this.f38030w;
    }

    public final List<q0> b() {
        return this.f38031x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return jo.p.c(this.f38030w, zVar.f38030w) && jo.p.c(this.f38031x, zVar.f38031x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f38030w.hashCode() * 31) + this.f38031x.hashCode();
    }

    public String toString() {
        return "LyricsBlockInfo(characterInfoList=" + this.f38030w + ", rubyInfoList=" + this.f38031x + ')';
    }
}
