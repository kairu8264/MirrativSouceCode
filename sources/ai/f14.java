package ai;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class f14 {

    /* renamed from: a  reason: collision with root package name */
    public final pw3 f3879a;

    /* renamed from: d  reason: collision with root package name */
    public final ib f3882d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f3883e;

    /* renamed from: f  reason: collision with root package name */
    public int f3884f;

    /* renamed from: g  reason: collision with root package name */
    public long f3885g;

    /* renamed from: h  reason: collision with root package name */
    public long f3886h;

    /* renamed from: l  reason: collision with root package name */
    public long f3890l;

    /* renamed from: m  reason: collision with root package name */
    public long f3891m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3892n;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<wa> f3880b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<va> f3881c = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    public final e14 f3887i = new e14(null);

    /* renamed from: j  reason: collision with root package name */
    public final e14 f3888j = new e14(null);

    /* renamed from: k  reason: collision with root package name */
    public boolean f3889k = false;

    public f14(pw3 pw3Var, boolean z10, boolean z11) {
        this.f3879a = pw3Var;
        byte[] bArr = new byte[128];
        this.f3883e = bArr;
        this.f3882d = new ib(bArr, 0, 0);
    }

    public final void a(wa waVar) {
        this.f3880b.append(waVar.f11527d, waVar);
    }

    public final void b(va vaVar) {
        this.f3881c.append(vaVar.f11011a, vaVar);
    }

    public final void c() {
        this.f3889k = false;
    }

    public final void d(long j10, int i10, long j11) {
        this.f3884f = i10;
        this.f3886h = j11;
        this.f3885g = j10;
    }

    public final boolean e(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.f3884f == 9) {
            if (z10 && this.f3889k) {
                long j11 = this.f3885g;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.f3891m;
                if (j12 != C.TIME_UNSET) {
                    this.f3879a.e(j12, this.f3892n ? 1 : 0, (int) (j11 - this.f3890l), i11, null);
                }
            }
            this.f3890l = this.f3885g;
            this.f3891m = this.f3886h;
            this.f3892n = false;
            this.f3889k = true;
        }
        boolean z13 = this.f3892n;
        int i12 = this.f3884f;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        this.f3892n = z14;
        return z14;
    }
}
