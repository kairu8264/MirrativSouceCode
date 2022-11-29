package ai;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class dw3 {

    /* renamed from: a  reason: collision with root package name */
    public final hb f3430a = new hb(10);

    public final v7 a(nv3 nv3Var, v8 v8Var) throws IOException {
        v7 v7Var = null;
        int i10 = 0;
        while (true) {
            try {
                ((hv3) nv3Var).c(this.f3430a.q(), 0, 10, false);
                this.f3430a.p(0);
                if (this.f3430a.z() != 4801587) {
                    break;
                }
                this.f3430a.s(3);
                int a10 = this.f3430a.a();
                int i11 = a10 + 10;
                if (v7Var == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f3430a.q(), 0, bArr, 0, 10);
                    ((hv3) nv3Var).c(bArr, 10, a10, false);
                    v7Var = x8.a(bArr, i11, v8Var, new x7());
                } else {
                    ((hv3) nv3Var).r(a10, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        nv3Var.j();
        ((hv3) nv3Var).r(i10, false);
        return v7Var;
    }
}
