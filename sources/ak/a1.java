package ak;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a1 extends FilterInputStream {
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final y2 f13301w;

    /* renamed from: x  reason: collision with root package name */
    public byte[] f13302x;

    /* renamed from: y  reason: collision with root package name */
    public long f13303y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f13304z;

    public a1(InputStream inputStream) {
        super(inputStream);
        this.f13301w = new y2();
        this.f13302x = new byte[4096];
        this.f13304z = false;
        this.A = false;
    }

    public final long a() {
        return this.f13303y;
    }

    public final a4 c() throws IOException {
        byte[] bArr;
        if (this.f13303y <= 0) {
            if (this.f13304z) {
            }
            return new w0(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f13302x;
        } while (read(bArr, 0, bArr.length) != -1);
        if (this.f13304z && !this.A) {
            if (!i(30)) {
                this.f13304z = true;
                return this.f13301w.c();
            }
            a4 c10 = this.f13301w.c();
            if (c10.d()) {
                this.A = true;
                return c10;
            } else if (c10.b() != 4294967295L) {
                int a10 = this.f13301w.a() - 30;
                long j10 = a10;
                int length = this.f13302x.length;
                if (j10 > length) {
                    do {
                        length += length;
                    } while (length < j10);
                    this.f13302x = Arrays.copyOf(this.f13302x, length);
                }
                if (!i(a10)) {
                    this.f13304z = true;
                    return this.f13301w.c();
                }
                a4 c11 = this.f13301w.c();
                this.f13303y = c11.b();
                return c11;
            } else {
                throw new p1("Files bigger than 4GiB are not supported.");
            }
        }
        return new w0(null, -1L, -1, false, false, null);
    }

    public final boolean d() {
        return this.A;
    }

    public final boolean e() {
        return this.f13304z;
    }

    public final int h(byte[] bArr, int i10, int i11) throws IOException {
        return Math.max(0, super.read(bArr, i10, i11));
    }

    public final boolean i(int i10) throws IOException {
        int h10 = h(this.f13302x, 0, i10);
        if (h10 != i10) {
            int i11 = i10 - h10;
            if (h(this.f13302x, h10, i11) != i11) {
                this.f13301w.b(this.f13302x, 0, h10);
                return false;
            }
        }
        this.f13301w.b(this.f13302x, 0, i10);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f13303y;
        if (j10 <= 0 || this.f13304z) {
            return -1;
        }
        int h10 = h(bArr, i10, (int) Math.min(j10, i11));
        this.f13303y -= h10;
        if (h10 == 0) {
            this.f13304z = true;
            return 0;
        }
        return h10;
    }
}
