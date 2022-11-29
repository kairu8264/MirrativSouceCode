package ai;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzaon;
import com.google.android.gms.internal.ads.zzaoo;
import com.google.android.gms.internal.ads.zzaos;
import com.google.android.gms.internal.ads.zzarm;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes3.dex */
public final class ud extends gg implements jj {
    public final id Q;
    public final qd R;
    public boolean S;
    public int T;
    public int U;
    public long V;
    public boolean W;

    public ud(ig igVar, je jeVar, boolean z10, Handler handler, jd jdVar) {
        super(1, igVar, null, true);
        this.R = new qd(null, new bd[0], new sd(this, null));
        this.Q = new id(handler, jdVar);
    }

    @Override // ai.gg
    public final int B(ig igVar, oc ocVar) throws zzarm {
        int i10;
        int i11;
        String str = ocVar.B;
        if (kj.a(str)) {
            int i12 = vj.f11100a;
            int i13 = i12 >= 21 ? 16 : 0;
            fg a10 = og.a(str, false);
            if (a10 == null) {
                return 1;
            }
            int i14 = 2;
            if (i12 < 21 || (((i10 = ocVar.O) == -1 || a10.f(i10)) && ((i11 = ocVar.N) == -1 || a10.g(i11)))) {
                i14 = 3;
            }
            return i13 | 4 | i14;
        }
        return 0;
    }

    @Override // ai.gg
    public final fg C(ig igVar, oc ocVar, boolean z10) throws zzarm {
        return super.C(igVar, ocVar, false);
    }

    @Override // ai.gg, ai.rc
    public final boolean D() {
        return super.D() && this.R.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // ai.gg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(ai.fg r4, android.media.MediaCodec r5, ai.oc r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f4011a
            int r7 = ai.vj.f11100a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = ai.vj.f11102c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = ai.vj.f11101b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = r1
        L38:
            r3.S = r0
            android.media.MediaFormat r4 = r6.l()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ud.E(ai.fg, android.media.MediaCodec, ai.oc, android.media.MediaCrypto):void");
    }

    @Override // ai.gg
    public final void G(String str, long j10, long j11) {
        this.Q.c(str, j10, j11);
    }

    @Override // ai.gg
    public final void H(oc ocVar) throws zzamy {
        super.H(ocVar);
        this.Q.d(ocVar);
        this.T = MimeTypes.AUDIO_RAW.equals(ocVar.B) ? ocVar.P : 2;
        this.U = ocVar.N;
    }

    @Override // ai.gg
    public final void I(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzamy {
        int i10;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.S && integer == 6) {
            int i11 = this.U;
            if (i11 < 6) {
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < this.U; i12++) {
                    iArr2[i12] = i12;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i10 = 6;
        } else {
            i10 = integer;
            iArr = null;
        }
        try {
            this.R.c(MimeTypes.AUDIO_RAW, i10, integer2, this.T, 0, iArr);
        } catch (zzaon e10) {
            throw zzamy.a(e10, y());
        }
    }

    @Override // ai.gg
    public final boolean J(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws zzamy {
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.O.f3224e++;
            this.R.e();
            return true;
        }
        try {
            if (this.R.f(byteBuffer, j12)) {
                mediaCodec.releaseOutputBuffer(i10, false);
                this.O.f3223d++;
                return true;
            }
            return false;
        } catch (zzaoo | zzaos e10) {
            throw zzamy.a(e10, y());
        }
    }

    @Override // ai.gg
    public final void K() throws zzamy {
        try {
            this.R.g();
        } catch (zzaos e10) {
            throw zzamy.a(e10, y());
        }
    }

    @Override // ai.gg, ai.rc
    public final boolean M() {
        return this.R.i() || super.M();
    }

    @Override // ai.cc
    public final void a(int i10, Object obj) throws zzamy {
        if (i10 != 2) {
            return;
        }
        this.R.l(((Float) obj).floatValue());
    }

    @Override // ai.yb, ai.rc
    public final jj d() {
        return this;
    }

    @Override // ai.jj
    public final qc i0() {
        return this.R.k();
    }

    @Override // ai.jj
    public final qc j0(qc qcVar) {
        return this.R.j(qcVar);
    }

    @Override // ai.jj
    public final long q() {
        long b10 = this.R.b(D());
        if (b10 != Long.MIN_VALUE) {
            if (!this.W) {
                b10 = Math.max(this.V, b10);
            }
            this.V = b10;
            this.W = false;
        }
        return this.V;
    }

    @Override // ai.gg, ai.yb
    public final void r(boolean z10) throws zzamy {
        super.r(z10);
        this.Q.b(this.O);
        int i10 = x().f10232a;
    }

    @Override // ai.gg, ai.yb
    public final void t(long j10, boolean z10) throws zzamy {
        super.t(j10, z10);
        this.R.n();
        this.V = j10;
        this.W = true;
    }

    @Override // ai.yb
    public final void u() {
        this.R.d();
    }

    @Override // ai.yb
    public final void v() {
        this.R.m();
    }

    @Override // ai.gg, ai.yb
    public final void w() {
        try {
            this.R.o();
            try {
                super.w();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.w();
                throw th2;
            } finally {
            }
        }
    }
}
