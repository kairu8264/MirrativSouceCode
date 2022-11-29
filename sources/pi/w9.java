package pi;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class w9 implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ na f48328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ba f48329b;

    public w9(ba baVar, na naVar) {
        this.f48329b = baVar;
        this.f48328a = naVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        if (this.f48329b.U((String) rh.p.i(this.f48328a.f48080w)).k() && h.b(this.f48328a.R).k()) {
            return this.f48329b.R(this.f48328a).f0();
        }
        this.f48329b.r().u().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
