package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class l0 extends x {
    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        if (str != null && !str.isEmpty() && u4Var.h(str)) {
            q d10 = u4Var.d(str);
            if (d10 instanceof j) {
                return ((j) d10).a(u4Var, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
