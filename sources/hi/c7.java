package hi;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class c7 {
    public static <T> y6<T> a(y6<T> y6Var) {
        if ((y6Var instanceof a7) || (y6Var instanceof z6)) {
            return y6Var;
        }
        if (y6Var instanceof Serializable) {
            return new z6(y6Var);
        }
        return new a7(y6Var);
    }

    public static <T> y6<T> b(T t10) {
        return new b7(t10);
    }
}
