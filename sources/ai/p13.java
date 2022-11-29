package ai;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzfn;
import com.google.android.gms.internal.ads.zzfp;
import com.google.android.gms.internal.ads.zzfy;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class p13 extends w2 {
    public static final byte[] W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public int G0;
    public final ox2 H;
    public boolean H0;
    public final f43 I;
    public boolean I0;
    public final float J;
    public boolean J0;
    public final a4 K;
    public long K0;
    public final a4 L;
    public long L0;
    public final a4 M;
    public boolean M0;
    public final nu2 N;
    public boolean N0;
    public final ob<v4> O;
    public boolean O0;
    public final ArrayList<Long> P;
    public on P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final long[] R;
    public long R0;
    public final long[] S;
    public int S0;
    public final long[] T;
    public oj3 T0;
    public v4 U;
    public lr2 U0;
    public v4 V;
    public lr2 V0;
    public MediaCrypto W;
    public boolean X;
    public long Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f8224a0;

    /* renamed from: b0  reason: collision with root package name */
    public v4 f8225b0;

    /* renamed from: c0  reason: collision with root package name */
    public MediaFormat f8226c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f8227d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f8228e0;

    /* renamed from: f0  reason: collision with root package name */
    public ArrayDeque<pz2> f8229f0;

    /* renamed from: g0  reason: collision with root package name */
    public zzfp f8230g0;

    /* renamed from: h0  reason: collision with root package name */
    public pz2 f8231h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8232i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f8233j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8234k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8235l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8236m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f8237n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8238o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f8239p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f8240q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f8241r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f8242s0;

    /* renamed from: t0  reason: collision with root package name */
    public nv2 f8243t0;

    /* renamed from: u0  reason: collision with root package name */
    public long f8244u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f8245v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f8246w0;

    /* renamed from: x0  reason: collision with root package name */
    public ByteBuffer f8247x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f8248y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f8249z0;

    public p13(int i10, ox2 ox2Var, f43 f43Var, boolean z10, float f10) {
        super(i10);
        this.H = ox2Var;
        Objects.requireNonNull(f43Var);
        this.I = f43Var;
        this.J = f10;
        this.K = new a4(0, 0);
        this.L = new a4(0, 0);
        this.M = new a4(2, 0);
        nu2 nu2Var = new nu2();
        this.N = nu2Var;
        this.O = new ob<>(10);
        this.P = new ArrayList<>();
        this.Q = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.f8224a0 = 1.0f;
        this.Y = C.TIME_UNSET;
        this.R = new long[10];
        this.S = new long[10];
        this.T = new long[10];
        this.Q0 = C.TIME_UNSET;
        this.R0 = C.TIME_UNSET;
        nu2Var.i(0);
        nu2Var.f1723c.order(ByteOrder.nativeOrder());
        this.f8228e0 = -1.0f;
        this.f8232i0 = 0;
        this.E0 = 0;
        this.f8245v0 = -1;
        this.f8246w0 = -1;
        this.f8244u0 = C.TIME_UNSET;
        this.K0 = C.TIME_UNSET;
        this.L0 = C.TIME_UNSET;
        this.F0 = 0;
        this.G0 = 0;
    }

    public static boolean j0(v4 v4Var) {
        return v4Var.E == 0;
    }

    private final void l0() {
        this.C0 = false;
        this.N.a();
        this.M.a();
        this.B0 = false;
        this.A0 = false;
    }

    private final void t0() {
        try {
            this.T0.j();
        } finally {
            F();
        }
    }

    public abstract void A0(String str, long j10, long j11);

    public final pz2 B() {
        return this.f8231h0;
    }

    public abstract void B0(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [ai.lr2, ai.oj3, android.media.MediaCrypto] */
    public final void C() {
        try {
            oj3 oj3Var = this.T0;
            if (oj3Var != null) {
                oj3Var.k();
                this.P0.f7856b++;
                B0(this.f8231h0.f8747a);
            }
        } finally {
            this.T0 = null;
            this.W = null;
            this.U0 = null;
            G();
        }
    }

    public abstract void C0(Exception exc);

    public final boolean D() throws zzaeg {
        boolean E = E();
        if (E) {
            w();
        }
        return E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (n0() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (n0() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
        if (n0() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ai.qo D0(ai.w4 r13) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p13.D0(ai.w4):ai.qo");
    }

    public final boolean E() {
        if (this.T0 == null) {
            return false;
        }
        if (this.G0 != 3 && !this.f8234k0 && ((!this.f8235l0 || this.J0) && (!this.f8236m0 || !this.I0))) {
            t0();
            return false;
        }
        C();
        return true;
    }

    public abstract void E0(v4 v4Var, MediaFormat mediaFormat) throws zzaeg;

    public void F() {
        r();
        r0();
        this.f8244u0 = C.TIME_UNSET;
        this.I0 = false;
        this.H0 = false;
        this.f8240q0 = false;
        this.f8241r0 = false;
        this.f8248y0 = false;
        this.f8249z0 = false;
        this.P.clear();
        this.K0 = C.TIME_UNSET;
        this.L0 = C.TIME_UNSET;
        nv2 nv2Var = this.f8243t0;
        if (nv2Var != null) {
            nv2Var.a();
        }
        this.F0 = 0;
        this.G0 = 0;
        this.E0 = this.D0 ? 1 : 0;
    }

    public final boolean F0(int i10) throws zzaeg {
        w4 d10 = d();
        this.K.a();
        int i11 = i(d10, this.K, i10 | 4);
        if (i11 == -5) {
            D0(d10);
            return true;
        } else if (i11 == -4 && this.K.c()) {
            this.M0 = true;
            p0();
            return false;
        } else {
            return false;
        }
    }

    public final void G() {
        F();
        this.f8243t0 = null;
        this.f8229f0 = null;
        this.f8231h0 = null;
        this.f8225b0 = null;
        this.f8226c0 = null;
        this.f8227d0 = false;
        this.J0 = false;
        this.f8228e0 = -1.0f;
        this.f8232i0 = 0;
        this.f8233j0 = false;
        this.f8234k0 = false;
        this.f8235l0 = false;
        this.f8236m0 = false;
        this.f8237n0 = false;
        this.f8238o0 = false;
        this.f8239p0 = false;
        this.f8242s0 = false;
        this.D0 = false;
        this.E0 = 0;
        this.X = false;
    }

    public final boolean G0(long j10) {
        return this.Y == C.TIME_UNSET || SystemClock.elapsedRealtime() - j10 < this.Y;
    }

    public zzfn H(Throwable th2, pz2 pz2Var) {
        return new zzfn(th2, pz2Var);
    }

    public final boolean H0() {
        return this.f8246w0 >= 0;
    }

    @Override // ai.w2, ai.v6
    public final int I() {
        return 8;
    }

    @Override // ai.u6
    public boolean J() {
        return this.N0;
    }

    @Override // ai.v6
    public final int K(v4 v4Var) throws zzaeg {
        try {
            return u0(this.I, v4Var);
        } catch (zzfy e10) {
            throw g(e10, v4Var, false, 4002);
        }
    }

    public void M(a4 a4Var) throws zzaeg {
    }

    @Override // ai.u6
    public boolean N() {
        if (this.U != null) {
            if (k() || H0()) {
                return true;
            }
            if (this.f8244u0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.f8244u0) {
                return true;
            }
        }
        return false;
    }

    public void Q(long j10) {
        while (true) {
            int i10 = this.S0;
            if (i10 == 0 || j10 < this.T[0]) {
                return;
            }
            long[] jArr = this.R;
            this.Q0 = jArr[0];
            this.R0 = this.S[0];
            int i11 = i10 - 1;
            this.S0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.S;
            System.arraycopy(jArr2, 1, jArr2, 0, this.S0);
            long[] jArr3 = this.T;
            System.arraycopy(jArr3, 1, jArr3, 0, this.S0);
            t();
        }
    }

    public final float R() {
        return this.Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0278, code lost:
        if (r15.V != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        r15.N0 = true;
        r13 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321 A[LOOP:2: B:80:0x0148->B:189:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0333 A[Catch: IllegalStateException -> 0x0365, TryCatch #10 {IllegalStateException -> 0x0365, blocks: (B:186:0x031a, B:191:0x032d, B:193:0x0333, B:195:0x0339, B:182:0x0302, B:184:0x0314, B:202:0x034b), top: B:256:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x032a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v37 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    @Override // ai.u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(long r24, long r26) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p13.a0(long, long):void");
    }

    @Override // ai.w2
    public final void c(v4[] v4VarArr, long j10, long j11) throws zzaeg {
        if (this.R0 == C.TIME_UNSET) {
            u9.d(this.Q0 == C.TIME_UNSET);
            this.Q0 = j10;
            this.R0 = j11;
            return;
        }
        int i10 = this.S0;
        if (i10 == 10) {
            long j12 = this.S[9];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
            Log.w("MediaCodecRenderer", sb2.toString());
        } else {
            this.S0 = i10 + 1;
        }
        long[] jArr = this.R;
        int i11 = this.S0 - 1;
        jArr[i11] = j10;
        this.S[i11] = j11;
        this.T[i11] = this.K0;
    }

    @Override // ai.w2, ai.u6
    public void f0(float f10, float f11) throws zzaeg {
        this.Z = f10;
        this.f8224a0 = f11;
        m0(this.f8225b0);
    }

    public final long i0() {
        return this.R0;
    }

    public final oj3 k0() {
        return this.T0;
    }

    @Override // ai.w2
    public void l(boolean z10, boolean z11) throws zzaeg {
        this.P0 = new on();
    }

    @Override // ai.w2
    public void m(long j10, boolean z10) throws zzaeg {
        this.M0 = false;
        this.N0 = false;
        if (this.A0) {
            this.N.a();
            this.M.a();
            this.B0 = false;
        } else {
            D();
        }
        if (this.O.c() > 0) {
            this.O0 = true;
        }
        this.O.b();
        int i10 = this.S0;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.R0 = this.S[i11];
            this.Q0 = this.R[i11];
            this.S0 = 0;
        }
    }

    public final boolean m0(v4 v4Var) throws zzaeg {
        if (sb.f9778a >= 23 && this.T0 != null && this.G0 != 3 && Z() != 0) {
            float z02 = z0(this.f8224a0, v4Var, e());
            float f10 = this.f8228e0;
            if (f10 == z02) {
                return true;
            }
            if (z02 == -1.0f) {
                o0();
                return false;
            } else if (f10 == -1.0f && z02 <= this.J) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", z02);
                this.T0.m(bundle);
                this.f8228e0 = z02;
            }
        }
        return true;
    }

    @TargetApi(23)
    public final boolean n0() throws zzaeg {
        if (this.H0) {
            this.F0 = 1;
            if (this.f8234k0 || this.f8236m0) {
                this.G0 = 3;
                return false;
            }
            this.G0 = 2;
        } else {
            q0();
        }
        return true;
    }

    public final void o0() throws zzaeg {
        if (this.H0) {
            this.F0 = 1;
            this.G0 = 3;
            return;
        }
        C();
        w();
    }

    @Override // ai.w2
    public void p() {
        this.U = null;
        this.Q0 = C.TIME_UNSET;
        this.R0 = C.TIME_UNSET;
        this.S0 = 0;
        E();
    }

    @TargetApi(23)
    public final void p0() throws zzaeg {
        int i10 = this.G0;
        if (i10 == 1) {
            t0();
        } else if (i10 == 2) {
            t0();
            q0();
        } else if (i10 != 3) {
            this.N0 = true;
            u();
        } else {
            C();
            w();
        }
    }

    @Override // ai.w2
    public void q() {
        try {
            l0();
            C();
        } finally {
            this.V0 = null;
        }
    }

    public final void q0() throws zzaeg {
        try {
            throw null;
        } catch (MediaCryptoException e10) {
            throw g(e10, this.U, false, 6006);
        }
    }

    public final void r() {
        this.f8245v0 = -1;
        this.L.f1723c = null;
    }

    public final void r0() {
        this.f8246w0 = -1;
        this.f8247x0 = null;
    }

    public abstract void s(a4 a4Var) throws zzaeg;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final boolean s0() throws zzaeg {
        oj3 oj3Var = this.T0;
        boolean z10 = 0;
        if (oj3Var == null || this.F0 == 2 || this.M0) {
            return false;
        }
        if (this.f8245v0 < 0) {
            int a10 = oj3Var.a();
            this.f8245v0 = a10;
            if (a10 < 0) {
                return false;
            }
            this.L.f1723c = this.T0.d(a10);
            this.L.a();
        }
        if (this.F0 == 1) {
            if (!this.f8242s0) {
                this.I0 = true;
                this.T0.f(this.f8245v0, 0, 0, 0L, 4);
                r();
            }
            this.F0 = 2;
            return false;
        } else if (this.f8240q0) {
            this.f8240q0 = false;
            this.L.f1723c.put(W0);
            this.T0.f(this.f8245v0, 0, 38, 0L, 0);
            r();
            this.H0 = true;
            return true;
        } else {
            if (this.E0 == 1) {
                for (int i10 = 0; i10 < this.f8225b0.f10962n.size(); i10++) {
                    this.L.f1723c.put(this.f8225b0.f10962n.get(i10));
                }
                this.E0 = 2;
            }
            int position = this.L.f1723c.position();
            w4 d10 = d();
            try {
                int i11 = i(d10, this.L, 0);
                if (P()) {
                    this.L0 = this.K0;
                }
                if (i11 == -3) {
                    return false;
                }
                if (i11 == -5) {
                    if (this.E0 == 2) {
                        this.L.a();
                        this.E0 = 1;
                    }
                    D0(d10);
                    return true;
                } else if (this.L.c()) {
                    if (this.E0 == 2) {
                        this.L.a();
                        this.E0 = 1;
                    }
                    this.M0 = true;
                    if (!this.H0) {
                        p0();
                        return false;
                    }
                    try {
                        if (!this.f8242s0) {
                            this.I0 = true;
                            this.T0.f(this.f8245v0, 0, 0, 0L, 4);
                            r();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw g(e10, this.U, false, y2.e(e10.getErrorCode()));
                    }
                } else if (!this.H0 && !this.L.d()) {
                    this.L.a();
                    if (this.E0 == 2) {
                        this.E0 = 1;
                    }
                    return true;
                } else {
                    boolean j10 = this.L.j();
                    if (j10) {
                        this.L.f1722b.c(position);
                    }
                    if (this.f8233j0 && !j10) {
                        ByteBuffer byteBuffer = this.L.f1723c;
                        byte[] bArr = xa.f11894a;
                        int position2 = byteBuffer.position();
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int i14 = i12 + 1;
                            if (i14 < position2) {
                                int i15 = byteBuffer.get(i12) & TagConstant.TAG_CAT_RESERVED;
                                if (i13 == 3) {
                                    if (i15 == 1) {
                                        if ((byteBuffer.get(i14) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i12 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        i15 = 1;
                                    }
                                } else if (i15 == 0) {
                                    i13++;
                                }
                                if (i15 != 0) {
                                    i13 = 0;
                                }
                                i12 = i14;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (this.L.f1723c.position() == 0) {
                            return true;
                        }
                        this.f8233j0 = false;
                    }
                    a4 a4Var = this.L;
                    long j11 = a4Var.f1725e;
                    nv2 nv2Var = this.f8243t0;
                    if (nv2Var != null) {
                        j11 = nv2Var.b(this.U, a4Var);
                        this.K0 = Math.max(this.K0, this.f8243t0.c(this.U));
                    }
                    long j12 = j11;
                    if (this.L.b()) {
                        this.P.add(Long.valueOf(j12));
                    }
                    if (this.O0) {
                        this.O.a(j12, this.U);
                        this.O0 = false;
                    }
                    this.K0 = Math.max(this.K0, j12);
                    this.L.k();
                    if (this.L.e()) {
                        M(this.L);
                    }
                    s(this.L);
                    try {
                        if (j10) {
                            this.T0.g(this.f8245v0, 0, this.L.f1722b, j12, 0);
                        } else {
                            this.T0.f(this.f8245v0, 0, this.L.f1723c.limit(), j12, 0);
                        }
                        r();
                        this.H0 = true;
                        this.E0 = 0;
                        on onVar = this.P0;
                        z10 = onVar.f7857c + 1;
                        onVar.f7857c = z10;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw g(e11, this.U, z10, y2.e(e11.getErrorCode()));
                    }
                }
            } catch (zzae e12) {
                C0(e12);
                F0(0);
                t0();
                return true;
            }
        }
    }

    public abstract void t();

    public void u() throws zzaeg {
    }

    public abstract int u0(f43 f43Var, v4 v4Var) throws zzfy;

    public abstract boolean v(long j10, long j11, oj3 oj3Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v4 v4Var) throws zzaeg;

    public abstract List<pz2> v0(f43 f43Var, v4 v4Var, boolean z10) throws zzfy;

    /* JADX WARN: Code restructure failed: missing block: B:141:0x023c, code lost:
        if ("stvm8".equals(r6) == false) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0210 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021f A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022c A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0254 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0263 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b0 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c7 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d6 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0316 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0324 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0347 A[Catch: Exception -> 0x034b, TryCatch #3 {Exception -> 0x034b, blocks: (B:48:0x00b8, B:52:0x00d0, B:56:0x00d8, B:59:0x00e8, B:61:0x00f2, B:62:0x00fb, B:64:0x0100, B:66:0x010c, B:68:0x0117, B:69:0x0121, B:70:0x0140, B:73:0x0154, B:75:0x015a, B:77:0x0164, B:79:0x016c, B:81:0x0174, B:100:0x01b7, B:102:0x01bf, B:104:0x01c7, B:108:0x01d2, B:111:0x01dc, B:113:0x01e4, B:116:0x01ee, B:118:0x01f8, B:120:0x0200, B:125:0x020a, B:127:0x0210, B:131:0x021b, B:133:0x021f, B:148:0x0250, B:150:0x0254, B:154:0x025f, B:156:0x0263, B:158:0x026b, B:160:0x0275, B:162:0x027f, B:164:0x0287, B:166:0x028f, B:168:0x0297, B:170:0x029f, B:174:0x02aa, B:176:0x02b0, B:178:0x02b4, B:182:0x02bf, B:184:0x02c7, B:205:0x030a, B:207:0x0316, B:208:0x031d, B:210:0x0324, B:211:0x032d, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02fa, B:201:0x0304, B:138:0x022c, B:140:0x0236, B:142:0x023e, B:144:0x0246, B:86:0x0182, B:88:0x018a, B:90:0x0192, B:92:0x019c, B:94:0x01a4, B:96:0x01ac, B:221:0x0347, B:222:0x034a, B:67:0x0111, B:60:0x00ed, B:51:0x00c4), top: B:244:0x00b8, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [ai.qi3, android.view.Surface, android.media.MediaCrypto] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p13.w():void");
    }

    public boolean w0(v4 v4Var) {
        return false;
    }

    public boolean x(pz2 pz2Var) {
        return true;
    }

    public abstract nw2 x0(pz2 pz2Var, v4 v4Var, MediaCrypto mediaCrypto, float f10);

    public abstract qo y0(pz2 pz2Var, v4 v4Var, v4 v4Var2);

    public abstract float z0(float f10, v4 v4Var, v4[] v4VarArr);
}
