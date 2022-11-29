package ai;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hv3 implements nv3 {

    /* renamed from: b  reason: collision with root package name */
    public final a6 f5009b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5010c;

    /* renamed from: d  reason: collision with root package name */
    public long f5011d;

    /* renamed from: f  reason: collision with root package name */
    public int f5013f;

    /* renamed from: g  reason: collision with root package name */
    public int f5014g;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5012e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5008a = new byte[4096];

    public hv3(a6 a6Var, long j10, long j11) {
        this.f5009b = a6Var;
        this.f5011d = j10;
        this.f5010c = j11;
    }

    @Override // ai.nv3
    public final int F(int i10) throws IOException {
        int t10 = t(1);
        if (t10 == 0) {
            t10 = w(this.f5008a, 0, Math.min(1, 4096), 0, true);
        }
        x(t10);
        return t10;
    }

    @Override // ai.nv3, ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int u10 = u(bArr, i10, i11);
        if (u10 == 0) {
            u10 = w(bArr, i10, i11, 0, true);
        }
        x(u10);
        return u10;
    }

    @Override // ai.nv3
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (r(i11, z10)) {
            System.arraycopy(this.f5012e, this.f5013f - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // ai.nv3
    public final void d(byte[] bArr, int i10, int i11) throws IOException {
        c(bArr, i10, i11, false);
    }

    @Override // ai.nv3
    public final void e(byte[] bArr, int i10, int i11) throws IOException {
        f(bArr, i10, i11, false);
    }

    @Override // ai.nv3
    public final boolean f(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int u10 = u(bArr, i10, i11);
        while (u10 < i11 && u10 != -1) {
            u10 = w(bArr, i10, i11, u10, z10);
        }
        x(u10);
        return u10 != -1;
    }

    @Override // ai.nv3
    public final void f0(int i10) throws IOException {
        r(i10, false);
    }

    @Override // ai.nv3
    public final void i(int i10) throws IOException {
        q(i10, false);
    }

    @Override // ai.nv3
    public final void j() {
        this.f5013f = 0;
    }

    @Override // ai.nv3
    public final long k() {
        return this.f5011d + this.f5013f;
    }

    @Override // ai.nv3
    public final long n() {
        return this.f5011d;
    }

    @Override // ai.nv3
    public final long o() {
        return this.f5010c;
    }

    @Override // ai.nv3
    public final int p(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        s(i11);
        int i12 = this.f5014g;
        int i13 = this.f5013f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = w(this.f5012e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f5014g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f5012e, this.f5013f, bArr, i10, min);
        this.f5013f += min;
        return min;
    }

    public final boolean q(int i10, boolean z10) throws IOException {
        int t10 = t(i10);
        while (t10 < i10 && t10 != -1) {
            t10 = w(this.f5008a, -t10, Math.min(i10, t10 + 4096), t10, false);
        }
        x(t10);
        return t10 != -1;
    }

    public final boolean r(int i10, boolean z10) throws IOException {
        s(i10);
        int i11 = this.f5014g - this.f5013f;
        while (i11 < i10) {
            i11 = w(this.f5012e, this.f5013f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f5014g = this.f5013f + i11;
        }
        this.f5013f += i10;
        return true;
    }

    public final void s(int i10) {
        int i11 = this.f5013f + i10;
        int length = this.f5012e.length;
        if (i11 > length) {
            this.f5012e = Arrays.copyOf(this.f5012e, sb.c0(length + length, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    public final int t(int i10) {
        int min = Math.min(this.f5014g, i10);
        v(min);
        return min;
    }

    public final int u(byte[] bArr, int i10, int i11) {
        int i12 = this.f5014g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f5012e, 0, bArr, i10, min);
        v(min);
        return min;
    }

    public final void v(int i10) {
        int i11 = this.f5014g - i10;
        this.f5014g = i11;
        this.f5013f = 0;
        byte[] bArr = this.f5012e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f5012e = bArr2;
    }

    public final int w(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int b10 = this.f5009b.b(bArr, i10 + i12, i11 - i12);
            if (b10 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + b10;
        }
        throw new InterruptedIOException();
    }

    public final void x(int i10) {
        if (i10 != -1) {
            this.f5011d += i10;
        }
    }
}
