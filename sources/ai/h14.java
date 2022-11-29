package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class h14 {

    /* renamed from: a  reason: collision with root package name */
    public final pw3 f4693a;

    /* renamed from: b  reason: collision with root package name */
    public long f4694b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4695c;

    /* renamed from: d  reason: collision with root package name */
    public int f4696d;

    /* renamed from: e  reason: collision with root package name */
    public long f4697e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4698f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4699g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4700h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4701i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4702j;

    /* renamed from: k  reason: collision with root package name */
    public long f4703k;

    /* renamed from: l  reason: collision with root package name */
    public long f4704l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4705m;

    public h14(pw3 pw3Var) {
        this.f4693a = pw3Var;
    }

    public final void a() {
        this.f4698f = false;
        this.f4699g = false;
        this.f4700h = false;
        this.f4701i = false;
        this.f4702j = false;
    }

    public final void b(long j10, int i10, int i11, long j11, boolean z10) {
        boolean z11 = false;
        this.f4699g = false;
        this.f4700h = false;
        this.f4697e = j11;
        this.f4696d = 0;
        this.f4694b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.f4701i && !this.f4702j) {
                if (z10) {
                    e(i10);
                }
                this.f4701i = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.f4700h = !this.f4702j;
                this.f4702j = true;
            }
        }
        boolean z12 = i11 >= 16 && i11 <= 21;
        this.f4695c = z12;
        if (z12 || i11 <= 9) {
            z11 = true;
        }
        this.f4698f = z11;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f4698f) {
            int i12 = this.f4696d;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.f4696d = i12 + (i11 - i10);
                return;
            }
            this.f4699g = (bArr[i13] & 128) != 0;
            this.f4698f = false;
        }
    }

    public final void d(long j10, int i10, boolean z10) {
        if (this.f4702j && this.f4699g) {
            this.f4705m = this.f4695c;
            this.f4702j = false;
        } else if (this.f4700h || this.f4699g) {
            if (z10 && this.f4701i) {
                e(i10 + ((int) (j10 - this.f4694b)));
            }
            this.f4703k = this.f4694b;
            this.f4704l = this.f4697e;
            this.f4705m = this.f4695c;
            this.f4701i = true;
        }
    }

    public final void e(int i10) {
        long j10 = this.f4704l;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        boolean z10 = this.f4705m;
        long j11 = this.f4694b;
        long j12 = this.f4703k;
        this.f4693a.e(j10, z10 ? 1 : 0, (int) (j11 - j12), i10, null);
    }
}
