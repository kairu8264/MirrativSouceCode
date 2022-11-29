package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xw3 implements mv3 {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f12335p;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12338s;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12340b;

    /* renamed from: c  reason: collision with root package name */
    public long f12341c;

    /* renamed from: d  reason: collision with root package name */
    public int f12342d;

    /* renamed from: e  reason: collision with root package name */
    public int f12343e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12344f;

    /* renamed from: h  reason: collision with root package name */
    public int f12346h;

    /* renamed from: i  reason: collision with root package name */
    public long f12347i;

    /* renamed from: j  reason: collision with root package name */
    public pv3 f12348j;

    /* renamed from: k  reason: collision with root package name */
    public pw3 f12349k;

    /* renamed from: l  reason: collision with root package name */
    public lw3 f12350l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12351m;

    /* renamed from: n  reason: collision with root package name */
    public static final sv3 f12333n = ww3.f11787a;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f12334o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f12336q = sb.X("#!AMR\n");

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f12337r = sb.X("#!AMR-WB\n");

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12339a = new byte[1];

    /* renamed from: g  reason: collision with root package name */
    public int f12345g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f12335p = iArr;
        f12338s = iArr[8];
    }

    public xw3(int i10) {
    }

    public static boolean b(nv3 nv3Var, byte[] bArr) throws IOException {
        nv3Var.j();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((hv3) nv3Var).c(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    public final boolean a(nv3 nv3Var) throws IOException {
        byte[] bArr = f12336q;
        if (b(nv3Var, bArr)) {
            this.f12340b = false;
            ((hv3) nv3Var).q(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f12337r;
        if (b(nv3Var, bArr2)) {
            this.f12340b = true;
            ((hv3) nv3Var).q(bArr2.length, false);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x0098, TryCatch #0 {EOFException -> 0x0098, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x007f, B:33:0x0080, B:34:0x0097), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x0098, TryCatch #0 {EOFException -> 0x0098, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x007f, B:33:0x0080, B:34:0x0097), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(ai.nv3 r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f12343e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L99
            r12.j()     // Catch: java.io.EOFException -> L98
            byte[] r0 = r11.f12339a     // Catch: java.io.EOFException -> L98
            r4 = r12
            ai.hv3 r4 = (ai.hv3) r4     // Catch: java.io.EOFException -> L98
            r4.c(r0, r3, r2, r3)     // Catch: java.io.EOFException -> L98
            byte[] r0 = r11.f12339a     // Catch: java.io.EOFException -> L98
            r0 = r0[r3]     // Catch: java.io.EOFException -> L98
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L80
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f12340b     // Catch: java.io.EOFException -> L98
            if (r4 == 0) goto L2c
            r6 = 10
            if (r0 < r6) goto L37
            r6 = 13
            if (r0 <= r6) goto L2c
            goto L37
        L2c:
            if (r4 != 0) goto L55
            r6 = 12
            if (r0 < r6) goto L37
            r6 = 14
            if (r0 > r6) goto L37
            goto L55
        L37:
            if (r4 == 0) goto L3e
            int[] r4 = ai.xw3.f12335p     // Catch: java.io.EOFException -> L98
            r0 = r4[r0]     // Catch: java.io.EOFException -> L98
            goto L42
        L3e:
            int[] r4 = ai.xw3.f12334o     // Catch: java.io.EOFException -> L98
            r0 = r4[r0]     // Catch: java.io.EOFException -> L98
        L42:
            r11.f12342d = r0     // Catch: java.io.EOFException -> L98
            r11.f12343e = r0
            int r4 = r11.f12345g
            if (r4 != r1) goto L4d
            r11.f12345g = r0
            r4 = r0
        L4d:
            if (r4 != r0) goto L99
            int r4 = r11.f12346h
            int r4 = r4 + r2
            r11.f12346h = r4
            goto L99
        L55:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L5c
            r12 = r3
        L5c:
            int r2 = r12.length()     // Catch: java.io.EOFException -> L98
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L98
            r3.<init>(r2)     // Catch: java.io.EOFException -> L98
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)     // Catch: java.io.EOFException -> L98
            r3.append(r12)     // Catch: java.io.EOFException -> L98
            java.lang.String r12 = " frame type "
            r3.append(r12)     // Catch: java.io.EOFException -> L98
            r3.append(r0)     // Catch: java.io.EOFException -> L98
            java.lang.String r12 = r3.toString()     // Catch: java.io.EOFException -> L98
            com.google.android.gms.internal.ads.zzaha r12 = com.google.android.gms.internal.ads.zzaha.b(r12, r5)     // Catch: java.io.EOFException -> L98
            throw r12     // Catch: java.io.EOFException -> L98
        L80:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L98
            r2 = 42
            r12.<init>(r2)     // Catch: java.io.EOFException -> L98
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L98
            r12.append(r0)     // Catch: java.io.EOFException -> L98
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L98
            com.google.android.gms.internal.ads.zzaha r12 = com.google.android.gms.internal.ads.zzaha.b(r12, r5)     // Catch: java.io.EOFException -> L98
            throw r12     // Catch: java.io.EOFException -> L98
        L98:
            return r1
        L99:
            ai.pw3 r4 = r11.f12349k
            int r12 = ai.nw3.a(r4, r12, r0, r2)
            if (r12 != r1) goto La2
            return r1
        La2:
            int r0 = r11.f12343e
            int r0 = r0 - r12
            r11.f12343e = r0
            if (r0 <= 0) goto Laa
            return r3
        Laa:
            ai.pw3 r4 = r11.f12349k
            long r5 = r11.f12341c
            r7 = 1
            int r8 = r11.f12342d
            r9 = 0
            r10 = 0
            r4.e(r5, r7, r8, r9, r10)
            long r0 = r11.f12341c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f12341c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.xw3.c(ai.nv3):int");
    }

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        u9.e(this.f12349k);
        int i10 = sb.f9778a;
        if (nv3Var.n() == 0 && !a(nv3Var)) {
            throw zzaha.b("Could not find AMR header.", null);
        }
        if (!this.f12351m) {
            this.f12351m = true;
            boolean z10 = this.f12340b;
            String str = true != z10 ? MimeTypes.AUDIO_AMR_NB : MimeTypes.AUDIO_AMR_WB;
            int i11 = true != z10 ? 8000 : AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            pw3 pw3Var = this.f12349k;
            t4 t4Var = new t4();
            t4Var.n(str);
            t4Var.o(f12338s);
            t4Var.B(1);
            t4Var.C(i11);
            pw3Var.b(t4Var.I());
        }
        int c10 = c(nv3Var);
        if (this.f12344f) {
            return c10;
        }
        kw3 kw3Var = new kw3(C.TIME_UNSET, 0L);
        this.f12350l = kw3Var;
        this.f12348j.s(kw3Var);
        this.f12344f = true;
        return c10;
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.f12341c = 0L;
        this.f12342d = 0;
        this.f12343e = 0;
        this.f12347i = 0L;
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f12348j = pv3Var;
        this.f12349k = pv3Var.p(0, 1);
        pv3Var.x();
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        return a(nv3Var);
    }
}
