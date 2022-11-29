package h2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f34425a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34426b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34427c;

    public d(Object obj, int i10, int i11) {
        p.h(obj, TtmlNode.TAG_SPAN);
        this.f34425a = obj;
        this.f34426b = i10;
        this.f34427c = i11;
    }

    public final Object a() {
        return this.f34425a;
    }

    public final int b() {
        return this.f34426b;
    }

    public final int c() {
        return this.f34427c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f34425a, dVar.f34425a) && this.f34426b == dVar.f34426b && this.f34427c == dVar.f34427c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34425a.hashCode() * 31) + Integer.hashCode(this.f34426b)) * 31) + Integer.hashCode(this.f34427c);
    }

    public String toString() {
        return "SpanRange(span=" + this.f34425a + ", start=" + this.f34426b + ", end=" + this.f34427c + ')';
    }
}
