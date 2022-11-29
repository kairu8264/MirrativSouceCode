package ai;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lf1 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<nf1> f6555a;

    public /* synthetic */ lf1(nf1 nf1Var, mf1 mf1Var) {
        this.f6555a = new WeakReference<>(nf1Var);
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        nf1 nf1Var = this.f6555a.get();
        if (nf1Var == null) {
            return;
        }
        nf1.v(nf1Var).zza();
    }
}
