package t2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t2.d;
import u2.n;
import u2.p;

/* loaded from: classes.dex */
public class e {
    public static float I0 = 0.5f;
    public boolean A0;
    public float[] B0;
    public e[] C0;
    public e[] D0;
    public e E0;
    public e F0;
    public int G0;
    public int H0;
    public boolean J;
    public d U;
    public d[] V;
    public ArrayList<d> W;
    public boolean[] X;
    public b[] Y;
    public e Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f53054a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f53056b0;

    /* renamed from: c  reason: collision with root package name */
    public u2.c f53057c;

    /* renamed from: c0  reason: collision with root package name */
    public float f53058c0;

    /* renamed from: d  reason: collision with root package name */
    public u2.c f53059d;

    /* renamed from: d0  reason: collision with root package name */
    public int f53060d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f53062e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f53064f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f53066g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f53068h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f53070i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f53072j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f53074k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f53076l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f53078m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f53080n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f53082o0;

    /* renamed from: p0  reason: collision with root package name */
    public Object f53084p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f53086q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f53088r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f53090s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f53092t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f53094u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f53096v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f53098w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f53100x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f53102y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f53104z0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f53053a = false;

    /* renamed from: b  reason: collision with root package name */
    public p[] f53055b = new p[2];

    /* renamed from: e  reason: collision with root package name */
    public u2.l f53061e = null;

    /* renamed from: f  reason: collision with root package name */
    public n f53063f = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f53065g = {true, true};

    /* renamed from: h  reason: collision with root package name */
    public boolean f53067h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f53069i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f53071j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f53073k = true;

    /* renamed from: l  reason: collision with root package name */
    public int f53075l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f53077m = -1;

    /* renamed from: n  reason: collision with root package name */
    public s2.a f53079n = new s2.a(this);

    /* renamed from: o  reason: collision with root package name */
    public boolean f53081o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f53083p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f53085q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f53087r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f53089s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f53091t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f53093u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f53095v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f53097w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int[] f53099x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public int f53101y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f53103z = 0;
    public float A = 1.0f;
    public int B = 0;
    public int C = 0;
    public float D = 1.0f;
    public int E = -1;
    public float F = 1.0f;
    public int[] G = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float H = 0.0f;
    public boolean I = false;
    public boolean K = false;
    public int L = 0;
    public int M = 0;
    public d N = new d(this, d.b.LEFT);
    public d O = new d(this, d.b.TOP);
    public d P = new d(this, d.b.RIGHT);
    public d Q = new d(this, d.b.BOTTOM);
    public d R = new d(this, d.b.BASELINE);
    public d S = new d(this, d.b.CENTER_X);
    public d T = new d(this, d.b.CENTER_Y);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53105a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f53106b;

        static {
            int[] iArr = new int[b.values().length];
            f53106b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53106b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53106b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53106b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f53105a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53105a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53105a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53105a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53105a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53105a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53105a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53105a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f53105a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.U = dVar;
        this.V = new d[]{this.N, this.P, this.O, this.Q, this.R, dVar};
        this.W = new ArrayList<>();
        this.X = new boolean[2];
        b bVar = b.FIXED;
        this.Y = new b[]{bVar, bVar};
        this.Z = null;
        this.f53054a0 = 0;
        this.f53056b0 = 0;
        this.f53058c0 = 0.0f;
        this.f53060d0 = -1;
        this.f53062e0 = 0;
        this.f53064f0 = 0;
        this.f53066g0 = 0;
        this.f53068h0 = 0;
        this.f53070i0 = 0;
        this.f53072j0 = 0;
        this.f53074k0 = 0;
        float f10 = I0;
        this.f53080n0 = f10;
        this.f53082o0 = f10;
        this.f53086q0 = 0;
        this.f53088r0 = 0;
        this.f53090s0 = null;
        this.f53092t0 = null;
        this.f53098w0 = false;
        this.f53100x0 = 0;
        this.f53102y0 = 0;
        this.B0 = new float[]{-1.0f, -1.0f};
        this.C0 = new e[]{null, null};
        this.D0 = new e[]{null, null};
        this.E0 = null;
        this.F0 = null;
        this.G0 = -1;
        this.H0 = -1;
        d();
    }

