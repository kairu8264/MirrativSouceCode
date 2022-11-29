package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class e0 extends x {
    public e0() {
        this.f36056a.add(n0.AND);
        this.f36056a.add(n0.NOT);
        this.f36056a.add(n0.OR);
    }

    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        if (ordinal == 1) {
            v5.h(n0.AND.name(), 2, list);
            q b10 = u4Var.b(list.get(0));
            return !b10.f().booleanValue() ? b10 : u4Var.b(list.get(1));
        } else if (ordinal == 47) {
            v5.h(n0.NOT.name(), 1, list);
            return new g(Boolean.valueOf(!u4Var.b(list.get(0)).f().booleanValue()));
        } else if (ordinal != 50) {
            return super.b(str);
        } else {
            v5.h(n0.OR.name(), 2, list);
            q b11 = u4Var.b(list.get(0));
            return b11.f().booleanValue() ? b11 : u4Var.b(list.get(1));
        }
    }
}
