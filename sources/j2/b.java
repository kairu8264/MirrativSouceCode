package j2;

import c1.c0;
import c1.u;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    public final long f37060b;

    public b(long j10) {
        this.f37060b = j10;
        if (!(j10 != c0.f18634b.e())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ b(long j10, jo.h hVar) {
        this(j10);
    }

    @Override // j2.h
    public long a() {
        return this.f37060b;
    }

    @Override // j2.h
    public u d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && c0.m(this.f37060b, ((b) obj).f37060b);
    }

    public int hashCode() {
        return c0.s(this.f37060b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) c0.t(this.f37060b)) + ')';
    }
}
