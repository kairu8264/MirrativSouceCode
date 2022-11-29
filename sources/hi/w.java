package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class w extends x {
    public w() {
        this.f36056a.add(n0.BITWISE_AND);
        this.f36056a.add(n0.BITWISE_LEFT_SHIFT);
        this.f36056a.add(n0.BITWISE_NOT);
        this.f36056a.add(n0.BITWISE_OR);
        this.f36056a.add(n0.BITWISE_RIGHT_SHIFT);
        this.f36056a.add(n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f36056a.add(n0.BITWISE_XOR);
    }

    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        switch (v5.e(str).ordinal()) {
            case 4:
                v5.h(n0.BITWISE_AND.name(), 2, list);
                return new i(Double.valueOf(v5.b(u4Var.b(list.get(0)).e().doubleValue()) & v5.b(u4Var.b(list.get(1)).e().doubleValue())));
            case 5:
                v5.h(n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(v5.b(u4Var.b(list.get(0)).e().doubleValue()) << ((int) (v5.d(u4Var.b(list.get(1)).e().doubleValue()) & 31))));
            case 6:
                v5.h(n0.BITWISE_NOT.name(), 1, list);
                return new i(Double.valueOf(~v5.b(u4Var.b(list.get(0)).e().doubleValue())));
            case 7:
                v5.h(n0.BITWISE_OR.name(), 2, list);
                return new i(Double.valueOf(v5.b(u4Var.b(list.get(0)).e().doubleValue()) | v5.b(u4Var.b(list.get(1)).e().doubleValue())));
            case 8:
                v5.h(n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(v5.b(u4Var.b(list.get(0)).e().doubleValue()) >> ((int) (v5.d(u4Var.b(list.get(1)).e().doubleValue()) & 31))));
            case 9:
                v5.h(n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(v5.d(u4Var.b(list.get(0)).e().doubleValue()) >>> ((int) (v5.d(u4Var.b(list.get(1)).e().doubleValue()) & 31))));
            case 10:
                v5.h(n0.BITWISE_XOR.name(), 2, list);
                return new i(Double.valueOf(v5.b(u4Var.b(list.get(0)).e().doubleValue()) ^ v5.b(u4Var.b(list.get(1)).e().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
