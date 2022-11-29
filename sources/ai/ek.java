package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzarm;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes3.dex */
public final class ek extends gg {
    public final Context Q;
    public final gk R;
    public final ok S;
    public final boolean T;
    public final long[] U;
    public oc[] V;
    public dk W;
    public Surface X;
    public Surface Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f3688a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f3689b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f3690c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3691d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f3692e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f3693f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f3694g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f3695h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3696i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f3697j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3698k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3699l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3700m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f3701n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f3702o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f3703p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(Context context, ig igVar, long j10, Handler handler, pk pkVar, int i10) {
        super(2, igVar, null, false);
        boolean z10 = false;
        this.Q = context.getApplicationContext();
        this.R = new gk(context);
        this.S = new ok(handler, pkVar);
        if (vj.f11100a <= 22 && "foster".equals(vj.f11101b) && "NVIDIA".equals(vj.f11102c)) {
            z10 = true;
        }
        this.T = z10;
        this.U = new long[10];
        this.f3702o0 = C.TIME_UNSET;
        this.f3688a0 = C.TIME_UNSET;
        this.f3694g0 = -1;
        this.f3695h0 = -1;
        this.f3697j0 = -1.0f;
        this.f3693f0 = -1.0f;
        c0();
    }

    public static boolean g0(long j10) {
        return j10 < -30000;
    }

