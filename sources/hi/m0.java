package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class m0 extends x {
    public m0() {
        this.f36056a.add(n0.ASSIGN);
        this.f36056a.add(n0.CONST);
        this.f36056a.add(n0.CREATE_ARRAY);
        this.f36056a.add(n0.CREATE_OBJECT);
        this.f36056a.add(n0.EXPRESSION_LIST);
        this.f36056a.add(n0.GET);
        this.f36056a.add(n0.GET_INDEX);
        this.f36056a.add(n0.GET_PROPERTY);
        this.f36056a.add(n0.NULL);
        this.f36056a.add(n0.SET_PROPERTY);
        this.f36056a.add(n0.TYPEOF);
        this.f36056a.add(n0.UNDEFINED);
        this.f36056a.add(n0.VAR);
    }

    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        String str2;
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            v5.h(n0.ASSIGN.name(), 2, list);
            q b10 = u4Var.b(list.get(0));
            if (b10 instanceof u) {
                if (u4Var.h(b10.h())) {
                    q b11 = u4Var.b(list.get(1));
                    u4Var.g(b10.h(), b11);
                    return b11;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b10.h()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b10.getClass().getCanonicalName()));
        } else if (ordinal == 14) {
            v5.i(n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                    q b12 = u4Var.b(list.get(i11));
                    if (b12 instanceof u) {
                        u4Var.f(b12.h(), u4Var.b(list.get(i11 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b12.getClass().getCanonicalName()));
                    }
                }
                return q.f35921f;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            v5.i(n0.EXPRESSION_LIST.name(), 1, list);
            q qVar = q.f35921f;
            while (i10 < list.size()) {
                qVar = u4Var.b(list.get(i10));
                if (qVar instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return qVar;
        } else if (ordinal == 33) {
            v5.h(n0.GET.name(), 1, list);
            q b13 = u4Var.b(list.get(0));
            if (b13 instanceof u) {
                return u4Var.d(b13.h());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b13.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            v5.h(n0.NULL.name(), 0, list);
            return q.f35922g;
        } else if (ordinal == 58) {
            v5.h(n0.SET_PROPERTY.name(), 3, list);
            q b14 = u4Var.b(list.get(0));
            q b15 = u4Var.b(list.get(1));
            q b16 = u4Var.b(list.get(2));
            if (b14 != q.f35921f && b14 != q.f35922g) {
                if ((b14 instanceof f) && (b15 instanceof i)) {
                    ((f) b14).B(b15.e().intValue(), b16);
                } else if (b14 instanceof m) {
                    ((m) b14).k(b15.h(), b16);
                }
                return b16;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", b15.h(), b14.h()));
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            for (q qVar2 : list) {
                q b17 = u4Var.b(qVar2);
                if (!(b17 instanceof h)) {
                    fVar.B(i10, b17);
                    i10++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new n();
            }
            if (list.size() % 2 == 0) {
                n nVar = new n();
                while (i10 < list.size() - 1) {
                    q b18 = u4Var.b(list.get(i10));
                    q b19 = u4Var.b(list.get(i10 + 1));
                    if (!(b18 instanceof h) && !(b19 instanceof h)) {
                        nVar.k(b18.h(), b19);
                        i10 += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return nVar;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    v5.h(n0.TYPEOF.name(), 1, list);
                    q b20 = u4Var.b(list.get(0));
                    if (b20 instanceof v) {
                        str2 = "undefined";
                    } else if (b20 instanceof g) {
                        str2 = "boolean";
                    } else if (b20 instanceof i) {
                        str2 = "number";
                    } else if (b20 instanceof u) {
                        str2 = "string";
                    } else if (b20 instanceof p) {
                        str2 = "function";
                    } else if ((b20 instanceof r) || (b20 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b20));
                    } else {
                        str2 = "object";
                    }
                    return new u(str2);
                case 63:
                    v5.h(n0.UNDEFINED.name(), 0, list);
                    return q.f35921f;
                case 64:
                    v5.i(n0.VAR.name(), 1, list);
                    for (q qVar3 : list) {
                        q b21 = u4Var.b(qVar3);
                        if (b21 instanceof u) {
                            u4Var.e(b21.h(), q.f35921f);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b21.getClass().getCanonicalName()));
                        }
                    }
                    return q.f35921f;
                default:
                    return super.b(str);
            }
        } else {
            v5.h(n0.GET_PROPERTY.name(), 2, list);
            q b22 = u4Var.b(list.get(0));
            q b23 = u4Var.b(list.get(1));
            if ((b22 instanceof f) && v5.k(b23)) {
                return ((f) b22).r(b23.e().intValue());
            }
            if (b22 instanceof m) {
                return ((m) b22).s(b23.h());
            }
            if (b22 instanceof u) {
                if ("length".equals(b23.h())) {
                    return new i(Double.valueOf(b22.h().length()));
                }
                if (v5.k(b23) && b23.e().doubleValue() < b22.h().length()) {
                    return new u(String.valueOf(b22.h().charAt(b23.e().intValue())));
                }
            }
            return q.f35921f;
        }
    }
}
