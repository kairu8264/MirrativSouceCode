package ai;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ft1 implements rn3<s43<String>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<cq2> f4199a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f4200b;

    public ft1(eo3<cq2> eo3Var, eo3<Context> eo3Var2) {
        this.f4199a = eo3Var;
        this.f4200b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager k10 = wg.t.f().k(this.f4200b.zzb());
        wp2 wp2Var = wp2.WEBVIEW_COOKIE;
        return np2.b(new Callable(k10) { // from class: ai.bt1

            /* renamed from: a  reason: collision with root package name */
            public final CookieManager f2491a;

            {
                this.f2491a = k10;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.f2491a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) ft.c().c(ox.f8141z0));
            }
        }, wp2Var, this.f4199a.zzb()).h(1L, TimeUnit.SECONDS).f(Exception.class, ct1.f3034a).i();
    }
}
