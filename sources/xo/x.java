package xo;

import java.util.Arrays;
import java.util.Objects;
import uo.i1;
import uo.u0;
import wn.l;

/* loaded from: classes4.dex */
public class x<T> extends yo.a<z> implements r<T>, xo.c, yo.n<T> {
    public final int A;
    public final int B;
    public final wo.h C;
    public Object[] D;
    public long E;
    public long F;
    public int G;
    public int H;

    /* loaded from: classes4.dex */
    public static final class a implements i1 {

        /* renamed from: w  reason: collision with root package name */
        public final x<?> f60622w;

        /* renamed from: x  reason: collision with root package name */
        public long f60623x;

        /* renamed from: y  reason: collision with root package name */
        public final Object f60624y;

        /* renamed from: z  reason: collision with root package name */
        public final ao.d<wn.v> f60625z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x<?> xVar, long j10, Object obj, ao.d<? super wn.v> dVar) {
            this.f60622w = xVar;
            this.f60623x = j10;
            this.f60624y = obj;
            this.f60625z = dVar;
        }

        @Override // uo.i1
        public void dispose() {
            this.f60622w.z(this);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60626a;

        static {
            int[] iArr = new int[wo.h.values().length];
            iArr[wo.h.SUSPEND.ordinal()] = 1;
            iArr[wo.h.DROP_LATEST.ordinal()] = 2;
            iArr[wo.h.DROP_OLDEST.ordinal()] = 3;
            f60626a = iArr;
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
    /* loaded from: classes4.dex */
    public static final class c extends co.d {
        public /* synthetic */ Object A;
        public final /* synthetic */ x<T> B;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f60627w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60628x;

        /* renamed from: y  reason: collision with root package name */
        public Object f60629y;

        /* renamed from: z  reason: collision with root package name */
        public Object f60630z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x<T> xVar, ao.d<? super c> dVar) {
            super(dVar);
            this.B = xVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return x.B(this.B, null, this);
        }
    }

    public x(int i10, int i11, wo.h hVar) {
        this.A = i10;
        this.B = i11;
        this.C = hVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:42|43))(1:44)|12|13|14|15|(3:16|(4:26|(1:28)(1:34)|29|(2:31|32)(1:33))(3:18|19|(2:21|22)(1:24))|25))(4:45|46|47|48)|38|39)(5:54|55|56|(2:58|(1:60))|62)|49|50|15|(3:16|(0)(0)|25)))|65|6|(0)(0)|49|50|15|(3:16|(0)(0)|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object B(xo.x r8, xo.d r9, ao.d r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.x.B(xo.x, xo.d, ao.d):java.lang.Object");
    }

    public static /* synthetic */ Object G(x xVar, Object obj, ao.d dVar) {
        Object H;
        return (!xVar.b(obj) && (H = xVar.H(obj, dVar)) == bo.c.c()) ? H : wn.v.f59242a;
    }

    public final void A() {
        Object f10;
        if (this.B != 0 || this.H > 1) {
            Object[] objArr = this.D;
            jo.p.e(objArr);
            while (this.H > 0) {
                f10 = y.f(objArr, (L() + Q()) - 1);
                if (f10 != y.f60631a) {
                    return;
                }
                this.H--;
                y.g(objArr, L() + Q(), null);
            }
        }
    }

    public final void C(long j10) {
        yo.c[] h10;
        if (yo.a.g(this) != 0 && (h10 = yo.a.h(this)) != null) {
            int i10 = 0;
            int length = h10.length;
            while (i10 < length) {
                yo.c cVar = h10[i10];
                i10++;
                if (cVar != null) {
                    z zVar = (z) cVar;
                    long j11 = zVar.f60632a;
                    if (j11 >= 0 && j11 < j10) {
                        zVar.f60632a = j10;
                    }
                }
            }
        }
        this.F = j10;
    }

    @Override // yo.a
    /* renamed from: D */
    public z j() {
        return new z();
    }

    @Override // yo.a
    /* renamed from: E */
    public z[] k(int i10) {
        return new z[i10];
    }

    public final void F() {
        Object[] objArr = this.D;
        jo.p.e(objArr);
        y.g(objArr, L(), null);
        this.G--;
        long L = L() + 1;
        if (this.E < L) {
            this.E = L;
        }
        if (this.F < L) {
            C(L);
        }
        if (u0.a()) {
            if (!(L() == L)) {
                throw new AssertionError();
            }
        }
    }

    public final Object H(T t10, ao.d<? super wn.v> dVar) {
        ao.d<wn.v>[] dVarArr;
        a aVar;
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        ao.d<wn.v>[] dVarArr2 = yo.b.f62080a;
        synchronized (this) {
            if (S(t10)) {
                l.a aVar2 = wn.l.f59224w;
                qVar.resumeWith(wn.l.a(wn.v.f59242a));
                dVarArr = J(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, Q() + L(), t10, qVar);
                I(aVar3);
                this.H++;
                if (this.B == 0) {
                    dVarArr2 = J(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            uo.s.a(qVar, aVar);
        }
        int i10 = 0;
        int length = dVarArr.length;
        while (i10 < length) {
            ao.d<wn.v> dVar2 = dVarArr[i10];
            i10++;
            if (dVar2 != null) {
                l.a aVar4 = wn.l.f59224w;
                dVar2.resumeWith(wn.l.a(wn.v.f59242a));
            }
        }
        Object t11 = qVar.t();
        if (t11 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t11 == bo.c.c() ? t11 : wn.v.f59242a;
    }

    public final void I(Object obj) {
        int Q = Q();
        Object[] objArr = this.D;
        if (objArr == null) {
            objArr = R(null, 0, 2);
        } else if (Q >= objArr.length) {
            objArr = R(objArr, Q, objArr.length * 2);
        }
        y.g(objArr, L() + Q, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final ao.d<wn.v>[] J(ao.d<wn.v>[] dVarArr) {
        yo.c[] h10;
        z zVar;
        ao.d<? super wn.v> dVar;
        int length = dVarArr.length;
        if (yo.a.g(this) != 0 && (h10 = yo.a.h(this)) != null) {
            int i10 = 0;
            int length2 = h10.length;
            while (i10 < length2) {
                yo.c cVar = h10[i10];
                i10++;
                if (cVar != null && (dVar = (zVar = (z) cVar).f60633b) != null && U(zVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        jo.p.g(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    zVar.f60633b = null;
                    length++;
                }
            }
        }
        return dVarArr;
    }

    public final long K() {
        return L() + this.G;
    }

    public final long L() {
        return Math.min(this.F, this.E);
    }

    public final T M() {
        Object f10;
        Object[] objArr = this.D;
        jo.p.e(objArr);
        f10 = y.f(objArr, (this.E + P()) - 1);
        return (T) f10;
    }

    public final Object N(long j10) {
        Object f10;
        Object[] objArr = this.D;
        jo.p.e(objArr);
        f10 = y.f(objArr, j10);
        return f10 instanceof a ? ((a) f10).f60624y : f10;
    }

    public final long O() {
        return L() + this.G + this.H;
    }

    public final int P() {
        return (int) ((L() + this.G) - this.E);
    }

    public final int Q() {
        return this.G + this.H;
    }

    public final Object[] R(Object[] objArr, int i10, int i11) {
        Object f10;
        int i12 = 0;
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.D = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long L = L();
            while (i12 < i10) {
                int i13 = i12 + 1;
                long j10 = i12 + L;
                f10 = y.f(objArr, j10);
                y.g(objArr2, j10, f10);
                i12 = i13;
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean S(T t10) {
        if (m() == 0) {
            return T(t10);
        }
        if (this.G >= this.B && this.F <= this.E) {
            int i10 = b.f60626a[this.C.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        I(t10);
        int i11 = this.G + 1;
        this.G = i11;
        if (i11 > this.B) {
            F();
        }
        if (P() > this.A) {
            W(this.E + 1, this.F, K(), O());
        }
        return true;
    }

    public final boolean T(T t10) {
        if (u0.a()) {
            if (!(m() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.A == 0) {
            return true;
        }
        I(t10);
        int i10 = this.G + 1;
        this.G = i10;
        if (i10 > this.A) {
            F();
        }
        this.F = L() + this.G;
        return true;
    }

    public final long U(z zVar) {
        long j10 = zVar.f60632a;
        if (j10 < K()) {
            return j10;
        }
        if (this.B <= 0 && j10 <= L() && this.H != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object V(z zVar) {
        Object obj;
        ao.d<wn.v>[] dVarArr = yo.b.f62080a;
        synchronized (this) {
            long U = U(zVar);
            if (U < 0) {
                obj = y.f60631a;
            } else {
                long j10 = zVar.f60632a;
                Object N = N(U);
                zVar.f60632a = U + 1;
                dVarArr = X(j10);
                obj = N;
            }
        }
        int i10 = 0;
        int length = dVarArr.length;
        while (i10 < length) {
            ao.d<wn.v> dVar = dVarArr[i10];
            i10++;
            if (dVar != null) {
                l.a aVar = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(wn.v.f59242a));
            }
        }
        return obj;
    }

    public final void W(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        if (u0.a()) {
            if (!(min >= L())) {
                throw new AssertionError();
            }
        }
        for (long L = L(); L < min; L = 1 + L) {
            Object[] objArr = this.D;
            jo.p.e(objArr);
            y.g(objArr, L, null);
        }
        this.E = j10;
        this.F = j11;
        this.G = (int) (j12 - min);
        this.H = (int) (j13 - j12);
        if (u0.a()) {
            if (!(this.G >= 0)) {
                throw new AssertionError();
            }
        }
        if (u0.a()) {
            if (!(this.H >= 0)) {
                throw new AssertionError();
            }
        }
        if (u0.a()) {
            if (!(this.E <= L() + ((long) this.G))) {
                throw new AssertionError();
            }
        }
    }

    public final ao.d<wn.v>[] X(long j10) {
        int i10;
        long j11;
        Object f10;
        Object f11;
        yo.c[] h10;
        if (u0.a()) {
            if (!(j10 >= this.F)) {
                throw new AssertionError();
            }
        }
        if (j10 > this.F) {
            return yo.b.f62080a;
        }
        long L = L();
        long j12 = this.G + L;
        long j13 = 1;
        if (this.B == 0 && this.H > 0) {
            j12++;
        }
        if (yo.a.g(this) != 0 && (h10 = yo.a.h(this)) != null) {
            int length = h10.length;
            int i11 = 0;
            while (i11 < length) {
                yo.c cVar = h10[i11];
                i11++;
                if (cVar != null) {
                    long j14 = ((z) cVar).f60632a;
                    if (j14 >= 0 && j14 < j12) {
                        j12 = j14;
                    }
                }
            }
        }
        if (u0.a()) {
            if (!(j12 >= this.F)) {
                throw new AssertionError();
            }
        }
        if (j12 <= this.F) {
            return yo.b.f62080a;
        }
        long K = K();
        if (m() > 0) {
            i10 = Math.min(this.H, this.B - ((int) (K - j12)));
        } else {
            i10 = this.H;
        }
        ao.d<wn.v>[] dVarArr = yo.b.f62080a;
        long j15 = this.H + K;
        if (i10 > 0) {
            dVarArr = new ao.d[i10];
            Object[] objArr = this.D;
            jo.p.e(objArr);
            long j16 = K;
            int i12 = 0;
            while (true) {
                if (K >= j15) {
                    j11 = j12;
                    break;
                }
                long j17 = K + j13;
                f11 = y.f(objArr, K);
                zo.k0 k0Var = y.f60631a;
                if (f11 != k0Var) {
                    j11 = j12;
                    Objects.requireNonNull(f11, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) f11;
                    int i13 = i12 + 1;
                    dVarArr[i12] = aVar.f60625z;
                    y.g(objArr, K, k0Var);
                    y.g(objArr, j16, aVar.f60624y);
                    j16++;
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                    K = j17;
                    j12 = j11;
                } else {
                    K = j17;
                }
                j13 = 1;
            }
            K = j16;
        } else {
            j11 = j12;
        }
        int i14 = (int) (K - L);
        long j18 = m() == 0 ? K : j11;
        long max = Math.max(this.E, K - Math.min(this.A, i14));
        if (this.B == 0 && max < j15) {
            Object[] objArr2 = this.D;
            jo.p.e(objArr2);
            f10 = y.f(objArr2, max);
            if (jo.p.c(f10, y.f60631a)) {
                K++;
                max++;
            }
        }
        W(max, j18, K, j15);
        A();
        return true ^ (dVarArr.length == 0) ? J(dVarArr) : dVarArr;
    }

    public final long Y() {
        long j10 = this.E;
        if (j10 < this.F) {
            this.F = j10;
        }
        return j10;
    }

    @Override // xo.w, xo.c
    public Object a(d<? super T> dVar, ao.d<?> dVar2) {
        return B(this, dVar, dVar2);
    }

    @Override // xo.r
    public boolean b(T t10) {
        int i10;
        boolean z10;
        ao.d<wn.v>[] dVarArr = yo.b.f62080a;
        synchronized (this) {
            i10 = 0;
            if (S(t10)) {
                dVarArr = J(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        int length = dVarArr.length;
        while (i10 < length) {
            ao.d<wn.v> dVar = dVarArr[i10];
            i10++;
            if (dVar != null) {
                l.a aVar = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(wn.v.f59242a));
            }
        }
        return z10;
    }

    @Override // yo.n
    public xo.c<T> d(ao.g gVar, int i10, wo.h hVar) {
        return y.e(this, gVar, i10, hVar);
    }

    @Override // xo.r, xo.d
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        return G(this, t10, dVar);
    }

    @Override // xo.r
    public void f() {
        synchronized (this) {
            W(K(), this.F, K(), O());
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final Object y(z zVar, ao.d<? super wn.v> dVar) {
        wn.v vVar;
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        synchronized (this) {
            if (U(zVar) < 0) {
                zVar.f60633b = qVar;
                zVar.f60633b = qVar;
            } else {
                l.a aVar = wn.l.f59224w;
                qVar.resumeWith(wn.l.a(wn.v.f59242a));
            }
            vVar = wn.v.f59242a;
        }
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : vVar;
    }

    public final void z(a aVar) {
        Object f10;
        synchronized (this) {
            if (aVar.f60623x < L()) {
                return;
            }
            Object[] objArr = this.D;
            jo.p.e(objArr);
            f10 = y.f(objArr, aVar.f60623x);
            if (f10 != aVar) {
                return;
            }
            y.g(objArr, aVar.f60623x, y.f60631a);
            A();
            wn.v vVar = wn.v.f59242a;
        }
    }
}
