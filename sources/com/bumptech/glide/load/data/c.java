package com.bumptech.glide.load.data;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: w  reason: collision with root package name */
    public final OutputStream f20128w;

    /* renamed from: x  reason: collision with root package name */
    public byte[] f20129x;

    /* renamed from: y  reason: collision with root package name */
    public p7.b f20130y;

    /* renamed from: z  reason: collision with root package name */
    public int f20131z;

    public c(OutputStream outputStream, p7.b bVar) {
        this(outputStream, bVar, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public final void a() throws IOException {
        int i10 = this.f20131z;
        if (i10 > 0) {
            this.f20128w.write(this.f20129x, 0, i10);
            this.f20131z = 0;
        }
    }

    public final void c() throws IOException {
        if (this.f20131z == this.f20129x.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f20128w.close();
            d();
        } catch (Throwable th2) {
            this.f20128w.close();
            throw th2;
        }
    }

    public final void d() {
        byte[] bArr = this.f20129x;
        if (bArr != null) {
            this.f20130y.e(bArr);
            this.f20129x = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f20128w.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f20129x;
        int i11 = this.f20131z;
        this.f20131z = i11 + 1;
        bArr[i11] = (byte) i10;
        c();
    }

    public c(OutputStream outputStream, p7.b bVar, int i10) {
        this.f20128w = outputStream;
        this.f20130y = bVar;
        this.f20129x = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f20131z;
            if (i15 == 0 && i13 >= this.f20129x.length) {
                this.f20128w.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f20129x.length - i15);
            System.arraycopy(bArr, i14, this.f20129x, this.f20131z, min);
            this.f20131z += min;
            i12 += min;
            c();
        } while (i12 < i11);
    }
}
