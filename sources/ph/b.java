package ph;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes3.dex */
public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final int f47456a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.a<O> f47457b;

    /* renamed from: c  reason: collision with root package name */
    public final O f47458c;

    /* renamed from: d  reason: collision with root package name */
    public final String f47459d;

    public b(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        this.f47457b = aVar;
        this.f47458c = o10;
        this.f47459d = str;
        this.f47456a = rh.n.b(aVar, o10, str);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f47457b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return rh.n.a(this.f47457b, bVar.f47457b) && rh.n.a(this.f47458c, bVar.f47458c) && rh.n.a(this.f47459d, bVar.f47459d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47456a;
    }
}