    public int A() {
        return this.L;
    }

    public void A0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f53062e0 = i10;
        this.f53064f0 = i11;
        if (this.f53088r0 == 8) {
            this.f53054a0 = 0;
            this.f53056b0 = 0;
            return;
        }
        b[] bVarArr = this.Y;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f53054a0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f53056b0)) {
            i17 = i14;
        }
        this.f53054a0 = i16;
        this.f53056b0 = i17;
        int i18 = this.f53078m0;
        if (i17 < i18) {
            this.f53056b0 = i18;
        }
        int i19 = this.f53076l0;
        if (i16 < i19) {
            this.f53054a0 = i19;
        }
        int i20 = this.f53103z;
        if (i20 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.f53054a0 = Math.min(this.f53054a0, i20);
        }
        int i21 = this.C;
        if (i21 > 0 && this.Y[1] == b.MATCH_CONSTRAINT) {
            this.f53056b0 = Math.min(this.f53056b0, i21);
        }
        int i22 = this.f53054a0;
        if (i16 != i22) {
            this.f53075l = i22;
        }
        int i23 = this.f53056b0;
        if (i17 != i23) {
            this.f53077m = i23;
        }
    }

    public int B() {
        return this.M;
    }

    public void B0(boolean z10) {
        this.I = z10;
    }

    public int C(int i10) {
        if (i10 == 0) {
            return R();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i10) {
        this.f53056b0 = i10;
        int i11 = this.f53078m0;
        if (i10 < i11) {
            this.f53056b0 = i11;
        }
    }

    public int D() {
        return this.G[1];
    }

    public void D0(float f10) {
        this.f53080n0 = f10;
    }

    public int E() {
        return this.G[0];
    }

    public void E0(int i10) {
        this.f53100x0 = i10;
    }

    public int F() {
        return this.f53078m0;
    }

    public void F0(int i10, int i11) {
        this.f53062e0 = i10;
        int i12 = i11 - i10;
        this.f53054a0 = i12;
        int i13 = this.f53076l0;
        if (i12 < i13) {
            this.f53054a0 = i13;
        }
    }

    public int G() {
        return this.f53076l0;
    }

    public void G0(b bVar) {
        this.Y[0] = bVar;
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.Q).f53048f) != null && dVar2.f53048f == dVar) {
                return dVar2.f53046d;
            }
            return null;
        }
        d dVar3 = this.P;
        d dVar4 = dVar3.f53048f;
        if (dVar4 == null || dVar4.f53048f != dVar3) {
            return null;
        }
        return dVar4.f53046d;
    }

    public void H0(int i10, int i11, int i12, float f10) {
        this.f53095v = i10;
        this.f53101y = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f53103z = i12;
        this.A = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f53095v = 2;
    }

    public e I() {
        return this.Z;
    }

    public void I0(float f10) {
        this.B0[0] = f10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.O).f53048f) != null && dVar2.f53048f == dVar) {
                return dVar2.f53046d;
            }
            return null;
        }
        d dVar3 = this.N;
        d dVar4 = dVar3.f53048f;
        if (dVar4 == null || dVar4.f53048f != dVar3) {
            return null;
        }
        return dVar4.f53046d;
    }

    public void J0(int i10, boolean z10) {
        this.X[i10] = z10;
    }

    public int K() {
        return S() + this.f53054a0;
    }

    public void K0(boolean z10) {
        this.J = z10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f53061e;
        }
        if (i10 == 1) {
            return this.f53063f;
        }
        return null;
    }

    public void L0(boolean z10) {
        this.K = z10;
    }

    public float M() {
        return this.f53082o0;
    }

    public void M0(int i10, int i11) {
        this.L = i10;
        this.M = i11;
        P0(false);
    }

    public int N() {
        return this.f53102y0;
    }

    public void N0(int i10) {
        this.G[1] = i10;
    }

    public b O() {
        return this.Y[1];
    }

    public void O0(int i10) {
        this.G[0] = i10;
    }

    public int P() {
        int i10 = this.N != null ? 0 + this.O.f53049g : 0;
        return this.P != null ? i10 + this.Q.f53049g : i10;
    }

    public void P0(boolean z10) {
        this.f53069i = z10;
    }

    public int Q() {
        return this.f53088r0;
    }

    public void Q0(int i10) {
        if (i10 < 0) {
            this.f53078m0 = 0;
        } else {
            this.f53078m0 = i10;
        }
    }

    public int R() {
        if (this.f53088r0 == 8) {
            return 0;
        }
        return this.f53054a0;
    }

    public void R0(int i10) {
        if (i10 < 0) {
            this.f53076l0 = 0;
        } else {
            this.f53076l0 = i10;
        }
    }

    public int S() {
        e eVar = this.Z;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).Q0 + this.f53062e0;
        }
        return this.f53062e0;
    }

    public void S0(int i10, int i11) {
        this.f53062e0 = i10;
        this.f53064f0 = i11;
    }

    public int T() {
        e eVar = this.Z;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).R0 + this.f53064f0;
        }
        return this.f53064f0;
    }

    public void T0(e eVar) {
        this.Z = eVar;
    }

    public boolean U() {
        return this.I;
    }

    public void U0(float f10) {
        this.f53082o0 = f10;
    }

    public boolean V(int i10) {
        if (i10 == 0) {
            return (this.N.f53048f != null ? 1 : 0) + (this.P.f53048f != null ? 1 : 0) < 2;
        }
        return ((this.O.f53048f != null ? 1 : 0) + (this.Q.f53048f != null ? 1 : 0)) + (this.R.f53048f != null ? 1 : 0) < 2;
    }

    public void V0(int i10) {
        this.f53102y0 = i10;
    }

    public boolean W() {
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.W.get(i10).l()) {
                return true;
            }
        }
        return false;
    }

    public void W0(int i10, int i11) {
        this.f53064f0 = i10;
        int i12 = i11 - i10;
        this.f53056b0 = i12;
        int i13 = this.f53078m0;
        if (i12 < i13) {
            this.f53056b0 = i13;
        }
    }

    public boolean X() {
        return (this.f53075l == -1 && this.f53077m == -1) ? false : true;
    }

    public void X0(b bVar) {
        this.Y[1] = bVar;
    }

    public boolean Y(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.N.f53048f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.P.f53048f) != null && dVar2.m() && (this.P.f53048f.d() - this.P.e()) - (this.N.f53048f.d() + this.N.e()) >= i11;
        }
        d dVar4 = this.O.f53048f;
        return dVar4 != null && dVar4.m() && (dVar = this.Q.f53048f) != null && dVar.m() && (this.Q.f53048f.d() - this.Q.e()) - (this.O.f53048f.d() + this.O.e()) >= i11;
        return false;
    }

    public void Y0(int i10, int i11, int i12, float f10) {
        this.f53097w = i10;
        this.B = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.C = i12;
        this.D = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f53097w = 2;
    }

    public void Z(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void Z0(float f10) {
        this.B0[1] = f10;
    }

    public final boolean a0(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.V;
        if (dVarArr[i11].f53048f != null && dVarArr[i11].f53048f.f53048f != dVarArr[i11]) {
            int i12 = i11 + 1;
            if (dVarArr[i12].f53048f != null && dVarArr[i12].f53048f.f53048f == dVarArr[i12]) {
                return true;
            }
        }
        return false;
    }

    public void a1(int i10) {
        this.f53088r0 = i10;
    }

    public boolean b0() {
        return this.f53085q;
    }

    public void b1(int i10) {
        this.f53054a0 = i10;
        int i11 = this.f53076l0;
        if (i10 < i11) {
            this.f53054a0 = i11;
        }
    }

    public boolean c0(int i10) {
        return this.X[i10];
    }

    public void c1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f53093u = i10;
    }

    public final void d() {
        this.W.add(this.N);
        this.W.add(this.O);
        this.W.add(this.P);
        this.W.add(this.Q);
        this.W.add(this.S);
        this.W.add(this.T);
        this.W.add(this.U);
        this.W.add(this.R);
    }

    public boolean d0() {
        d dVar = this.N;
        d dVar2 = dVar.f53048f;
        if (dVar2 == null || dVar2.f53048f != dVar) {
            d dVar3 = this.P;
            d dVar4 = dVar3.f53048f;
            return dVar4 != null && dVar4.f53048f == dVar3;
        }
        return true;
    }

    public void d1(int i10) {
        this.f53062e0 = i10;
    }

    public void e(f fVar, q2.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.J1(64));
        }
        if (i10 == 0) {
            HashSet<d> c10 = this.N.c();
            if (c10 != null) {
                Iterator<d> it = c10.iterator();
                while (it.hasNext()) {
                    it.next().f53046d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> c11 = this.P.c();
            if (c11 != null) {
                Iterator<d> it2 = c11.iterator();
                while (it2.hasNext()) {
                    it2.next().f53046d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c12 = this.O.c();
        if (c12 != null) {
            Iterator<d> it3 = c12.iterator();
            while (it3.hasNext()) {
                it3.next().f53046d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c13 = this.Q.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f53046d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c14 = this.R.c();
        if (c14 != null) {
            Iterator<d> it5 = c14.iterator();
            while (it5.hasNext()) {
                it5.next().f53046d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.J;
    }

    public void e1(int i10) {
        this.f53064f0 = i10;
    }

    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0() {
        d dVar = this.O;
        d dVar2 = dVar.f53048f;
        if (dVar2 == null || dVar2.f53048f != dVar) {
            d dVar3 = this.Q;
            d dVar4 = dVar3.f53048f;
            return dVar4 != null && dVar4.f53048f == dVar3;
        }
        return true;
    }

    public void f1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.E == -1) {
            if (z12 && !z13) {
                this.E = 0;
            } else if (!z12 && z13) {
                this.E = 1;
                if (this.f53060d0 == -1) {
                    this.F = 1.0f / this.F;
                }
            }
        }
        if (this.E == 0 && (!this.O.n() || !this.Q.n())) {
            this.E = 1;
        } else if (this.E == 1 && (!this.N.n() || !this.P.n())) {
            this.E = 0;
        }
        if (this.E == -1 && (!this.O.n() || !this.Q.n() || !this.N.n() || !this.P.n())) {
            if (this.O.n() && this.Q.n()) {
                this.E = 0;
            } else if (this.N.n() && this.P.n()) {
                this.F = 1.0f / this.F;
                this.E = 1;
            }
        }
        if (this.E == -1) {
            int i10 = this.f53101y;
            if (i10 > 0 && this.B == 0) {
                this.E = 0;
            } else if (i10 != 0 || this.B <= 0) {
            } else {
                this.F = 1.0f / this.F;
                this.E = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(q2.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.e.g(q2.d, boolean):void");
    }

    public boolean g0() {
        return this.K;
    }

    public void g1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f53061e.k();
        boolean k11 = z11 & this.f53063f.k();
        u2.l lVar = this.f53061e;
        int i12 = lVar.f54354h.f54309g;
        n nVar = this.f53063f;
        int i13 = nVar.f54354h.f54309g;
        int i14 = lVar.f54355i.f54309g;
        int i15 = nVar.f54355i.f54309g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f53062e0 = i12;
        }
        if (k11) {
            this.f53064f0 = i13;
        }
        if (this.f53088r0 == 8) {
            this.f53054a0 = 0;
            this.f53056b0 = 0;
            return;
        }
        if (k10) {
            if (this.Y[0] == b.FIXED && i17 < (i11 = this.f53054a0)) {
                i17 = i11;
            }
            this.f53054a0 = i17;
            int i19 = this.f53076l0;
            if (i17 < i19) {
                this.f53054a0 = i19;
            }
        }
        if (k11) {
            if (this.Y[1] == b.FIXED && i18 < (i10 = this.f53056b0)) {
                i18 = i10;
            }
            this.f53056b0 = i18;
            int i20 = this.f53078m0;
            if (i18 < i20) {
                this.f53056b0 = i20;
            }
        }
    }

    public boolean h() {
        return this.f53088r0 != 8;
    }

    public boolean h0() {
        return this.f53069i && this.f53088r0 != 8;
    }

    public void h1(q2.d dVar, boolean z10) {
        n nVar;
        u2.l lVar;
        int x10 = dVar.x(this.N);
        int x11 = dVar.x(this.O);
        int x12 = dVar.x(this.P);
        int x13 = dVar.x(this.Q);
        if (z10 && (lVar = this.f53061e) != null) {
            u2.f fVar = lVar.f54354h;
            if (fVar.f54312j) {
                u2.f fVar2 = lVar.f54355i;
                if (fVar2.f54312j) {
                    x10 = fVar.f54309g;
                    x12 = fVar2.f54309g;
                }
            }
        }
        if (z10 && (nVar = this.f53063f) != null) {
            u2.f fVar3 = nVar.f54354h;
            if (fVar3.f54312j) {
                u2.f fVar4 = nVar.f54355i;
                if (fVar4.f54312j) {
                    x11 = fVar3.f54309g;
                    x13 = fVar4.f54309g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x13 = 0;
            x10 = 0;
            x11 = 0;
            x12 = 0;
        }
        A0(x10, x11, x12, x13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x049c, code lost:
        if ((r4 instanceof t2.a) != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:386:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(q2.d r38, boolean r39, boolean r40, boolean r41, boolean r42, q2.i r43, q2.i r44, t2.e.b r45, boolean r46, t2.d r47, t2.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.e.i(q2.d, boolean, boolean, boolean, boolean, q2.i, q2.i, t2.e$b, boolean, t2.d, t2.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public boolean i0() {
        return this.f53081o || (this.N.m() && this.P.m());
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        Z(bVar, eVar, bVar, i10, 0);
        this.H = f10;
    }

    public boolean j0() {
        return this.f53083p || (this.O.m() && this.Q.m());
    }

    public void k(q2.d dVar) {
        dVar.q(this.N);
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        if (this.f53074k0 > 0) {
            dVar.q(this.R);
        }
    }

    public boolean k0() {
        return this.f53087r;
    }

    public void l() {
        if (this.f53061e == null) {
            this.f53061e = new u2.l(this);
        }
        if (this.f53063f == null) {
            this.f53063f = new n(this);
        }
    }

    public void l0() {
        this.f53085q = true;
    }

    public d m(d.b bVar) {
        switch (a.f53105a[bVar.ordinal()]) {
            case 1:
                return this.N;
            case 2:
                return this.O;
            case 3:
                return this.P;
            case 4:
                return this.Q;
            case 5:
                return this.R;
            case 6:
                return this.U;
            case 7:
                return this.S;
            case 8:
                return this.T;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0() {
        this.f53087r = true;
    }

    public int n() {
        return this.f53074k0;
    }

    public boolean n0() {
        b[] bVarArr = this.Y;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f53080n0;
        }
        if (i10 == 1) {
            return this.f53082o0;
        }
        return -1.0f;
    }

    public void o0() {
        this.N.p();
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.Z = null;
        this.H = 0.0f;
        this.f53054a0 = 0;
        this.f53056b0 = 0;
        this.f53058c0 = 0.0f;
        this.f53060d0 = -1;
        this.f53062e0 = 0;
        this.f53064f0 = 0;
        this.f53070i0 = 0;
        this.f53072j0 = 0;
        this.f53074k0 = 0;
        this.f53076l0 = 0;
        this.f53078m0 = 0;
        float f10 = I0;
        this.f53080n0 = f10;
        this.f53082o0 = f10;
        b[] bVarArr = this.Y;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f53084p0 = null;
        this.f53086q0 = 0;
        this.f53088r0 = 0;
        this.f53092t0 = null;
        this.f53094u0 = false;
        this.f53096v0 = false;
        this.f53100x0 = 0;
        this.f53102y0 = 0;
        this.f53104z0 = false;
        this.A0 = false;
        float[] fArr = this.B0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f53089s = -1;
        this.f53091t = -1;
        int[] iArr = this.G;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f53095v = 0;
        this.f53097w = 0;
        this.A = 1.0f;
        this.D = 1.0f;
        this.f53103z = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.f53101y = 0;
        this.B = 0;
        this.f53067h = false;
        this.E = -1;
        this.F = 1.0f;
        this.f53098w0 = false;
        boolean[] zArr = this.f53065g;
        zArr[0] = true;
        zArr[1] = true;
        this.K = false;
        boolean[] zArr2 = this.X;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f53069i = true;
        int[] iArr2 = this.f53099x;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f53075l = -1;
        this.f53077m = -1;
    }

    public int p() {
        return T() + this.f53056b0;
    }

    public void p0() {
        this.f53081o = false;
        this.f53083p = false;
        this.f53085q = false;
        this.f53087r = false;
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).q();
        }
    }

    public Object q() {
        return this.f53084p0;
    }

    public void q0(q2.c cVar) {
        this.N.r(cVar);
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.U.r(cVar);
        this.S.r(cVar);
        this.T.r(cVar);
    }

    public String r() {
        return this.f53090s0;
    }

    public void r0(int i10) {
        this.f53074k0 = i10;
        this.I = i10 > 0;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return O();
        }
        return null;
    }

    public void s0(Object obj) {
        this.f53084p0 = obj;
    }

    public float t() {
        return this.f53058c0;
    }

    public void t0(String str) {
        this.f53090s0 = str;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f53092t0 != null) {
            str = "type: " + this.f53092t0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f53090s0 != null) {
            str2 = "id: " + this.f53090s0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f53062e0);
        sb2.append(", ");
        sb2.append(this.f53064f0);
        sb2.append(") - (");
        sb2.append(this.f53054a0);
        sb2.append(" x ");
        sb2.append(this.f53056b0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f53060d0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void u0(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int i11 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i12, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i11 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = i10;
            } else {
                String substring4 = str.substring(i12);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = i10;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.f53058c0 = f10;
                this.f53060d0 = i11;
                return;
            }
            return;
        }
        this.f53058c0 = 0.0f;
    }

    public int v() {
        if (this.f53088r0 == 8) {
            return 0;
        }
        return this.f53056b0;
    }

    public void v0(int i10) {
        if (this.I) {
            int i11 = i10 - this.f53074k0;
            int i12 = this.f53056b0 + i11;
            this.f53064f0 = i11;
            this.O.s(i11);
            this.Q.s(i12);
            this.R.s(i10);
            this.f53083p = true;
        }
    }

    public float w() {
        return this.f53080n0;
    }

    public void w0(int i10, int i11) {
        if (this.f53081o) {
            return;
        }
        this.N.s(i10);
        this.P.s(i11);
        this.f53062e0 = i10;
        this.f53054a0 = i11 - i10;
        this.f53081o = true;
    }

    public int x() {
        return this.f53100x0;
    }

    public void x0(int i10) {
        this.N.s(i10);
        this.f53062e0 = i10;
    }

    public b y() {
        return this.Y[0];
    }

    public void y0(int i10) {
        this.O.s(i10);
        this.f53064f0 = i10;
    }

    public int z() {
        d dVar = this.N;
        int i10 = dVar != null ? 0 + dVar.f53049g : 0;
        d dVar2 = this.P;
        return dVar2 != null ? i10 + dVar2.f53049g : i10;
    }

    public void z0(int i10, int i11) {
        if (this.f53083p) {
            return;
        }
        this.O.s(i10);
        this.Q.s(i11);
        this.f53064f0 = i10;
        this.f53056b0 = i11 - i10;
        if (this.I) {
            this.R.s(i10 + this.f53074k0);
        }
        this.f53083p = true;
    }
}
