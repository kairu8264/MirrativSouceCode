package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class hh implements xh {

    /* renamed from: a  reason: collision with root package name */
    public final int f4844a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ih f4845b;

    public hh(ih ihVar, int i10) {
        this.f4845b = ihVar;
        this.f4844a = i10;
    }

    @Override // ai.xh
    public final void a(long j10) {
        this.f4845b.G(this.f4844a, j10);
    }

    @Override // ai.xh
    public final void b() throws IOException {
        this.f4845b.E();
    }

    @Override // ai.xh
    public final int c(pc pcVar, ee eeVar, boolean z10) {
        return this.f4845b.F(this.f4844a, pcVar, eeVar, z10);
    }

    @Override // ai.xh
    public final boolean zzb() {
        return this.f4845b.D(this.f4844a);
    }
}
