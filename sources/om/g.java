package om;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ep.b0;
import ep.d0;
import ep.v;
import java.io.IOException;
import rm.k;

/* loaded from: classes4.dex */
public class g implements ep.f {

    /* renamed from: w  reason: collision with root package name */
    public final ep.f f45485w;

    /* renamed from: x  reason: collision with root package name */
    public final mm.d f45486x;

    /* renamed from: y  reason: collision with root package name */
    public final sm.h f45487y;

    /* renamed from: z  reason: collision with root package name */
    public final long f45488z;

    public g(ep.f fVar, k kVar, sm.h hVar, long j10) {
        this.f45485w = fVar;
        this.f45486x = mm.d.c(kVar);
        this.f45488z = j10;
        this.f45487y = hVar;
    }

    @Override // ep.f
    public void c(ep.e eVar, IOException iOException) {
        b0 j10 = eVar.j();
        if (j10 != null) {
            v j11 = j10.j();
            if (j11 != null) {
                this.f45486x.w(j11.x().toString());
            }
            if (j10.g() != null) {
                this.f45486x.l(j10.g());
            }
        }
        this.f45486x.q(this.f45488z);
        this.f45486x.u(this.f45487y.b());
        h.d(this.f45486x);
        this.f45485w.c(eVar, iOException);
    }

    @Override // ep.f
    public void e(ep.e eVar, d0 d0Var) throws IOException {
        FirebasePerfOkHttpClient.a(d0Var, this.f45486x, this.f45488z, this.f45487y.b());
        this.f45485w.e(eVar, d0Var);
    }
}
