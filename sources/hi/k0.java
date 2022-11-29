package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class k0 extends x {
    public k0() {
        this.f36056a.add(n0.ADD);
        this.f36056a.add(n0.DIVIDE);
        this.f36056a.add(n0.MODULUS);
        this.f36056a.add(n0.MULTIPLY);
        this.f36056a.add(n0.NEGATE);
        this.f36056a.add(n0.POST_DECREMENT);
        this.f36056a.add(n0.POST_INCREMENT);
        this.f36056a.add(n0.PRE_DECREMENT);
        this.f36056a.add(n0.PRE_INCREMENT);
        this.f36056a.add(n0.SUBTRACT);
    }

    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        if (ordinal == 0) {
            v5.h(n0Var.name(), 2, list);
            q b10 = u4Var.b(list.get(0));
            q b11 = u4Var.b(list.get(1));
            if (!(b10 instanceof m) && !(b10 instanceof u) && !(b11 instanceof m) && !(b11 instanceof u)) {
                return new i(Double.valueOf(b10.e().doubleValue() + b11.e().doubleValue()));
            }
            String valueOf = String.valueOf(b10.h());
            String valueOf2 = String.valueOf(b11.h());
            return new u(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            v5.h(n0.DIVIDE.name(), 2, list);
            return new i(Double.valueOf(u4Var.b(list.get(0)).e().doubleValue() / u4Var.b(list.get(1)).e().doubleValue()));
        } else if (ordinal == 59) {
            v5.h(n0.SUBTRACT.name(), 2, list);
            return new i(Double.valueOf(u4Var.b(list.get(0)).e().doubleValue() + new i(Double.valueOf(-u4Var.b(list.get(1)).e().doubleValue())).e().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            v5.h(str, 2, list);
            q b12 = u4Var.b(list.get(0));
            u4Var.b(list.get(1));
            return b12;
        } else if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    v5.h(n0.MODULUS.name(), 2, list);
                    return new i(Double.valueOf(u4Var.b(list.get(0)).e().doubleValue() % u4Var.b(list.get(1)).e().doubleValue()));
                case 45:
                    v5.h(n0.MULTIPLY.name(), 2, list);
                    return new i(Double.valueOf(u4Var.b(list.get(0)).e().doubleValue() * u4Var.b(list.get(1)).e().doubleValue()));
                case 46:
                    v5.h(n0.NEGATE.name(), 1, list);
                    return new i(Double.valueOf(-u4Var.b(list.get(0)).e().doubleValue()));
                default:
                    return super.b(str);
            }
        } else {
            v5.h(str, 1, list);
            return u4Var.b(list.get(0));
        }
    }
}
