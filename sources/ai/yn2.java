package ai;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class yn2 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<on2, xn2<?, ?>> f12686a = new HashMap<>();

    public final <R extends d41<AdT>, AdT extends u01> xn2<R, AdT> a(on2 on2Var, Context context, fn2 fn2Var, eo2<R, AdT> eo2Var) {
        xn2<R, AdT> xn2Var = (xn2<R, AdT>) this.f12686a.get(on2Var);
        if (xn2Var == null) {
            ln2 ln2Var = new ln2(rn2.p(on2Var, context));
            xn2<R, AdT> xn2Var2 = new xn2<>(ln2Var, new go2(ln2Var, fn2Var, eo2Var));
            this.f12686a.put(on2Var, xn2Var2);
            return xn2Var2;
        }
        return xn2Var;
    }
}
