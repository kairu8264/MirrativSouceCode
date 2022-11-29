package pi;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class f5 implements Callable<List<ga>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f47800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f47801b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f47802c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u5 f47803d;

    public f5(u5 u5Var, String str, String str2, String str3) {
        this.f47803d = u5Var;
        this.f47800a = str;
        this.f47801b = str2;
        this.f47802c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<ga> call() throws Exception {
        ba baVar;
        ba baVar2;
        baVar = this.f47803d.f48261w;
        baVar.d();
        baVar2 = this.f47803d.f48261w;
        return baVar2.V().f0(this.f47800a, this.f47801b, this.f47802c);
    }
}
