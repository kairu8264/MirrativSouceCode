package ai;

import com.google.android.gms.internal.ads.zzhu;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qp3 extends lo3<Integer> {

    /* renamed from: s  reason: collision with root package name */
    public static final k5 f9048s;

    /* renamed from: j  reason: collision with root package name */
    public final dp3[] f9049j;

    /* renamed from: k  reason: collision with root package name */
    public final q7[] f9050k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<dp3> f9051l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<Object, Long> f9052m;

    /* renamed from: n  reason: collision with root package name */
    public final y03<Object, ho3> f9053n;

    /* renamed from: o  reason: collision with root package name */
    public int f9054o;

    /* renamed from: p  reason: collision with root package name */
    public long[][] f9055p;

    /* renamed from: q  reason: collision with root package name */
    public zzhu f9056q;

    /* renamed from: r  reason: collision with root package name */
    public final no3 f9057r;

    static {
        b5 b5Var = new b5();
        b5Var.a("MergingMediaSource");
        f9048s = b5Var.c();
    }

    public qp3(boolean z10, boolean z11, dp3... dp3VarArr) {
        no3 no3Var = new no3();
        this.f9049j = dp3VarArr;
        this.f9057r = no3Var;
        this.f9051l = new ArrayList<>(Arrays.asList(dp3VarArr));
        this.f9054o = -1;
        this.f9050k = new q7[dp3VarArr.length];
        this.f9055p = new long[0];
        this.f9052m = new HashMap();
        this.f9053n = g13.a(8).b(2).c();
    }

    @Override // ai.lo3
    public final /* bridge */ /* synthetic */ bp3 B(Integer num, bp3 bp3Var) {
        if (num.intValue() == 0) {
            return bp3Var;
        }
        return null;
    }

    @Override // ai.dp3
    public final ap3 f(bp3 bp3Var, is3 is3Var, long j10) {
        int length = this.f9049j.length;
        ap3[] ap3VarArr = new ap3[length];
        int i10 = this.f9050k[0].i(bp3Var.f9603a);
        for (int i11 = 0; i11 < length; i11++) {
            ap3VarArr[i11] = this.f9049j[i11].f(bp3Var.c(this.f9050k[i11].j(i10)), is3Var, j10 - this.f9055p[i10][i11]);
        }
        return new pp3(this.f9057r, this.f9055p[i10], ap3VarArr, null);
    }

    @Override // ai.dp3
    public final void g(ap3 ap3Var) {
        pp3 pp3Var = (pp3) ap3Var;
        int i10 = 0;
        while (true) {
            dp3[] dp3VarArr = this.f9049j;
            if (i10 >= dp3VarArr.length) {
                return;
            }
            dp3VarArr[i10].g(pp3Var.m(i10));
            i10++;
        }
    }

    @Override // ai.lo3, ai.pk3
    public final void n(pm pmVar) {
        super.n(pmVar);
        for (int i10 = 0; i10 < this.f9049j.length; i10++) {
            A(Integer.valueOf(i10), this.f9049j[i10]);
        }
    }

    @Override // ai.lo3, ai.pk3
    public final void p() {
        super.p();
        Arrays.fill(this.f9050k, (Object) null);
        this.f9054o = -1;
        this.f9056q = null;
        this.f9051l.clear();
        Collections.addAll(this.f9051l, this.f9049j);
    }

    @Override // ai.lo3, ai.dp3
    public final void r() throws IOException {
        zzhu zzhuVar = this.f9056q;
        if (zzhuVar == null) {
            super.r();
            return;
        }
        throw zzhuVar;
    }

    @Override // ai.dp3
    public final k5 u() {
        dp3[] dp3VarArr = this.f9049j;
        return dp3VarArr.length > 0 ? dp3VarArr[0].u() : f9048s;
    }

    @Override // ai.lo3
    public final /* bridge */ /* synthetic */ void z(Integer num, dp3 dp3Var, q7 q7Var) {
        int i10;
        if (this.f9056q != null) {
            return;
        }
        if (this.f9054o == -1) {
            i10 = q7Var.g();
            this.f9054o = i10;
        } else {
            int g10 = q7Var.g();
            int i11 = this.f9054o;
            if (g10 != i11) {
                this.f9056q = new zzhu(0);
                return;
            }
            i10 = i11;
        }
        if (this.f9055p.length == 0) {
            this.f9055p = (long[][]) Array.newInstance(long.class, i10, this.f9050k.length);
        }
        this.f9051l.remove(dp3Var);
        this.f9050k[num.intValue()] = q7Var;
        if (this.f9051l.isEmpty()) {
            s(this.f9050k[0]);
        }
    }
}
