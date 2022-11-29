package hn;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class u0 extends BufferedOutputStream {
    public u0(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(r0 r0Var) throws IOException {
        d(r0Var);
        e(r0Var);
        h(r0Var);
        byte[] m10 = t.m(4);
        write(m10);
        i(r0Var, m10);
    }

    public void c(String str) throws IOException {
        write(t.d(str));
    }

    public final void d(r0 r0Var) throws IOException {
        write((r0Var.t() & 15) | (r0Var.r() ? 128 : 0) | (r0Var.x() ? 64 : 0) | (r0Var.y() ? 32 : 0) | (r0Var.z() ? 16 : 0));
    }

    public final void e(r0 r0Var) throws IOException {
        int v10 = r0Var.v();
        write(v10 <= 125 ? v10 | 128 : v10 <= 65535 ? 254 : 255);
    }

    public final void h(r0 r0Var) throws IOException {
        byte[] bArr;
        int v10 = r0Var.v();
        if (v10 <= 125) {
            return;
        }
        if (v10 <= 65535) {
            bArr = new byte[]{(byte) ((v10 >> 8) & 255), (byte) (v10 & 255)};
        } else {
            bArr = new byte[8];
            for (int i10 = 7; i10 >= 0; i10--) {
                bArr[i10] = (byte) (v10 & 255);
                v10 >>>= 8;
            }
        }
        write(bArr);
    }

    public final void i(r0 r0Var, byte[] bArr) throws IOException {
        byte[] u10 = r0Var.u();
        if (u10 == null) {
            return;
        }
        byte[] bArr2 = new byte[u10.length];
        for (int i10 = 0; i10 < u10.length; i10++) {
            bArr2[i10] = (byte) ((u10[i10] ^ bArr[i10 % 4]) & 255);
        }
        write(bArr2);
    }
}
