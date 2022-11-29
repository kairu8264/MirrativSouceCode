package d2;

import java.util.List;

/* loaded from: classes.dex */
public final class x implements Comparable<x> {
    public static final x A;
    public static final x B;
    public static final x C;
    public static final x D;
    public static final x E;
    public static final x F;
    public static final x G;
    public static final x H;
    public static final x I;
    public static final x J;
    public static final x K;
    public static final x L;
    public static final x M;
    public static final x N;
    public static final x O;
    public static final x P;
    public static final List<x> Q;

    /* renamed from: x  reason: collision with root package name */
    public static final a f29149x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final x f29150y;

    /* renamed from: z  reason: collision with root package name */
    public static final x f29151z;

    /* renamed from: w  reason: collision with root package name */
    public final int f29152w;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a() {
            return x.N;
        }

        public final x b() {
            return x.J;
        }

        public final x c() {
            return x.L;
        }

        public final x d() {
            return x.K;
        }

        public final x e() {
            return x.B;
        }

        public final x f() {
            return x.C;
        }

        public final x g() {
            return x.D;
        }

        public final x h() {
            return x.E;
        }

        public final x i() {
            return x.F;
        }

        public final x j() {
            return x.G;
        }
    }

    static {
        x xVar = new x(100);
        f29150y = xVar;
        x xVar2 = new x(200);
        f29151z = xVar2;
        x xVar3 = new x(300);
        A = xVar3;
        x xVar4 = new x(400);
        B = xVar4;
        x xVar5 = new x(500);
        C = xVar5;
        x xVar6 = new x(600);
        D = xVar6;
        x xVar7 = new x(700);
        E = xVar7;
        x xVar8 = new x(800);
        F = xVar8;
        x xVar9 = new x(900);
        G = xVar9;
        H = xVar;
        I = xVar2;
        J = xVar3;
        K = xVar4;
        L = xVar5;
        M = xVar6;
        N = xVar7;
        O = xVar8;
        P = xVar9;
        Q = xn.s.m(xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9);
    }

    public x(int i10) {
        this.f29152w = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f29152w == ((x) obj).f29152w;
    }

    public int hashCode() {
        return this.f29152w;
    }

    @Override // java.lang.Comparable
    /* renamed from: q */
    public int compareTo(x xVar) {
        jo.p.h(xVar, "other");
        return jo.p.j(this.f29152w, xVar.f29152w);
    }

    public final int r() {
        return this.f29152w;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f29152w + ')';
    }
}
