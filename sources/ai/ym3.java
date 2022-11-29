package ai;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ym3 extends bn3 implements h54 {
    public i54 E;
    public final String F = "moov";

    public ym3(String str) {
    }

    @Override // ai.h54
    public final void a(i54 i54Var) {
        this.E = i54Var;
    }

    @Override // ai.h54
    public final void d(cn3 cn3Var, ByteBuffer byteBuffer, long j10, e54 e54Var) throws IOException {
        cn3Var.b();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f2419x = cn3Var;
        this.f2421z = cn3Var.b();
        cn3Var.u(cn3Var.b() + j10);
        this.A = cn3Var.b();
        this.f2418w = e54Var;
    }

    @Override // ai.h54
    public final String zzb() {
        return this.F;
    }
}
