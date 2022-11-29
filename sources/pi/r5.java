package pi;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class r5 implements Callable<List<ga>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f48190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u5 f48191b;

    public r5(u5 u5Var, String str) {
        this.f48191b = u5Var;
        this.f48190a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<ga> call() throws Exception {
        ba baVar;
        ba baVar2;
        baVar = this.f48191b.f48261w;
        baVar.d();
        baVar2 = this.f48191b.f48261w;
        return baVar2.V().e0(this.f48190a);
    }
}
