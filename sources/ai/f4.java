package ai;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzafx;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class f4 extends v2 {
    public c6 A;
    public int B;
    public long C;
    public tq3 D;

    /* renamed from: b  reason: collision with root package name */
    public final wr3 f3915b;

    /* renamed from: c  reason: collision with root package name */
    public final h6 f3916c;

    /* renamed from: d  reason: collision with root package name */
    public final u6[] f3917d;

    /* renamed from: e  reason: collision with root package name */
    public final ur3 f3918e;

    /* renamed from: f  reason: collision with root package name */
    public final ha f3919f;

    /* renamed from: g  reason: collision with root package name */
    public final o4 f3920g;

    /* renamed from: h  reason: collision with root package name */
    public final q4 f3921h;

    /* renamed from: i  reason: collision with root package name */
    public final na<i6> f3922i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArraySet<h3> f3923j;

    /* renamed from: k  reason: collision with root package name */
    public final n7 f3924k;

    /* renamed from: l  reason: collision with root package name */
    public final List<e4> f3925l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3926m;

    /* renamed from: n  reason: collision with root package name */
    public final mp3 f3927n;

    /* renamed from: o  reason: collision with root package name */
    public final o11 f3928o;

    /* renamed from: p  reason: collision with root package name */
    public final Looper f3929p;

    /* renamed from: q  reason: collision with root package name */
    public final ds3 f3930q;

    /* renamed from: r  reason: collision with root package name */
    public final v9 f3931r;

    /* renamed from: s  reason: collision with root package name */
    public int f3932s;

    /* renamed from: t  reason: collision with root package name */
    public int f3933t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3934u;

    /* renamed from: v  reason: collision with root package name */
    public int f3935v;

    /* renamed from: w  reason: collision with root package name */
    public y6 f3936w;

    /* renamed from: x  reason: collision with root package name */
    public h6 f3937x;

    /* renamed from: y  reason: collision with root package name */
    public o5 f3938y;

    /* renamed from: z  reason: collision with root package name */
    public o5 f3939z;

    @SuppressLint({"HandlerLeak"})
    public f4(u6[] u6VarArr, ur3 ur3Var, mp3 mp3Var, x4 x4Var, ds3 ds3Var, o11 o11Var, boolean z10, y6 y6Var, long j10, long j11, a3 a3Var, long j12, boolean z11, v9 v9Var, Looper looper, final o6 o6Var, h6 h6Var, byte[] bArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = sb.f9782e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb2.append("Init ");
        sb2.append(hexString);
        sb2.append(" [ExoPlayerLib/2.15.0] [");
        sb2.append(str);
        sb2.append("]");
        Log.i("ExoPlayerImpl", sb2.toString());
        int length = u6VarArr.length;
        this.f3917d = u6VarArr;
        Objects.requireNonNull(ur3Var);
        this.f3918e = ur3Var;
        this.f3927n = mp3Var;
        this.f3930q = ds3Var;
        this.f3928o = o11Var;
        this.f3926m = true;
        this.f3936w = y6Var;
        this.f3929p = looper;
        this.f3931r = v9Var;
        na<i6> naVar = new na<>(looper, v9Var, new la(o6Var) { // from class: ai.j3

            /* renamed from: a  reason: collision with root package name */
            public final o6 f5606a;

            {
                this.f5606a = o6Var;
            }

            @Override // ai.la
            public final void a(Object obj, fa faVar) {
                i6 i6Var = (i6) obj;
                new j6(faVar);
            }
        });
        this.f3922i = naVar;
        this.f3923j = new CopyOnWriteArraySet<>();
        this.f3925l = new ArrayList();
        this.D = new tq3(0);
        wr3 wr3Var = new wr3(new w6[2], new br3[2], null, null);
        this.f3915b = wr3Var;
        this.f3924k = new n7();
        g6 g6Var = new g6();
        g6Var.c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19);
        g6Var.b(28, true);
        g6Var.d(h6Var);
        h6 e10 = g6Var.e();
        this.f3916c = e10;
        g6 g6Var2 = new g6();
        g6Var2.d(e10);
        g6Var2.a(3);
        g6Var2.a(9);
        this.f3937x = g6Var2.e();
        o5 o5Var = o5.f7642t;
        this.f3938y = o5Var;
        this.f3939z = o5Var;
        this.B = -1;
        this.f3919f = v9Var.a(looper, null);
        o4 o4Var = new o4(this) { // from class: ai.u3

            /* renamed from: a  reason: collision with root package name */
            public final f4 f10587a;

            {
                this.f10587a = this;
            }

            @Override // ai.o4
            public final void a(n4 n4Var) {
                this.f10587a.h(n4Var);
            }
        };
        this.f3920g = o4Var;
        this.A = c6.a(wr3Var);
        o11Var.P(o6Var, looper);
        naVar.b(o11Var);
        ds3Var.a(new Handler(looper), o11Var);
        this.f3921h = new q4(u6VarArr, ur3Var, wr3Var, x4Var, ds3Var, 0, false, o11Var, y6Var, a3Var, 500L, false, looper, v9Var, o4Var, null);
    }

    public static long m(c6 c6Var) {
        p7 p7Var = new p7();
        n7 n7Var = new n7();
        c6Var.f2722a.o(c6Var.f2723b.f9603a, n7Var);
        long j10 = c6Var.f2724c;
        if (j10 == C.TIME_UNSET) {
            long j11 = c6Var.f2722a.f(n7Var.f7216c, p7Var, 0L).f8336k;
            return 0L;
        }
        return j10;
    }

    public static boolean t(c6 c6Var) {
        return c6Var.f2726e == 3 && c6Var.f2733l && c6Var.f2734m == 0;
    }

    public final void A(h3 h3Var) {
        this.f3923j.add(h3Var);
    }

    public final int B() {
        return this.A.f2726e;
    }

    @Override // ai.o6
    public final int C() {
        int j10 = j();
        if (j10 == -1) {
            return 0;
        }
        return j10;
    }

    @Override // ai.o6
    public final q7 D() {
        return this.A.f2722a;
    }

    public final void E() {
        c6 c6Var = this.A;
        if (c6Var.f2726e != 1) {
            return;
        }
        c6 f10 = c6Var.f(null);
        c6 e10 = f10.e(true != f10.f2722a.k() ? 2 : 4);
        this.f3932s++;
        this.f3921h.R();
        l(e10, 1, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    public final void F(List<dp3> list, boolean z10) {
        j();
        N();
        this.f3932s++;
        if (!this.f3925l.isEmpty()) {
            int size = this.f3925l.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f3925l.remove(i10);
            }
            this.D = this.D.g(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            x5 x5Var = new x5(list.get(i11), this.f3926m);
            arrayList.add(x5Var);
            this.f3925l.add(i11, new e4(x5Var.f11867b, x5Var.f11866a.F()));
        }
        this.D = this.D.f(0, arrayList.size());
        s6 s6Var = new s6(this.f3925l, this.D, null);
        if (!s6Var.k() && s6Var.a() < 0) {
            throw new zzafx(s6Var, -1, C.TIME_UNSET);
        }
        int e10 = s6Var.e(false);
        c6 p10 = p(this.A, s6Var, q(s6Var, e10, C.TIME_UNSET));
        int i12 = p10.f2726e;
        if (e10 != -1 && i12 != 1) {
            i12 = (s6Var.k() || e10 >= s6Var.a()) ? 4 : 2;
        }
        c6 e11 = p10.e(i12);
        this.f3921h.Z(arrayList, e10, y2.b(C.TIME_UNSET), this.D);
        l(e11, 0, 1, false, (this.A.f2723b.f9603a.equals(e11.f2723b.f9603a) || this.A.f2722a.k()) ? false : true, 4, k(e11), -1);
    }

    public final void G(boolean z10, int i10, int i11) {
        c6 c6Var = this.A;
        if (c6Var.f2733l == z10 && c6Var.f2734m == i10) {
            return;
        }
        this.f3932s++;
        c6 h10 = c6Var.h(z10, i10);
        this.f3921h.S(z10, i10);
        l(h10, 0, i11, false, false, 5, C.TIME_UNSET, -1);
    }

    public final boolean H() {
        return this.A.f2733l;
    }

    public final void I(boolean z10, zzaeg zzaegVar) {
        c6 c6Var = this.A;
        c6 g10 = c6Var.g(c6Var.f2723b);
        g10.f2738q = g10.f2740s;
        g10.f2739r = 0L;
        c6 e10 = g10.e(1);
        if (zzaegVar != null) {
            e10 = e10.f(zzaegVar);
        }
        c6 c6Var2 = e10;
        this.f3932s++;
        this.f3921h.U();
        l(c6Var2, 0, 1, false, c6Var2.f2722a.k() && !this.A.f2722a.k(), 4, k(c6Var2), -1);
    }

    public final void J() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = sb.f9782e;
        String a10 = r4.a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb2 = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a10).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [ExoPlayerLib/2.15.0] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(a10);
        sb2.append("]");
        Log.i("ExoPlayerImpl", sb2.toString());
        if (!this.f3921h.V()) {
            na<i6> naVar = this.f3922i;
            naVar.d(10, b4.f2221a);
            naVar.e();
        }
        this.f3922i.f();
        this.f3919f.h0(null);
        o11 o11Var = this.f3928o;
        if (o11Var != null) {
            this.f3930q.b(o11Var);
        }
        c6 e10 = this.A.e(1);
        this.A = e10;
        c6 g10 = e10.g(e10.f2723b);
        this.A = g10;
        g10.f2738q = g10.f2740s;
        this.A.f2739r = 0L;
    }

    @Override // ai.o6
    public final long K() {
        if (y()) {
            c6 c6Var = this.A;
            c6Var.f2722a.o(c6Var.f2723b.f9603a, this.f3924k);
            c6 c6Var2 = this.A;
            if (c6Var2.f2724c == C.TIME_UNSET) {
                long j10 = c6Var2.f2722a.f(C(), this.f10933a, 0L).f8336k;
                return y2.a(0L);
            }
            return y2.a(0L) + y2.a(this.A.f2724c);
        }
        return N();
    }

    public final r6 L(q6 q6Var) {
        return new r6(this.f3921h, q6Var, this.A.f2722a, C(), this.f3931r, this.f3921h.W());
    }

    public final long M() {
        if (!y()) {
            q7 q7Var = this.A.f2722a;
            return q7Var.k() ? C.TIME_UNSET : y2.a(q7Var.f(C(), this.f10933a, 0L).f8337l);
        }
        c6 c6Var = this.A;
        bp3 bp3Var = c6Var.f2723b;
        c6Var.f2722a.o(bp3Var.f9603a, this.f3924k);
        return y2.a(this.f3924k.h(bp3Var.f9604b, bp3Var.f9605c));
    }

    @Override // ai.o6
    public final long N() {
        return y2.a(k(this.A));
    }

    @Override // ai.o6
    public final int O() {
        if (y()) {
            return this.A.f2723b.f9604b;
        }
        return -1;
    }

    @Override // ai.o6
    public final void P(int i10, long j10) {
        q7 q7Var = this.A.f2722a;
        if (i10 >= 0 && (q7Var.k() || i10 < q7Var.a())) {
            this.f3932s++;
            if (!y()) {
                int i11 = this.A.f2726e != 1 ? 2 : 1;
                int C = C();
                c6 p10 = p(this.A.e(i11), q7Var, q(q7Var, i10, j10));
                this.f3921h.T(q7Var, i10, y2.b(j10));
                l(p10, 0, 1, true, true, 1, k(p10), C);
                return;
            }
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            n4 n4Var = new n4(this.A);
            n4Var.b(1);
            this.f3920g.a(n4Var);
            return;
        }
        throw new zzafx(q7Var, i10, j10);
    }

    @Override // ai.o6
    public final void Q(boolean z10) {
        throw null;
    }

    public final long R() {
        if (y()) {
            c6 c6Var = this.A;
            if (c6Var.f2732k.equals(c6Var.f2723b)) {
                return y2.a(this.A.f2738q);
            }
            return M();
        } else if (this.A.f2722a.k()) {
            return this.C;
        } else {
            c6 c6Var2 = this.A;
            long j10 = 0;
            if (c6Var2.f2732k.f9606d != c6Var2.f2723b.f9606d) {
                return y2.a(c6Var2.f2722a.f(C(), this.f10933a, 0L).f8337l);
            }
            long j11 = c6Var2.f2738q;
            if (this.A.f2732k.b()) {
                c6 c6Var3 = this.A;
                c6Var3.f2722a.o(c6Var3.f2732k.f9603a, this.f3924k).b(this.A.f2732k.f9604b);
            } else {
                j10 = j11;
            }
            c6 c6Var4 = this.A;
            s(c6Var4.f2722a, c6Var4.f2732k, j10);
            return y2.a(j10);
        }
    }

    public final int e() {
        int length = this.f3917d.length;
        return 2;
    }

    public final /* synthetic */ void f(i6 i6Var) {
        i6Var.w0(this.f3937x);
    }

    public final /* synthetic */ void h(final n4 n4Var) {
        this.f3919f.i0(new Runnable(this, n4Var) { // from class: ai.z3

            /* renamed from: w  reason: collision with root package name */
            public final f4 f12846w;

            /* renamed from: x  reason: collision with root package name */
            public final n4 f12847x;

            {
                this.f12846w = this;
                this.f12847x = n4Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12846w.i(this.f12847x);
            }
        });
    }

    public final /* synthetic */ void i(n4 n4Var) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.f3932s - n4Var.f7179c;
        this.f3932s = i10;
        boolean z11 = true;
        if (n4Var.f7180d) {
            this.f3933t = n4Var.f7181e;
            this.f3934u = true;
        }
        if (n4Var.f7182f) {
            this.f3935v = n4Var.f7183g;
        }
        if (i10 == 0) {
            q7 q7Var = n4Var.f7178b.f2722a;
            if (!this.A.f2722a.k() && q7Var.k()) {
                this.B = -1;
                this.C = 0L;
            }
            if (!q7Var.k()) {
                List<q7> y10 = ((s6) q7Var).y();
                u9.d(y10.size() == this.f3925l.size());
                for (int i11 = 0; i11 < y10.size(); i11++) {
                    this.f3925l.get(i11).f3524b = y10.get(i11);
                }
            }
            if (this.f3934u) {
                if (n4Var.f7178b.f2723b.equals(this.A.f2723b) && n4Var.f7178b.f2725d == this.A.f2740s) {
                    z11 = false;
                }
                if (z11) {
                    if (!q7Var.k() && !n4Var.f7178b.f2723b.b()) {
                        c6 c6Var = n4Var.f7178b;
                        bp3 bp3Var = c6Var.f2723b;
                        j11 = c6Var.f2725d;
                        s(q7Var, bp3Var, j11);
                    } else {
                        j11 = n4Var.f7178b.f2725d;
                    }
                    z10 = z11;
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                    z10 = z11;
                }
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f3934u = false;
            l(n4Var.f7178b, 1, this.f3935v, false, z10, this.f3933t, j10, -1);
        }
    }

    public final int j() {
        if (this.A.f2722a.k()) {
            return this.B;
        }
        c6 c6Var = this.A;
        return c6Var.f2722a.o(c6Var.f2723b.f9603a, this.f3924k).f7216c;
    }

    public final long k(c6 c6Var) {
        if (c6Var.f2722a.k()) {
            return y2.b(this.C);
        }
        if (c6Var.f2723b.b()) {
            return c6Var.f2740s;
        }
        q7 q7Var = c6Var.f2722a;
        bp3 bp3Var = c6Var.f2723b;
        long j10 = c6Var.f2740s;
        s(q7Var, bp3Var, j10);
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x041e, code lost:
        if (r4.f(C(), r40.f10933a, 0).f8332g != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(final ai.c6 r41, final int r42, final int r43, boolean r44, boolean r45, final int r46, long r47, int r49) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.f4.l(ai.c6, int, int, boolean, boolean, int, long, int):void");
    }

    @Override // ai.o6
    public final int n() {
        return 0;
    }

    @Override // ai.o6
    public final boolean o() {
        return false;
    }

    public final c6 p(c6 c6Var, q7 q7Var, Pair<Object, Long> pair) {
        bp3 bp3Var;
        uz3 uz3Var;
        bp3 bp3Var2;
        wr3 wr3Var;
        List<v7> list;
        int i10;
        c6 c10;
        long j10;
        u9.a(q7Var.k() || pair != null);
        q7 q7Var2 = c6Var.f2722a;
        c6 d10 = c6Var.d(q7Var);
        if (q7Var.k()) {
            bp3 b10 = c6.b();
            long b11 = y2.b(this.C);
            c6 g10 = d10.c(b10, b11, b11, b11, 0L, uz3.f10891d, this.f3915b, zz2.r()).g(b10);
            g10.f2738q = g10.f2740s;
            return g10;
        }
        Object obj = d10.f2723b.f9603a;
        int i11 = sb.f9778a;
        boolean z10 = !obj.equals(pair.first);
        if (z10) {
            bp3Var = new bp3(pair.first);
        } else {
            bp3Var = d10.f2723b;
        }
        bp3 bp3Var3 = bp3Var;
        long longValue = ((Long) pair.second).longValue();
        long b12 = y2.b(K());
        if (!q7Var2.k()) {
            q7Var2.o(obj, this.f3924k);
        }
        if (z10 || longValue < b12) {
            u9.d(!bp3Var3.b());
            if (z10) {
                uz3Var = uz3.f10891d;
            } else {
                uz3Var = d10.f2729h;
            }
            uz3 uz3Var2 = uz3Var;
            if (z10) {
                bp3Var2 = bp3Var3;
                wr3Var = this.f3915b;
            } else {
                bp3Var2 = bp3Var3;
                wr3Var = d10.f2730i;
            }
            wr3 wr3Var2 = wr3Var;
            if (z10) {
                list = zz2.r();
            } else {
                list = d10.f2731j;
            }
            c6 g11 = d10.c(bp3Var2, longValue, longValue, longValue, 0L, uz3Var2, wr3Var2, list).g(bp3Var2);
            g11.f2738q = longValue;
            return g11;
        }
        if (i10 == 0) {
            int i12 = q7Var.i(d10.f2732k.f9603a);
            if (i12 != -1 && q7Var.h(i12, this.f3924k, false).f7216c == q7Var.o(bp3Var3.f9603a, this.f3924k).f7216c) {
                return d10;
            }
            q7Var.o(bp3Var3.f9603a, this.f3924k);
            if (bp3Var3.b()) {
                j10 = this.f3924k.h(bp3Var3.f9604b, bp3Var3.f9605c);
            } else {
                j10 = this.f3924k.f7217d;
            }
            c10 = d10.c(bp3Var3, d10.f2740s, d10.f2740s, d10.f2725d, j10 - d10.f2740s, d10.f2729h, d10.f2730i, d10.f2731j).g(bp3Var3);
            c10.f2738q = j10;
        } else {
            u9.d(!bp3Var3.b());
            long max = Math.max(0L, d10.f2739r - (longValue - b12));
            long j11 = d10.f2738q;
            if (d10.f2732k.equals(d10.f2723b)) {
                j11 = longValue + max;
            }
            c10 = d10.c(bp3Var3, longValue, longValue, longValue, max, d10.f2729h, d10.f2730i, d10.f2731j);
            c10.f2738q = j11;
        }
        return c10;
    }

    public final Pair<Object, Long> q(q7 q7Var, int i10, long j10) {
        if (q7Var.k()) {
            this.B = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.C = j10;
            return null;
        }
        if (i10 == -1 || i10 >= q7Var.a()) {
            i10 = q7Var.e(false);
            long j11 = q7Var.f(i10, this.f10933a, 0L).f8336k;
            j10 = y2.a(0L);
        }
        return q7Var.m(this.f10933a, this.f3924k, i10, y2.b(j10));
    }

    @Override // ai.o6
    public final int r() {
        if (this.A.f2722a.k()) {
            return 0;
        }
        c6 c6Var = this.A;
        return c6Var.f2722a.i(c6Var.f2723b.f9603a);
    }

    public final long s(q7 q7Var, bp3 bp3Var, long j10) {
        q7Var.o(bp3Var.f9603a, this.f3924k);
        return j10;
    }

    @Override // ai.o6
    public final long u() {
        return y2.a(this.A.f2739r);
    }

    public final boolean v() {
        return this.A.f2737p;
    }

    public final Looper w() {
        return this.f3929p;
    }

    @Override // ai.o6
    public final int x() {
        if (y()) {
            return this.A.f2723b.f9605c;
        }
        return -1;
    }

    @Override // ai.o6
    public final boolean y() {
        return this.A.f2723b.b();
    }

    public final void z(i6 i6Var) {
        this.f3922i.b(i6Var);
    }
}
