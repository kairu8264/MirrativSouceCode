package l0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<j0> f39326a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39327b;

    /* renamed from: c  reason: collision with root package name */
    public int f39328c;

    /* renamed from: d  reason: collision with root package name */
    public final List<j0> f39329d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, d0> f39330e;

    /* renamed from: f  reason: collision with root package name */
    public final wn.f f39331f;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<HashMap<Object, LinkedHashSet<j0>>> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final HashMap<Object, LinkedHashSet<j0>> invoke() {
            HashMap<Object, LinkedHashSet<j0>> P;
            Object H;
            P = k.P();
            y0 y0Var = y0.this;
            int size = y0Var.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                j0 j0Var = y0Var.b().get(i10);
                H = k.H(j0Var);
                k.S(P, H, j0Var);
            }
            return P;
        }
    }

    public y0(List<j0> list, int i10) {
        jo.p.h(list, "keyInfos");
        this.f39326a = list;
        this.f39327b = i10;
        if (i10 >= 0) {
            this.f39329d = new ArrayList();
            HashMap<Integer, d0> hashMap = new HashMap<>();
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                j0 j0Var = this.f39326a.get(i12);
                hashMap.put(Integer.valueOf(j0Var.b()), new d0(i12, i11, j0Var.c()));
                i11 += j0Var.c();
            }
            this.f39330e = hashMap;
            this.f39331f = wn.g.a(new a());
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a() {
        return this.f39328c;
    }

    public final List<j0> b() {
        return this.f39326a;
    }

    public final HashMap<Object, LinkedHashSet<j0>> c() {
        return (HashMap) this.f39331f.getValue();
    }

    public final j0 d(int i10, Object obj) {
        Object R;
        R = k.R(c(), obj != null ? new i0(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
        return (j0) R;
    }

    public final int e() {
        return this.f39327b;
    }

    public final List<j0> f() {
        return this.f39329d;
    }

    public final int g(j0 j0Var) {
        jo.p.h(j0Var, "keyInfo");
        d0 d0Var = this.f39330e.get(Integer.valueOf(j0Var.b()));
        if (d0Var != null) {
            return d0Var.b();
        }
        return -1;
    }

    public final boolean h(j0 j0Var) {
        jo.p.h(j0Var, "keyInfo");
        return this.f39329d.add(j0Var);
    }

    public final void i(j0 j0Var, int i10) {
        jo.p.h(j0Var, "keyInfo");
        this.f39330e.put(Integer.valueOf(j0Var.b()), new d0(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        if (i10 > i11) {
            Collection<d0> values = this.f39330e.values();
            jo.p.g(values, "groupInfos.values");
            for (d0 d0Var : values) {
                int b10 = d0Var.b();
                if (i10 <= b10 && b10 < i10 + i12) {
                    d0Var.e((b10 - i10) + i11);
                } else if (i11 <= b10 && b10 < i10) {
                    d0Var.e(b10 + i12);
                }
            }
        } else if (i11 > i10) {
            Collection<d0> values2 = this.f39330e.values();
            jo.p.g(values2, "groupInfos.values");
            for (d0 d0Var2 : values2) {
                int b11 = d0Var2.b();
                if (i10 <= b11 && b11 < i10 + i12) {
                    d0Var2.e((b11 - i10) + i11);
                } else if (i10 + 1 <= b11 && b11 < i11) {
                    d0Var2.e(b11 - i12);
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        if (i10 > i11) {
            Collection<d0> values = this.f39330e.values();
            jo.p.g(values, "groupInfos.values");
            for (d0 d0Var : values) {
                int c10 = d0Var.c();
                if (c10 == i10) {
                    d0Var.f(i11);
                } else if (i11 <= c10 && c10 < i10) {
                    d0Var.f(c10 + 1);
                }
            }
        } else if (i11 > i10) {
            Collection<d0> values2 = this.f39330e.values();
            jo.p.g(values2, "groupInfos.values");
            for (d0 d0Var2 : values2) {
                int c11 = d0Var2.c();
                if (c11 == i10) {
                    d0Var2.f(i11);
                } else if (i10 + 1 <= c11 && c11 < i11) {
                    d0Var2.f(c11 - 1);
                }
            }
        }
    }

    public final void l(int i10) {
        this.f39328c = i10;
    }

    public final int m(j0 j0Var) {
        jo.p.h(j0Var, "keyInfo");
        d0 d0Var = this.f39330e.get(Integer.valueOf(j0Var.b()));
        if (d0Var != null) {
            return d0Var.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int b10;
        d0 d0Var = this.f39330e.get(Integer.valueOf(i10));
        if (d0Var != null) {
            int b11 = d0Var.b();
            int a10 = i11 - d0Var.a();
            d0Var.d(i11);
            if (a10 != 0) {
                Collection<d0> values = this.f39330e.values();
                jo.p.g(values, "groupInfos.values");
                for (d0 d0Var2 : values) {
                    if (d0Var2.b() >= b11 && !jo.p.c(d0Var2, d0Var) && (b10 = d0Var2.b() + a10) >= 0) {
                        d0Var2.e(b10);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int o(j0 j0Var) {
        jo.p.h(j0Var, "keyInfo");
        d0 d0Var = this.f39330e.get(Integer.valueOf(j0Var.b()));
        return d0Var != null ? d0Var.a() : j0Var.c();
    }
}
