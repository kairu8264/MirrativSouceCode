package pi;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class i5 implements Callable<List<c>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f47932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f47933b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f47934c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u5 f47935d;

    public i5(u5 u5Var, String str, String str2, String str3) {
        this.f47935d = u5Var;
        this.f47932a = str;
        this.f47933b = str2;
        this.f47934c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<c> call() throws Exception {
        ba baVar;
        ba baVar2;
        baVar = this.f47935d.f48261w;
        baVar.d();
        baVar2 = this.f47935d.f48261w;
        return baVar2.V().c0(this.f47932a, this.f47933b, this.f47934c);
    }
}
