package kg;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class x implements fg.b<w> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Executor> f38809a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<lg.d> f38810b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<y> f38811c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<mg.a> f38812d;

    public x(rn.a<Executor> aVar, rn.a<lg.d> aVar2, rn.a<y> aVar3, rn.a<mg.a> aVar4) {
        this.f38809a = aVar;
        this.f38810b = aVar2;
        this.f38811c = aVar3;
        this.f38812d = aVar4;
    }

    public static x a(rn.a<Executor> aVar, rn.a<lg.d> aVar2, rn.a<y> aVar3, rn.a<mg.a> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w c(Executor executor, lg.d dVar, y yVar, mg.a aVar) {
        return new w(executor, dVar, yVar, aVar);
    }

    @Override // rn.a
    /* renamed from: b */
    public w get() {
        return c(this.f38809a.get(), this.f38810b.get(), this.f38811c.get(), this.f38812d.get());
    }
}
