package ai;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class le {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6532g = new byte[4096];

    /* renamed from: a  reason: collision with root package name */
    public final ui f6533a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6534b;

    /* renamed from: c  reason: collision with root package name */
    public long f6535c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6536d = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: e  reason: collision with root package name */
    public int f6537e;

    /* renamed from: f  reason: collision with root package name */
    public int f6538f;

    public le(ui uiVar, long j10, long j11) {
        this.f6533a = uiVar;
        this.f6535c = j10;
        this.f6534b = j11;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int k10 = k(bArr, i10, i11);
        if (k10 == 0) {
            k10 = m(bArr, i10, i11, 0, true);
        }
        n(k10);
        return k10;
    }

    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int k10 = k(bArr, i10, i11);
        while (k10 < i11 && k10 != -1) {
            k10 = m(bArr, i10, i11, k10, z10);
        }
        n(k10);
        return k10 != -1;
    }

    public final int c(int i10) throws IOException, InterruptedException {
        int j10 = j(i10);
        if (j10 == 0) {
            j10 = m(f6532g, 0, Math.min(i10, 4096), 0, true);
        }
        n(j10);
        return j10;
    }

    public final boolean d(int i10, boolean z10) throws IOException, InterruptedException {
        int j10 = j(i10);
        while (j10 < i10 && j10 != -1) {
            j10 = m(f6532g, -j10, Math.min(i10, j10 + 4096), j10, false);
        }
        n(j10);
        return j10 != -1;
    }

    public final boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        if (f(i11, false)) {
            System.arraycopy(this.f6536d, this.f6537e - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    public final boolean f(int i10, boolean z10) throws IOException, InterruptedException {
        int i11 = this.f6537e + i10;
        int length = this.f6536d.length;
        if (i11 > length) {
            this.f6536d = Arrays.copyOf(this.f6536d, vj.f(length + length, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
        int min = Math.min(this.f6538f - this.f6537e, i10);
        while (min < i10) {
            min = m(this.f6536d, this.f6537e, i10, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i12 = this.f6537e + i10;
        this.f6537e = i12;
        this.f6538f = Math.max(this.f6538f, i12);
        return true;
    }

    public final void g() {
        this.f6537e = 0;
    }

    public final long h() {
        return this.f6535c;
    }

    public final long i() {
        return this.f6534b;
    }

    public final int j(int i10) {
        int min = Math.min(this.f6538f, i10);
        l(min);
        return min;
    }

    public final int k(byte[] bArr, int i10, int i11) {
        int i12 = this.f6538f;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f6536d, 0, bArr, i10, min);
        l(min);
        return min;
    }

    public final void l(int i10) {
        int i11 = this.f6538f - i10;
        this.f6538f = i11;
        this.f6537e = 0;
        byte[] bArr = this.f6536d;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f6536d = bArr2;
    }

    public final int m(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int e10 = this.f6533a.e(bArr, i10 + i12, i11 - i12);
            if (e10 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + e10;
        }
        throw new InterruptedException();
    }

    public final void n(int i10) {
        if (i10 != -1) {
            this.f6535c += i10;
        }
    }
}
