package b7;

import java.util.List;
import java.util.Locale;
import z6.j;
import z6.k;
import z6.l;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<a7.c> f17046a;

    /* renamed from: b  reason: collision with root package name */
    public final s6.d f17047b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17048c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17049d;

    /* renamed from: e  reason: collision with root package name */
    public final a f17050e;

    /* renamed from: f  reason: collision with root package name */
    public final long f17051f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17052g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a7.h> f17053h;

    /* renamed from: i  reason: collision with root package name */
    public final l f17054i;

    /* renamed from: j  reason: collision with root package name */
    public final int f17055j;

    /* renamed from: k  reason: collision with root package name */
    public final int f17056k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17057l;

    /* renamed from: m  reason: collision with root package name */
    public final float f17058m;

    /* renamed from: n  reason: collision with root package name */
    public final float f17059n;

    /* renamed from: o  reason: collision with root package name */
    public final int f17060o;

    /* renamed from: p  reason: collision with root package name */
    public final int f17061p;

    /* renamed from: q  reason: collision with root package name */
    public final j f17062q;

    /* renamed from: r  reason: collision with root package name */
    public final k f17063r;

    /* renamed from: s  reason: collision with root package name */
    public final z6.b f17064s;

    /* renamed from: t  reason: collision with root package name */
    public final List<g7.a<Float>> f17065t;

    /* renamed from: u  reason: collision with root package name */
    public final b f17066u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f17067v;

    /* renamed from: w  reason: collision with root package name */
    public final a7.a f17068w;

    /* renamed from: x  reason: collision with root package name */
    public final d7.j f17069x;

    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<a7.c> list, s6.d dVar, String str, long j10, a aVar, long j11, String str2, List<a7.h> list2, l lVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, j jVar, k kVar, List<g7.a<Float>> list3, b bVar, z6.b bVar2, boolean z10, a7.a aVar2, d7.j jVar2) {
        this.f17046a = list;
        this.f17047b = dVar;
        this.f17048c = str;
        this.f17049d = j10;
        this.f17050e = aVar;
        this.f17051f = j11;
        this.f17052g = str2;
        this.f17053h = list2;
        this.f17054i = lVar;
        this.f17055j = i10;
        this.f17056k = i11;
        this.f17057l = i12;
        this.f17058m = f10;
        this.f17059n = f11;
        this.f17060o = i13;
        this.f17061p = i14;
        this.f17062q = jVar;
        this.f17063r = kVar;
        this.f17065t = list3;
        this.f17066u = bVar;
        this.f17064s = bVar2;
        this.f17067v = z10;
        this.f17068w = aVar2;
        this.f17069x = jVar2;
    }

    public a7.a a() {
        return this.f17068w;
    }

    public s6.d b() {
        return this.f17047b;
    }

    public d7.j c() {
        return this.f17069x;
    }

    public long d() {
        return this.f17049d;
    }

    public List<g7.a<Float>> e() {
        return this.f17065t;
    }

    public a f() {
        return this.f17050e;
    }

    public List<a7.h> g() {
        return this.f17053h;
    }

    public b h() {
        return this.f17066u;
    }

    public String i() {
        return this.f17048c;
    }

    public long j() {
        return this.f17051f;
    }

    public int k() {
        return this.f17061p;
    }

    public int l() {
        return this.f17060o;
    }

    public String m() {
        return this.f17052g;
    }

    public List<a7.c> n() {
        return this.f17046a;
    }

    public int o() {
        return this.f17057l;
    }

    public int p() {
        return this.f17056k;
    }

    public int q() {
        return this.f17055j;
    }

    public float r() {
        return this.f17059n / this.f17047b.e();
    }

    public j s() {
        return this.f17062q;
    }

    public k t() {
        return this.f17063r;
    }

    public String toString() {
        return y("");
    }

    public z6.b u() {
        return this.f17064s;
    }

    public float v() {
        return this.f17058m;
    }

    public l w() {
        return this.f17054i;
    }

    public boolean x() {
        return this.f17067v;
    }

    public String y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i());
        sb2.append("\n");
        e u10 = this.f17047b.u(j());
        if (u10 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(u10.i());
            e u11 = this.f17047b.u(u10.j());
            while (u11 != null) {
                sb2.append("->");
                sb2.append(u11.i());
                u11 = this.f17047b.u(u11.j());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!g().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(g().size());
            sb2.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f17046a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (a7.c cVar : this.f17046a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
