package ai;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzahc;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class hp0 extends ul0 implements pm, r31 {
    public static final /* synthetic */ int R = 0;
    public final or3 A;
    public final dm0 B;
    public final WeakReference<em0> C;
    public final fq3 D;
    public e7 E;
    public ByteBuffer F;
    public boolean G;
    public tl0 H;
    public int I;
    public int J;
    public long K;
    public final String L;
    public final int M;
    public final ArrayList<rk> O;
    public volatile uo0 P;

    /* renamed from: y  reason: collision with root package name */
    public final Context f4917y;

    /* renamed from: z  reason: collision with root package name */
    public final ro0 f4918z;
    public final Object N = new Object();
    public final Set<WeakReference<qo0>> Q = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
        if (((java.lang.Boolean) ai.ft.c().c(ai.ox.f8030l1)).booleanValue() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
        if (r6.f3344j == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
        if (r6.f3343i <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
        r7 = new ai.yo0(r4, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
        r7 = new ai.zo0(r4, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
        if (r6.f3344j == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
        r6 = new ai.ap0(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
        r5 = r4.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
        if (r5.limit() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
        r5 = new byte[r4.F.limit()];
        r4.F.get(r5);
        r6 = new ai.bp0(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hp0(android.content.Context r5, ai.dm0 r6, ai.em0 r7) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.hp0.<init>(android.content.Context, ai.dm0, ai.em0):void");
    }

    @Override // ai.ul0
    public final boolean B() {
        return this.E != null;
    }

    @Override // ai.ul0
    public final int C() {
        return this.E.h();
    }

    @Override // ai.ul0
    public final long D() {
        return this.E.N();
    }

    @Override // ai.ul0
    public final boolean E() {
        return this.E.l();
    }

    @Override // ai.ul0
    public final void F(boolean z10) {
        this.E.k(z10);
    }

    @Override // ai.ul0
    public final void G(int i10) {
        this.f4918z.a(i10);
    }

    @Override // ai.ul0
    public final void H(int i10) {
        this.f4918z.i(i10);
    }

    @Override // ai.ul0
    public final long I() {
        return this.E.q();
    }

    @Override // ai.ul0
    public final long J() {
        if (g0()) {
            return 0L;
        }
        return this.I;
    }

    @Override // ai.ul0
    public final long K() {
        if (g0() && this.P.w()) {
            return Math.min(this.I, this.P.o());
        }
        return 0L;
    }

    @Override // ai.ul0
    public final long L() {
        if (!g0()) {
            synchronized (this.N) {
                while (!this.O.isEmpty()) {
                    long j10 = this.K;
                    Map<String, List<String>> a10 = this.O.remove(0).a();
                    long j11 = 0;
                    if (a10 != null) {
                        Iterator<Map.Entry<String, List<String>>> it = a10.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, List<String>> next = it.next();
                            if (next != null) {
                                try {
                                    if (next.getKey() != null && tw2.e("content-length", next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                        j11 = Long.parseLong(next.getValue().get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.K = j10 + j11;
                }
            }
            return this.K;
        }
        return this.P.y();
    }

    @Override // ai.ul0
    public final int M() {
        return this.J;
    }

    @Override // ai.ul0
    public final void N(boolean z10) {
        if (this.E == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.E.p();
            if (i10 >= 2) {
                return;
            }
            or3 or3Var = this.A;
            jr3 g10 = or3Var.i().g();
            g10.s(i10, !z10);
            or3Var.j(g10);
            i10++;
        }
    }

    @Override // ai.ul0
    public final long O() {
        return this.E.s();
    }

    @Override // ai.ul0
    public final long P() {
        return this.I;
    }

    @Override // ai.ul0
    public final void S(Uri[] uriArr, String str) {
        T(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // ai.ul0
    public final void T(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        dp3 qp3Var;
        if (this.E == null) {
            return;
        }
        this.F = byteBuffer;
        this.G = z10;
        int length = uriArr.length;
        if (length == 1) {
            qp3Var = h0(uriArr[0]);
        } else {
            dp3[] dp3VarArr = new dp3[length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                dp3VarArr[i10] = h0(uriArr[i10]);
            }
            qp3Var = new qp3(false, false, dp3VarArr);
        }
        this.E.j(qp3Var);
        this.E.i();
        ul0.f10744x.incrementAndGet();
    }

    @Override // ai.ul0
    public final void U(tl0 tl0Var) {
        this.H = tl0Var;
    }

    @Override // ai.ul0
    public final void V() {
        e7 e7Var = this.E;
        if (e7Var != null) {
            e7Var.g(this);
            this.E.m();
            this.E = null;
            ul0.f10744x.decrementAndGet();
        }
    }

    @Override // ai.ul0
    public final void W(Surface surface, boolean z10) {
        e7 e7Var = this.E;
        if (e7Var == null) {
            return;
        }
        e7Var.i0(surface);
    }

    @Override // ai.ul0
    public final void X(float f10, boolean z10) {
        e7 e7Var = this.E;
        if (e7Var == null) {
            return;
        }
        e7Var.e(f10);
    }

    @Override // ai.ul0
    public final void Y() {
        this.E.Q(false);
    }

    @Override // ai.ul0
    public final void Z(long j10) {
        e7 e7Var = this.E;
        e7Var.P(e7Var.C(), j10);
    }

    @Override // ai.ul0
    public final void a0(int i10) {
        this.f4918z.j(i10);
    }

    @Override // ai.ul0
    public final void b0(int i10) {
        this.f4918z.k(i10);
    }

    @Override // ai.ul0
    public final void c0(int i10) {
        for (WeakReference<qo0> weakReference : this.Q) {
            qo0 qo0Var = weakReference.get();
            if (qo0Var != null) {
                qo0Var.v(i10);
            }
        }
    }

    @Override // ai.r31
    public final void d(p21 p21Var, Object obj, long j10) {
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            tl0Var.x();
        }
    }

    public final /* synthetic */ void d0(boolean z10, long j10) {
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            tl0Var.b(z10, j10);
        }
    }

    public final /* synthetic */ a8 e0(String str, boolean z10) {
        ad adVar = new ad();
        adVar.a(str);
        adVar.e(true != z10 ? null : this);
        adVar.b(this.B.f3338d);
        adVar.c(this.B.f3340f);
        adVar.d(true);
        return adVar.zza();
    }

    public final /* synthetic */ a8 f0(String str, boolean z10) {
        hp0 hp0Var = true != z10 ? null : this;
        dm0 dm0Var = this.B;
        qo0 qo0Var = new qo0(str, hp0Var, dm0Var.f3338d, dm0Var.f3340f, dm0Var.f3343i);
        this.Q.add(new WeakReference<>(qo0Var));
        return qo0Var;
    }

    public final void finalize() {
        ul0.f10743w.decrementAndGet();
        if (yg.p1.m()) {
            yg.p1.k("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // ai.pm
    public final void g(a8 a8Var, bc bcVar, boolean z10) {
        if (a8Var instanceof rk) {
            synchronized (this.N) {
                this.O.add((rk) a8Var);
            }
        } else if (a8Var instanceof uo0) {
            this.P = (uo0) a8Var;
            final em0 em0Var = this.C.get();
            if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue() && em0Var != null && this.P.u()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.P.w()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.P.x()));
                yg.d2.f61866i.post(new Runnable(em0Var, hashMap) { // from class: ai.wo0

                    /* renamed from: w  reason: collision with root package name */
                    public final em0 f11699w;

                    /* renamed from: x  reason: collision with root package name */
                    public final Map f11700x;

                    {
                        this.f11699w = em0Var;
                        this.f11700x = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        em0 em0Var2 = this.f11699w;
                        Map<String, ?> map = this.f11700x;
                        int i10 = hp0.R;
                        em0Var2.j0("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    public final boolean g0() {
        return this.P != null && this.P.v();
    }

    @Override // ai.r31
    public final void h(p21 p21Var, int i10) {
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            tl0Var.a(i10);
        }
    }

    public final dp3 h0(Uri uri) {
        b5 b5Var = new b5();
        b5Var.b(uri);
        k5 c10 = b5Var.c();
        fq3 fq3Var = this.D;
        fq3Var.a(this.B.f3341g);
        return fq3Var.b(c10);
    }

    @Override // ai.r31
    public final void i(p21 p21Var, v4 v4Var, qo qoVar) {
        em0 em0Var = this.C.get();
        if (!((Boolean) ft.c().c(ox.f8030l1)).booleanValue() || em0Var == null || v4Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(v4Var.f10967s));
        hashMap.put("bitRate", String.valueOf(v4Var.f10956h));
        int i10 = v4Var.f10965q;
        int i11 = v4Var.f10966r;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        hashMap.put("resolution", sb2.toString());
        hashMap.put("videoMime", v4Var.f10959k);
        hashMap.put("videoSampleMime", v4Var.f10960l);
        hashMap.put("videoCodec", v4Var.f10957i);
        em0Var.j0("onMetadataEvent", hashMap);
    }

    public final /* synthetic */ u6[] i0(Handler handler, lu3 lu3Var, fk1 fk1Var, s9 s9Var, w7 w7Var) {
        Context context = this.f4917y;
        f43 f43Var = f43.f3944a;
        u72 u72Var = new u72(null, new u71[0], false);
        ox2 ox2Var = ox2.f8150a;
        return new u6[]{new yb2(context, ox2Var, f43Var, false, handler, fk1Var, u72Var), new pt3(this.f4917y, ox2Var, f43Var, 0L, false, handler, lu3Var, -1)};
    }

    public final /* synthetic */ a8 j0(z6 z6Var) {
        return new uo0(this.f4917y, z6Var.zza(), this.L, this.M, this, new to0(this) { // from class: ai.gp0

            /* renamed from: a  reason: collision with root package name */
            public final hp0 f4535a;

            {
                this.f4535a = this;
            }

            @Override // ai.to0
            public final void b(boolean z10, long j10) {
                this.f4535a.d0(z10, j10);
            }
        });
    }

    @Override // ai.pm
    public final void k(a8 a8Var, bc bcVar, boolean z10) {
    }

    @Override // ai.r31
    public final void l(p21 p21Var, v4 v4Var, qo qoVar) {
        em0 em0Var = this.C.get();
        if (!((Boolean) ft.c().c(ox.f8030l1)).booleanValue() || em0Var == null || v4Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", v4Var.f10959k);
        hashMap.put("audioSampleMime", v4Var.f10960l);
        hashMap.put("audioCodec", v4Var.f10957i);
        em0Var.j0("onMetadataEvent", hashMap);
    }

    @Override // ai.r31
    public final void m(p21 p21Var, so3 so3Var, yo3 yo3Var, IOException iOException, boolean z10) {
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            if (this.B.f3346l) {
                tl0Var.c("onLoadException", iOException);
            } else {
                tl0Var.e("onLoadError", iOException);
            }
        }
    }

    @Override // ai.r31
    public final void q(p21 p21Var, zzahc zzahcVar) {
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            tl0Var.e("onPlayerError", zzahcVar);
        }
    }

    @Override // ai.pm
    public final void s(a8 a8Var, bc bcVar, boolean z10, int i10) {
        this.I += i10;
    }

    @Override // ai.r31
    public final void t(p21 p21Var, s54 s54Var) {
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            tl0Var.d(s54Var.f9737a, s54Var.f9738b);
        }
    }

    @Override // ai.r31
    public final void u(p21 p21Var, int i10, long j10) {
        this.J += i10;
    }

    @Override // ai.pm
    public final void w(a8 a8Var, bc bcVar, boolean z10) {
    }
}
