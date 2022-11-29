package a0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f121a;

    /* renamed from: b  reason: collision with root package name */
    public final g0[] f122b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f123c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f124d;

    /* renamed from: e  reason: collision with root package name */
    public final int f125e;

    /* renamed from: f  reason: collision with root package name */
    public final m2.q f126f;

    /* renamed from: g  reason: collision with root package name */
    public final int f127g;

    /* renamed from: h  reason: collision with root package name */
    public final int f128h;

    /* renamed from: i  reason: collision with root package name */
    public final int f129i;

    /* renamed from: j  reason: collision with root package name */
    public final int f130j;

    public i0(int i10, g0[] g0VarArr, List<c> list, boolean z10, int i11, m2.q qVar, int i12, int i13) {
        this.f121a = i10;
        this.f122b = g0VarArr;
        this.f123c = list;
        this.f124d = z10;
        this.f125e = i11;
        this.f126f = qVar;
        this.f127g = i12;
        this.f128h = i13;
        int i14 = 0;
        for (g0 g0Var : g0VarArr) {
            i14 = Math.max(i14, g0Var.d());
        }
        this.f129i = i14;
        this.f130j = i14 + this.f127g;
    }

    public /* synthetic */ i0(int i10, g0[] g0VarArr, List list, boolean z10, int i11, m2.q qVar, int i12, int i13, jo.h hVar) {
        this(i10, g0VarArr, list, z10, i11, qVar, i12, i13);
    }

    public final int a() {
        return this.f121a;
    }

    public final g0[] b() {
        return this.f122b;
    }

    public final int c() {
        return this.f129i;
    }

    public final int d() {
        return this.f130j;
    }

    public final boolean e() {
        return this.f122b.length == 0;
    }

    public final List<x> f(int i10, int i11, int i12) {
        g0[] g0VarArr = this.f122b;
        ArrayList arrayList = new ArrayList(g0VarArr.length);
        int length = g0VarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < length) {
            g0 g0Var = g0VarArr[i13];
            int i17 = i14 + 1;
            int d10 = c.d(this.f123c.get(i14).g());
            int i18 = this.f126f == m2.q.Rtl ? (this.f125e - i15) - d10 : i15;
            boolean z10 = this.f124d;
            int i19 = z10 ? this.f121a : i18;
            if (!z10) {
                i18 = this.f121a;
            }
            x f10 = g0Var.f(i10, i16, i11, i12, i19, i18, this.f129i);
            i16 += g0Var.a() + this.f128h;
            i15 += d10;
            arrayList.add(f10);
            i13++;
            i14 = i17;
        }
        return arrayList;
    }
}
