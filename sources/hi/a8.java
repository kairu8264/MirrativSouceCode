package hi;

import com.google.android.gms.internal.measurement.zzjd;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a8 extends b8 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f35636d;

    /* renamed from: e  reason: collision with root package name */
    public final int f35637e;

    /* renamed from: f  reason: collision with root package name */
    public int f35638f;

    public a8(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.f35636d = bArr;
            this.f35638f = 0;
            this.f35637e = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    public final void E(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f35636d, this.f35638f, i11);
            this.f35638f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35638f), Integer.valueOf(this.f35637e), Integer.valueOf(i11)), e10);
        }
    }

    public final void F(String str) throws IOException {
        int i10 = this.f35638f;
        try {
            int a10 = b8.a(str.length() * 3);
            int a11 = b8.a(str.length());
            if (a11 == a10) {
                int i11 = i10 + a11;
                this.f35638f = i11;
                int b10 = kb.b(str, this.f35636d, i11, this.f35637e - i11);
                this.f35638f = i10;
                u((b10 - i10) - a11);
                this.f35638f = b10;
                return;
            }
            u(kb.c(str));
            byte[] bArr = this.f35636d;
            int i12 = this.f35638f;
            this.f35638f = kb.b(str, bArr, i12, this.f35637e - i12);
        } catch (jb e10) {
            this.f35638f = i10;
            e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzjd(e11);
        }
    }

    @Override // hi.b8
    public final int g() {
        return this.f35637e - this.f35638f;
    }

    @Override // hi.b8
    public final void h(byte b10) throws IOException {
        try {
            byte[] bArr = this.f35636d;
            int i10 = this.f35638f;
            this.f35638f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35638f), Integer.valueOf(this.f35637e), 1), e10);
        }
    }

    @Override // hi.b8
    public final void i(int i10, boolean z10) throws IOException {
        u(i10 << 3);
        h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // hi.b8
    public final void j(int i10, u7 u7Var) throws IOException {
        u((i10 << 3) | 2);
        u(u7Var.g());
        u7Var.m(this);
    }

    @Override // hi.b8
    public final void k(int i10, int i11) throws IOException {
        u((i10 << 3) | 5);
        l(i11);
    }

    @Override // hi.b8
    public final void l(int i10) throws IOException {
        try {
            byte[] bArr = this.f35636d;
            int i11 = this.f35638f;
            int i12 = i11 + 1;
            this.f35638f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f35638f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f35638f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f35638f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35638f), Integer.valueOf(this.f35637e), 1), e10);
        }
    }

    @Override // hi.b8
    public final void m(int i10, long j10) throws IOException {
        u((i10 << 3) | 1);
        n(j10);
    }

    @Override // hi.b8
    public final void n(long j10) throws IOException {
        try {
            byte[] bArr = this.f35636d;
            int i10 = this.f35638f;
            int i11 = i10 + 1;
            this.f35638f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f35638f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f35638f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f35638f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f35638f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f35638f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f35638f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f35638f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35638f), Integer.valueOf(this.f35637e), 1), e10);
        }
    }

    @Override // hi.b8
    public final void o(int i10, int i11) throws IOException {
        u(i10 << 3);
        p(i11);
    }

    @Override // hi.b8
    public final void p(int i10) throws IOException {
        if (i10 >= 0) {
            u(i10);
        } else {
            w(i10);
        }
    }

    @Override // hi.b8
    public final void q(byte[] bArr, int i10, int i11) throws IOException {
        E(bArr, 0, i11);
    }

    @Override // hi.b8
    public final void r(int i10, String str) throws IOException {
        u((i10 << 3) | 2);
        F(str);
    }

    @Override // hi.b8
    public final void s(int i10, int i11) throws IOException {
        u((i10 << 3) | i11);
    }

    @Override // hi.b8
    public final void t(int i10, int i11) throws IOException {
        u(i10 << 3);
        u(i11);
    }

    @Override // hi.b8
    public final void u(int i10) throws IOException {
        boolean z10;
        z10 = b8.f35661c;
        if (z10) {
            int i11 = g7.f35783a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f35636d;
                int i12 = this.f35638f;
                this.f35638f = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35638f), Integer.valueOf(this.f35637e), 1), e10);
            }
        }
        byte[] bArr2 = this.f35636d;
        int i13 = this.f35638f;
        this.f35638f = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // hi.b8
    public final void v(int i10, long j10) throws IOException {
        u(i10 << 3);
        w(j10);
    }

    @Override // hi.b8
    public final void w(long j10) throws IOException {
        boolean z10;
        z10 = b8.f35661c;
        if (z10 && this.f35637e - this.f35638f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f35636d;
                int i10 = this.f35638f;
                this.f35638f = i10 + 1;
                fb.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f35636d;
            int i11 = this.f35638f;
            this.f35638f = i11 + 1;
            fb.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f35636d;
                int i12 = this.f35638f;
                this.f35638f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35638f), Integer.valueOf(this.f35637e), 1), e10);
            }
        }
        byte[] bArr4 = this.f35636d;
        int i13 = this.f35638f;
        this.f35638f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
