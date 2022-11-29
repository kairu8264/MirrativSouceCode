package v4;

import java.util.concurrent.Executor;
import v4.q0;
import z4.h;

/* loaded from: classes.dex */
public final class i0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f56621a;

    /* renamed from: b  reason: collision with root package name */
    public final q0.f f56622b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f56623c;

    public i0(h.c cVar, q0.f fVar, Executor executor) {
        this.f56621a = cVar;
        this.f56622b = fVar;
        this.f56623c = executor;
    }

    @Override // z4.h.c
    public z4.h a(h.b bVar) {
        return new h0(this.f56621a.a(bVar), this.f56622b, this.f56623c);
    }
}