    public static int h0(oc ocVar) {
        int i10 = ocVar.I;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // ai.gg
    public final int B(ig igVar, oc ocVar) throws zzarm {
        boolean z10;
        int i10;
        int i11;
        String str = ocVar.B;
        if (kj.b(str)) {
            ie ieVar = ocVar.E;
            if (ieVar != null) {
                z10 = false;
                for (int i12 = 0; i12 < ieVar.f5200y; i12++) {
                    z10 |= ieVar.a(i12).A;
                }
            } else {
                z10 = false;
            }
            fg a10 = og.a(str, z10);
            if (a10 == null) {
                return 1;
            }
            boolean d10 = a10.d(ocVar.f7713y);
            if (d10 && (i10 = ocVar.F) > 0 && (i11 = ocVar.G) > 0) {
                if (vj.f11100a >= 21) {
                    d10 = a10.e(i10, i11, ocVar.H);
                } else {
                    d10 = i10 * i11 <= og.c();
                    if (!d10) {
                        int i13 = ocVar.F;
                        int i14 = ocVar.G;
                        String str2 = vj.f11104e;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb2.append("FalseCheck [legacyFrameSize, ");
                        sb2.append(i13);
                        sb2.append("x");
                        sb2.append(i14);
                        sb2.append("] [");
                        sb2.append(str2);
                        sb2.append("]");
                        Log.d("MediaCodecVideoRenderer", sb2.toString());
                    }
                }
            }
            return (true != d10 ? 2 : 3) | (true != a10.f4012b ? 4 : 8) | (true == a10.f4013c ? 16 : 0);
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ai.gg
    public final void E(fg fgVar, MediaCodec mediaCodec, oc ocVar, MediaCrypto mediaCrypto) throws zzarm {
        boolean z10;
        int i10;
        oc[] ocVarArr = this.V;
        int i11 = ocVar.F;
        int i12 = ocVar.G;
        int i13 = ocVar.C;
        if (i13 == -1) {
            String str = ocVar.B;
            if (i11 != -1 && i12 != -1) {
                int i14 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals(MimeTypes.VIDEO_H263)) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        break;
                    case -1662541442:
                        if (str.equals(MimeTypes.VIDEO_H265)) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    case 1187890754:
                        if (str.equals(MimeTypes.VIDEO_MP4V)) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    case 1331836730:
                        if (str.equals(MimeTypes.VIDEO_H264)) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    case 1599127256:
                        if (str.equals(MimeTypes.VIDEO_VP8)) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    case 1599127257:
                        if (str.equals(MimeTypes.VIDEO_VP9)) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    default:
                        z10 = true;
                        break;
                }
                if (z10 && !z10) {
                    if (!z10) {
                        if (!z10) {
                            if (z10 || z10) {
                                i10 = i11 * i12;
                                i13 = (i10 * 3) / (i14 + i14);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(vj.f11103d)) {
                        i10 = vj.e(i11, 16) * vj.e(i12, 16) * 256;
                        i14 = 2;
                        i13 = (i10 * 3) / (i14 + i14);
                    }
                }
                i10 = i11 * i12;
                i14 = 2;
                i13 = (i10 * 3) / (i14 + i14);
            }
            i13 = -1;
        }
        int length = ocVarArr.length;
        dk dkVar = new dk(i11, i12, i13);
        this.W = dkVar;
        boolean z11 = this.T;
        MediaFormat l10 = ocVar.l();
        l10.setInteger("max-width", dkVar.f3319a);
        l10.setInteger("max-height", dkVar.f3320b);
        int i15 = dkVar.f3321c;
        if (i15 != -1) {
            l10.setInteger("max-input-size", i15);
        }
        if (z11) {
            l10.setInteger("auto-frc", 0);
        }
        if (this.X == null) {
            fj.d(b0(fgVar.f4014d));
            if (this.Y == null) {
                this.Y = bk.b(this.Q, fgVar.f4014d);
            }
            this.X = this.Y;
        }
        mediaCodec.configure(l10, this.X, (MediaCrypto) null, 0);
        int i16 = vj.f11100a;
    }

    @Override // ai.gg
    public final void G(String str, long j10, long j11) {
        this.S.c(str, j10, j11);
    }

    @Override // ai.gg
    public final void H(oc ocVar) throws zzamy {
        super.H(ocVar);
        this.S.d(ocVar);
        float f10 = ocVar.J;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f3693f0 = f10;
        this.f3692e0 = h0(ocVar);
    }

    @Override // ai.gg
    public final void I(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f3694g0 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f3695h0 = integer2;
        float f10 = this.f3693f0;
        this.f3697j0 = f10;
        if (vj.f11100a >= 21) {
            int i10 = this.f3692e0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f3694g0;
                this.f3694g0 = integer2;
                this.f3695h0 = i11;
                this.f3697j0 = 1.0f / f10;
            }
        } else {
            this.f3696i0 = this.f3692e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // ai.gg
    public final boolean J(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) {
        while (true) {
            int i12 = this.f3703p0;
            if (i12 == 0) {
                break;
            }
            long[] jArr = this.U;
            long j13 = jArr[0];
            if (j12 < j13) {
                break;
            }
            this.f3702o0 = j13;
            int i13 = i12 - 1;
            this.f3703p0 = i13;
            System.arraycopy(jArr, 1, jArr, 0, i13);
        }
        long j14 = j12 - this.f3702o0;
        if (z10) {
            X(mediaCodec, i10, j14);
            return true;
        }
        long j15 = j12 - j10;
        if (this.X == this.Y) {
            if (g0(j15)) {
                X(mediaCodec, i10, j14);
                return true;
            }
            return false;
        } else if (!this.Z) {
            if (vj.f11100a >= 21) {
                Z(mediaCodec, i10, j14, System.nanoTime());
            } else {
                Y(mediaCodec, i10, j14);
            }
            return true;
        } else if (c() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long c10 = this.R.c(j12, ((j15 - ((elapsedRealtime * 1000) - j11)) * 1000) + nanoTime);
            long j16 = (c10 - nanoTime) / 1000;
            if (g0(j16)) {
                tj.a("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i10, false);
                tj.b();
                de deVar = this.O;
                deVar.f3225f++;
                this.f3690c0++;
                int i14 = this.f3691d0 + 1;
                this.f3691d0 = i14;
                deVar.f3226g = Math.max(i14, deVar.f3226g);
                if (this.f3690c0 == -1) {
                    f0();
                }
                return true;
            }
            if (vj.f11100a >= 21) {
                if (j16 < 50000) {
                    Z(mediaCodec, i10, j14, c10);
                    return true;
                }
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                Y(mediaCodec, i10, j14);
                return true;
            }
            return false;
        }
    }

    @Override // ai.gg, ai.rc
    public final boolean M() {
        Surface surface;
        if (super.M() && (this.Z || (((surface = this.Y) != null && this.X == surface) || S() == null))) {
            this.f3688a0 = C.TIME_UNSET;
            return true;
        } else if (this.f3688a0 == C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f3688a0) {
                return true;
            }
            this.f3688a0 = C.TIME_UNSET;
            return false;
        }
    }

    @Override // ai.gg
    public final boolean R(fg fgVar) {
        return this.X != null || b0(fgVar.f4014d);
    }

    @Override // ai.gg
    public final void U() {
        try {
            super.U();
        } finally {
            Surface surface = this.Y;
            if (surface != null) {
                if (this.X == surface) {
                    this.X = null;
                }
                surface.release();
                this.Y = null;
            }
        }
    }

    @Override // ai.gg
    public final void V(ee eeVar) {
        int i10 = vj.f11100a;
    }

    @Override // ai.gg
    public final boolean W(MediaCodec mediaCodec, boolean z10, oc ocVar, oc ocVar2) {
        if (ocVar.B.equals(ocVar2.B) && h0(ocVar) == h0(ocVar2)) {
            if (z10 || (ocVar.F == ocVar2.F && ocVar.G == ocVar2.G)) {
                int i10 = ocVar2.F;
                dk dkVar = this.W;
                return i10 <= dkVar.f3319a && ocVar2.G <= dkVar.f3320b && ocVar2.C <= dkVar.f3321c;
            }
            return false;
        }
        return false;
    }

    public final void X(MediaCodec mediaCodec, int i10, long j10) {
        tj.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        tj.b();
        this.O.f3224e++;
    }

    public final void Y(MediaCodec mediaCodec, int i10, long j10) {
        d0();
        tj.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        tj.b();
        this.O.f3223d++;
        this.f3691d0 = 0;
        a0();
    }

    @TargetApi(21)
    public final void Z(MediaCodec mediaCodec, int i10, long j10, long j11) {
        d0();
        tj.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        tj.b();
        this.O.f3223d++;
        this.f3691d0 = 0;
        a0();
    }

    @Override // ai.cc
    public final void a(int i10, Object obj) throws zzamy {
        if (i10 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    fg T = T();
                    if (T != null && b0(T.f4014d)) {
                        surface = bk.b(this.Q, T.f4014d);
                        this.Y = surface;
                    }
                }
            }
            if (this.X != surface) {
                this.X = surface;
                int c10 = c();
                if (c10 == 1 || c10 == 2) {
                    MediaCodec S = S();
                    if (vj.f11100a >= 23 && S != null && surface != null) {
                        S.setOutputSurface(surface);
                    } else {
                        U();
                        L();
                    }
                }
                if (surface != null && surface != this.Y) {
                    e0();
                    this.Z = false;
                    int i11 = vj.f11100a;
                    if (c10 == 2) {
                        this.f3688a0 = C.TIME_UNSET;
                        return;
                    }
                    return;
                }
                c0();
                this.Z = false;
                int i12 = vj.f11100a;
            } else if (surface == null || surface == this.Y) {
            } else {
                e0();
                if (this.Z) {
                    this.S.g(this.X);
                }
            }
        }
    }

    public final void a0() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.S.g(this.X);
    }

    public final boolean b0(boolean z10) {
        return vj.f11100a >= 23 && (!z10 || bk.a(this.Q));
    }

    public final void c0() {
        this.f3698k0 = -1;
        this.f3699l0 = -1;
        this.f3701n0 = -1.0f;
        this.f3700m0 = -1;
    }

    public final void d0() {
        int i10 = this.f3698k0;
        int i11 = this.f3694g0;
        if (i10 == i11 && this.f3699l0 == this.f3695h0 && this.f3700m0 == this.f3696i0 && this.f3701n0 == this.f3697j0) {
            return;
        }
        this.S.f(i11, this.f3695h0, this.f3696i0, this.f3697j0);
        this.f3698k0 = this.f3694g0;
        this.f3699l0 = this.f3695h0;
        this.f3700m0 = this.f3696i0;
        this.f3701n0 = this.f3697j0;
    }

    public final void e0() {
        if (this.f3698k0 == -1 && this.f3699l0 == -1) {
            return;
        }
        this.S.f(this.f3694g0, this.f3695h0, this.f3696i0, this.f3697j0);
    }

    public final void f0() {
        if (this.f3690c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.S.e(this.f3690c0, elapsedRealtime - this.f3689b0);
            this.f3690c0 = 0;
            this.f3689b0 = elapsedRealtime;
        }
    }

    @Override // ai.gg, ai.yb
    public final void r(boolean z10) throws zzamy {
        super.r(z10);
        int i10 = x().f10232a;
        this.S.b(this.O);
        this.R.a();
    }

    @Override // ai.yb
    public final void s(oc[] ocVarArr, long j10) throws zzamy {
        this.V = ocVarArr;
        if (this.f3702o0 == C.TIME_UNSET) {
            this.f3702o0 = j10;
            return;
        }
        int i10 = this.f3703p0;
        if (i10 == 10) {
            long j11 = this.U[9];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j11);
            Log.w("MediaCodecVideoRenderer", sb2.toString());
        } else {
            this.f3703p0 = i10 + 1;
        }
        this.U[this.f3703p0 - 1] = j10;
    }

    @Override // ai.gg, ai.yb
    public final void t(long j10, boolean z10) throws zzamy {
        super.t(j10, z10);
        this.Z = false;
        int i10 = vj.f11100a;
        this.f3691d0 = 0;
        int i11 = this.f3703p0;
        if (i11 != 0) {
            this.f3702o0 = this.U[i11 - 1];
            this.f3703p0 = 0;
        }
        this.f3688a0 = C.TIME_UNSET;
    }

    @Override // ai.yb
    public final void u() {
        this.f3690c0 = 0;
        this.f3689b0 = SystemClock.elapsedRealtime();
        this.f3688a0 = C.TIME_UNSET;
    }

    @Override // ai.yb
    public final void v() {
        f0();
    }

    @Override // ai.gg, ai.yb
    public final void w() {
        this.f3694g0 = -1;
        this.f3695h0 = -1;
        this.f3697j0 = -1.0f;
        this.f3693f0 = -1.0f;
        this.f3702o0 = C.TIME_UNSET;
        this.f3703p0 = 0;
        c0();
        this.Z = false;
        int i10 = vj.f11100a;
        this.R.b();
        try {
            super.w();
        } finally {
            this.O.a();
            this.S.h(this.O);
        }
    }
}
