package rh;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import oh.b;
import rh.o;

/* loaded from: classes3.dex */
public final class k0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ oh.b f51460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ vi.h f51461b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o.a f51462c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m0 f51463d;

    public k0(oh.b bVar, vi.h hVar, o.a aVar, m0 m0Var) {
        this.f51460a = bVar;
        this.f51461b = hVar;
        this.f51462c = aVar;
        this.f51463d = m0Var;
    }

    @Override // oh.b.a
    public final void a(Status status) {
        if (status.k0()) {
            this.f51461b.c(this.f51462c.a(this.f51460a.b(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f51461b.b(b.a(status));
    }
}
