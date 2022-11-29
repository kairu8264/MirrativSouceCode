package j6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import n6.c;
import uo.g1;
import uo.k0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final k0 f37115a;

    /* renamed from: b */
    public final k0 f37116b;

    /* renamed from: c */
    public final k0 f37117c;

    /* renamed from: d */
    public final k0 f37118d;

    /* renamed from: e */
    public final c.a f37119e;

    /* renamed from: f */
    public final k6.d f37120f;

    /* renamed from: g */
    public final Bitmap.Config f37121g;

    /* renamed from: h */
    public final boolean f37122h;

    /* renamed from: i */
    public final boolean f37123i;

    /* renamed from: j */
    public final Drawable f37124j;

    /* renamed from: k */
    public final Drawable f37125k;

    /* renamed from: l */
    public final Drawable f37126l;

    /* renamed from: m */
    public final a f37127m;

    /* renamed from: n */
    public final a f37128n;

    /* renamed from: o */
    public final a f37129o;

    public b() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public b(k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, c.a aVar, k6.d dVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4) {
        this.f37115a = k0Var;
        this.f37116b = k0Var2;
        this.f37117c = k0Var3;
        this.f37118d = k0Var4;
        this.f37119e = aVar;
        this.f37120f = dVar;
        this.f37121g = config;
        this.f37122h = z10;
        this.f37123i = z11;
        this.f37124j = drawable;
        this.f37125k = drawable2;
        this.f37126l = drawable3;
        this.f37127m = aVar2;
        this.f37128n = aVar3;
        this.f37129o = aVar4;
    }

    public final b a(k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, c.a aVar, k6.d dVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4) {
        return new b(k0Var, k0Var2, k0Var3, k0Var4, aVar, dVar, config, z10, z11, drawable, drawable2, drawable3, aVar2, aVar3, aVar4);
    }

    public final boolean c() {
        return this.f37122h;
    }

    public final boolean d() {
        return this.f37123i;
    }

    public final Bitmap.Config e() {
        return this.f37121g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (jo.p.c(this.f37115a, bVar.f37115a) && jo.p.c(this.f37116b, bVar.f37116b) && jo.p.c(this.f37117c, bVar.f37117c) && jo.p.c(this.f37118d, bVar.f37118d) && jo.p.c(this.f37119e, bVar.f37119e) && this.f37120f == bVar.f37120f && this.f37121g == bVar.f37121g && this.f37122h == bVar.f37122h && this.f37123i == bVar.f37123i && jo.p.c(this.f37124j, bVar.f37124j) && jo.p.c(this.f37125k, bVar.f37125k) && jo.p.c(this.f37126l, bVar.f37126l) && this.f37127m == bVar.f37127m && this.f37128n == bVar.f37128n && this.f37129o == bVar.f37129o) {
                return true;
            }
        }
        return false;
    }

    public final k0 f() {
        return this.f37117c;
    }

    public final a g() {
        return this.f37128n;
    }

    public final Drawable h() {
        return this.f37125k;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f37115a.hashCode() * 31) + this.f37116b.hashCode()) * 31) + this.f37117c.hashCode()) * 31) + this.f37118d.hashCode()) * 31) + this.f37119e.hashCode()) * 31) + this.f37120f.hashCode()) * 31) + this.f37121g.hashCode()) * 31) + Boolean.hashCode(this.f37122h)) * 31) + Boolean.hashCode(this.f37123i)) * 31;
        Drawable drawable = this.f37124j;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f37125k;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f37126l;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f37127m.hashCode()) * 31) + this.f37128n.hashCode()) * 31) + this.f37129o.hashCode();
    }

    public final Drawable i() {
        return this.f37126l;
    }

    public final k0 j() {
        return this.f37116b;
    }

    public final k0 k() {
        return this.f37115a;
    }

    public final a l() {
        return this.f37127m;
    }

    public final a m() {
        return this.f37129o;
    }

    public final Drawable n() {
        return this.f37124j;
    }

    public final k6.d o() {
        return this.f37120f;
    }

    public final k0 p() {
        return this.f37118d;
    }

    public final c.a q() {
        return this.f37119e;
    }

    public /* synthetic */ b(k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, c.a aVar, k6.d dVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? g1.c().h0() : k0Var, (i10 & 2) != 0 ? g1.b() : k0Var2, (i10 & 4) != 0 ? g1.b() : k0Var3, (i10 & 8) != 0 ? g1.b() : k0Var4, (i10 & 16) != 0 ? c.a.f41592b : aVar, (i10 & 32) != 0 ? k6.d.AUTOMATIC : dVar, (i10 & 64) != 0 ? o6.k.e() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & 2048) == 0 ? drawable3 : null, (i10 & 4096) != 0 ? a.ENABLED : aVar2, (i10 & 8192) != 0 ? a.ENABLED : aVar3, (i10 & 16384) != 0 ? a.ENABLED : aVar4);
    }
}
