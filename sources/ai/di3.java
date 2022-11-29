package ai;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class di3 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile di3 f3305b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile di3 f3306c;

    /* renamed from: d  reason: collision with root package name */
    public static final di3 f3307d = new di3(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<ci3, pi3<?, ?>> f3308a;

    public di3() {
        this.f3308a = new HashMap();
    }

    public static di3 a() {
        di3 di3Var = f3305b;
        if (di3Var == null) {
            synchronized (di3.class) {
                di3Var = f3305b;
                if (di3Var == null) {
                    di3Var = f3307d;
                    f3305b = di3Var;
                }
            }
        }
        return di3Var;
    }

    public static di3 b() {
        di3 di3Var = f3306c;
        if (di3Var != null) {
            return di3Var;
        }
        synchronized (di3.class) {
            di3 di3Var2 = f3306c;
            if (di3Var2 != null) {
                return di3Var2;
            }
            di3 b10 = li3.b(di3.class);
            f3306c = b10;
            return b10;
        }
    }

    public final <ContainingType extends xj3> pi3<ContainingType, ?> c(ContainingType containingtype, int i10) {
        return (pi3<ContainingType, ?>) this.f3308a.get(new ci3(containingtype, i10));
    }

    public di3(boolean z10) {
        this.f3308a = Collections.emptyMap();
    }
}
