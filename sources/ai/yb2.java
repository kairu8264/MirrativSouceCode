package ai;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzfy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class yb2 extends p13 implements qa {
    public final Context X0;
    public final ej1 Y0;
    public final hq1 Z0;

    /* renamed from: a1 */
    public int f12519a1;

    /* renamed from: b1 */
    public boolean f12520b1;

    /* renamed from: c1 */
    public v4 f12521c1;

    /* renamed from: d1 */
    public long f12522d1;

    /* renamed from: e1 */
    public boolean f12523e1;

    /* renamed from: f1 */
    public boolean f12524f1;

    /* renamed from: g1 */
    public boolean f12525g1;

    /* renamed from: h1 */
    public t6 f12526h1;

    public yb2(Context context, ox2 ox2Var, f43 f43Var, boolean z10, Handler handler, fk1 fk1Var, hq1 hq1Var) {
        super(1, ox2Var, f43Var, false, 44100.0f);
        this.X0 = context.getApplicationContext();
        this.Z0 = hq1Var;
        this.Y0 = new ej1(handler, fk1Var);
        hq1Var.j(new w92(this, null));
    }

    @Override // ai.qa
    public final void A(e6 e6Var) {
        this.Z0.o(e6Var);
    }

    @Override // ai.p13
    public final void A0(String str, long j10, long j11) {
        this.Y0.b(str, j10, j11);
    }

    @Override // ai.p13
    public final void B0(String str) {
        this.Y0.f(str);
    }

    @Override // ai.p13
    public final void C0(Exception exc) {
        oa.b("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.Y0.j(exc);
    }

    @Override // ai.p13
    public final qo D0(w4 w4Var) throws zzaeg {
        qo D0 = super.D0(w4Var);
        this.Y0.c(w4Var.f11484a, D0);
        return D0;
    }

    @Override // ai.p13
    public final void E0(v4 v4Var, MediaFormat mediaFormat) throws zzaeg {
        int i10;
        int i11;
        v4 v4Var2 = this.f12521c1;
        int[] iArr = null;
        if (v4Var2 != null) {
            v4Var = v4Var2;
        } else if (k0() != null) {
            if (MimeTypes.AUDIO_RAW.equals(v4Var.f10960l)) {
                i10 = v4Var.A;
            } else if (sb.f9778a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = sb.o(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = MimeTypes.AUDIO_RAW.equals(v4Var.f10960l) ? v4Var.A : 2;
            }
            t4 t4Var = new t4();
            t4Var.n(MimeTypes.AUDIO_RAW);
            t4Var.D(i10);
            t4Var.E(v4Var.B);
            t4Var.F(v4Var.C);
            t4Var.B(mediaFormat.getInteger("channel-count"));
            t4Var.C(mediaFormat.getInteger("sample-rate"));
            v4 I = t4Var.I();
            if (this.f12520b1 && I.f10973y == 6 && (i11 = v4Var.f10973y) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < v4Var.f10973y; i12++) {
                    iArr[i12] = i12;
                }
            }
            v4Var = I;
        }
        try {
            this.Z0.c(v4Var, 0, iArr);
        } catch (zzdr e10) {
            throw g(e10, e10.f27270w, false, 5001);
        }
    }

    @Override // ai.p13, ai.u6
    public final boolean J() {
        return super.J() && this.Z0.g();
    }

    public final int J0(pz2 pz2Var, v4 v4Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(pz2Var.f8747a) || (i10 = sb.f9778a) >= 24 || (i10 == 23 && sb.z(this.X0))) {
            return v4Var.f10961m;
        }
        return -1;
    }

    public final void K0() {
        long b10 = this.Z0.b(J());
        if (b10 != Long.MIN_VALUE) {
            if (!this.f12524f1) {
                b10 = Math.max(this.f12522d1, b10);
            }
            this.f12522d1 = b10;
            this.f12524f1 = false;
        }
    }

    public final void M0() {
        this.f12524f1 = true;
    }

    @Override // ai.p13, ai.u6
    public final boolean N() {
        return this.Z0.i() || super.N();
    }

    @Override // ai.w2, ai.q6
    public final void a(int i10, Object obj) throws zzaeg {
        if (i10 == 2) {
            this.Z0.p(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.Z0.s((lc3) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.Z0.n(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.Z0.l0(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f12526h1 = (t6) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.Z0.t((vo3) obj);
        }
    }

    @Override // ai.u6, ai.v6
    public final String b() {
        return "MediaCodecAudioRenderer";
    }

    @Override // ai.w2, ai.u6
    public final qa h() {
        return this;
    }

    @Override // ai.p13, ai.w2
    public final void l(boolean z10, boolean z11) throws zzaeg {
        super.l(z10, z11);
        this.Y0.a(this.P0);
        f();
    }

    @Override // ai.p13, ai.w2
    public final void m(long j10, boolean z10) throws zzaeg {
        super.m(j10, z10);
        this.Z0.m();
        this.f12522d1 = j10;
        this.f12523e1 = true;
        this.f12524f1 = true;
    }

    @Override // ai.w2
    public final void n() {
        this.Z0.a();
    }

    @Override // ai.w2
    public final void o() {
        K0();
        this.Z0.q();
    }

    @Override // ai.p13, ai.w2
    public final void p() {
        this.f12525g1 = true;
        try {
            this.Z0.m();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.p();
                throw th2;
            } finally {
            }
        }
    }

    @Override // ai.p13, ai.w2
    public final void q() {
        try {
            super.q();
            if (this.f12525g1) {
                this.f12525g1 = false;
                this.Z0.r();
            }
        } catch (Throwable th2) {
            if (this.f12525g1) {
                this.f12525g1 = false;
                this.Z0.r();
            }
            throw th2;
        }
    }

    @Override // ai.p13
    public final void s(a4 a4Var) {
        if (!this.f12523e1 || a4Var.b()) {
            return;
        }
        if (Math.abs(a4Var.f1725e - this.f12522d1) > 500000) {
            this.f12522d1 = a4Var.f1725e;
        }
        this.f12523e1 = false;
    }

    @Override // ai.p13
    public final void t() {
        this.Z0.f();
    }

    @Override // ai.p13
    public final void u() throws zzaeg {
        try {
            this.Z0.h();
        } catch (zzdv e10) {
            throw g(e10, e10.f27274x, e10.f27273w, 5002);
        }
    }

    @Override // ai.p13
    public final int u0(f43 f43Var, v4 v4Var) throws zzfy {
        if (ua.a(v4Var.f10960l)) {
            int i10 = sb.f9778a >= 21 ? 32 : 0;
            int i11 = v4Var.E;
            boolean j02 = p13.j0(v4Var);
            if (j02 && this.Z0.d(v4Var) && (i11 == 0 || qg3.a() != null)) {
                return i10 | 12;
            }
            if ((!MimeTypes.AUDIO_RAW.equals(v4Var.f10960l) || this.Z0.d(v4Var)) && this.Z0.d(sb.n(2, v4Var.f10973y, v4Var.f10974z))) {
                List<pz2> v02 = v0(f43Var, v4Var, false);
                if (v02.isEmpty()) {
                    return 1;
                }
                if (j02) {
                    pz2 pz2Var = v02.get(0);
                    boolean c10 = pz2Var.c(v4Var);
                    int i12 = 8;
                    if (c10 && pz2Var.d(v4Var)) {
                        i12 = 16;
                    }
                    return (true != c10 ? 3 : 4) | i12 | i10;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override // ai.p13
    public final boolean v(long j10, long j11, oj3 oj3Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v4 v4Var) throws zzaeg {
        Objects.requireNonNull(byteBuffer);
        if (this.f12521c1 != null && (i11 & 2) != 0) {
            Objects.requireNonNull(oj3Var);
            oj3Var.h(i10, false);
            return true;
        } else if (z10) {
            if (oj3Var != null) {
                oj3Var.h(i10, false);
            }
            this.P0.f7860f += i12;
            this.Z0.f();
            return true;
        } else {
            try {
                if (this.Z0.l(byteBuffer, j12, i12)) {
                    if (oj3Var != null) {
                        oj3Var.h(i10, false);
                    }
                    this.P0.f7859e += i12;
                    return true;
                }
                return false;
            } catch (zzds e10) {
                throw g(e10, e10.f27272x, false, 5001);
            } catch (zzdv e11) {
                throw g(e11, v4Var, e11.f27273w, 5002);
            }
        }
    }

    @Override // ai.p13
    public final List<pz2> v0(f43 f43Var, v4 v4Var, boolean z10) throws zzfy {
        pz2 a10;
        String str = v4Var.f10960l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.Z0.d(v4Var) && (a10 = qg3.a()) != null) {
            return Collections.singletonList(a10);
        }
        List<pz2> d10 = qg3.d(qg3.c(str, false, false), v4Var);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(d10);
            arrayList.addAll(qg3.c(MimeTypes.AUDIO_E_AC3, false, false));
            d10 = arrayList;
        }
        return Collections.unmodifiableList(d10);
    }

    @Override // ai.p13
    public final boolean w0(v4 v4Var) {
        return this.Z0.d(v4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008b  */
    @Override // ai.p13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.nw2 x0(ai.pz2 r8, ai.v4 r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.yb2.x0(ai.pz2, ai.v4, android.media.MediaCrypto, float):ai.nw2");
    }

    @Override // ai.qa
    public final e6 y() {
        return this.Z0.k();
    }

    @Override // ai.p13
    public final qo y0(pz2 pz2Var, v4 v4Var, v4 v4Var2) {
        int i10;
        int i11;
        qo e10 = pz2Var.e(v4Var, v4Var2);
        int i12 = e10.f9023e;
        if (J0(pz2Var, v4Var2) > this.f12519a1) {
            i12 |= 64;
        }
        String str = pz2Var.f8747a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = e10.f9022d;
        }
        return new qo(str, v4Var, v4Var2, i11, i10);
    }

    @Override // ai.qa
    public final long z() {
        if (Z() == 2) {
            K0();
        }
        return this.f12522d1;
    }

    @Override // ai.p13
    public final float z0(float f10, v4 v4Var, v4[] v4VarArr) {
        int i10 = -1;
        for (v4 v4Var2 : v4VarArr) {
            int i11 = v4Var2.f10974z;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }
}
