package ai;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public final class p24 implements q24 {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f8267m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f8268n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a  reason: collision with root package name */
    public final pv3 f8269a;

    /* renamed from: b  reason: collision with root package name */
    public final pw3 f8270b;

    /* renamed from: c  reason: collision with root package name */
    public final t24 f8271c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8272d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f8273e;

    /* renamed from: f  reason: collision with root package name */
    public final hb f8274f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8275g;

    /* renamed from: h  reason: collision with root package name */
    public final v4 f8276h;

    /* renamed from: i  reason: collision with root package name */
    public int f8277i;

    /* renamed from: j  reason: collision with root package name */
    public long f8278j;

    /* renamed from: k  reason: collision with root package name */
    public int f8279k;

    /* renamed from: l  reason: collision with root package name */
    public long f8280l;

    public p24(pv3 pv3Var, pw3 pw3Var, t24 t24Var) throws zzaha {
        this.f8269a = pv3Var;
        this.f8270b = pw3Var;
        this.f8271c = t24Var;
        int max = Math.max(1, t24Var.f10082c / 10);
        this.f8275g = max;
        hb hbVar = new hb(t24Var.f10085f);
        hbVar.x();
        int x10 = hbVar.x();
        this.f8272d = x10;
        int i10 = t24Var.f10081b;
        int i11 = (((t24Var.f10083d - (i10 * 4)) * 8) / (t24Var.f10084e * i10)) + 1;
        if (x10 == i11) {
            int b02 = sb.b0(max, x10);
            this.f8273e = new byte[t24Var.f10083d * b02];
            this.f8274f = new hb(b02 * (x10 + x10) * i10);
            int i12 = ((t24Var.f10082c * t24Var.f10083d) * 8) / x10;
            t4 t4Var = new t4();
            t4Var.n(MimeTypes.AUDIO_RAW);
            t4Var.i(i12);
            t4Var.j(i12);
            t4Var.o((max + max) * i10);
            t4Var.B(t24Var.f10081b);
            t4Var.C(t24Var.f10082c);
            t4Var.D(2);
            this.f8276h = t4Var.I();
            return;
        }
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("Expected frames per block: ");
        sb2.append(i11);
        sb2.append("; got: ");
        sb2.append(x10);
        throw zzaha.b(sb2.toString(), null);
    }

    @Override // ai.q24
    public final void a(long j10) {
        this.f8277i = 0;
        this.f8278j = j10;
        this.f8279k = 0;
        this.f8280l = 0L;
    }

    @Override // ai.q24
    public final void b(int i10, long j10) {
        this.f8269a.s(new w24(this.f8271c, this.f8272d, i10, j10));
        this.f8270b.b(this.f8276h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:4:0x001e). Please submit an issue!!! */
    @Override // ai.q24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(ai.nv3 r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p24.c(ai.nv3, long):boolean");
    }

    public final void d(int i10) {
        long j10 = this.f8278j;
        long h10 = sb.h(this.f8280l, 1000000L, this.f8271c.f10082c);
        int f10 = f(i10);
        this.f8270b.e(j10 + h10, 1, f10, this.f8279k - f10, null);
        this.f8280l += i10;
        this.f8279k -= f10;
    }

    public final int e(int i10) {
        int i11 = this.f8271c.f10081b;
        return i10 / (i11 + i11);
    }

    public final int f(int i10) {
        return (i10 + i10) * this.f8271c.f10081b;
    }
}
