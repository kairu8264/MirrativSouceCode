package ai;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzath;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ih implements mh, ne, aj, vh {
    public final jh A;
    public final nh B;
    public final long C;
    public final gh E;
    public lh K;
    public te L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci R;
    public long S;
    public boolean[] T;
    public boolean[] U;
    public boolean V;
    public long X;
    public int Z;

    /* renamed from: a0 */
    public boolean f5225a0;

    /* renamed from: b0 */
    public boolean f5226b0;

    /* renamed from: c0 */
    public final wi f5227c0;

    /* renamed from: w */
    public final Uri f5228w;

    /* renamed from: x */
    public final ui f5229x;

    /* renamed from: y */
    public final int f5230y;

    /* renamed from: z */
    public final Handler f5231z;
    public final dj D = new dj("Loader:ExtractorMediaPeriod");
    public final hj F = new hj();
    public final Runnable G = new bh(this);
    public final Runnable H = new ch(this);
    public final Handler I = new Handler();
    public long Y = C.TIME_UNSET;
    public final SparseArray<wh> J = new SparseArray<>();
    public long W = -1;

    public ih(Uri uri, ui uiVar, me[] meVarArr, int i10, Handler handler, jh jhVar, nh nhVar, wi wiVar, String str, int i11, byte[] bArr) {
        this.f5228w = uri;
        this.f5229x = uiVar;
        this.f5230y = i10;
        this.f5231z = handler;
        this.A = jhVar;
        this.B = nhVar;
        this.f5227c0 = wiVar;
        this.C = i11;
        this.E = new gh(meVarArr, this);
    }

    public static /* synthetic */ void H(ih ihVar) {
        if (ihVar.f5226b0 || ihVar.N || ihVar.L == null || !ihVar.M) {
            return;
        }
        int size = ihVar.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ihVar.J.valueAt(i10).i() == null) {
                return;
            }
        }
        ihVar.F.b();
        bi[] biVarArr = new bi[size];
        ihVar.U = new boolean[size];
        ihVar.T = new boolean[size];
        ihVar.S = ihVar.L.zzb();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 < size) {
                oc i12 = ihVar.J.valueAt(i11).i();
                biVarArr[i11] = new bi(i12);
                String str = i12.B;
                if (!kj.b(str) && !kj.a(str)) {
                    z10 = false;
                }
                ihVar.U[i11] = z10;
                ihVar.V = z10 | ihVar.V;
                i11++;
            } else {
                ihVar.R = new ci(biVarArr);
                ihVar.N = true;
                ihVar.B.a(new ai(ihVar.S, ihVar.L.zza()), null);
                ihVar.K.c(ihVar);
                return;
            }
        }
    }

    public final void C() {
        this.D.h(new dh(this, this.E));
        this.I.removeCallbacksAndMessages(null);
        this.f5226b0 = true;
    }

    public final boolean D(int i10) {
        return this.f5225a0 || (!u() && this.J.valueAt(i10).h());
    }

    public final void E() throws IOException {
        this.D.i(Integer.MIN_VALUE);
    }

    public final int F(int i10, pc pcVar, ee eeVar, boolean z10) {
        if (this.P || u()) {
            return -3;
        }
        return this.J.valueAt(i10).m(pcVar, eeVar, z10, this.f5225a0, this.X);
    }

    public final void G(int i10, long j10) {
        wh valueAt = this.J.valueAt(i10);
        if (this.f5225a0 && j10 > valueAt.j()) {
            valueAt.k();
        } else {
            valueAt.l(j10, true);
        }
    }

    @Override // ai.aj
    public final /* bridge */ /* synthetic */ int a(cj cjVar, long j10, long j11, IOException iOException) {
        te teVar;
        fh fhVar = (fh) cjVar;
        q(fhVar);
        Handler handler = this.f5231z;
        if (handler != null) {
            handler.post(new eh(this, iOException));
        }
        if (iOException instanceof zzath) {
            return 3;
        }
        int s10 = s();
        int i10 = this.Z;
        if (this.W == -1 && ((teVar = this.L) == null || teVar.zzb() == C.TIME_UNSET)) {
            this.X = 0L;
            this.P = this.N;
            int size = this.J.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.J.valueAt(i11).e(!this.N || this.T[i11]);
            }
            fhVar.e(0L, 0L);
        }
        this.Z = s();
        return s10 <= i10 ? 0 : 1;
    }

    @Override // ai.ne
    public final ve b(int i10, int i11) {
        wh whVar = this.J.get(i10);
        if (whVar == null) {
            wh whVar2 = new wh(this.f5227c0, null);
            whVar2.n(this);
            this.J.put(i10, whVar2);
            return whVar2;
        }
        return whVar;
    }

    @Override // ai.aj
    public final /* bridge */ /* synthetic */ void c(cj cjVar, long j10, long j11, boolean z10) {
        q((fh) cjVar);
        if (z10 || this.Q <= 0) {
            return;
        }
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.valueAt(i10).e(this.T[i10]);
        }
        this.K.b(this);
    }

    @Override // ai.mh, ai.zh
    public final boolean d(long j10) {
        if (this.f5225a0) {
            return false;
        }
        if (this.N && this.Q == 0) {
            return false;
        }
        boolean a10 = this.F.a();
        if (this.D.f()) {
            return a10;
        }
        r();
        return true;
    }

    @Override // ai.mh
    public final void e(lh lhVar, long j10) {
        this.K = lhVar;
        this.F.a();
        r();
    }

    @Override // ai.vh
    public final void f(oc ocVar) {
        this.I.post(this.G);
    }

    @Override // ai.ne
    public final void g(te teVar) {
        this.L = teVar;
        this.I.post(this.G);
    }

    @Override // ai.mh
    public final long h(fi[] fiVarArr, boolean[] zArr, xh[] xhVarArr, boolean[] zArr2, long j10) {
        fi fiVar;
        int i10;
        fj.d(this.N);
        for (int i11 = 0; i11 < fiVarArr.length; i11++) {
            xh xhVar = xhVarArr[i11];
            if (xhVar != null && (fiVarArr[i11] == null || !zArr[i11])) {
                i10 = ((hh) xhVar).f4844a;
                fj.d(this.T[i10]);
                this.Q--;
                this.T[i10] = false;
                this.J.valueAt(i10).g();
                xhVarArr[i11] = null;
            }
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < fiVarArr.length; i12++) {
            if (xhVarArr[i12] == null && (fiVar = fiVarArr[i12]) != null) {
                fiVar.b();
                fj.d(fiVar.d(0) == 0);
                int b10 = this.R.b(fiVar.a());
                fj.d(!this.T[b10]);
                this.Q++;
                this.T[b10] = true;
                xhVarArr[i12] = new hh(this, b10);
                zArr2[i12] = true;
                z10 = true;
            }
        }
        if (!this.O) {
            int size = this.J.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (!this.T[i13]) {
                    this.J.valueAt(i13).g();
                }
            }
        }
        if (this.Q == 0) {
            this.P = false;
            if (this.D.f()) {
                this.D.g();
            }
        } else if (!this.O ? j10 != 0 : z10) {
            j10 = j(j10);
            for (int i14 = 0; i14 < xhVarArr.length; i14++) {
                if (xhVarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.O = true;
        return j10;
    }

    @Override // ai.aj
    public final /* bridge */ /* synthetic */ void i(cj cjVar, long j10, long j11) {
        q((fh) cjVar);
        this.f5225a0 = true;
        if (this.S == C.TIME_UNSET) {
            long t10 = t();
            long j12 = t10 == Long.MIN_VALUE ? 0L : t10 + 10000;
            this.S = j12;
            this.B.a(new ai(j12, this.L.zza()), null);
        }
        this.K.b(this);
    }

    @Override // ai.mh
    public final long j(long j10) {
        if (true != this.L.zza()) {
            j10 = 0;
        }
        this.X = j10;
        int size = this.J.size();
        boolean u10 = true ^ u();
        int i10 = 0;
        while (true) {
            if (!u10) {
                this.Y = j10;
                this.f5225a0 = false;
                if (this.D.f()) {
                    this.D.g();
                } else {
                    for (int i11 = 0; i11 < size; i11++) {
                        this.J.valueAt(i11).e(this.T[i11]);
                    }
                }
            } else if (i10 >= size) {
                break;
            } else {
                if (this.T[i10]) {
                    u10 = this.J.valueAt(i10).l(j10, false);
                }
                i10++;
            }
        }
        this.P = false;
        return j10;
    }

    @Override // ai.mh
    public final void k() throws IOException {
        this.D.i(Integer.MIN_VALUE);
    }

    @Override // ai.mh
    public final long l() {
        long t10;
        if (this.f5225a0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.Y;
        }
        if (this.V) {
            int size = this.J.size();
            t10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                if (this.U[i10]) {
                    t10 = Math.min(t10, this.J.valueAt(i10).j());
                }
            }
        } else {
            t10 = t();
        }
        return t10 == Long.MIN_VALUE ? this.X : t10;
    }

    @Override // ai.ne
    public final void m() {
        this.M = true;
        this.I.post(this.G);
    }

    @Override // ai.mh
    public final ci n() {
        return this.R;
    }

    @Override // ai.mh
    public final void o(long j10) {
    }

    @Override // ai.mh
    public final long p() {
        if (this.P) {
            this.P = false;
            return this.X;
        }
        return C.TIME_UNSET;
    }

    public final void q(fh fhVar) {
        long j10;
        if (this.W == -1) {
            j10 = fhVar.f4034i;
            this.W = j10;
        }
    }

    public final void r() {
        te teVar;
        fh fhVar = new fh(this, this.f5228w, this.f5229x, this.E, this.F);
        if (this.N) {
            fj.d(u());
            long j10 = this.S;
            if (j10 != C.TIME_UNSET && this.Y >= j10) {
                this.f5225a0 = true;
                this.Y = C.TIME_UNSET;
                return;
            }
            fhVar.e(this.L.a(this.Y), this.Y);
            this.Y = C.TIME_UNSET;
        }
        this.Z = s();
        int i10 = this.f5230y;
        if (i10 == -1) {
            i10 = (this.N && this.W == -1 && ((teVar = this.L) == null || teVar.zzb() == C.TIME_UNSET)) ? 6 : 3;
        }
        this.D.e(fhVar, this, i10);
    }

    public final int s() {
        int size = this.J.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.J.valueAt(i11).f();
        }
        return i10;
    }

    public final long t() {
        int size = this.J.size();
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, this.J.valueAt(i10).j());
        }
        return j10;
    }

    public final boolean u() {
        return this.Y != C.TIME_UNSET;
    }

    @Override // ai.mh, ai.zh
    public final long zza() {
        if (this.Q == 0) {
            return Long.MIN_VALUE;
        }
        return l();
    }
}
