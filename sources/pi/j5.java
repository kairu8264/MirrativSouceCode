package pi;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class j5 implements Callable<List<c>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f47969a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f47970b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f47971c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u5 f47972d;

    public j5(u5 u5Var, String str, String str2, String str3) {
        this.f47972d = u5Var;
        this.f47969a = str;
        this.f47970b = str2;
        this.f47971c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<c> call() throws Exception {
        ba baVar;
        ba baVar2;
        baVar = this.f47972d.f48261w;
        baVar.d();
        baVar2 = this.f47972d.f48261w;
        return baVar2.V().c0(this.f47969a, this.f47970b, this.f47971c);
    }
}
