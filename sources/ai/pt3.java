package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzfn;
import com.google.android.gms.internal.ads.zzfy;
import com.google.android.gms.internal.ads.zzlx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pt3 extends p13 {
    public static final int[] C1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean D1;
    public static boolean E1;
    public int A1;
    public rt3 B1;
    public final Context X0;
    public final zt3 Y0;
    public final ku3 Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final boolean f8661a1;

    /* renamed from: b1  reason: collision with root package name */
    public ot3 f8662b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f8663c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f8664d1;

    /* renamed from: e1  reason: collision with root package name */
    public Surface f8665e1;

    /* renamed from: f1  reason: collision with root package name */
    public lt3 f8666f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f8667g1;

    /* renamed from: h1  reason: collision with root package name */
    public int f8668h1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f8669i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f8670j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f8671k1;

    /* renamed from: l1  reason: collision with root package name */
    public long f8672l1;

    /* renamed from: m1  reason: collision with root package name */
    public long f8673m1;

    /* renamed from: n1  reason: collision with root package name */
    public long f8674n1;

    /* renamed from: o1  reason: collision with root package name */
    public int f8675o1;

    /* renamed from: p1  reason: collision with root package name */
    public int f8676p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f8677q1;

    /* renamed from: r1  reason: collision with root package name */
    public long f8678r1;

    /* renamed from: s1  reason: collision with root package name */
    public long f8679s1;

    /* renamed from: t1  reason: collision with root package name */
    public long f8680t1;

    /* renamed from: u1  reason: collision with root package name */
    public int f8681u1;

    /* renamed from: v1  reason: collision with root package name */
    public int f8682v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f8683w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f8684x1;

    /* renamed from: y1  reason: collision with root package name */
    public float f8685y1;

    /* renamed from: z1  reason: collision with root package name */
    public s54 f8686z1;

    public pt3(Context context, ox2 ox2Var, f43 f43Var, long j10, boolean z10, Handler handler, lu3 lu3Var, int i10) {
        super(2, ox2Var, f43Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.X0 = applicationContext;
        this.Y0 = new zt3(applicationContext);
        this.Z0 = new ku3(handler, lu3Var);
        this.f8661a1 = "NVIDIA".equals(sb.f9780c);
        this.f8673m1 = C.TIME_UNSET;
        this.f8682v1 = -1;
        this.f8683w1 = -1;
        this.f8685y1 = -1.0f;
        this.f8668h1 = 1;
        this.A1 = 0;
        this.f8686z1 = null;
    }

    public static List<pz2> K0(f43 f43Var, v4 v4Var, boolean z10, boolean z11) throws zzfy {
        Pair<Integer, Integer> f10;
        String str = v4Var.f10960l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<pz2> d10 = qg3.d(qg3.c(str, z10, z11), v4Var);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (f10 = qg3.f(v4Var)) != null) {
            int intValue = ((Integer) f10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                d10.addAll(qg3.c(MimeTypes.VIDEO_H265, z10, z11));
            } else if (intValue == 512) {
                d10.addAll(qg3.c(MimeTypes.VIDEO_H264, z10, z11));
            }
        }
        return Collections.unmodifiableList(d10);
    }

    public static boolean M0(long j10) {
        return j10 < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int N0(pz2 pz2Var, v4 v4Var) {
        boolean z10;
        int i10;
        int intValue;
        int i11 = v4Var.f10965q;
        int i12 = v4Var.f10966r;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = v4Var.f10960l;
        int i13 = 2;
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
            Pair<Integer, Integer> f10 = qg3.f(v4Var);
            str = (f10 == null || !((intValue = ((Integer) f10.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
        }
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
            if (z10) {
                String str2 = sb.f9781d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(sb.f9780c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && pz2Var.f8752f)))) {
                    return -1;
                }
                i10 = sb.b0(i11, 16) * sb.b0(i12, 16) * 256;
            } else if (!z10) {
                if (!z10 && !z10) {
                    return -1;
                }
                i10 = i11 * i12;
                i13 = 4;
            }
            return (i10 * 3) / (i13 + i13);
        }
        i10 = i11 * i12;
        return (i10 * 3) / (i13 + i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0351, code lost:
        if (r1.equals("602LV") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x074a, code lost:
        if (r7 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean P0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 2774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.pt3.P0(java.lang.String):boolean");
    }

    public static int S0(pz2 pz2Var, v4 v4Var) {
        if (v4Var.f10961m != -1) {
            int size = v4Var.f10962n.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += v4Var.f10962n.get(i11).length;
            }
            return v4Var.f10961m + i10;
        }
        return N0(pz2Var, v4Var);
    }

    private final void o0() {
        int i10 = this.f8682v1;
        if (i10 == -1) {
            if (this.f8683w1 == -1) {
                return;
            }
            i10 = -1;
        }
        s54 s54Var = this.f8686z1;
        if (s54Var != null && s54Var.f9737a == i10 && s54Var.f9738b == this.f8683w1 && s54Var.f9739c == this.f8684x1 && s54Var.f9740d == this.f8685y1) {
            return;
        }
        s54 s54Var2 = new s54(i10, this.f8683w1, this.f8684x1, this.f8685y1);
        this.f8686z1 = s54Var2;
        this.Z0.f(s54Var2);
    }

    private final void p0() {
        s54 s54Var = this.f8686z1;
        if (s54Var != null) {
            this.Z0.f(s54Var);
        }
    }

    @Override // ai.p13
    public final void A0(String str, long j10, long j11) {
        this.Z0.b(str, j10, j11);
        this.f8663c1 = P0(str);
        pz2 B = B();
        Objects.requireNonNull(B);
        boolean z10 = false;
        if (sb.f9778a >= 29 && MimeTypes.VIDEO_VP9.equals(B.f8748b)) {
            MediaCodecInfo.CodecProfileLevel[] b10 = B.b();
            int length = b10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (b10[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8664d1 = z10;
    }

    @Override // ai.p13
    public final void B0(String str) {
        this.Z0.h(str);
    }

    @Override // ai.p13
    public final void C0(Exception exc) {
        oa.b("MediaCodecVideoRenderer", "Video codec error", exc);
        this.Z0.j(exc);
    }

    @Override // ai.p13
    public final qo D0(w4 w4Var) throws zzaeg {
        qo D0 = super.D0(w4Var);
        this.Z0.c(w4Var.f11484a, D0);
        return D0;
    }

    @Override // ai.p13
    public final void E0(v4 v4Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        oj3 k02 = k0();
        if (k02 != null) {
            k02.n(this.f8668h1);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z10 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f8682v1 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f8683w1 = integer2;
        float f10 = v4Var.f10969u;
        this.f8685y1 = f10;
        if (sb.f9778a >= 21) {
            int i10 = v4Var.f10968t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f8682v1;
                this.f8682v1 = integer2;
                this.f8683w1 = i11;
                this.f8685y1 = 1.0f / f10;
            }
        } else {
            this.f8684x1 = v4Var.f10968t;
        }
        this.Y0.g(v4Var.f10967s);
    }

    @Override // ai.p13
    public final void F() {
        super.F();
        this.f8677q1 = 0;
    }

    @Override // ai.p13
    public final zzfn H(Throwable th2, pz2 pz2Var) {
        return new zzlx(th2, pz2Var, this.f8665e1);
    }

    public final void I0(oj3 oj3Var, int i10, long j10) {
        o0();
        qb.a("releaseOutputBuffer");
        oj3Var.h(i10, true);
        qb.b();
        this.f8679s1 = SystemClock.elapsedRealtime() * 1000;
        this.P0.f7859e++;
        this.f8676p1 = 0;
        R0();
    }

    public final void J0(int i10) {
        on onVar = this.P0;
        onVar.f7861g += i10;
        this.f8675o1 += i10;
        int i11 = this.f8676p1 + i10;
        this.f8676p1 = i11;
        onVar.f7862h = Math.max(i11, onVar.f7862h);
    }

    public final boolean L0(pz2 pz2Var) {
        return sb.f9778a >= 23 && !P0(pz2Var.f8747a) && (!pz2Var.f8752f || lt3.a(this.X0));
    }

    @Override // ai.p13
    @TargetApi(29)
    public final void M(a4 a4Var) throws zzaeg {
        if (this.f8664d1) {
            ByteBuffer byteBuffer = a4Var.f1726f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    oj3 k02 = k0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    k02.m(bundle);
                }
            }
        }
    }

    @Override // ai.p13, ai.u6
    public final boolean N() {
        lt3 lt3Var;
        if (super.N() && (this.f8669i1 || (((lt3Var = this.f8666f1) != null && this.f8665e1 == lt3Var) || k0() == null))) {
            this.f8673m1 = C.TIME_UNSET;
            return true;
        } else if (this.f8673m1 == C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f8673m1) {
                return true;
            }
            this.f8673m1 = C.TIME_UNSET;
            return false;
        }
    }

    public final void O0(oj3 oj3Var, int i10, long j10, long j11) {
        o0();
        qb.a("releaseOutputBuffer");
        oj3Var.i(i10, j11);
        qb.b();
        this.f8679s1 = SystemClock.elapsedRealtime() * 1000;
        this.P0.f7859e++;
        this.f8676p1 = 0;
        R0();
    }

    @Override // ai.p13
    public final void Q(long j10) {
        super.Q(j10);
        this.f8677q1--;
    }

    public final void Q0(long j10) {
        on onVar = this.P0;
        onVar.f7864j += j10;
        onVar.f7865k++;
        this.f8680t1 += j10;
        this.f8681u1++;
    }

    public final void R0() {
        this.f8671k1 = true;
        if (this.f8669i1) {
            return;
        }
        this.f8669i1 = true;
        this.Z0.g(this.f8665e1);
        this.f8667g1 = true;
    }

    public final void T0(oj3 oj3Var, int i10, long j10) {
        qb.a("skipVideoBuffer");
        oj3Var.h(i10, false);
        qb.b();
        this.P0.f7860f++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // ai.w2, ai.q6
    public final void a(int i10, Object obj) throws zzaeg {
        if (i10 != 1) {
            if (i10 == 7) {
                this.B1 = (rt3) obj;
                return;
            } else if (i10 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.A1 != intValue) {
                    this.A1 = intValue;
                    return;
                }
                return;
            } else if (i10 != 4) {
                if (i10 != 5) {
                    return;
                }
                this.Y0.a(((Integer) obj).intValue());
                return;
            } else {
                this.f8668h1 = ((Integer) obj).intValue();
                oj3 k02 = k0();
                if (k02 != null) {
                    k02.n(this.f8668h1);
                    return;
                }
                return;
            }
        }
        lt3 lt3Var = obj instanceof Surface ? (Surface) obj : null;
        if (lt3Var == null) {
            lt3 lt3Var2 = this.f8666f1;
            if (lt3Var2 != null) {
                lt3Var = lt3Var2;
            } else {
                pz2 B = B();
                if (B != null && L0(B)) {
                    lt3Var = lt3.b(this.X0, B.f8752f);
                    this.f8666f1 = lt3Var;
                }
            }
        }
        if (this.f8665e1 != lt3Var) {
            this.f8665e1 = lt3Var;
            this.Y0.d(lt3Var);
            this.f8667g1 = false;
            int Z = Z();
            oj3 k03 = k0();
            if (k03 != null) {
                if (sb.f9778a >= 23 && lt3Var != null && !this.f8663c1) {
                    k03.l(lt3Var);
                } else {
                    C();
                    w();
                }
            }
            if (lt3Var != null && lt3Var != this.f8666f1) {
                p0();
                this.f8669i1 = false;
                int i11 = sb.f9778a;
                if (Z == 2) {
                    this.f8673m1 = C.TIME_UNSET;
                    return;
                }
                return;
            }
            this.f8686z1 = null;
            this.f8669i1 = false;
            int i12 = sb.f9778a;
        } else if (lt3Var == null || lt3Var == this.f8666f1) {
        } else {
            p0();
            if (this.f8667g1) {
                this.Z0.g(this.f8665e1);
            }
        }
    }

    @Override // ai.u6, ai.v6
    public final String b() {
        return "MediaCodecVideoRenderer";
    }

    @Override // ai.p13, ai.w2, ai.u6
    public final void f0(float f10, float f11) throws zzaeg {
        super.f0(f10, f11);
        this.Y0.f(f10);
    }

    @Override // ai.p13, ai.w2
    public final void l(boolean z10, boolean z11) throws zzaeg {
        super.l(z10, z11);
        f();
        this.Z0.a(this.P0);
        this.Y0.b();
        this.f8670j1 = z11;
        this.f8671k1 = false;
    }

    @Override // ai.p13, ai.w2
    public final void m(long j10, boolean z10) throws zzaeg {
        super.m(j10, z10);
        this.f8669i1 = false;
        int i10 = sb.f9778a;
        this.Y0.e();
        this.f8678r1 = C.TIME_UNSET;
        this.f8672l1 = C.TIME_UNSET;
        this.f8676p1 = 0;
        this.f8673m1 = C.TIME_UNSET;
    }

    @Override // ai.w2
    public final void n() {
        this.f8675o1 = 0;
        this.f8674n1 = SystemClock.elapsedRealtime();
        this.f8679s1 = SystemClock.elapsedRealtime() * 1000;
        this.f8680t1 = 0L;
        this.f8681u1 = 0;
        this.Y0.c();
    }

    @Override // ai.w2
    public final void o() {
        this.f8673m1 = C.TIME_UNSET;
        if (this.f8675o1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Z0.d(this.f8675o1, elapsedRealtime - this.f8674n1);
            this.f8675o1 = 0;
            this.f8674n1 = elapsedRealtime;
        }
        int i10 = this.f8681u1;
        if (i10 != 0) {
            this.Z0.e(this.f8680t1, i10);
            this.f8680t1 = 0L;
            this.f8681u1 = 0;
        }
        this.Y0.i();
    }

    @Override // ai.p13, ai.w2
    public final void p() {
        this.f8686z1 = null;
        this.f8669i1 = false;
        int i10 = sb.f9778a;
        this.f8667g1 = false;
        this.Y0.j();
        try {
            super.p();
        } finally {
            this.Z0.i(this.P0);
        }
    }

    @Override // ai.p13, ai.w2
    @TargetApi(17)
    public final void q() {
        try {
            super.q();
        } finally {
            lt3 lt3Var = this.f8666f1;
            if (lt3Var != null) {
                if (this.f8665e1 == lt3Var) {
                    this.f8665e1 = null;
                }
                lt3Var.release();
                this.f8666f1 = null;
            }
        }
    }

    @Override // ai.p13
    public final void s(a4 a4Var) throws zzaeg {
        this.f8677q1++;
        int i10 = sb.f9778a;
    }

    @Override // ai.p13
    public final void t() {
        this.f8669i1 = false;
        int i10 = sb.f9778a;
    }

    @Override // ai.p13
    public final int u0(f43 f43Var, v4 v4Var) throws zzfy {
        int i10 = 0;
        if (ua.b(v4Var.f10960l)) {
            boolean z10 = v4Var.f10963o != null;
            List<pz2> K0 = K0(f43Var, v4Var, z10, false);
            if (z10 && K0.isEmpty()) {
                K0 = K0(f43Var, v4Var, false, false);
            }
            if (K0.isEmpty()) {
                return 1;
            }
            if (p13.j0(v4Var)) {
                pz2 pz2Var = K0.get(0);
                boolean c10 = pz2Var.c(v4Var);
                int i11 = true != pz2Var.d(v4Var) ? 8 : 16;
                if (c10) {
                    List<pz2> K02 = K0(f43Var, v4Var, z10, true);
                    if (!K02.isEmpty()) {
                        pz2 pz2Var2 = K02.get(0);
                        if (pz2Var2.c(v4Var) && pz2Var2.d(v4Var)) {
                            i10 = 32;
                        }
                    }
                }
                return (true != c10 ? 3 : 4) | i11 | i10;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
        if (r16 > com.google.android.exoplayer2.extractor.mp3.IndexSeeker.MIN_TIME_BETWEEN_POINTS_US) goto L86;
     */
    @Override // ai.p13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(long r23, long r25, ai.oj3 r27, java.nio.ByteBuffer r28, int r29, int r30, int r31, long r32, boolean r34, boolean r35, ai.v4 r36) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.pt3.v(long, long, ai.oj3, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, ai.v4):boolean");
    }

    @Override // ai.p13
    public final List<pz2> v0(f43 f43Var, v4 v4Var, boolean z10) throws zzfy {
        return K0(f43Var, v4Var, false, false);
    }

    @Override // ai.p13
    public final boolean x(pz2 pz2Var) {
        return this.f8665e1 != null || L0(pz2Var);
    }

    @Override // ai.p13
    @TargetApi(17)
    public final nw2 x0(pz2 pz2Var, v4 v4Var, MediaCrypto mediaCrypto, float f10) {
        String str;
        ot3 ot3Var;
        int i10;
        String str2;
        Point point;
        Pair<Integer, Integer> f11;
        int N0;
        lt3 lt3Var = this.f8666f1;
        if (lt3Var != null && lt3Var.f6663w != pz2Var.f8752f) {
            lt3Var.release();
            this.f8666f1 = null;
        }
        String str3 = pz2Var.f8749c;
        v4[] e10 = e();
        int i11 = v4Var.f10965q;
        int i12 = v4Var.f10966r;
        int S0 = S0(pz2Var, v4Var);
        int length = e10.length;
        if (length == 1) {
            if (S0 != -1 && (N0 = N0(pz2Var, v4Var)) != -1) {
                S0 = Math.min((int) (S0 * 1.5f), N0);
            }
            ot3Var = new ot3(i11, i12, S0);
            str = str3;
        } else {
            boolean z10 = false;
            for (int i13 = 0; i13 < length; i13++) {
                v4 v4Var2 = e10[i13];
                if (v4Var.f10972x != null && v4Var2.f10972x == null) {
                    t4 a10 = v4Var2.a();
                    a10.z(v4Var.f10972x);
                    v4Var2 = a10.I();
                }
                if (pz2Var.e(v4Var, v4Var2).f9022d != 0) {
                    int i14 = v4Var2.f10965q;
                    z10 |= i14 == -1 || v4Var2.f10966r == -1;
                    i11 = Math.max(i11, i14);
                    i12 = Math.max(i12, v4Var2.f10966r);
                    S0 = Math.max(S0, S0(pz2Var, v4Var2));
                }
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(i12);
                String str4 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb2.toString());
                int i15 = v4Var.f10966r;
                int i16 = v4Var.f10965q;
                int i17 = i15 > i16 ? i15 : i16;
                int i18 = i15 <= i16 ? i15 : i16;
                float f12 = i18 / i17;
                int[] iArr = C1;
                str = str3;
                int i19 = 0;
                while (i19 < 9) {
                    int i20 = iArr[i19];
                    int[] iArr2 = iArr;
                    int i21 = (int) (i20 * f12);
                    if (i20 <= i17 || i21 <= i18) {
                        break;
                    }
                    int i22 = i17;
                    int i23 = i18;
                    if (sb.f9778a >= 21) {
                        int i24 = i15 <= i16 ? i20 : i21;
                        if (i15 <= i16) {
                            i20 = i21;
                        }
                        point = pz2Var.g(i24, i20);
                        i10 = S0;
                        str2 = str4;
                        if (pz2Var.f(point.x, point.y, v4Var.f10967s)) {
                            break;
                        }
                        i19++;
                        iArr = iArr2;
                        i17 = i22;
                        i18 = i23;
                        S0 = i10;
                        str4 = str2;
                    } else {
                        i10 = S0;
                        str2 = str4;
                        try {
                            int b02 = sb.b0(i20, 16) * 16;
                            int b03 = sb.b0(i21, 16) * 16;
                            if (b02 * b03 <= qg3.e()) {
                                int i25 = i15 <= i16 ? b02 : b03;
                                if (i15 <= i16) {
                                    b02 = b03;
                                }
                                point = new Point(i25, b02);
                            } else {
                                i19++;
                                iArr = iArr2;
                                i17 = i22;
                                i18 = i23;
                                S0 = i10;
                                str4 = str2;
                            }
                        } catch (zzfy unused) {
                        }
                    }
                }
                i10 = S0;
                str2 = str4;
                point = null;
                if (point != null) {
                    i11 = Math.max(i11, point.x);
                    i12 = Math.max(i12, point.y);
                    t4 a11 = v4Var.a();
                    a11.s(i11);
                    a11.t(i12);
                    S0 = Math.max(i10, N0(pz2Var, a11.I()));
                    StringBuilder sb3 = new StringBuilder(57);
                    sb3.append("Codec max resolution adjusted to: ");
                    sb3.append(i11);
                    sb3.append("x");
                    sb3.append(i12);
                    Log.w(str2, sb3.toString());
                } else {
                    S0 = i10;
                }
            } else {
                str = str3;
            }
            ot3Var = new ot3(i11, i12, S0);
        }
        this.f8662b1 = ot3Var;
        boolean z11 = this.f8661a1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", v4Var.f10965q);
        mediaFormat.setInteger("height", v4Var.f10966r);
        ra.a(mediaFormat, v4Var.f10962n);
        float f13 = v4Var.f10967s;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        ra.b(mediaFormat, "rotation-degrees", v4Var.f10968t);
        vq3 vq3Var = v4Var.f10972x;
        if (vq3Var != null) {
            ra.b(mediaFormat, "color-transfer", vq3Var.f11160c);
            ra.b(mediaFormat, "color-standard", vq3Var.f11158a);
            ra.b(mediaFormat, "color-range", vq3Var.f11159b);
            byte[] bArr = vq3Var.f11161d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(v4Var.f10960l) && (f11 = qg3.f(v4Var)) != null) {
            ra.b(mediaFormat, Referer.PROFILE, ((Integer) f11.first).intValue());
        }
        mediaFormat.setInteger("max-width", ot3Var.f7908a);
        mediaFormat.setInteger("max-height", ot3Var.f7909b);
        ra.b(mediaFormat, "max-input-size", ot3Var.f7910c);
        if (sb.f9778a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f8665e1 == null) {
            if (L0(pz2Var)) {
                if (this.f8666f1 == null) {
                    this.f8666f1 = lt3.b(this.X0, pz2Var.f8752f);
                }
                this.f8665e1 = this.f8666f1;
            } else {
                throw new IllegalStateException();
            }
        }
        return nw2.b(pz2Var, mediaFormat, v4Var, this.f8665e1, null);
    }

    @Override // ai.p13
    public final qo y0(pz2 pz2Var, v4 v4Var, v4 v4Var2) {
        int i10;
        int i11;
        qo e10 = pz2Var.e(v4Var, v4Var2);
        int i12 = e10.f9023e;
        int i13 = v4Var2.f10965q;
        ot3 ot3Var = this.f8662b1;
        if (i13 > ot3Var.f7908a || v4Var2.f10966r > ot3Var.f7909b) {
            i12 |= 256;
        }
        if (S0(pz2Var, v4Var2) > this.f8662b1.f7910c) {
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

    @Override // ai.p13
    public final float z0(float f10, v4 v4Var, v4[] v4VarArr) {
        float f11 = -1.0f;
        for (v4 v4Var2 : v4VarArr) {
            float f12 = v4Var2.f10967s;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }
}
