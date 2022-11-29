package tb;

import androidx.fragment.app.e;
import jo.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f53422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f53423b;

    public a(e eVar, String str) {
        p.h(eVar, "dialogFragment");
        p.h(str, "tag");
        this.f53422a = eVar;
        this.f53423b = str;
    }

    public final e a() {
        return this.f53422a;
    }

    public final String b() {
        return this.f53423b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f53422a, aVar.f53422a) && p.c(this.f53423b, aVar.f53423b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f53422a.hashCode() * 31) + this.f53423b.hashCode();
    }

    public String toString() {
        return "DialogFragmentTransactionData(dialogFragment=" + this.f53422a + ", tag=" + this.f53423b + ')';
    }
}
