package d2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final l f29114a;

    /* renamed from: b  reason: collision with root package name */
    public final x f29115b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29116c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29117d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f29118e;

    public m0(l lVar, x xVar, int i10, int i11, Object obj) {
        this.f29114a = lVar;
        this.f29115b = xVar;
        this.f29116c = i10;
        this.f29117d = i11;
        this.f29118e = obj;
    }

    public /* synthetic */ m0(l lVar, x xVar, int i10, int i11, Object obj, jo.h hVar) {
        this(lVar, xVar, i10, i11, obj);
    }

    public static /* synthetic */ m0 b(m0 m0Var, l lVar, x xVar, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            lVar = m0Var.f29114a;
        }
        if ((i12 & 2) != 0) {
            xVar = m0Var.f29115b;
        }
        x xVar2 = xVar;
        if ((i12 & 4) != 0) {
            i10 = m0Var.f29116c;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = m0Var.f29117d;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = m0Var.f29118e;
        }
        return m0Var.a(lVar, xVar2, i13, i14, obj);
    }

    public final m0 a(l lVar, x xVar, int i10, int i11, Object obj) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return new m0(lVar, xVar, i10, i11, obj, null);
    }

    public final l c() {
        return this.f29114a;
    }

    public final int d() {
        return this.f29116c;
    }

    public final int e() {
        return this.f29117d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return jo.p.c(this.f29114a, m0Var.f29114a) && jo.p.c(this.f29115b, m0Var.f29115b) && u.f(this.f29116c, m0Var.f29116c) && v.h(this.f29117d, m0Var.f29117d) && jo.p.c(this.f29118e, m0Var.f29118e);
        }
        return false;
    }

    public final x f() {
        return this.f29115b;
    }

    public int hashCode() {
        l lVar = this.f29114a;
        int hashCode = (((((((lVar == null ? 0 : lVar.hashCode()) * 31) + this.f29115b.hashCode()) * 31) + u.g(this.f29116c)) * 31) + v.i(this.f29117d)) * 31;
        Object obj = this.f29118e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f29114a + ", fontWeight=" + this.f29115b + ", fontStyle=" + ((Object) u.h(this.f29116c)) + ", fontSynthesis=" + ((Object) v.l(this.f29117d)) + ", resourceLoaderCacheKey=" + this.f29118e + ')';
    }
}
