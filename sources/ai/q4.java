package ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaeg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q4 implements Handler.Callback, zo3, tr3, y5, c3, p6 {
    public final wr3 A;
    public final x4 B;
    public final ds3 C;
    public final ha D;
    public final HandlerThread E;
    public final Looper F;
    public final p7 G;
    public final n7 H;
    public final long I;
    public final d3 J;
    public final ArrayList<m4> K;
    public final v9 L;
    public final o4 M;
    public final s5 N;
    public final z5 O;
    public y6 P;
    public c6 Q;
    public n4 R;
    public boolean S;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f8805a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8806b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8807c0;

    /* renamed from: d0  reason: collision with root package name */
    public p4 f8808d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f8809e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8810f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f8811g0;

    /* renamed from: h0  reason: collision with root package name */
    public zzaeg f8812h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a3 f8813i0;

    /* renamed from: w  reason: collision with root package name */
    public final u6[] f8814w;

    /* renamed from: x  reason: collision with root package name */
    public final Set<u6> f8815x;

    /* renamed from: y  reason: collision with root package name */
    public final v6[] f8816y;

    /* renamed from: z  reason: collision with root package name */
    public final ur3 f8817z;
    public int X = 0;
    public boolean Y = false;
    public boolean T = false;

    public q4(u6[] u6VarArr, ur3 ur3Var, wr3 wr3Var, x4 x4Var, ds3 ds3Var, int i10, boolean z10, o11 o11Var, y6 y6Var, a3 a3Var, long j10, boolean z11, Looper looper, v9 v9Var, o4 o4Var, byte[] bArr) {
        this.M = o4Var;
        this.f8814w = u6VarArr;
        this.f8817z = ur3Var;
        this.A = wr3Var;
        this.B = x4Var;
        this.C = ds3Var;
        this.P = y6Var;
        this.f8813i0 = a3Var;
        this.L = v9Var;
        this.I = x4Var.d();
        x4Var.c();
        c6 a10 = c6.a(wr3Var);
        this.Q = a10;
        this.R = new n4(a10);
        this.f8816y = new v6[2];
        for (int i11 = 0; i11 < 2; i11++) {
            u6VarArr[i11].X(i11);
            this.f8816y[i11] = u6VarArr[i11].e0();
        }
        this.J = new d3(this, v9Var);
        this.K = new ArrayList<>();
        this.f8815x = Collections.newSetFromMap(new IdentityHashMap());
        this.G = new p7();
        this.H = new n7();
        ur3Var.c(this, ds3Var);
        this.f8811g0 = true;
        Handler handler = new Handler(looper);
        this.N = new s5(o11Var, handler);
        this.O = new z5(this, o11Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.E = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.F = looper2;
        this.D = v9Var.a(looper2, this);
    }

    public static boolean I(c6 c6Var, n7 n7Var) {
        bp3 bp3Var = c6Var.f2723b;
        q7 q7Var = c6Var.f2722a;
        return q7Var.k() || q7Var.o(bp3Var.f9603a, n7Var).f7219f;
    }

    public static Pair<Object, Long> J(q7 q7Var, p4 p4Var, boolean z10, int i10, boolean z11, p7 p7Var, n7 n7Var) {
        Pair<Object, Long> m10;
        q7 q7Var2 = p4Var.f8291a;
        if (q7Var.k()) {
            return null;
        }
        q7 q7Var3 = true == q7Var2.k() ? q7Var : q7Var2;
        try {
            m10 = q7Var3.m(p7Var, n7Var, p4Var.f8292b, p4Var.f8293c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (q7Var.equals(q7Var3)) {
            return m10;
        }
        if (q7Var.i(m10.first) != -1) {
            return (q7Var3.o(m10.first, n7Var).f7219f && q7Var3.f(n7Var.f7216c, p7Var, 0L).f8338m == q7Var3.i(m10.first)) ? q7Var.m(p7Var, n7Var, q7Var.o(m10.first, n7Var).f7216c, p4Var.f8293c) : m10;
        }
        Object X = X(p7Var, n7Var, i10, z11, m10.first, q7Var3, q7Var);
        if (X != null) {
            return q7Var.m(p7Var, n7Var, q7Var.o(X, n7Var).f7216c, C.TIME_UNSET);
        }
        return null;
    }

    public static boolean K(u6 u6Var) {
        return u6Var.Z() != 0;
    }

    public static final void L(r6 r6Var) throws zzaeg {
        r6Var.h();
        try {
            r6Var.a().a(r6Var.c(), r6Var.e());
        } finally {
            r6Var.i(true);
        }
    }

    public static final void M(u6 u6Var) throws zzaeg {
        if (u6Var.Z() == 2) {
            u6Var.S();
        }
    }

    public static final void N(u6 u6Var, long j10) {
        u6Var.c0();
        if (u6Var instanceof t9) {
            t9 t9Var = (t9) u6Var;
            throw null;
        }
    }

    public static v4[] O(br3 br3Var) {
        int b10 = br3Var != null ? br3Var.b() : 0;
        v4[] v4VarArr = new v4[b10];
        for (int i10 = 0; i10 < b10; i10++) {
            v4VarArr[i10] = br3Var.c(i10);
        }
        return v4VarArr;
    }

    public static Object X(p7 p7Var, n7 n7Var, int i10, boolean z10, Object obj, q7 q7Var, q7 q7Var2) {
        int i11 = q7Var.i(obj);
        int g10 = q7Var.g();
        int i12 = 0;
        int i13 = i11;
        int i14 = -1;
        while (true) {
            if (i12 >= g10 || i14 != -1) {
                break;
            }
            i13 = q7Var.l(i13, n7Var, p7Var, i10, z10);
            if (i13 == -1) {
                i14 = -1;
                break;
            }
            i14 = q7Var2.i(q7Var.j(i13));
            i12++;
        }
        if (i14 == -1) {
            return null;
        }
        return q7Var2.j(i14);
    }

    public static final /* synthetic */ void a0(r6 r6Var) {
        try {
            L(r6Var);
        } catch (zzaeg e10) {
            oa.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.c6 A(ai.bp3 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r5 = r20
            boolean r1 = r0.f8811g0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L21
            ai.c6 r1 = r0.Q
            long r7 = r1.f2740s
            int r1 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r1 != 0) goto L21
            ai.c6 r1 = r0.Q
            ai.bp3 r1 = r1.f2723b
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = r3
            goto L22
        L21:
            r1 = r4
        L22:
            r0.f8811g0 = r1
            r16.u()
            ai.c6 r1 = r0.Q
            ai.uz3 r7 = r1.f2729h
            ai.wr3 r8 = r1.f2730i
            java.util.List<ai.v7> r1 = r1.f2731j
            ai.z5 r9 = r0.O
            boolean r9 = r9.c()
            if (r9 == 0) goto L96
            ai.s5 r1 = r0.N
            ai.p5 r1 = r1.k()
            if (r1 != 0) goto L42
            ai.uz3 r7 = ai.uz3.f10891d
            goto L46
        L42:
            ai.uz3 r7 = r1.p()
        L46:
            if (r1 != 0) goto L4b
            ai.wr3 r8 = r0.A
            goto L4f
        L4b:
            ai.wr3 r8 = r1.q()
        L4f:
            ai.br3[] r9 = r8.f11731d
            ai.wz2 r10 = new ai.wz2
            r10.<init>()
            int r11 = r9.length
            r12 = r3
            r13 = r12
        L59:
            if (r12 >= r11) goto L79
            r14 = r9[r12]
            if (r14 == 0) goto L76
            ai.v4 r14 = r14.c(r3)
            ai.v7 r14 = r14.f10958j
            if (r14 != 0) goto L72
            ai.v7 r14 = new ai.v7
            ai.u7[] r15 = new ai.u7[r3]
            r14.<init>(r15)
            r10.f(r14)
            goto L76
        L72:
            r10.f(r14)
            r13 = r4
        L76:
            int r12 = r12 + 1
            goto L59
        L79:
            if (r13 == 0) goto L80
            ai.zz2 r3 = r10.g()
            goto L84
        L80:
            ai.zz2 r3 = ai.zz2.r()
        L84:
            if (r1 == 0) goto L94
            ai.q5 r4 = r1.f8308f
            long r9 = r4.f8827c
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 == 0) goto L94
            ai.q5 r4 = r4.b(r5)
            r1.f8308f = r4
        L94:
            r13 = r3
            goto Lad
        L96:
            ai.c6 r3 = r0.Q
            ai.bp3 r3 = r3.f2723b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            ai.uz3 r1 = ai.uz3.f10891d
            ai.wr3 r3 = r0.A
            ai.zz2 r4 = ai.zz2.r()
            r11 = r1
            r12 = r3
            r13 = r4
            goto Laf
        Lac:
            r13 = r1
        Lad:
            r11 = r7
            r12 = r8
        Laf:
            if (r24 == 0) goto Lb8
            ai.n4 r1 = r0.R
            r3 = r25
            r1.d(r3)
        Lb8:
            ai.c6 r1 = r0.Q
            long r9 = r16.E()
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            ai.c6 r1 = r1.c(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.q4.A(ai.bp3, long, long, long, boolean, int):ai.c6");
    }

    public final void B() throws zzaeg {
        C(new boolean[2]);
    }

    public final void C(boolean[] zArr) throws zzaeg {
        p5 l10 = this.N.l();
        wr3 q10 = l10.q();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!q10.a(i10) && this.f8815x.remove(this.f8814w[i10])) {
                this.f8814w[i10].V();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (q10.a(i11)) {
                boolean z10 = zArr[i11];
                u6 u6Var = this.f8814w[i11];
                if (!K(u6Var)) {
                    p5 l11 = this.N.l();
                    boolean z11 = l11 == this.N.k();
                    wr3 q11 = l11.q();
                    w6 w6Var = q11.f11729b[i11];
                    v4[] O = O(q11.f11731d[i11]);
                    boolean z12 = H() && this.Q.f2726e == 3;
                    boolean z13 = !z10 && z12;
                    this.f8807c0++;
                    this.f8815x.add(u6Var);
                    u6Var.W(w6Var, O, l11.f8305c[i11], this.f8809e0, z13, z11, l11.c(), l11.a());
                    u6Var.a(11, new i4(this));
                    this.J.d(u6Var);
                    if (z12) {
                        u6Var.O();
                    }
                }
            }
        }
        l10.f8309g = true;
    }

    public final void D(boolean z10) {
        bp3 bp3Var;
        long e10;
        p5 j10 = this.N.j();
        if (j10 == null) {
            bp3Var = this.Q.f2723b;
        } else {
            bp3Var = j10.f8308f.f8825a;
        }
        boolean z11 = !this.Q.f2732k.equals(bp3Var);
        if (z11) {
            this.Q = this.Q.g(bp3Var);
        }
        c6 c6Var = this.Q;
        if (j10 == null) {
            e10 = c6Var.f2740s;
        } else {
            e10 = j10.e();
        }
        c6Var.f2738q = e10;
        this.Q.f2739r = E();
        if ((z11 || z10) && j10 != null && j10.f8306d) {
            G(j10.p(), j10.q());
        }
    }

    public final long E() {
        return F(this.Q.f2738q);
    }

    public final long F(long j10) {
        p5 j11 = this.N.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f8809e0 - j11.a()));
    }

    public final void G(uz3 uz3Var, wr3 wr3Var) {
        this.B.g(this.f8814w, uz3Var, wr3Var.f11731d);
    }

    public final boolean H() {
        c6 c6Var = this.Q;
        return c6Var.f2733l && c6Var.f2734m == 0;
    }

    public final void R() {
        this.D.a(0).zza();
    }

    public final void S(boolean z10, int i10) {
        this.D.g0(1, z10 ? 1 : 0, i10).zza();
    }

    public final void T(q7 q7Var, int i10, long j10) {
        this.D.d0(3, new p4(q7Var, i10, j10)).zza();
    }

    public final void U() {
        this.D.a(6).zza();
    }

    public final synchronized boolean V() {
        if (!this.S && this.E.isAlive()) {
            this.D.E(7);
            c0(new yx2(this) { // from class: ai.g4

                /* renamed from: w  reason: collision with root package name */
                public final q4 f4326w;

                {
                    this.f4326w = this;
                }

                @Override // ai.yx2
                public final Object zza() {
                    return this.f4326w.Y();
                }
            }, 500L);
            return this.S;
        }
        return true;
    }

    public final Looper W() {
        return this.F;
    }

    public final /* synthetic */ Boolean Y() {
        return Boolean.valueOf(this.S);
    }

    public final void Z(List<x5> list, int i10, long j10, tq3 tq3Var) {
        this.D.d0(17, new j4(list, tq3Var, i10, j10, null, null)).zza();
    }

    @Override // ai.p6
    public final synchronized void a(r6 r6Var) {
        if (!this.S && this.E.isAlive()) {
            this.D.d0(14, r6Var).zza();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        r6Var.i(false);
    }

    @Override // ai.c3
    public final void b(e6 e6Var) {
        this.D.d0(16, e6Var).zza();
    }

    public final void b0(IOException iOException, int i10) {
        zzaeg a10 = zzaeg.a(iOException, i10);
        p5 k10 = this.N.k();
        if (k10 != null) {
            a10 = a10.d(k10.f8308f.f8825a);
        }
        oa.b("ExoPlayerImplInternal", "Playback error", a10);
        m(false, false);
        this.Q = this.Q.f(a10);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[LOOP:0: B:30:0x009c->B:37:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:30:0x009c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.q4.c():void");
    }

    public final synchronized void c0(yx2<Boolean> yx2Var, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z10 = false;
        for (long j11 = 500; !yx2Var.zza().booleanValue() && j11 > 0; j11 = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(j11);
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final long d(q7 q7Var, Object obj, long j10) {
        q7Var.f(q7Var.o(obj, this.H).f7216c, this.G, 0L);
        p7 p7Var = this.G;
        if (p7Var.f8329d != C.TIME_UNSET && p7Var.b()) {
            p7 p7Var2 = this.G;
            if (p7Var2.f8332g) {
                return y2.b(sb.C(p7Var2.f8330e) - this.G.f8329d) - j10;
            }
        }
        return C.TIME_UNSET;
    }

    public final void d0(int i10) {
        c6 c6Var = this.Q;
        if (c6Var.f2726e != i10) {
            this.Q = c6Var.e(i10);
        }
    }

    public final boolean e(q7 q7Var, bp3 bp3Var) {
        if (!bp3Var.b() && !q7Var.k()) {
            q7Var.f(q7Var.o(bp3Var.f9603a, this.H).f7216c, this.G, 0L);
            if (this.G.b()) {
                p7 p7Var = this.G;
                if (p7Var.f8332g && p7Var.f8329d != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e0() {
        boolean z10;
        this.R.c(this.Q);
        z10 = this.R.f7177a;
        if (z10) {
            this.M.a(this.R);
            this.R = new n4(this.Q);
        }
    }

    public final void f(long j10, long j11) {
        this.D.c0(2);
        this.D.f0(2, j10 + j11);
    }

    public final void f0(boolean z10, int i10, boolean z11, int i11) throws zzaeg {
        br3[] br3VarArr;
        this.R.b(z11 ? 1 : 0);
        this.R.e(i11);
        this.Q = this.Q.h(z10, i10);
        this.V = false;
        for (p5 k10 = this.N.k(); k10 != null; k10 = k10.o()) {
            for (br3 br3Var : k10.q().f11731d) {
            }
        }
        if (!H()) {
            i0();
            c();
            return;
        }
        int i12 = this.Q.f2726e;
        if (i12 == 3) {
            h0();
            this.D.E(2);
        } else if (i12 == 2) {
            this.D.E(2);
        }
    }

    @Override // ai.zo3
    public final void g(ap3 ap3Var) {
        this.D.d0(8, ap3Var).zza();
    }

    public final void g0(boolean z10) throws zzaeg {
        bp3 bp3Var = this.N.k().f8308f.f8825a;
        long k10 = k(bp3Var, this.Q.f2740s, true, false);
        if (k10 != this.Q.f2740s) {
            c6 c6Var = this.Q;
            this.Q = A(bp3Var, k10, c6Var.f2724c, c6Var.f2725d, z10, 5);
        }
    }

    @Override // ai.rq3
    public final /* bridge */ /* synthetic */ void h(ap3 ap3Var) {
        this.D.d0(9, ap3Var).zza();
    }

    public final void h0() throws zzaeg {
        this.V = false;
        this.J.a();
        u6[] u6VarArr = this.f8814w;
        for (int i10 = 0; i10 < 2; i10++) {
            u6 u6Var = u6VarArr[i10];
            if (K(u6Var)) {
                u6Var.O();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:422:0x0861, code lost:
        if (r() != false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x08f0, code lost:
        if (r2 == false) goto L571;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044c A[Catch: all -> 0x04ea, TryCatch #5 {all -> 0x04ea, blocks: (B:181:0x0442, B:183:0x044c, B:185:0x0451, B:187:0x0458, B:188:0x045b, B:190:0x0462, B:192:0x046c, B:194:0x0474, B:198:0x047c, B:200:0x0486, B:202:0x0496, B:205:0x049f, B:211:0x04b1, B:215:0x04bb), top: B:576:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0810 A[Catch: RuntimeException -> 0x0a6c, IOException -> 0x0a96, zzgj -> 0x0a9e, zzak -> 0x0aa6, zzaha -> 0x0aae, zzey -> 0x0ac5, zzaeg -> 0x0ace, TryCatch #6 {zzaeg -> 0x0ace, zzaha -> 0x0aae, zzak -> 0x0aa6, zzey -> 0x0ac5, zzgj -> 0x0a9e, IOException -> 0x0a96, RuntimeException -> 0x0a6c, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b2, B:37:0x00c1, B:38:0x00c5, B:39:0x00d6, B:41:0x00e5, B:42:0x0101, B:43:0x0114, B:44:0x011d, B:46:0x012f, B:47:0x013b, B:48:0x014b, B:50:0x0157, B:53:0x0162, B:54:0x0169, B:55:0x0176, B:59:0x017d, B:61:0x0185, B:63:0x0189, B:65:0x018e, B:67:0x0196, B:69:0x019e, B:70:0x01a1, B:72:0x01a6, B:79:0x01b3, B:80:0x01b4, B:84:0x01bb, B:86:0x01c9, B:87:0x01cc, B:88:0x01d1, B:90:0x01e1, B:91:0x01e4, B:92:0x01e9, B:94:0x0200, B:96:0x0204, B:98:0x0212, B:102:0x021c, B:104:0x0221, B:106:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x025a, B:118:0x0263, B:120:0x0285, B:121:0x0288, B:122:0x028b, B:124:0x028f, B:126:0x029f, B:128:0x02a5, B:129:0x02a9, B:131:0x02ad, B:132:0x02b2, B:133:0x02b7, B:137:0x02d8, B:139:0x02e3, B:134:0x02bb, B:136:0x02c5, B:140:0x02f0, B:142:0x02fc, B:143:0x0308, B:145:0x0314, B:147:0x033c, B:148:0x035c, B:149:0x0361, B:150:0x0373, B:157:0x037e, B:158:0x037f, B:159:0x0386, B:160:0x038e, B:161:0x03a3, B:163:0x03c5, B:223:0x04dc, B:208:0x04ac, B:207:0x04a8, B:228:0x04ef, B:229:0x0500, B:165:0x03ec, B:169:0x0400, B:171:0x0410, B:173:0x0427, B:175:0x0430, B:230:0x0501, B:232:0x050f, B:235:0x0519, B:237:0x0528, B:239:0x0534, B:241:0x0563, B:242:0x056a, B:243:0x056e, B:245:0x0572, B:247:0x057f, B:316:0x0690, B:318:0x0698, B:320:0x06a0, B:323:0x06a5, B:324:0x06b1, B:326:0x06b6, B:328:0x06be, B:332:0x06cf, B:334:0x06d5, B:335:0x06ef, B:337:0x06f5, B:339:0x06fa, B:341:0x06ff, B:343:0x0703, B:345:0x0709, B:347:0x070d, B:349:0x0715, B:351:0x071b, B:353:0x0725, B:356:0x072b, B:357:0x072e, B:250:0x0589, B:252:0x058f, B:255:0x0595, B:258:0x05a0, B:260:0x05a5, B:263:0x05b3, B:265:0x05b9, B:266:0x05c2, B:267:0x05c5, B:269:0x05cd, B:271:0x05db, B:273:0x05ed, B:275:0x05f7, B:278:0x0601, B:280:0x0609, B:281:0x060c, B:285:0x0613, B:287:0x061d, B:289:0x0627, B:291:0x0638, B:293:0x063e, B:294:0x0649, B:295:0x064c, B:297:0x0652, B:300:0x0657, B:302:0x065c, B:304:0x0664, B:306:0x066a, B:308:0x0670, B:312:0x067e, B:314:0x068a, B:315:0x068d, B:246:0x057c, B:358:0x077b, B:363:0x078a, B:365:0x0794, B:366:0x079b, B:368:0x07ab, B:369:0x07c0, B:371:0x07c5, B:401:0x0813, B:374:0x07ce, B:376:0x07d5, B:380:0x07de, B:382:0x07e8, B:388:0x07f7, B:390:0x07fd, B:400:0x0810, B:403:0x081e, B:405:0x0824, B:409:0x082c, B:411:0x0834, B:413:0x0838, B:414:0x0843, B:416:0x0849, B:469:0x0924, B:472:0x092c, B:474:0x0930, B:476:0x0938, B:478:0x0946, B:479:0x094d, B:480:0x0951, B:482:0x0957, B:484:0x0960, B:487:0x0967, B:488:0x096e, B:489:0x096f, B:491:0x0977, B:492:0x097d, B:494:0x0983, B:498:0x0991, B:500:0x0995, B:504:0x09a5, B:512:0x09bc, B:514:0x09c2, B:515:0x0a1d, B:503:0x099d, B:496:0x098a, B:505:0x09a8, B:509:0x09af, B:510:0x09b5, B:417:0x0852, B:419:0x0859, B:421:0x085d, B:448:0x08cf, B:450:0x08da, B:426:0x086a, B:428:0x086e, B:430:0x0880, B:431:0x0886, B:433:0x0894, B:437:0x089d, B:439:0x08a7, B:445:0x08b2, B:451:0x08de, B:453:0x08e5, B:455:0x08e9, B:459:0x08f2, B:461:0x0900, B:463:0x0908, B:465:0x0912, B:466:0x0917, B:467:0x091c, B:468:0x0921, B:402:0x0817, B:516:0x0a25, B:517:0x0a2d, B:521:0x0a34, B:522:0x0a3c, B:526:0x0a5a), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0977 A[Catch: RuntimeException -> 0x0a6c, IOException -> 0x0a96, zzgj -> 0x0a9e, zzak -> 0x0aa6, zzaha -> 0x0aae, zzey -> 0x0ac5, zzaeg -> 0x0ace, TryCatch #6 {zzaeg -> 0x0ace, zzaha -> 0x0aae, zzak -> 0x0aa6, zzey -> 0x0ac5, zzgj -> 0x0a9e, IOException -> 0x0a96, RuntimeException -> 0x0a6c, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b2, B:37:0x00c1, B:38:0x00c5, B:39:0x00d6, B:41:0x00e5, B:42:0x0101, B:43:0x0114, B:44:0x011d, B:46:0x012f, B:47:0x013b, B:48:0x014b, B:50:0x0157, B:53:0x0162, B:54:0x0169, B:55:0x0176, B:59:0x017d, B:61:0x0185, B:63:0x0189, B:65:0x018e, B:67:0x0196, B:69:0x019e, B:70:0x01a1, B:72:0x01a6, B:79:0x01b3, B:80:0x01b4, B:84:0x01bb, B:86:0x01c9, B:87:0x01cc, B:88:0x01d1, B:90:0x01e1, B:91:0x01e4, B:92:0x01e9, B:94:0x0200, B:96:0x0204, B:98:0x0212, B:102:0x021c, B:104:0x0221, B:106:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x025a, B:118:0x0263, B:120:0x0285, B:121:0x0288, B:122:0x028b, B:124:0x028f, B:126:0x029f, B:128:0x02a5, B:129:0x02a9, B:131:0x02ad, B:132:0x02b2, B:133:0x02b7, B:137:0x02d8, B:139:0x02e3, B:134:0x02bb, B:136:0x02c5, B:140:0x02f0, B:142:0x02fc, B:143:0x0308, B:145:0x0314, B:147:0x033c, B:148:0x035c, B:149:0x0361, B:150:0x0373, B:157:0x037e, B:158:0x037f, B:159:0x0386, B:160:0x038e, B:161:0x03a3, B:163:0x03c5, B:223:0x04dc, B:208:0x04ac, B:207:0x04a8, B:228:0x04ef, B:229:0x0500, B:165:0x03ec, B:169:0x0400, B:171:0x0410, B:173:0x0427, B:175:0x0430, B:230:0x0501, B:232:0x050f, B:235:0x0519, B:237:0x0528, B:239:0x0534, B:241:0x0563, B:242:0x056a, B:243:0x056e, B:245:0x0572, B:247:0x057f, B:316:0x0690, B:318:0x0698, B:320:0x06a0, B:323:0x06a5, B:324:0x06b1, B:326:0x06b6, B:328:0x06be, B:332:0x06cf, B:334:0x06d5, B:335:0x06ef, B:337:0x06f5, B:339:0x06fa, B:341:0x06ff, B:343:0x0703, B:345:0x0709, B:347:0x070d, B:349:0x0715, B:351:0x071b, B:353:0x0725, B:356:0x072b, B:357:0x072e, B:250:0x0589, B:252:0x058f, B:255:0x0595, B:258:0x05a0, B:260:0x05a5, B:263:0x05b3, B:265:0x05b9, B:266:0x05c2, B:267:0x05c5, B:269:0x05cd, B:271:0x05db, B:273:0x05ed, B:275:0x05f7, B:278:0x0601, B:280:0x0609, B:281:0x060c, B:285:0x0613, B:287:0x061d, B:289:0x0627, B:291:0x0638, B:293:0x063e, B:294:0x0649, B:295:0x064c, B:297:0x0652, B:300:0x0657, B:302:0x065c, B:304:0x0664, B:306:0x066a, B:308:0x0670, B:312:0x067e, B:314:0x068a, B:315:0x068d, B:246:0x057c, B:358:0x077b, B:363:0x078a, B:365:0x0794, B:366:0x079b, B:368:0x07ab, B:369:0x07c0, B:371:0x07c5, B:401:0x0813, B:374:0x07ce, B:376:0x07d5, B:380:0x07de, B:382:0x07e8, B:388:0x07f7, B:390:0x07fd, B:400:0x0810, B:403:0x081e, B:405:0x0824, B:409:0x082c, B:411:0x0834, B:413:0x0838, B:414:0x0843, B:416:0x0849, B:469:0x0924, B:472:0x092c, B:474:0x0930, B:476:0x0938, B:478:0x0946, B:479:0x094d, B:480:0x0951, B:482:0x0957, B:484:0x0960, B:487:0x0967, B:488:0x096e, B:489:0x096f, B:491:0x0977, B:492:0x097d, B:494:0x0983, B:498:0x0991, B:500:0x0995, B:504:0x09a5, B:512:0x09bc, B:514:0x09c2, B:515:0x0a1d, B:503:0x099d, B:496:0x098a, B:505:0x09a8, B:509:0x09af, B:510:0x09b5, B:417:0x0852, B:419:0x0859, B:421:0x085d, B:448:0x08cf, B:450:0x08da, B:426:0x086a, B:428:0x086e, B:430:0x0880, B:431:0x0886, B:433:0x0894, B:437:0x089d, B:439:0x08a7, B:445:0x08b2, B:451:0x08de, B:453:0x08e5, B:455:0x08e9, B:459:0x08f2, B:461:0x0900, B:463:0x0908, B:465:0x0912, B:466:0x0917, B:467:0x091c, B:468:0x0921, B:402:0x0817, B:516:0x0a25, B:517:0x0a2d, B:521:0x0a34, B:522:0x0a3c, B:526:0x0a5a), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0983 A[Catch: RuntimeException -> 0x0a6c, IOException -> 0x0a96, zzgj -> 0x0a9e, zzak -> 0x0aa6, zzaha -> 0x0aae, zzey -> 0x0ac5, zzaeg -> 0x0ace, TryCatch #6 {zzaeg -> 0x0ace, zzaha -> 0x0aae, zzak -> 0x0aa6, zzey -> 0x0ac5, zzgj -> 0x0a9e, IOException -> 0x0a96, RuntimeException -> 0x0a6c, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b2, B:37:0x00c1, B:38:0x00c5, B:39:0x00d6, B:41:0x00e5, B:42:0x0101, B:43:0x0114, B:44:0x011d, B:46:0x012f, B:47:0x013b, B:48:0x014b, B:50:0x0157, B:53:0x0162, B:54:0x0169, B:55:0x0176, B:59:0x017d, B:61:0x0185, B:63:0x0189, B:65:0x018e, B:67:0x0196, B:69:0x019e, B:70:0x01a1, B:72:0x01a6, B:79:0x01b3, B:80:0x01b4, B:84:0x01bb, B:86:0x01c9, B:87:0x01cc, B:88:0x01d1, B:90:0x01e1, B:91:0x01e4, B:92:0x01e9, B:94:0x0200, B:96:0x0204, B:98:0x0212, B:102:0x021c, B:104:0x0221, B:106:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x025a, B:118:0x0263, B:120:0x0285, B:121:0x0288, B:122:0x028b, B:124:0x028f, B:126:0x029f, B:128:0x02a5, B:129:0x02a9, B:131:0x02ad, B:132:0x02b2, B:133:0x02b7, B:137:0x02d8, B:139:0x02e3, B:134:0x02bb, B:136:0x02c5, B:140:0x02f0, B:142:0x02fc, B:143:0x0308, B:145:0x0314, B:147:0x033c, B:148:0x035c, B:149:0x0361, B:150:0x0373, B:157:0x037e, B:158:0x037f, B:159:0x0386, B:160:0x038e, B:161:0x03a3, B:163:0x03c5, B:223:0x04dc, B:208:0x04ac, B:207:0x04a8, B:228:0x04ef, B:229:0x0500, B:165:0x03ec, B:169:0x0400, B:171:0x0410, B:173:0x0427, B:175:0x0430, B:230:0x0501, B:232:0x050f, B:235:0x0519, B:237:0x0528, B:239:0x0534, B:241:0x0563, B:242:0x056a, B:243:0x056e, B:245:0x0572, B:247:0x057f, B:316:0x0690, B:318:0x0698, B:320:0x06a0, B:323:0x06a5, B:324:0x06b1, B:326:0x06b6, B:328:0x06be, B:332:0x06cf, B:334:0x06d5, B:335:0x06ef, B:337:0x06f5, B:339:0x06fa, B:341:0x06ff, B:343:0x0703, B:345:0x0709, B:347:0x070d, B:349:0x0715, B:351:0x071b, B:353:0x0725, B:356:0x072b, B:357:0x072e, B:250:0x0589, B:252:0x058f, B:255:0x0595, B:258:0x05a0, B:260:0x05a5, B:263:0x05b3, B:265:0x05b9, B:266:0x05c2, B:267:0x05c5, B:269:0x05cd, B:271:0x05db, B:273:0x05ed, B:275:0x05f7, B:278:0x0601, B:280:0x0609, B:281:0x060c, B:285:0x0613, B:287:0x061d, B:289:0x0627, B:291:0x0638, B:293:0x063e, B:294:0x0649, B:295:0x064c, B:297:0x0652, B:300:0x0657, B:302:0x065c, B:304:0x0664, B:306:0x066a, B:308:0x0670, B:312:0x067e, B:314:0x068a, B:315:0x068d, B:246:0x057c, B:358:0x077b, B:363:0x078a, B:365:0x0794, B:366:0x079b, B:368:0x07ab, B:369:0x07c0, B:371:0x07c5, B:401:0x0813, B:374:0x07ce, B:376:0x07d5, B:380:0x07de, B:382:0x07e8, B:388:0x07f7, B:390:0x07fd, B:400:0x0810, B:403:0x081e, B:405:0x0824, B:409:0x082c, B:411:0x0834, B:413:0x0838, B:414:0x0843, B:416:0x0849, B:469:0x0924, B:472:0x092c, B:474:0x0930, B:476:0x0938, B:478:0x0946, B:479:0x094d, B:480:0x0951, B:482:0x0957, B:484:0x0960, B:487:0x0967, B:488:0x096e, B:489:0x096f, B:491:0x0977, B:492:0x097d, B:494:0x0983, B:498:0x0991, B:500:0x0995, B:504:0x09a5, B:512:0x09bc, B:514:0x09c2, B:515:0x0a1d, B:503:0x099d, B:496:0x098a, B:505:0x09a8, B:509:0x09af, B:510:0x09b5, B:417:0x0852, B:419:0x0859, B:421:0x085d, B:448:0x08cf, B:450:0x08da, B:426:0x086a, B:428:0x086e, B:430:0x0880, B:431:0x0886, B:433:0x0894, B:437:0x089d, B:439:0x08a7, B:445:0x08b2, B:451:0x08de, B:453:0x08e5, B:455:0x08e9, B:459:0x08f2, B:461:0x0900, B:463:0x0908, B:465:0x0912, B:466:0x0917, B:467:0x091c, B:468:0x0921, B:402:0x0817, B:516:0x0a25, B:517:0x0a2d, B:521:0x0a34, B:522:0x0a3c, B:526:0x0a5a), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x09c2 A[Catch: RuntimeException -> 0x0a6c, IOException -> 0x0a96, zzgj -> 0x0a9e, zzak -> 0x0aa6, zzaha -> 0x0aae, zzey -> 0x0ac5, zzaeg -> 0x0ace, TryCatch #6 {zzaeg -> 0x0ace, zzaha -> 0x0aae, zzak -> 0x0aa6, zzey -> 0x0ac5, zzgj -> 0x0a9e, IOException -> 0x0a96, RuntimeException -> 0x0a6c, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b2, B:37:0x00c1, B:38:0x00c5, B:39:0x00d6, B:41:0x00e5, B:42:0x0101, B:43:0x0114, B:44:0x011d, B:46:0x012f, B:47:0x013b, B:48:0x014b, B:50:0x0157, B:53:0x0162, B:54:0x0169, B:55:0x0176, B:59:0x017d, B:61:0x0185, B:63:0x0189, B:65:0x018e, B:67:0x0196, B:69:0x019e, B:70:0x01a1, B:72:0x01a6, B:79:0x01b3, B:80:0x01b4, B:84:0x01bb, B:86:0x01c9, B:87:0x01cc, B:88:0x01d1, B:90:0x01e1, B:91:0x01e4, B:92:0x01e9, B:94:0x0200, B:96:0x0204, B:98:0x0212, B:102:0x021c, B:104:0x0221, B:106:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x025a, B:118:0x0263, B:120:0x0285, B:121:0x0288, B:122:0x028b, B:124:0x028f, B:126:0x029f, B:128:0x02a5, B:129:0x02a9, B:131:0x02ad, B:132:0x02b2, B:133:0x02b7, B:137:0x02d8, B:139:0x02e3, B:134:0x02bb, B:136:0x02c5, B:140:0x02f0, B:142:0x02fc, B:143:0x0308, B:145:0x0314, B:147:0x033c, B:148:0x035c, B:149:0x0361, B:150:0x0373, B:157:0x037e, B:158:0x037f, B:159:0x0386, B:160:0x038e, B:161:0x03a3, B:163:0x03c5, B:223:0x04dc, B:208:0x04ac, B:207:0x04a8, B:228:0x04ef, B:229:0x0500, B:165:0x03ec, B:169:0x0400, B:171:0x0410, B:173:0x0427, B:175:0x0430, B:230:0x0501, B:232:0x050f, B:235:0x0519, B:237:0x0528, B:239:0x0534, B:241:0x0563, B:242:0x056a, B:243:0x056e, B:245:0x0572, B:247:0x057f, B:316:0x0690, B:318:0x0698, B:320:0x06a0, B:323:0x06a5, B:324:0x06b1, B:326:0x06b6, B:328:0x06be, B:332:0x06cf, B:334:0x06d5, B:335:0x06ef, B:337:0x06f5, B:339:0x06fa, B:341:0x06ff, B:343:0x0703, B:345:0x0709, B:347:0x070d, B:349:0x0715, B:351:0x071b, B:353:0x0725, B:356:0x072b, B:357:0x072e, B:250:0x0589, B:252:0x058f, B:255:0x0595, B:258:0x05a0, B:260:0x05a5, B:263:0x05b3, B:265:0x05b9, B:266:0x05c2, B:267:0x05c5, B:269:0x05cd, B:271:0x05db, B:273:0x05ed, B:275:0x05f7, B:278:0x0601, B:280:0x0609, B:281:0x060c, B:285:0x0613, B:287:0x061d, B:289:0x0627, B:291:0x0638, B:293:0x063e, B:294:0x0649, B:295:0x064c, B:297:0x0652, B:300:0x0657, B:302:0x065c, B:304:0x0664, B:306:0x066a, B:308:0x0670, B:312:0x067e, B:314:0x068a, B:315:0x068d, B:246:0x057c, B:358:0x077b, B:363:0x078a, B:365:0x0794, B:366:0x079b, B:368:0x07ab, B:369:0x07c0, B:371:0x07c5, B:401:0x0813, B:374:0x07ce, B:376:0x07d5, B:380:0x07de, B:382:0x07e8, B:388:0x07f7, B:390:0x07fd, B:400:0x0810, B:403:0x081e, B:405:0x0824, B:409:0x082c, B:411:0x0834, B:413:0x0838, B:414:0x0843, B:416:0x0849, B:469:0x0924, B:472:0x092c, B:474:0x0930, B:476:0x0938, B:478:0x0946, B:479:0x094d, B:480:0x0951, B:482:0x0957, B:484:0x0960, B:487:0x0967, B:488:0x096e, B:489:0x096f, B:491:0x0977, B:492:0x097d, B:494:0x0983, B:498:0x0991, B:500:0x0995, B:504:0x09a5, B:512:0x09bc, B:514:0x09c2, B:515:0x0a1d, B:503:0x099d, B:496:0x098a, B:505:0x09a8, B:509:0x09af, B:510:0x09b5, B:417:0x0852, B:419:0x0859, B:421:0x085d, B:448:0x08cf, B:450:0x08da, B:426:0x086a, B:428:0x086e, B:430:0x0880, B:431:0x0886, B:433:0x0894, B:437:0x089d, B:439:0x08a7, B:445:0x08b2, B:451:0x08de, B:453:0x08e5, B:455:0x08e9, B:459:0x08f2, B:461:0x0900, B:463:0x0908, B:465:0x0912, B:466:0x0917, B:467:0x091c, B:468:0x0921, B:402:0x0817, B:516:0x0a25, B:517:0x0a2d, B:521:0x0a34, B:522:0x0a3c, B:526:0x0a5a), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0813 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [ai.pm, ai.ds3] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r49) {
        /*
            Method dump skipped, instructions count: 2908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.q4.handleMessage(android.os.Message):boolean");
    }

    public final long i(bp3 bp3Var, long j10, boolean z10) throws zzaeg {
        return k(bp3Var, j10, this.N.k() != this.N.l(), z10);
    }

    public final void i0() throws zzaeg {
        this.J.b();
        u6[] u6VarArr = this.f8814w;
        for (int i10 = 0; i10 < 2; i10++) {
            u6 u6Var = u6VarArr[i10];
            if (K(u6Var)) {
                M(u6Var);
            }
        }
    }

    @Override // ai.y5
    public final void j() {
        this.D.E(22);
    }

    public final long k(bp3 bp3Var, long j10, boolean z10, boolean z11) throws zzaeg {
        i0();
        this.V = false;
        if (z11 || this.Q.f2726e == 3) {
            d0(2);
        }
        p5 k10 = this.N.k();
        p5 p5Var = k10;
        while (p5Var != null && !bp3Var.equals(p5Var.f8308f.f8825a)) {
            p5Var = p5Var.o();
        }
        if (z10 || k10 != p5Var || (p5Var != null && p5Var.a() + j10 < 0)) {
            u6[] u6VarArr = this.f8814w;
            for (int i10 = 0; i10 < 2; i10++) {
                q(u6VarArr[i10]);
            }
            if (p5Var != null) {
                while (this.N.k() != p5Var) {
                    this.N.n();
                }
                this.N.o(p5Var);
                p5Var.b(0L);
                B();
            }
        }
        if (p5Var != null) {
            this.N.o(p5Var);
            if (!p5Var.f8306d) {
                p5Var.f8308f = p5Var.f8308f.a(j10);
            } else if (p5Var.f8307e) {
                j10 = p5Var.f8303a.j(j10);
                p5Var.f8303a.l(j10 - this.I, false);
            }
            l(j10);
            x();
        } else {
            this.N.p();
            l(j10);
        }
        D(false);
        this.D.E(2);
        return j10;
    }

    public final void l(long j10) throws zzaeg {
        br3[] br3VarArr;
        p5 k10 = this.N.k();
        if (k10 != null) {
            j10 += k10.a();
        }
        this.f8809e0 = j10;
        this.J.c(j10);
        u6[] u6VarArr = this.f8814w;
        for (int i10 = 0; i10 < 2; i10++) {
            u6 u6Var = u6VarArr[i10];
            if (K(u6Var)) {
                u6Var.h0(this.f8809e0);
            }
        }
        for (p5 k11 = this.N.k(); k11 != null; k11 = k11.o()) {
            for (br3 br3Var : k11.q().f11731d) {
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        n(z10 || !this.Z, false, true, false);
        this.R.b(z11 ? 1 : 0);
        this.B.zzb();
        d0(1);
    }

    public final void n(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        bp3 bp3Var;
        boolean z14;
        long j11;
        long j12;
        this.D.c0(2);
        this.f8812h0 = null;
        this.V = false;
        this.J.b();
        this.f8809e0 = 0L;
        u6[] u6VarArr = this.f8814w;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                q(u6VarArr[i10]);
            } catch (zzaeg | RuntimeException e10) {
                oa.b("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            u6[] u6VarArr2 = this.f8814w;
            for (int i11 = 0; i11 < 2; i11++) {
                u6 u6Var = u6VarArr2[i11];
                if (this.f8815x.remove(u6Var)) {
                    try {
                        u6Var.V();
                    } catch (RuntimeException e11) {
                        oa.b("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f8807c0 = 0;
        c6 c6Var = this.Q;
        bp3 bp3Var2 = c6Var.f2723b;
        long j13 = c6Var.f2740s;
        if (!this.Q.f2723b.b() && !I(this.Q, this.H)) {
            j10 = this.Q.f2740s;
        } else {
            j10 = this.Q.f2724c;
        }
        if (z11) {
            this.f8808d0 = null;
            Pair<bp3, Long> o10 = o(this.Q.f2722a);
            bp3 bp3Var3 = (bp3) o10.first;
            long longValue = ((Long) o10.second).longValue();
            if (bp3Var3.equals(this.Q.f2723b)) {
                bp3Var = bp3Var3;
                z14 = false;
            } else {
                z14 = true;
                bp3Var = bp3Var3;
            }
            j11 = longValue;
            j12 = -9223372036854775807L;
        } else {
            bp3Var = bp3Var2;
            z14 = false;
            j11 = j13;
            j12 = j10;
        }
        this.N.p();
        this.W = false;
        c6 c6Var2 = this.Q;
        q7 q7Var = c6Var2.f2722a;
        int i12 = c6Var2.f2726e;
        zzaeg zzaegVar = z13 ? null : c6Var2.f2727f;
        uz3 uz3Var = z14 ? uz3.f10891d : c6Var2.f2729h;
        wr3 wr3Var = z14 ? this.A : c6Var2.f2730i;
        List r10 = z14 ? zz2.r() : c6Var2.f2731j;
        c6 c6Var3 = this.Q;
        this.Q = new c6(q7Var, bp3Var, j12, j11, i12, zzaegVar, false, uz3Var, wr3Var, r10, bp3Var, c6Var3.f2733l, c6Var3.f2734m, c6Var3.f2735n, j11, 0L, j11, this.f8806b0, false);
        if (z12) {
            this.O.g();
        }
    }

    public final Pair<bp3, Long> o(q7 q7Var) {
        long j10 = 0;
        if (q7Var.k()) {
            return Pair.create(c6.b(), 0L);
        }
        Pair<Object, Long> m10 = q7Var.m(this.G, this.H, q7Var.e(this.Y), C.TIME_UNSET);
        bp3 s10 = this.N.s(q7Var, m10.first, 0L);
        long longValue = ((Long) m10.second).longValue();
        if (s10.b()) {
            q7Var.o(s10.f9603a, this.H);
            if (s10.f9605c == this.H.c(s10.f9604b)) {
                this.H.i();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(s10, Long.valueOf(j10));
    }

    public final void p(q7 q7Var, q7 q7Var2) {
        if (q7Var.k() && q7Var2.k()) {
            return;
        }
        int size = this.K.size() - 1;
        if (size < 0) {
            Collections.sort(this.K);
            return;
        }
        Object obj = this.K.get(size).f6784w;
        y2.b(C.TIME_UNSET);
        throw null;
    }

    public final void q(u6 u6Var) throws zzaeg {
        if (K(u6Var)) {
            this.J.e(u6Var);
            M(u6Var);
            u6Var.g0();
            this.f8807c0--;
        }
    }

    public final boolean r() {
        p5 k10 = this.N.k();
        long j10 = k10.f8308f.f8829e;
        if (k10.f8306d) {
            if (j10 == C.TIME_UNSET || this.Q.f2740s < j10) {
                return true;
            }
            return !H();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0361 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [ai.n7] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [ai.p4] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ai.q7] */
    /* JADX WARN: Type inference failed for: r29v0, types: [ai.q7] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(ai.q7 r29, boolean r30) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.q4.s(ai.q7, boolean):void");
    }

    public final void t(q7 q7Var, bp3 bp3Var, q7 q7Var2, bp3 bp3Var2, long j10) {
        if (!q7Var.k() && e(q7Var, bp3Var)) {
            q7Var.f(q7Var.o(bp3Var.f9603a, this.H).f7216c, this.G, 0L);
            a3 a3Var = this.f8813i0;
            h5 h5Var = this.G.f8334i;
            int i10 = sb.f9778a;
            a3Var.a(h5Var);
            if (j10 != C.TIME_UNSET) {
                this.f8813i0.b(d(q7Var, bp3Var.f9603a, j10));
                return;
            }
            if (sb.H(!q7Var2.k() ? q7Var2.f(q7Var2.o(bp3Var2.f9603a, this.H).f7216c, this.G, 0L).f8326a : null, this.G.f8326a)) {
                return;
            }
            this.f8813i0.b(C.TIME_UNSET);
            return;
        }
        float f10 = this.J.y().f3544a;
        e6 e6Var = this.Q.f2735n;
        if (f10 != e6Var.f3544a) {
            this.J.A(e6Var);
        }
    }

    public final void u() {
        p5 k10 = this.N.k();
        boolean z10 = false;
        if (k10 != null && k10.f8308f.f8832h && this.T) {
            z10 = true;
        }
        this.U = z10;
    }

    public final void v(e6 e6Var, boolean z10) throws zzaeg {
        w(e6Var, e6Var.f3544a, true, z10);
    }

    public final void w(e6 e6Var, float f10, boolean z10, boolean z11) throws zzaeg {
        int i10;
        q4 q4Var = this;
        if (z10) {
            if (z11) {
                q4Var.R.b(1);
            }
            c6 c6Var = q4Var.Q;
            q4Var = this;
            q4Var.Q = new c6(c6Var.f2722a, c6Var.f2723b, c6Var.f2724c, c6Var.f2725d, c6Var.f2726e, c6Var.f2727f, c6Var.f2728g, c6Var.f2729h, c6Var.f2730i, c6Var.f2731j, c6Var.f2732k, c6Var.f2733l, c6Var.f2734m, e6Var, c6Var.f2738q, c6Var.f2739r, c6Var.f2740s, c6Var.f2736o, c6Var.f2737p);
        }
        float f11 = e6Var.f3544a;
        p5 k10 = q4Var.N.k();
        while (true) {
            i10 = 0;
            if (k10 == null) {
                break;
            }
            br3[] br3VarArr = k10.q().f11731d;
            int length = br3VarArr.length;
            while (i10 < length) {
                br3 br3Var = br3VarArr[i10];
                i10++;
            }
            k10 = k10.o();
        }
        u6[] u6VarArr = q4Var.f8814w;
        while (i10 < 2) {
            u6 u6Var = u6VarArr[i10];
            if (u6Var != null) {
                u6Var.f0(f10, e6Var.f3544a);
            }
            i10++;
        }
    }

    public final void x() {
        long a10;
        long j10;
        boolean h10;
        if (y()) {
            p5 j11 = this.N.j();
            long F = F(j11.f());
            if (j11 == this.N.k()) {
                a10 = this.f8809e0;
                j10 = j11.a();
            } else {
                a10 = this.f8809e0 - j11.a();
                j10 = j11.f8308f.f8826b;
            }
            h10 = this.B.h(a10 - j10, F, this.J.y().f3544a);
        } else {
            h10 = false;
        }
        this.W = h10;
        if (h10) {
            this.N.j().i(this.f8809e0);
        }
        z();
    }

    public final boolean y() {
        p5 j10 = this.N.j();
        return (j10 == null || j10.f() == Long.MIN_VALUE) ? false : true;
    }

    public final void z() {
        p5 j10 = this.N.j();
        boolean z10 = this.W || (j10 != null && j10.f8303a.k());
        c6 c6Var = this.Q;
        if (z10 != c6Var.f2728g) {
            this.Q = new c6(c6Var.f2722a, c6Var.f2723b, c6Var.f2724c, c6Var.f2725d, c6Var.f2726e, c6Var.f2727f, z10, c6Var.f2729h, c6Var.f2730i, c6Var.f2731j, c6Var.f2732k, c6Var.f2733l, c6Var.f2734m, c6Var.f2735n, c6Var.f2738q, c6Var.f2739r, c6Var.f2740s, c6Var.f2736o, c6Var.f2737p);
        }
    }

    @Override // ai.tr3
    public final void zza() {
        this.D.E(10);
    }
}
