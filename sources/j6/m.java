package j6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import ep.u;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f37205a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.Config f37206b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f37207c;

    /* renamed from: d  reason: collision with root package name */
    public final k6.h f37208d;

    /* renamed from: e  reason: collision with root package name */
    public final k6.g f37209e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f37210f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f37211g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f37212h;

    /* renamed from: i  reason: collision with root package name */
    public final String f37213i;

    /* renamed from: j  reason: collision with root package name */
    public final u f37214j;

    /* renamed from: k  reason: collision with root package name */
    public final q f37215k;

    /* renamed from: l  reason: collision with root package name */
    public final n f37216l;

    /* renamed from: m  reason: collision with root package name */
    public final a f37217m;

    /* renamed from: n  reason: collision with root package name */
    public final a f37218n;

    /* renamed from: o  reason: collision with root package name */
    public final a f37219o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, k6.h hVar, k6.g gVar, boolean z10, boolean z11, boolean z12, String str, u uVar, q qVar, n nVar, a aVar, a aVar2, a aVar3) {
        this.f37205a = context;
        this.f37206b = config;
        this.f37207c = colorSpace;
        this.f37208d = hVar;
        this.f37209e = gVar;
        this.f37210f = z10;
        this.f37211g = z11;
        this.f37212h = z12;
        this.f37213i = str;
        this.f37214j = uVar;
        this.f37215k = qVar;
        this.f37216l = nVar;
        this.f37217m = aVar;
        this.f37218n = aVar2;
        this.f37219o = aVar3;
    }

    public final m a(Context context, Bitmap.Config config, ColorSpace colorSpace, k6.h hVar, k6.g gVar, boolean z10, boolean z11, boolean z12, String str, u uVar, q qVar, n nVar, a aVar, a aVar2, a aVar3) {
        return new m(context, config, colorSpace, hVar, gVar, z10, z11, z12, str, uVar, qVar, nVar, aVar, aVar2, aVar3);
    }

    public final boolean c() {
        return this.f37210f;
    }

    public final boolean d() {
        return this.f37211g;
    }

    public final ColorSpace e() {
        return this.f37207c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (jo.p.c(this.f37205a, mVar.f37205a) && this.f37206b == mVar.f37206b && ((Build.VERSION.SDK_INT < 26 || jo.p.c(this.f37207c, mVar.f37207c)) && jo.p.c(this.f37208d, mVar.f37208d) && this.f37209e == mVar.f37209e && this.f37210f == mVar.f37210f && this.f37211g == mVar.f37211g && this.f37212h == mVar.f37212h && jo.p.c(this.f37213i, mVar.f37213i) && jo.p.c(this.f37214j, mVar.f37214j) && jo.p.c(this.f37215k, mVar.f37215k) && jo.p.c(this.f37216l, mVar.f37216l) && this.f37217m == mVar.f37217m && this.f37218n == mVar.f37218n && this.f37219o == mVar.f37219o)) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f37206b;
    }

    public final Context g() {
        return this.f37205a;
    }

    public final String h() {
        return this.f37213i;
    }

    public int hashCode() {
        int hashCode = ((this.f37205a.hashCode() * 31) + this.f37206b.hashCode()) * 31;
        ColorSpace colorSpace = this.f37207c;
        int hashCode2 = (((((((((((hashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f37208d.hashCode()) * 31) + this.f37209e.hashCode()) * 31) + Boolean.hashCode(this.f37210f)) * 31) + Boolean.hashCode(this.f37211g)) * 31) + Boolean.hashCode(this.f37212h)) * 31;
        String str = this.f37213i;
        return ((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f37214j.hashCode()) * 31) + this.f37215k.hashCode()) * 31) + this.f37216l.hashCode()) * 31) + this.f37217m.hashCode()) * 31) + this.f37218n.hashCode()) * 31) + this.f37219o.hashCode();
    }

    public final a i() {
        return this.f37218n;
    }

    public final u j() {
        return this.f37214j;
    }

    public final a k() {
        return this.f37219o;
    }

    public final n l() {
        return this.f37216l;
    }

    public final boolean m() {
        return this.f37212h;
    }

    public final k6.g n() {
        return this.f37209e;
    }

    public final k6.h o() {
        return this.f37208d;
    }

    public final q p() {
        return this.f37215k;
    }
}
