package hi;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class j0 extends x {
    public j0() {
        this.f36056a.add(n0.FOR_IN);
        this.f36056a.add(n0.FOR_IN_CONST);
        this.f36056a.add(n0.FOR_IN_LET);
        this.f36056a.add(n0.FOR_LET);
        this.f36056a.add(n0.FOR_OF);
        this.f36056a.add(n0.FOR_OF_CONST);
        this.f36056a.add(n0.FOR_OF_LET);
        this.f36056a.add(n0.WHILE);
    }

    public static q c(h0 h0Var, Iterator<q> it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q c10 = h0Var.a(it.next()).c((f) qVar);
                if (c10 instanceof h) {
                    h hVar = (h) c10;
                    if ("break".equals(hVar.b())) {
                        return q.f35921f;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
        }
        return q.f35921f;
    }

    public static q d(h0 h0Var, q qVar, q qVar2) {
        return c(h0Var, qVar.j(), qVar2);
    }

    public static q e(h0 h0Var, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // hi.x
    public final q a(String str, u4 u4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    v5.h(n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof u) {
                        return d(new i0(u4Var, list.get(0).h()), u4Var.b(list.get(1)), u4Var.b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    v5.h(n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof u) {
                        return d(new f0(u4Var, list.get(0).h()), u4Var.b(list.get(1)), u4Var.b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    v5.h(n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof u) {
                        return d(new g0(u4Var, list.get(0).h()), u4Var.b(list.get(1)), u4Var.b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    v5.h(n0.FOR_LET.name(), 4, list);
                    q b10 = u4Var.b(list.get(0));
                    if (b10 instanceof f) {
                        f fVar = (f) b10;
                        q qVar = list.get(1);
                        q qVar2 = list.get(2);
                        q b11 = u4Var.b(list.get(3));
                        u4 a10 = u4Var.a();
                        for (int i10 = 0; i10 < fVar.p(); i10++) {
                            String h10 = fVar.r(i10).h();
                            a10.g(h10, u4Var.d(h10));
                        }
                        while (u4Var.b(qVar).f().booleanValue()) {
                            q c10 = u4Var.c((f) b11);
                            if (c10 instanceof h) {
                                h hVar = (h) c10;
                                if ("break".equals(hVar.b())) {
                                    return q.f35921f;
                                }
                                if ("return".equals(hVar.b())) {
                                    return hVar;
                                }
                            }
                            u4 a11 = u4Var.a();
                            for (int i11 = 0; i11 < fVar.p(); i11++) {
                                String h11 = fVar.r(i11).h();
                                a11.g(h11, a10.d(h11));
                            }
                            a11.b(qVar2);
                            a10 = a11;
                        }
                        return q.f35921f;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    v5.h(n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof u) {
                        return e(new i0(u4Var, list.get(0).h()), u4Var.b(list.get(1)), u4Var.b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    v5.h(n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof u) {
                        return e(new f0(u4Var, list.get(0).h()), u4Var.b(list.get(1)), u4Var.b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    v5.h(n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof u) {
                        return e(new g0(u4Var, list.get(0).h()), u4Var.b(list.get(1)), u4Var.b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.b(str);
            }
        }
        v5.h(n0.WHILE.name(), 4, list);
        q qVar3 = list.get(0);
        q qVar4 = list.get(1);
        q b12 = u4Var.b(list.get(3));
        if (u4Var.b(list.get(2)).f().booleanValue()) {
            q c11 = u4Var.c((f) b12);
            if (c11 instanceof h) {
                h hVar2 = (h) c11;
                if ("break".equals(hVar2.b())) {
                    return q.f35921f;
                }
                if ("return".equals(hVar2.b())) {
                    return hVar2;
                }
            }
        }
        while (u4Var.b(qVar3).f().booleanValue()) {
            q c12 = u4Var.c((f) b12);
            if (c12 instanceof h) {
                h hVar3 = (h) c12;
                if ("break".equals(hVar3.b())) {
                    return q.f35921f;
                }
                if ("return".equals(hVar3.b())) {
                    return hVar3;
                }
            }
            u4Var.b(qVar4);
        }
        return q.f35921f;
    }
}
