package ai;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class lv3 implements pw3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f6702a = new byte[4096];

    @Override // ai.pw3
    public final void a(hb hbVar, int i10) {
        nw3.b(this, hbVar, i10);
    }

    @Override // ai.pw3
    public final void b(v4 v4Var) {
    }

    @Override // ai.pw3
    public final int c(a6 a6Var, int i10, boolean z10) throws IOException {
        return nw3.a(this, a6Var, i10, true);
    }

    @Override // ai.pw3
    public final void d(hb hbVar, int i10, int i11) {
        hbVar.s(i10);
    }

    @Override // ai.pw3
    public final void e(long j10, int i10, int i11, int i12, ow3 ow3Var) {
    }

    @Override // ai.pw3
    public final int f(a6 a6Var, int i10, boolean z10, int i11) throws IOException {
        int b10 = a6Var.b(this.f6702a, 0, Math.min(4096, i10));
        if (b10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return b10;
    }
}
