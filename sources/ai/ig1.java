package ai;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ig1 implements vk {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5214w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ jg1 f5215x;

    public ig1(jg1 jg1Var, String str) {
        this.f5215x = jg1Var;
        this.f5214w = str;
    }

    @Override // ai.vk
    public final void U(uk ukVar) {
        Map map;
        ki1 ki1Var;
        ki1 ki1Var2;
        ki1 ki1Var3;
        ki1 ki1Var4;
        Map map2;
        ki1 ki1Var5;
        ki1 ki1Var6;
        ki1 ki1Var7;
        if (!((Boolean) ft.c().c(ox.f7982f1)).booleanValue()) {
            if (ukVar.f10736j) {
                map = this.f5215x.D;
                map.put(this.f5214w, Boolean.TRUE);
                jg1 jg1Var = this.f5215x;
                ki1Var = jg1Var.f5787t;
                View k52 = ki1Var.k5();
                ki1Var2 = this.f5215x.f5787t;
                Map<String, WeakReference<View>> g10 = ki1Var2.g();
                ki1Var3 = this.f5215x.f5787t;
                jg1Var.J(k52, g10, ki1Var3.i(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (ukVar.f10736j) {
                ki1Var4 = this.f5215x.f5787t;
                if (ki1Var4 == null) {
                    return;
                }
                map2 = this.f5215x.D;
                map2.put(this.f5214w, Boolean.TRUE);
                jg1 jg1Var2 = this.f5215x;
                ki1Var5 = jg1Var2.f5787t;
                View k53 = ki1Var5.k5();
                ki1Var6 = this.f5215x.f5787t;
                Map<String, WeakReference<View>> g11 = ki1Var6.g();
                ki1Var7 = this.f5215x.f5787t;
                jg1Var2.J(k53, g11, ki1Var7.i(), true);
            }
        }
    }
}
