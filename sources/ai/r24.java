package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class r24 implements q24 {

    /* renamed from: a  reason: collision with root package name */
    public final pv3 f9315a;

    /* renamed from: b  reason: collision with root package name */
    public final pw3 f9316b;

    /* renamed from: c  reason: collision with root package name */
    public final t24 f9317c;

    /* renamed from: d  reason: collision with root package name */
    public final v4 f9318d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9319e;

    /* renamed from: f  reason: collision with root package name */
    public long f9320f;

    /* renamed from: g  reason: collision with root package name */
    public int f9321g;

    /* renamed from: h  reason: collision with root package name */
    public long f9322h;

    public r24(pv3 pv3Var, pw3 pw3Var, t24 t24Var, String str, int i10) throws zzaha {
        this.f9315a = pv3Var;
        this.f9316b = pw3Var;
        this.f9317c = t24Var;
        int i11 = (t24Var.f10081b * t24Var.f10084e) / 8;
        int i12 = t24Var.f10083d;
        if (i12 == i11) {
            int i13 = t24Var.f10082c * i11;
            int i14 = i13 * 8;
            int max = Math.max(i11, i13 / 10);
            this.f9319e = max;
            t4 t4Var = new t4();
            t4Var.n(str);
            t4Var.i(i14);
            t4Var.j(i14);
            t4Var.o(max);
            t4Var.B(t24Var.f10081b);
            t4Var.C(t24Var.f10082c);
            t4Var.D(i10);
            this.f9318d = t4Var.I();
            return;
        }
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("Expected block size: ");
        sb2.append(i11);
        sb2.append("; got: ");
        sb2.append(i12);
        throw zzaha.b(sb2.toString(), null);
    }

    @Override // ai.q24
    public final void a(long j10) {
        this.f9320f = j10;
        this.f9321g = 0;
        this.f9322h = 0L;
    }

    @Override // ai.q24
    public final void b(int i10, long j10) {
        this.f9315a.s(new w24(this.f9317c, 1, i10, j10));
        this.f9316b.b(this.f9318d);
    }

    @Override // ai.q24
    public final boolean c(nv3 nv3Var, long j10) throws IOException {
        int i10;
        t24 t24Var;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.f9321g) >= (i12 = this.f9319e)) {
                break;
            }
            int a10 = nw3.a(this.f9316b, nv3Var, (int) Math.min(i12 - i11, j11), true);
            if (a10 == -1) {
                j11 = 0;
            } else {
                this.f9321g += a10;
                j11 -= a10;
            }
        }
        int i13 = this.f9317c.f10083d;
        int i14 = this.f9321g / i13;
        if (i14 > 0) {
            long j12 = this.f9320f;
            long h10 = sb.h(this.f9322h, 1000000L, t24Var.f10082c);
            int i15 = i14 * i13;
            int i16 = this.f9321g - i15;
            this.f9316b.e(j12 + h10, 1, i15, i16, null);
            this.f9322h += i14;
            this.f9321g = i16;
        }
        return i10 <= 0;
    }
}
