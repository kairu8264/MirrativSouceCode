package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hb {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f4792a;

    /* renamed from: b  reason: collision with root package name */
    public int f4793b;

    /* renamed from: c  reason: collision with root package name */
    public int f4794c;

    public hb() {
        this.f4792a = sb.f9783f;
    }

    public hb(byte[] bArr, int i10) {
        this.f4792a = bArr;
        this.f4794c = i10;
    }

    public final int A() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        this.f4793b = i12 + 1;
        return (bArr[i12] & TagConstant.TAG_CAT_RESERVED) | (((b10 & TagConstant.TAG_CAT_RESERVED) << 24) >> 8) | ((b11 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final long B() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4793b = i13;
        byte b12 = bArr[i12];
        this.f4793b = i13 + 1;
        return ((b11 & 255) << 16) | ((b10 & 255) << 24) | ((b12 & 255) << 8) | (bArr[i13] & 255);
    }

    public final long C() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4793b = i13;
        byte b12 = bArr[i12];
        this.f4793b = i13 + 1;
        return ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public final int D() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4793b = i13;
        byte b12 = bArr[i12];
        this.f4793b = i13 + 1;
        return (bArr[i13] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 24) | ((b11 & TagConstant.TAG_CAT_RESERVED) << 16) | ((b12 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final int E() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4793b = i13;
        byte b12 = bArr[i12];
        this.f4793b = i13 + 1;
        return ((bArr[i13] & TagConstant.TAG_CAT_RESERVED) << 24) | (b10 & TagConstant.TAG_CAT_RESERVED) | ((b11 & TagConstant.TAG_CAT_RESERVED) << 8) | ((b12 & TagConstant.TAG_CAT_RESERVED) << 16);
    }

    public final long F() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4793b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f4793b = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.f4793b = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.f4793b = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.f4793b = i17;
        byte b16 = bArr[i16];
        this.f4793b = i17 + 1;
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (bArr[i17] & 255);
    }

    public final long G() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f4793b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f4793b = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.f4793b = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.f4793b = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.f4793b = i17;
        byte b16 = bArr[i16];
        this.f4793b = i17 + 1;
        return ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((b13 & 255) << 24) | ((b14 & 255) << 32) | ((b15 & 255) << 40) | ((b16 & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    public final int H() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        this.f4793b = i12 + 2;
        return (b11 & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final int a() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int b() {
        int D = D();
        if (D >= 0) {
            return D;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(D);
        throw new IllegalStateException(sb2.toString());
    }

    public final int c() {
        int E = E();
        if (E >= 0) {
            return E;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(E);
        throw new IllegalStateException(sb2.toString());
    }

    public final long d() {
        long F = F();
        if (F >= 0) {
            return F;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(F);
        throw new IllegalStateException(sb2.toString());
    }

    public final String e(int i10, Charset charset) {
        String str = new String(this.f4792a, this.f4793b, i10, charset);
        this.f4793b += i10;
        return str;
    }

    public final String f(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f4793b;
        int i12 = (i11 + i10) - 1;
        String W = sb.W(this.f4792a, i11, (i12 >= this.f4794c || this.f4792a[i12] != 0) ? i10 : i10 - 1);
        this.f4793b += i10;
        return W;
    }

    public final String g(char c10) {
        int i10 = this.f4794c;
        int i11 = this.f4793b;
        if (i10 - i11 != 0) {
            while (i11 < this.f4794c && this.f4792a[i11] != 0) {
                i11++;
            }
            byte[] bArr = this.f4792a;
            int i12 = this.f4793b;
            String W = sb.W(bArr, i12, i11 - i12);
            this.f4793b = i11;
            if (i11 < this.f4794c) {
                this.f4793b = i11 + 1;
            }
            return W;
        }
        return null;
    }

    public final long h() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.f4792a[this.f4793b];
        int i13 = 7;
        while (true) {
            i10 = 0;
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i10 = 7 - i13;
            } else if (i13 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j10);
            throw new NumberFormatException(sb2.toString());
        }
        for (i11 = 1; i11 < i10; i11++) {
            if ((this.f4792a[this.f4793b + i11] & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(62);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j10);
                throw new NumberFormatException(sb3.toString());
            }
            j10 = (j10 << 6) | (b10 & 63);
        }
        this.f4793b += i10;
        return j10;
    }

    public final void i(int i10) {
        byte[] bArr = this.f4792a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        j(bArr, i10);
    }

    public final void j(byte[] bArr, int i10) {
        this.f4792a = bArr;
        this.f4794c = i10;
        this.f4793b = 0;
    }

    public final void k(int i10) {
        byte[] bArr = this.f4792a;
        if (i10 > bArr.length) {
            this.f4792a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int l() {
        return this.f4794c - this.f4793b;
    }

    public final int m() {
        return this.f4794c;
    }

    public final void n(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f4792a.length) {
            z10 = true;
        }
        u9.a(z10);
        this.f4794c = i10;
    }

    public final int o() {
        return this.f4793b;
    }

    public final void p(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f4794c) {
            z10 = true;
        }
        u9.a(z10);
        this.f4793b = i10;
    }

    public final byte[] q() {
        return this.f4792a;
    }

    public final int r() {
        return this.f4792a.length;
    }

    public final void s(int i10) {
        p(this.f4793b + i10);
    }

    public final void t(gb gbVar, int i10) {
        u(gbVar.f4375a, 0, i10);
        gbVar.d(0);
    }

    public final void u(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f4792a, this.f4793b, bArr, i10, i11);
        this.f4793b += i11;
    }

    public final int v() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        this.f4793b = i10 + 1;
        return bArr[i10] & TagConstant.TAG_CAT_RESERVED;
    }

    public final int w() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        this.f4793b = i11 + 1;
        return (bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final int x() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        this.f4793b = i11 + 1;
        return ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8) | (b10 & TagConstant.TAG_CAT_RESERVED);
    }

    public final short y() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        this.f4793b = i11 + 1;
        return (short) ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 8));
    }

    public final int z() {
        byte[] bArr = this.f4792a;
        int i10 = this.f4793b;
        int i11 = i10 + 1;
        this.f4793b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f4793b = i12;
        byte b11 = bArr[i11];
        this.f4793b = i12 + 1;
        return (bArr[i12] & TagConstant.TAG_CAT_RESERVED) | ((b10 & TagConstant.TAG_CAT_RESERVED) << 16) | ((b11 & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public hb(int i10) {
        this.f4792a = new byte[i10];
        this.f4794c = i10;
    }

    public hb(byte[] bArr) {
        this.f4792a = bArr;
        this.f4794c = bArr.length;
    }
}
