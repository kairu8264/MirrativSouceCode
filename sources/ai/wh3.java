package ai;

import com.google.android.gms.internal.ads.zzgfg;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class wh3 extends yh3 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f11627d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11628e;

    /* renamed from: f  reason: collision with root package name */
    public int f11629f;

    public wh3(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.f11627d = bArr;
            this.f11629f = 0;
            this.f11628e = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    public final void E(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.f11627d, this.f11629f, i11);
            this.f11629f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11629f), Integer.valueOf(this.f11628e), Integer.valueOf(i11)), e10);
        }
    }

    public final void F(String str) throws IOException {
        int i10 = this.f11629f;
        try {
            int B = yh3.B(str.length() * 3);
            int B2 = yh3.B(str.length());
            if (B2 == B) {
                int i11 = i10 + B2;
                this.f11629f = i11;
                int h10 = sl3.h(str, this.f11627d, i11, this.f11628e - i11);
                this.f11629f = i10;
                r((h10 - i10) - B2);
                this.f11629f = h10;
                return;
            }
            r(sl3.g(str));
            byte[] bArr = this.f11627d;
            int i12 = this.f11629f;
            this.f11629f = sl3.h(str, bArr, i12, this.f11628e - i12);
        } catch (rl3 e10) {
            this.f11629f = i10;
            e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgfg(e11);
        }
    }

    @Override // ai.yh3
    public final void g(int i10, int i11) throws IOException {
        r((i10 << 3) | i11);
    }

    @Override // ai.yh3
    public final void h(int i10, int i11) throws IOException {
        r(i10 << 3);
        q(i11);
    }

    @Override // ai.yh3
    public final void i(int i10, int i11) throws IOException {
        r(i10 << 3);
        r(i11);
    }

    @Override // ai.yh3
    public final void j(int i10, int i11) throws IOException {
        r((i10 << 3) | 5);
        s(i11);
    }

    @Override // ai.yh3
    public final void k(int i10, long j10) throws IOException {
        r(i10 << 3);
        t(j10);
    }

    @Override // ai.yh3
    public final void l(int i10, long j10) throws IOException {
        r((i10 << 3) | 1);
        u(j10);
    }

    @Override // ai.yh3
    public final void m(int i10, boolean z10) throws IOException {
        r(i10 << 3);
        p(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // ai.yh3
    public final void n(int i10, String str) throws IOException {
        r((i10 << 3) | 2);
        F(str);
    }

    @Override // ai.yh3
    public final void o(int i10, oh3 oh3Var) throws IOException {
        r((i10 << 3) | 2);
        r(oh3Var.p());
        oh3Var.y(this);
    }

    @Override // ai.yh3
    public final void p(byte b10) throws IOException {
        try {
            byte[] bArr = this.f11627d;
            int i10 = this.f11629f;
            this.f11629f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11629f), Integer.valueOf(this.f11628e), 1), e10);
        }
    }

    @Override // ai.yh3
    public final void q(int i10) throws IOException {
        if (i10 >= 0) {
            r(i10);
        } else {
            t(i10);
        }
    }

    @Override // ai.yh3
    public final void r(int i10) throws IOException {
        boolean z10;
        z10 = yh3.f12604c;
        if (z10) {
            int i11 = zg3.f12988a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f11627d;
                int i12 = this.f11629f;
                this.f11629f = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11629f), Integer.valueOf(this.f11628e), 1), e10);
            }
        }
        byte[] bArr2 = this.f11627d;
        int i13 = this.f11629f;
        this.f11629f = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // ai.yh3
    public final void s(int i10) throws IOException {
        try {
            byte[] bArr = this.f11627d;
            int i11 = this.f11629f;
            int i12 = i11 + 1;
            this.f11629f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f11629f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f11629f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f11629f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11629f), Integer.valueOf(this.f11628e), 1), e10);
        }
    }

    @Override // ai.yh3
    public final void t(long j10) throws IOException {
        boolean z10;
        z10 = yh3.f12604c;
        if (z10 && this.f11628e - this.f11629f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f11627d;
                int i10 = this.f11629f;
                this.f11629f = i10 + 1;
                nl3.x(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f11627d;
            int i11 = this.f11629f;
            this.f11629f = i11 + 1;
            nl3.x(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f11627d;
                int i12 = this.f11629f;
                this.f11629f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11629f), Integer.valueOf(this.f11628e), 1), e10);
            }
        }
        byte[] bArr4 = this.f11627d;
        int i13 = this.f11629f;
        this.f11629f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }

    @Override // ai.yh3
    public final void u(long j10) throws IOException {
        try {
            byte[] bArr = this.f11627d;
            int i10 = this.f11629f;
            int i11 = i10 + 1;
            this.f11629f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f11629f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f11629f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f11629f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f11629f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f11629f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f11629f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f11629f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11629f), Integer.valueOf(this.f11628e), 1), e10);
        }
    }

    @Override // ai.yh3
    public final void v(byte[] bArr, int i10, int i11) throws IOException {
        E(bArr, 0, i11);
    }

    @Override // ai.yh3
    public final int w() {
        return this.f11628e - this.f11629f;
    }
}
