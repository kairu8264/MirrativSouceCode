package tb;

import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f53424a;

    /* renamed from: b  reason: collision with root package name */
    public final String f53425b;

    public b(Fragment fragment, String str) {
        p.h(fragment, "fragment");
        p.h(str, "tag");
        this.f53424a = fragment;
        this.f53425b = str;
    }

    public final Fragment a() {
        return this.f53424a;
    }

    public final String b() {
        return this.f53425b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f53424a, bVar.f53424a) && p.c(this.f53425b, bVar.f53425b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f53424a.hashCode() * 31) + this.f53425b.hashCode();
    }

    public String toString() {
        return "FragmentTransactionData(fragment=" + this.f53424a + ", tag=" + this.f53425b + ')';
    }
}
