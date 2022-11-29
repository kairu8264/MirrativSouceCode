package ai;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kf1 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<nf1> f6194a;

    public /* synthetic */ kf1(nf1 nf1Var, mf1 mf1Var) {
        this.f6194a = new WeakReference<>(nf1Var);
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        t41 t41Var;
        lc1 lc1Var;
        nf1 nf1Var = this.f6194a.get();
        if (nf1Var == null) {
            return;
        }
        t41Var = nf1Var.f7302h;
        t41Var.onAdClicked();
        if (((Boolean) ft.c().c(ox.f7954b7)).booleanValue()) {
            lc1Var = nf1Var.f7303i;
            lc1Var.zzb();
        }
    }
}
