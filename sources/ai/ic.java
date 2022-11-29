package ai;

import android.util.Log;
import com.google.android.gms.internal.ads.zzamy;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ic {

    /* renamed from: a  reason: collision with root package name */
    public final mh f5160a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5161b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5162c;

    /* renamed from: d  reason: collision with root package name */
    public final xh[] f5163d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean[] f5164e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5165f;

    /* renamed from: g  reason: collision with root package name */
    public int f5166g;

    /* renamed from: h  reason: collision with root package name */
    public long f5167h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5168i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5169j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5170k;

    /* renamed from: l  reason: collision with root package name */
    public ic f5171l;

    /* renamed from: m  reason: collision with root package name */
    public qi f5172m;

    /* renamed from: n  reason: collision with root package name */
    public final rc[] f5173n;

    /* renamed from: o  reason: collision with root package name */
    public final sc[] f5174o;

    /* renamed from: p  reason: collision with root package name */
    public final pi f5175p;

    /* renamed from: q  reason: collision with root package name */
    public final oh f5176q;

    /* renamed from: r  reason: collision with root package name */
    public qi f5177r;

    /* renamed from: s  reason: collision with root package name */
    public final bn0 f5178s;

    public ic(rc[] rcVarArr, sc[] scVarArr, long j10, pi piVar, bn0 bn0Var, oh ohVar, Object obj, int i10, int i11, boolean z10, long j11, byte[] bArr) {
        this.f5173n = rcVarArr;
        this.f5174o = scVarArr;
        this.f5165f = j10;
        this.f5175p = piVar;
        this.f5178s = bn0Var;
        this.f5176q = ohVar;
        Objects.requireNonNull(obj);
        this.f5161b = obj;
        this.f5162c = i10;
        this.f5166g = i11;
        this.f5168i = z10;
        this.f5167h = j11;
        this.f5163d = new xh[2];
        this.f5164e = new boolean[2];
        this.f5160a = ohVar.c(i11, bn0Var.l());
    }

    public final boolean a() {
        return this.f5169j && (!this.f5170k || this.f5160a.l() == Long.MIN_VALUE);
    }

    public final boolean b() throws zzamy {
        qi a10 = this.f5175p.a(this.f5174o, this.f5160a.n());
        qi qiVar = this.f5177r;
        if (qiVar != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (a10.a(qiVar, i10)) {
                }
            }
            return false;
        }
        this.f5172m = a10;
        return true;
    }

    public final long c(long j10, boolean z10) {
        return d(j10, false, new boolean[2]);
    }

    public final long d(long j10, boolean z10, boolean[] zArr) {
        ni niVar = this.f5172m.f8963b;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= 2) {
                break;
            }
            boolean[] zArr2 = this.f5164e;
            if (z10 || !this.f5172m.a(this.f5177r, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        long h10 = this.f5160a.h(niVar.b(), this.f5164e, this.f5163d, zArr, j10);
        this.f5177r = this.f5172m;
        this.f5170k = false;
        int i11 = 0;
        while (true) {
            xh[] xhVarArr = this.f5163d;
            if (i11 >= 2) {
                this.f5178s.b(this.f5173n, this.f5172m.f8962a, niVar);
                return h10;
            }
            if (xhVarArr[i11] != null) {
                fj.d(niVar.a(i11) != null);
                this.f5170k = true;
            } else {
                fj.d(niVar.a(i11) == null);
            }
            i11++;
        }
    }

    public final void e() {
        try {
            this.f5176q.b(this.f5160a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }
}
