package g1;

import c1.j1;
import c1.k1;
import c1.w0;
import java.util.List;
import jo.f0;

/* loaded from: classes.dex */
public final class t extends q {

    /* renamed from: a  reason: collision with root package name */
    public final String f32550a;

    /* renamed from: b  reason: collision with root package name */
    public final List<f> f32551b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32552c;

    /* renamed from: d  reason: collision with root package name */
    public final c1.u f32553d;

    /* renamed from: e  reason: collision with root package name */
    public final float f32554e;

    /* renamed from: f  reason: collision with root package name */
    public final c1.u f32555f;

    /* renamed from: g  reason: collision with root package name */
    public final float f32556g;

    /* renamed from: h  reason: collision with root package name */
    public final float f32557h;

    /* renamed from: i  reason: collision with root package name */
    public final int f32558i;

    /* renamed from: j  reason: collision with root package name */
    public final int f32559j;

    /* renamed from: k  reason: collision with root package name */
    public final float f32560k;

    /* renamed from: l  reason: collision with root package name */
    public final float f32561l;

    /* renamed from: m  reason: collision with root package name */
    public final float f32562m;

    /* renamed from: n  reason: collision with root package name */
    public final float f32563n;

    /* JADX WARN: Multi-variable type inference failed */
    public t(String str, List<? extends f> list, int i10, c1.u uVar, float f10, c1.u uVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.f32550a = str;
        this.f32551b = list;
        this.f32552c = i10;
        this.f32553d = uVar;
        this.f32554e = f10;
        this.f32555f = uVar2;
        this.f32556g = f11;
        this.f32557h = f12;
        this.f32558i = i11;
        this.f32559j = i12;
        this.f32560k = f13;
        this.f32561l = f14;
        this.f32562m = f15;
        this.f32563n = f16;
    }

    public /* synthetic */ t(String str, List list, int i10, c1.u uVar, float f10, c1.u uVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, jo.h hVar) {
        this(str, list, i10, uVar, f10, uVar2, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final c1.u d() {
        return this.f32553d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jo.p.c(f0.b(t.class), f0.b(obj.getClass()))) {
            return false;
        }
        t tVar = (t) obj;
        if (jo.p.c(this.f32550a, tVar.f32550a) && jo.p.c(this.f32553d, tVar.f32553d)) {
            if ((this.f32554e == tVar.f32554e) && jo.p.c(this.f32555f, tVar.f32555f)) {
                if (this.f32556g == tVar.f32556g) {
                    if ((this.f32557h == tVar.f32557h) && j1.g(this.f32558i, tVar.f32558i) && k1.g(this.f32559j, tVar.f32559j)) {
                        if (this.f32560k == tVar.f32560k) {
                            if (this.f32561l == tVar.f32561l) {
                                if (this.f32562m == tVar.f32562m) {
                                    return ((this.f32563n > tVar.f32563n ? 1 : (this.f32563n == tVar.f32563n ? 0 : -1)) == 0) && w0.f(this.f32552c, tVar.f32552c) && jo.p.c(this.f32551b, tVar.f32551b);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f32554e;
    }

    public final String g() {
        return this.f32550a;
    }

    public int hashCode() {
        int hashCode = ((this.f32550a.hashCode() * 31) + this.f32551b.hashCode()) * 31;
        c1.u uVar = this.f32553d;
        int hashCode2 = (((hashCode + (uVar != null ? uVar.hashCode() : 0)) * 31) + Float.hashCode(this.f32554e)) * 31;
        c1.u uVar2 = this.f32555f;
        return ((((((((((((((((((hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 31) + Float.hashCode(this.f32556g)) * 31) + Float.hashCode(this.f32557h)) * 31) + j1.h(this.f32558i)) * 31) + k1.h(this.f32559j)) * 31) + Float.hashCode(this.f32560k)) * 31) + Float.hashCode(this.f32561l)) * 31) + Float.hashCode(this.f32562m)) * 31) + Float.hashCode(this.f32563n)) * 31) + w0.g(this.f32552c);
    }

    public final List<f> j() {
        return this.f32551b;
    }

    public final int k() {
        return this.f32552c;
    }

    public final c1.u m() {
        return this.f32555f;
    }

    public final float p() {
        return this.f32556g;
    }

    public final int r() {
        return this.f32558i;
    }

    public final int s() {
        return this.f32559j;
    }

    public final float t() {
        return this.f32560k;
    }

    public final float u() {
        return this.f32557h;
    }

    public final float w() {
        return this.f32562m;
    }

    public final float x() {
        return this.f32563n;
    }

    public final float y() {
        return this.f32561l;
    }
}
