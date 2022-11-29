package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public class aw3 implements nv3 {

    /* renamed from: a  reason: collision with root package name */
    public final nv3 f2139a;

    public aw3(nv3 nv3Var) {
        this.f2139a = nv3Var;
    }

    @Override // ai.nv3
    public final int F(int i10) throws IOException {
        throw null;
    }

    @Override // ai.nv3, ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        return this.f2139a.b(bArr, i10, i11);
    }

    @Override // ai.nv3
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f2139a.c(bArr, 0, 8, true);
    }

    @Override // ai.nv3
    public final void d(byte[] bArr, int i10, int i11) throws IOException {
        ((hv3) this.f2139a).c(bArr, i10, i11, false);
    }

    @Override // ai.nv3
    public final void e(byte[] bArr, int i10, int i11) throws IOException {
        ((hv3) this.f2139a).f(bArr, i10, i11, false);
    }

    @Override // ai.nv3
    public final boolean f(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f2139a.f(bArr, 0, 8, true);
    }

    @Override // ai.nv3
    public final void f0(int i10) throws IOException {
        ((hv3) this.f2139a).r(i10, false);
    }

    @Override // ai.nv3
    public final void i(int i10) throws IOException {
        ((hv3) this.f2139a).q(i10, false);
    }

    @Override // ai.nv3
    public final void j() {
        this.f2139a.j();
    }

    @Override // ai.nv3
    public long k() {
        return this.f2139a.k();
    }

    @Override // ai.nv3
    public long n() {
        return this.f2139a.n();
    }

    @Override // ai.nv3
    public long o() {
        return this.f2139a.o();
    }

    @Override // ai.nv3
    public final int p(byte[] bArr, int i10, int i11) throws IOException {
        throw null;
    }
}
