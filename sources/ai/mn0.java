package ai;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzamy;
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
public final class mn0 extends ul0 implements ej, jh, pk, jd, ac {
    public static final /* synthetic */ int S = 0;
    public final rc A;
    public final rc B;
    public final li C;
    public final dm0 D;
    public ec E;
    public ByteBuffer F;
    public boolean G;
    public final WeakReference<em0> H;
    public tl0 I;
    public int J;
    public int K;
    public long L;
    public final String M;
    public final int N;
    public final ArrayList<zi> P;
    public volatile an0 Q;

    /* renamed from: y  reason: collision with root package name */
    public final Context f6981y;

    /* renamed from: z  reason: collision with root package name */
    public final bn0 f6982z;
    public final Object O = new Object();
    public final Set<WeakReference<xm0>> R = new HashSet();

    public mn0(Context context, dm0 dm0Var, em0 em0Var) {
        this.f6981y = context;
        this.D = dm0Var;
        this.H = new WeakReference<>(em0Var);
        bn0 bn0Var = new bn0();
        this.f6982z = bn0Var;
        ig igVar = ig.f5213a;
        ow2 ow2Var = yg.d2.f61866i;
        ek ekVar = new ek(context, igVar, 0L, ow2Var, this, -1);
        this.A = ekVar;
        ud udVar = new ud(igVar, null, true, ow2Var, this);
        this.B = udVar;
        hi hiVar = new hi(null);
        this.C = hiVar;
        if (yg.p1.m()) {
            yg.p1.k("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        ul0.f10743w.incrementAndGet();
        ec a10 = fc.a(new rc[]{udVar, ekVar}, hiVar, bn0Var);
        this.E = a10;
        a10.m0(this);
        this.J = 0;
        this.L = 0L;
        this.K = 0;
        this.P = new ArrayList<>();
        this.Q = null;
        this.M = (em0Var == null || em0Var.n() == null) ? "" : em0Var.n();
        this.N = em0Var != null ? em0Var.p() : 0;
        if (((Boolean) ft.c().c(ox.f8044n)).booleanValue()) {
            this.E.o();
        }
        if (em0Var != null && em0Var.K() > 0) {
            this.E.l0(em0Var.K());
        }
        if (em0Var == null || em0Var.M() <= 0) {
            return;
        }
        this.E.s0(em0Var.M());
    }

    @Override // ai.ac
    public final void A(xc xcVar, Object obj) {
    }

    @Override // ai.ul0
    public final boolean B() {
        return this.E != null;
    }

    @Override // ai.ul0
    public final int C() {
        return this.E.b();
    }

    @Override // ai.ul0
    public final long D() {
        return this.E.k();
    }

    @Override // ai.ul0
    public final boolean E() {
        return this.E.a();
    }

    @Override // ai.ul0
    public final void F(boolean z10) {
        this.E.k0(z10);
    }

    @Override // ai.ul0
    public final void G(int i10) {
        this.f6982z.g(i10);
    }

    @Override // ai.ul0
    public final void H(int i10) {
        this.f6982z.h(i10);
    }

    @Override // ai.ul0
    public final long I() {
        return this.E.j();
    }

    @Override // ai.ul0
    public final long J() {
        if (k0()) {
            return 0L;
        }
        return this.J;
    }

    @Override // ai.ul0
    public final long K() {
        if (k0() && this.Q.h()) {
            return Math.min(this.J, this.Q.j());
        }
        return 0L;
    }

    @Override // ai.ul0
    public final long L() {
        if (!k0()) {
            synchronized (this.O) {
                while (!this.P.isEmpty()) {
                    long j10 = this.L;
                    Map<String, List<String>> c10 = this.P.remove(0).c();
                    long j11 = 0;
                    if (c10 != null) {
                        Iterator<Map.Entry<String, List<String>>> it = c10.entrySet().iterator();
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
                    this.L = j10 + j11;
                }
            }
            return this.L;
        }
        return this.Q.k();
    }

    @Override // ai.ul0
    public final int M() {
        return this.K;
    }

    @Override // ai.ul0
    public final void N(boolean z10) {
        if (this.E != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                this.C.f(i10, !z10);
            }
        }
    }

    @Override // ai.ul0
    public final long O() {
        return this.E.n();
    }

    @Override // ai.ul0
    public final long P() {
        return this.J;
    }

    @Override // ai.ul0
    public final void S(Uri[] uriArr, String str) {
        T(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // ai.ul0
    public final void T(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        oh rhVar;
        if (this.E == null) {
            return;
        }
        this.F = byteBuffer;
        this.G = z10;
        int length = uriArr.length;
        if (length == 1) {
            rhVar = f0(uriArr[0], str);
        } else {
            oh[] ohVarArr = new oh[length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                ohVarArr[i10] = f0(uriArr[i10], str);
            }
            rhVar = new rh(ohVarArr);
        }
        this.E.r0(rhVar);
        ul0.f10744x.incrementAndGet();
    }

    @Override // ai.ul0
    public final void U(tl0 tl0Var) {
        this.I = tl0Var;
    }

    @Override // ai.ul0
    public final void V() {
        ec ecVar = this.E;
        if (ecVar != null) {
            ecVar.o0(this);
            this.E.h();
            this.E = null;
            ul0.f10744x.decrementAndGet();
        }
    }

    @Override // ai.ul0
    public final void W(Surface surface, boolean z10) {
        if (this.E == null) {
            return;
        }
        dc dcVar = new dc(this.A, 1, surface);
        if (z10) {
            this.E.p0(dcVar);
        } else {
            this.E.n0(dcVar);
        }
    }

    @Override // ai.ul0
    public final void X(float f10, boolean z10) {
        if (this.E == null) {
            return;
        }
        dc dcVar = new dc(this.B, 2, Float.valueOf(f10));
        if (z10) {
            this.E.p0(dcVar);
        } else {
            this.E.n0(dcVar);
        }
    }

    @Override // ai.ul0
    public final void Y() {
        this.E.e();
    }

    @Override // ai.ul0
    public final void Z(long j10) {
        this.E.q0(j10);
    }

    @Override // ai.ac
    public final void a() {
    }

    @Override // ai.ul0
    public final void a0(int i10) {
        this.f6982z.i(i10);
    }

    @Override // ai.ac
    public final void b(boolean z10) {
    }

    @Override // ai.ul0
    public final void b0(int i10) {
        this.f6982z.j(i10);
    }

    @Override // ai.jh
    public final void c(IOException iOException) {
        tl0 tl0Var = this.I;
        if (tl0Var != null) {
            if (this.D.f3346l) {
                tl0Var.c("onLoadException", iOException);
            } else {
                tl0Var.e("onLoadError", iOException);
            }
        }
    }

    @Override // ai.ul0
    public final void c0(int i10) {
        for (WeakReference<xm0> weakReference : this.R) {
            xm0 xm0Var = weakReference.get();
            if (xm0Var != null) {
                xm0Var.g(i10);
            }
        }
    }

    @Override // ai.ej
    /* renamed from: d0 */
    public final void n(ui uiVar, vi viVar) {
        if (uiVar instanceof zi) {
            synchronized (this.O) {
                this.P.add((zi) uiVar);
            }
        } else if (uiVar instanceof an0) {
            this.Q = (an0) uiVar;
            final em0 em0Var = this.H.get();
            if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue() && em0Var != null && this.Q.a()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.Q.h()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.Q.i()));
                yg.d2.f61866i.post(new Runnable(em0Var, hashMap) { // from class: ai.cn0

                    /* renamed from: w  reason: collision with root package name */
                    public final em0 f2878w;

                    /* renamed from: x  reason: collision with root package name */
                    public final Map f2879x;

                    {
                        this.f2878w = em0Var;
                        this.f2879x = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        em0 em0Var2 = this.f2878w;
                        Map<String, ?> map = this.f2879x;
                        int i10 = mn0.S;
                        em0Var2.j0("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // ai.pk
    public final void e(Surface surface) {
        tl0 tl0Var = this.I;
        if (tl0Var != null) {
            tl0Var.x();
        }
    }

    public final void e0(ui uiVar, int i10) {
        this.J += i10;
    }

    @Override // ai.ac
    public final void f(zzamy zzamyVar) {
        tl0 tl0Var = this.I;
        if (tl0Var != null) {
            tl0Var.e("onPlayerError", zzamyVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (((java.lang.Boolean) ai.ft.c().c(ai.ox.f8030l1)).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.oh f0(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            ai.kh r9 = new ai.kh
            boolean r0 = r10.G
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r10.F
            int r0 = r0.limit()
            if (r0 <= 0) goto L22
            java.nio.ByteBuffer r12 = r10.F
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.F
            r0.get(r12)
            ai.en0 r0 = new ai.en0
            r0.<init>(r12)
        L20:
            r2 = r0
            goto L89
        L22:
            ai.gx<java.lang.Boolean> r0 = ai.ox.f8070q1
            ai.mx r1 = ai.ft.c()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L47
            ai.gx<java.lang.Boolean> r0 = ai.ox.f8030l1
            ai.mx r2 = ai.ft.c()
            java.lang.Object r0 = r2.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4f
        L47:
            ai.dm0 r0 = r10.D
            boolean r0 = r0.f3344j
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            ai.dm0 r0 = r10.D
            int r0 = r0.f3343i
            if (r0 <= 0) goto L5b
            ai.fn0 r0 = new ai.fn0
            r0.<init>(r10, r12, r1)
            goto L60
        L5b:
            ai.gn0 r0 = new ai.gn0
            r0.<init>(r10, r12, r1)
        L60:
            ai.dm0 r12 = r10.D
            boolean r12 = r12.f3344j
            if (r12 == 0) goto L6c
            ai.hn0 r12 = new ai.hn0
            r12.<init>(r10, r0)
            r0 = r12
        L6c:
            java.nio.ByteBuffer r12 = r10.F
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.F
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.F
            r1.get(r12)
            ai.in0 r1 = new ai.in0
            r1.<init>(r0, r12)
            r2 = r1
        L89:
            ai.gx<java.lang.Boolean> r12 = ai.ox.f8036m
            ai.mx r0 = ai.ft.c()
            java.lang.Object r12 = r0.c(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9e
            ai.oe r12 = ai.jn0.f5849a
            goto La0
        L9e:
            ai.oe r12 = ai.kn0.f6290a
        La0:
            r3 = r12
            ai.dm0 r12 = r10.D
            int r4 = r12.f3345k
            ai.ow2 r5 = yg.d2.f61866i
            r7 = 0
            int r8 = r12.f3341g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mn0.f0(android.net.Uri, java.lang.String):ai.oh");
    }

    public final void finalize() throws Throwable {
        ul0.f10743w.decrementAndGet();
        if (yg.p1.m()) {
            yg.p1.k("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final /* synthetic */ ui g0(ti tiVar) {
        return new an0(this.f6981y, tiVar.zza(), this.M, this.N, this, new zm0(this) { // from class: ai.ln0

            /* renamed from: a  reason: collision with root package name */
            public final mn0 f6625a;

            {
                this.f6625a = this;
            }

            @Override // ai.zm0
            public final void b(boolean z10, long j10) {
                this.f6625a.h0(z10, j10);
            }
        });
    }

    public final /* synthetic */ void h0(boolean z10, long j10) {
        tl0 tl0Var = this.I;
        if (tl0Var != null) {
            tl0Var.b(z10, j10);
        }
    }

    public final /* synthetic */ ui i0(String str, boolean z10) {
        mn0 mn0Var = true != z10 ? null : this;
        dm0 dm0Var = this.D;
        return new xi(str, null, mn0Var, dm0Var.f3338d, dm0Var.f3340f, true, null);
    }

    @Override // ai.ac
    public final void j(boolean z10, int i10) {
        tl0 tl0Var = this.I;
        if (tl0Var != null) {
            tl0Var.a(i10);
        }
    }

    public final /* synthetic */ ui j0(String str, boolean z10) {
        mn0 mn0Var = true != z10 ? null : this;
        dm0 dm0Var = this.D;
        xm0 xm0Var = new xm0(str, mn0Var, dm0Var.f3338d, dm0Var.f3340f, dm0Var.f3343i);
        this.R.add(new WeakReference<>(xm0Var));
        return xm0Var;
    }

    public final boolean k0() {
        return this.Q != null && this.Q.g();
    }

    @Override // ai.ac
    public final void o(ci ciVar, ni niVar) {
    }

    @Override // ai.jd
    public final void p(oc ocVar) {
        em0 em0Var = this.H.get();
        if (!((Boolean) ft.c().c(ox.f8030l1)).booleanValue() || em0Var == null || ocVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", ocVar.A);
        hashMap.put("audioSampleMime", ocVar.B);
        hashMap.put("audioCodec", ocVar.f7713y);
        em0Var.j0("onMetadataEvent", hashMap);
    }

    @Override // ai.pk
    public final void r(int i10, int i11, int i12, float f10) {
        tl0 tl0Var = this.I;
        if (tl0Var != null) {
            tl0Var.d(i10, i11);
        }
    }

    @Override // ai.ac
    public final void v(qc qcVar) {
    }

    @Override // ai.pk
    public final void x(oc ocVar) {
        em0 em0Var = this.H.get();
        if (!((Boolean) ft.c().c(ox.f8030l1)).booleanValue() || em0Var == null || ocVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(ocVar.H));
        hashMap.put("bitRate", String.valueOf(ocVar.f7712x));
        int i10 = ocVar.F;
        int i11 = ocVar.G;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        hashMap.put("resolution", sb2.toString());
        hashMap.put("videoMime", ocVar.A);
        hashMap.put("videoSampleMime", ocVar.B);
        hashMap.put("videoCodec", ocVar.f7713y);
        em0Var.j0("onMetadataEvent", hashMap);
    }

    @Override // ai.ej
    public final /* bridge */ /* synthetic */ void y(Object obj, int i10) {
        this.J += i10;
    }

    @Override // ai.pk
    public final void z(int i10, long j10) {
        this.K += i10;
    }
}
