package ai;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class jq3 {

    /* renamed from: a  reason: collision with root package name */
    public final hb f5890a = new hb(32);

    /* renamed from: b  reason: collision with root package name */
    public iq3 f5891b;

    /* renamed from: c  reason: collision with root package name */
    public iq3 f5892c;

    /* renamed from: d  reason: collision with root package name */
    public iq3 f5893d;

    /* renamed from: e  reason: collision with root package name */
    public long f5894e;

    /* renamed from: f  reason: collision with root package name */
    public final is3 f5895f;

    public jq3(is3 is3Var, byte[] bArr) {
        this.f5895f = is3Var;
        iq3 iq3Var = new iq3(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f5891b = iq3Var;
        this.f5892c = iq3Var;
        this.f5893d = iq3Var;
    }

    public static iq3 k(iq3 iq3Var, a4 a4Var, mq3 mq3Var, hb hbVar) {
        iq3 iq3Var2;
        if (a4Var.j()) {
            long j10 = mq3Var.f7009b;
            int i10 = 1;
            hbVar.i(1);
            iq3 m10 = m(iq3Var, j10, hbVar.q(), 1);
            long j11 = j10 + 1;
            byte b10 = hbVar.q()[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            a1 a1Var = a4Var.f1722b;
            byte[] bArr = a1Var.f1666a;
            if (bArr == null) {
                a1Var.f1666a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            iq3Var2 = m(m10, j11, a1Var.f1666a, i12);
            long j12 = j11 + i12;
            if (i11 != 0) {
                hbVar.i(2);
                iq3Var2 = m(iq3Var2, j12, hbVar.q(), 2);
                j12 += 2;
                i10 = hbVar.w();
            }
            int i13 = i10;
            int[] iArr = a1Var.f1668c;
            if (iArr == null || iArr.length < i13) {
                iArr = new int[i13];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = a1Var.f1669d;
            if (iArr3 == null || iArr3.length < i13) {
                iArr3 = new int[i13];
            }
            int[] iArr4 = iArr3;
            if (i11 != 0) {
                int i14 = i13 * 6;
                hbVar.i(i14);
                iq3Var2 = m(iq3Var2, j12, hbVar.q(), i14);
                j12 += i14;
                hbVar.p(0);
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr2[i15] = hbVar.w();
                    iArr4[i15] = hbVar.b();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = mq3Var.f7008a - ((int) (j12 - mq3Var.f7009b));
            }
            ow3 ow3Var = mq3Var.f7010c;
            int i16 = sb.f9778a;
            a1Var.a(i13, iArr2, iArr4, ow3Var.f7934b, a1Var.f1666a, ow3Var.f7933a, ow3Var.f7935c, ow3Var.f7936d);
            long j13 = mq3Var.f7009b;
            int i17 = (int) (j12 - j13);
            mq3Var.f7009b = j13 + i17;
            mq3Var.f7008a -= i17;
        } else {
            iq3Var2 = iq3Var;
        }
        if (a4Var.e()) {
            hbVar.i(4);
            iq3 m11 = m(iq3Var2, mq3Var.f7009b, hbVar.q(), 4);
            int b11 = hbVar.b();
            mq3Var.f7009b += 4;
            mq3Var.f7008a -= 4;
            a4Var.i(b11);
            iq3 l10 = l(m11, mq3Var.f7009b, a4Var.f1723c, b11);
            mq3Var.f7009b += b11;
            int i18 = mq3Var.f7008a - b11;
            mq3Var.f7008a = i18;
            ByteBuffer byteBuffer = a4Var.f1726f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                a4Var.f1726f.clear();
            } else {
                a4Var.f1726f = ByteBuffer.allocate(i18);
            }
            return l(l10, mq3Var.f7009b, a4Var.f1726f, mq3Var.f7008a);
        }
        a4Var.i(mq3Var.f7008a);
        return l(iq3Var2, mq3Var.f7009b, a4Var.f1723c, mq3Var.f7008a);
    }

    public static iq3 l(iq3 iq3Var, long j10, ByteBuffer byteBuffer, int i10) {
        iq3 n10 = n(iq3Var, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (n10.f5326b - j10));
            byteBuffer.put(n10.f5328d.f12095a, n10.a(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == n10.f5326b) {
                n10 = n10.f5329e;
            }
        }
        return n10;
    }

    public static iq3 m(iq3 iq3Var, long j10, byte[] bArr, int i10) {
        iq3 n10 = n(iq3Var, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (n10.f5326b - j10));
            System.arraycopy(n10.f5328d.f12095a, n10.a(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == n10.f5326b) {
                n10 = n10.f5329e;
            }
        }
        return n10;
    }

    public static iq3 n(iq3 iq3Var, long j10) {
        while (j10 >= iq3Var.f5326b) {
            iq3Var = iq3Var.f5329e;
        }
        return iq3Var;
    }

    public final void a() {
        iq3 iq3Var = this.f5891b;
        if (iq3Var.f5327c) {
            iq3 iq3Var2 = this.f5893d;
            boolean z10 = iq3Var2.f5327c;
            int i10 = (z10 ? 1 : 0) + (((int) (iq3Var2.f5325a - iq3Var.f5325a)) / C.DEFAULT_BUFFER_SEGMENT_SIZE);
            xr3[] xr3VarArr = new xr3[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                xr3VarArr[i11] = iq3Var.f5328d;
                iq3Var = iq3Var.b();
            }
            this.f5895f.e(xr3VarArr);
        }
        iq3 iq3Var3 = new iq3(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f5891b = iq3Var3;
        this.f5892c = iq3Var3;
        this.f5893d = iq3Var3;
        this.f5894e = 0L;
        this.f5895f.f();
    }

    public final void b() {
        this.f5892c = this.f5891b;
    }

    public final void c(a4 a4Var, mq3 mq3Var) {
        this.f5892c = k(this.f5892c, a4Var, mq3Var, this.f5890a);
    }

    public final void d(a4 a4Var, mq3 mq3Var) {
        k(this.f5892c, a4Var, mq3Var, this.f5890a);
    }

    public final void e(long j10) {
        iq3 iq3Var;
        if (j10 != -1) {
            while (true) {
                iq3Var = this.f5891b;
                if (j10 < iq3Var.f5326b) {
                    break;
                }
                this.f5895f.d(iq3Var.f5328d);
                this.f5891b = this.f5891b.b();
            }
            if (this.f5892c.f5325a < iq3Var.f5325a) {
                this.f5892c = iq3Var;
            }
        }
    }

    public final long f() {
        return this.f5894e;
    }

    public final int g(a6 a6Var, int i10, boolean z10) throws IOException {
        int i11 = i(i10);
        iq3 iq3Var = this.f5893d;
        int b10 = a6Var.b(iq3Var.f5328d.f12095a, iq3Var.a(this.f5894e), i11);
        if (b10 != -1) {
            j(b10);
            return b10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void h(hb hbVar, int i10) {
        while (i10 > 0) {
            int i11 = i(i10);
            iq3 iq3Var = this.f5893d;
            hbVar.u(iq3Var.f5328d.f12095a, iq3Var.a(this.f5894e), i11);
            i10 -= i11;
            j(i11);
        }
    }

    public final int i(int i10) {
        iq3 iq3Var = this.f5893d;
        if (!iq3Var.f5327c) {
            xr3 c10 = this.f5895f.c();
            iq3 iq3Var2 = new iq3(this.f5893d.f5326b, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            iq3Var.f5328d = c10;
            iq3Var.f5329e = iq3Var2;
            iq3Var.f5327c = true;
        }
        return Math.min(i10, (int) (this.f5893d.f5326b - this.f5894e));
    }

    public final void j(int i10) {
        long j10 = this.f5894e + i10;
        this.f5894e = j10;
        iq3 iq3Var = this.f5893d;
        if (j10 == iq3Var.f5326b) {
            this.f5893d = iq3Var.f5329e;
        }
    }
}
