package t2;

import java.util.ArrayList;
import t2.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f53021a;

    /* renamed from: b  reason: collision with root package name */
    public e f53022b;

    /* renamed from: c  reason: collision with root package name */
    public e f53023c;

    /* renamed from: d  reason: collision with root package name */
    public e f53024d;

    /* renamed from: e  reason: collision with root package name */
    public e f53025e;

    /* renamed from: f  reason: collision with root package name */
    public e f53026f;

    /* renamed from: g  reason: collision with root package name */
    public e f53027g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<e> f53028h;

    /* renamed from: i  reason: collision with root package name */
    public int f53029i;

    /* renamed from: j  reason: collision with root package name */
    public int f53030j;

    /* renamed from: k  reason: collision with root package name */
    public float f53031k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f53032l;

    /* renamed from: m  reason: collision with root package name */
    public int f53033m;

    /* renamed from: n  reason: collision with root package name */
    public int f53034n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f53035o;

    /* renamed from: p  reason: collision with root package name */
    public int f53036p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f53037q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f53038r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f53039s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f53040t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f53041u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f53042v;

    public c(e eVar, int i10, boolean z10) {
        this.f53037q = false;
        this.f53021a = eVar;
        this.f53036p = i10;
        this.f53037q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.Q() != 8 && eVar.Y[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f53099x;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f53042v) {
            b();
        }
        this.f53042v = true;
    }

    public final void b() {
        int i10 = this.f53036p * 2;
        e eVar = this.f53021a;
        boolean z10 = true;
        this.f53035o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f53029i++;
            e[] eVarArr = eVar.D0;
            int i11 = this.f53036p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.C0[i11] = null;
            if (eVar.Q() != 8) {
                this.f53032l++;
                e.b s10 = eVar.s(this.f53036p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f53033m += eVar.C(this.f53036p);
                }
                int e10 = this.f53033m + eVar.V[i10].e();
                this.f53033m = e10;
                int i12 = i10 + 1;
                this.f53033m = e10 + eVar.V[i12].e();
                int e11 = this.f53034n + eVar.V[i10].e();
                this.f53034n = e11;
                this.f53034n = e11 + eVar.V[i12].e();
                if (this.f53022b == null) {
                    this.f53022b = eVar;
                }
                this.f53024d = eVar;
                e.b[] bVarArr = eVar.Y;
                int i13 = this.f53036p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f53099x;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f53030j++;
                        float[] fArr = eVar.B0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f53031k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f53038r = true;
                            } else {
                                this.f53039s = true;
                            }
                            if (this.f53028h == null) {
                                this.f53028h = new ArrayList<>();
                            }
                            this.f53028h.add(eVar);
                        }
                        if (this.f53026f == null) {
                            this.f53026f = eVar;
                        }
                        e eVar4 = this.f53027g;
                        if (eVar4 != null) {
                            eVar4.C0[this.f53036p] = eVar;
                        }
                        this.f53027g = eVar;
                    }
                    if (this.f53036p == 0) {
                        if (eVar.f53095v != 0) {
                            this.f53035o = false;
                        } else if (eVar.f53101y != 0 || eVar.f53103z != 0) {
                            this.f53035o = false;
                        }
                    } else if (eVar.f53097w != 0) {
                        this.f53035o = false;
                    } else if (eVar.B != 0 || eVar.C != 0) {
                        this.f53035o = false;
                    }
                    if (eVar.f53058c0 != 0.0f) {
                        this.f53035o = false;
                        this.f53041u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.D0[this.f53036p] = eVar;
            }
            d dVar = eVar.V[i10 + 1].f53048f;
            if (dVar != null) {
                e eVar5 = dVar.f53046d;
                d[] dVarArr = eVar5.V;
                if (dVarArr[i10].f53048f != null && dVarArr[i10].f53048f.f53046d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f53022b;
        if (eVar6 != null) {
            this.f53033m -= eVar6.V[i10].e();
        }
        e eVar7 = this.f53024d;
        if (eVar7 != null) {
            this.f53033m -= eVar7.V[i10 + 1].e();
        }
        this.f53023c = eVar;
        if (this.f53036p == 0 && this.f53037q) {
            this.f53025e = eVar;
        } else {
            this.f53025e = this.f53021a;
        }
        if (!this.f53039s || !this.f53038r) {
            z10 = false;
        }
        this.f53040t = z10;
    }
}
