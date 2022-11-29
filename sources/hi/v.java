package hi;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class v implements q {
    @Override // hi.q
    public final q d() {
        return q.f35921f;
    }

    @Override // hi.q
    public final Double e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof v;
    }

    @Override // hi.q
    public final Boolean f() {
        return Boolean.FALSE;
    }

    @Override // hi.q
    public final String h() {
        return "undefined";
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return null;
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
