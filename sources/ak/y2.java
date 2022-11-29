package ak;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y2 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f13721a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f13722b;

    /* renamed from: c  reason: collision with root package name */
    public long f13723c;

    /* renamed from: d  reason: collision with root package name */
    public long f13724d;

    /* renamed from: e  reason: collision with root package name */
    public int f13725e;

    /* renamed from: f  reason: collision with root package name */
    public int f13726f;

    /* renamed from: g  reason: collision with root package name */
    public int f13727g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13728h;

    /* renamed from: i  reason: collision with root package name */
    public String f13729i;

    public y2() {
        d();
    }

    public final int a() {
        return this.f13726f;
    }

    public final int b(byte[] bArr, int i10, int i11) {
        int e10 = e(30, bArr, i10, i11);
        if (e10 != -1) {
            if (this.f13723c == -1) {
                long b10 = x0.b(this.f13721a, 0);
                this.f13723c = b10;
                if (b10 == 67324752) {
                    this.f13728h = false;
                    this.f13724d = x0.b(this.f13721a, 18);
                    this.f13727g = x0.a(this.f13721a, 8);
                    this.f13725e = x0.a(this.f13721a, 26);
                    int a10 = this.f13725e + 30 + x0.a(this.f13721a, 28);
                    this.f13726f = a10;
                    int length = this.f13721a.length;
                    if (length < a10) {
                        do {
                            length += length;
                        } while (length < a10);
                        this.f13721a = Arrays.copyOf(this.f13721a, length);
                    }
                } else {
                    this.f13728h = true;
                }
            }
            int e11 = e(this.f13726f, bArr, i10 + e10, i11 - e10);
            if (e11 == -1) {
                return -1;
            }
            int i12 = e10 + e11;
            if (!this.f13728h && this.f13729i == null) {
                this.f13729i = new String(this.f13721a, 30, this.f13725e);
            }
            return i12;
        }
        return -1;
    }

    public final a4 c() {
        int i10 = this.f13722b;
        int i11 = this.f13726f;
        if (i10 < i11) {
            return new w0(this.f13729i, this.f13724d, this.f13727g, true, this.f13728h, Arrays.copyOf(this.f13721a, i10));
        }
        w0 w0Var = new w0(this.f13729i, this.f13724d, this.f13727g, false, this.f13728h, Arrays.copyOf(this.f13721a, i11));
        d();
        return w0Var;
    }

    public final void d() {
        this.f13722b = 0;
        this.f13725e = -1;
        this.f13723c = -1L;
        this.f13728h = false;
        this.f13726f = 30;
        this.f13724d = -1L;
        this.f13727g = -1;
        this.f13729i = null;
    }

    public final int e(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f13722b;
        if (i13 < i10) {
            int min = Math.min(i12, i10 - i13);
            System.arraycopy(bArr, i11, this.f13721a, this.f13722b, min);
            int i14 = this.f13722b + min;
            this.f13722b = i14;
            if (i14 < i10) {
                return -1;
            }
            return min;
        }
        return 0;
    }
}
