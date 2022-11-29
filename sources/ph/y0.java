package ph;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.a;

/* loaded from: classes3.dex */
public final class y0<A extends com.google.android.gms.common.api.internal.a<? extends oh.e, a.b>> extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public final A f47568b;

    public y0(int i10, A a10) {
        super(i10);
        this.f47568b = (A) rh.p.j(a10, "Null methods are not runnable.");
    }

    @Override // ph.b1
    public final void a(Status status) {
        try {
            this.f47568b.p(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // ph.b1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f47568b.p(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // ph.b1
    public final void c(b0<?> b0Var) throws DeadObjectException {
        try {
            this.f47568b.n(b0Var.s());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // ph.b1
    public final void d(r rVar, boolean z10) {
        rVar.c(this.f47568b, z10);
    }
}
