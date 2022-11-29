package ai;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class oe0 implements Callable<ne0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7724a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ qe0 f7725b;

    public oe0(qe0 qe0Var, Context context) {
        this.f7725b = qe0Var;
        this.f7724a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ ne0 call() throws Exception {
        WeakHashMap weakHashMap;
        ne0 a10;
        WeakHashMap weakHashMap2;
        weakHashMap = this.f7725b.f8909a;
        pe0 pe0Var = (pe0) weakHashMap.get(this.f7724a);
        if (pe0Var != null && pe0Var.f8392a + uy.f10877a.e().longValue() >= wg.t.k().currentTimeMillis()) {
            a10 = new me0(this.f7724a, pe0Var.f8393b).a();
        } else {
            a10 = new me0(this.f7724a).a();
        }
        weakHashMap2 = this.f7725b.f8909a;
        weakHashMap2.put(this.f7724a, new pe0(this.f7725b, a10));
        return a10;
    }
}
