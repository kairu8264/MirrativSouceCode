package com.bumptech.glide.load.data;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {
    public static final int A;

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f20135y;

    /* renamed from: z  reason: collision with root package name */
    public static final int f20136z;

    /* renamed from: w  reason: collision with root package name */
    public final byte f20137w;

    /* renamed from: x  reason: collision with root package name */
    public int f20138x;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f20135y = bArr;
        int length = bArr.length;
        f20136z = length;
        A = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f20137w = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i10;
        int i11 = this.f20138x;
        if (i11 < 2 || i11 > (i10 = A)) {
            read = super.read();
        } else if (i11 == i10) {
            read = this.f20137w;
        } else {
            read = f20135y[i11 - 2] & TagConstant.TAG_CAT_RESERVED;
        }
        if (read != -1) {
            this.f20138x++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f20138x = (int) (this.f20138x + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f20138x;
        int i14 = A;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f20137w;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f20135y, this.f20138x - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f20138x += i12;
        }
        return i12;
    }
}
