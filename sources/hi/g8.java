package hi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g8 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile g8 f35784b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile g8 f35785c;

    /* renamed from: d  reason: collision with root package name */
    public static final g8 f35786d = new g8(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<f8, s8<?, ?>> f35787a;

    public g8() {
        this.f35787a = new HashMap();
    }

    public static g8 a() {
        g8 g8Var = f35784b;
        if (g8Var == null) {
            synchronized (g8.class) {
                g8Var = f35784b;
                if (g8Var == null) {
                    g8Var = f35786d;
                    f35784b = g8Var;
                }
            }
        }
        return g8Var;
    }

    public static g8 b() {
        g8 g8Var = f35785c;
        if (g8Var != null) {
            return g8Var;
        }
        synchronized (g8.class) {
            g8 g8Var2 = f35785c;
            if (g8Var2 != null) {
                return g8Var2;
            }
            g8 b10 = o8.b(g8.class);
            f35785c = b10;
            return b10;
        }
    }

    public final <ContainingType extends w9> s8<ContainingType, ?> c(ContainingType containingtype, int i10) {
        return (s8<ContainingType, ?>) this.f35787a.get(new f8(containingtype, i10));
    }

    public g8(boolean z10) {
        this.f35787a = Collections.emptyMap();
    }
}
