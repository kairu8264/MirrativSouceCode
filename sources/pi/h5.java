package pi;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class h5 implements Callable<List<ga>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f47905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f47906b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f47907c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u5 f47908d;

    public h5(u5 u5Var, String str, String str2, String str3) {
        this.f47908d = u5Var;
        this.f47905a = str;
        this.f47906b = str2;
        this.f47907c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<ga> call() throws Exception {
        ba baVar;
        ba baVar2;
        baVar = this.f47908d.f48261w;
        baVar.d();
        baVar2 = this.f47908d.f48261w;
        return baVar2.V().f0(this.f47905a, this.f47906b, this.f47907c);
    }
}
