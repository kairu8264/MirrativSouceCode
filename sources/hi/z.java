package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class z extends x {
    public z() {
        this.f36056a.add(n0.EQUALS);
        this.f36056a.add(n0.GREATER_THAN);
        this.f36056a.add(n0.GREATER_THAN_EQUALS);
        this.f36056a.add(n0.IDENTITY_EQUALS);
        this.f36056a.add(n0.IDENTITY_NOT_EQUALS);
        this.f36056a.add(n0.LESS_THAN);
        this.f36056a.add(n0.LESS_THAN_EQUALS);
        this.f36056a.add(n0.NOT_EQUALS);
    }

    public static boolean c(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            if (qVar instanceof i) {
                return (Double.isNaN(qVar.e().doubleValue()) || Double.isNaN(qVar2.e().doubleValue()) || qVar.e().doubleValue() != qVar2.e().doubleValue()) ? false : true;
            } else if (qVar instanceof u) {
                return qVar.h().equals(qVar2.h());
            } else {
                if (qVar instanceof g) {
                    return qVar.f().equals(qVar2.f());
                }
                return qVar == qVar2;
            }
        } else if (((qVar instanceof v) || (qVar instanceof o)) && ((qVar2 instanceof v) || (qVar2 instanceof o))) {
            return true;
        } else {
            boolean z10 = qVar instanceof i;
            if (z10 && (qVar2 instanceof u)) {
                return c(qVar, new i(qVar2.e()));
            }
            boolean z11 = qVar instanceof u;
            if (z11 && (qVar2 instanceof i)) {
                return c(new i(qVar.e()), qVar2);
            }
            if (qVar instanceof g) {
                return c(new i(qVar.e()), qVar2);
            }
            if (qVar2 instanceof g) {
                return c(qVar, new i(qVar2.e()));
            }
            if ((!z11 && !z10) || !(qVar2 instanceof m)) {
                if ((qVar instanceof m) && ((qVar2 instanceof u) || (qVar2 instanceof i))) {
                    return c(new u(qVar.h()), qVar2);
                }
                return false;
            }
            return c(qVar, new u(qVar2.h()));
        }
    }

    public static boolean d(q qVar, q qVar2) {
        int i10;
        if (qVar instanceof m) {
            qVar = new u(qVar.h());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.h());
        }
        if ((qVar instanceof u) && (qVar2 instanceof u)) {
            return qVar.h().compareTo(qVar2.h()) < 0;
        }
        double doubleValue = qVar.e().doubleValue();
        double doubleValue2 = qVar2.e().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((i10 == 0 && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.h());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.h());
        }
        return (((qVar instanceof u) && (qVar2 instanceof u)) || !(Double.isNaN(qVar.e().doubleValue()) || Double.isNaN(qVar2.e().doubleValue()))) && !d(qVar2, qVar);
    }

    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        boolean c10;
        boolean c11;
        v5.h(v5.e(str).name(), 2, list);
        q b10 = u4Var.b(list.get(0));
        q b11 = u4Var.b(list.get(1));
        int ordinal = v5.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c11 = c(b10, b11);
            } else if (ordinal == 42) {
                c10 = d(b10, b11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        c10 = d(b11, b10);
                        break;
                    case 38:
                        c10 = e(b11, b10);
                        break;
                    case 39:
                        c10 = v5.l(b10, b11);
                        break;
                    case 40:
                        c11 = v5.l(b10, b11);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                c10 = e(b10, b11);
            }
            c10 = !c11;
        } else {
            c10 = c(b10, b11);
        }
        return c10 ? q.f35926k : q.f35927l;
    }
}
