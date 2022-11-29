package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final s.g<RecyclerView.e0, a> f16105a = new s.g<>();

    /* renamed from: b  reason: collision with root package name */
    public final s.e<RecyclerView.e0> f16106b = new s.e<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static n3.e<a> f16107d = new n3.f(20);

        /* renamed from: a  reason: collision with root package name */
        public int f16108a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.m.c f16109b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.m.c f16110c;

        public static void a() {
            do {
            } while (f16107d.acquire() != null);
        }

        public static a b() {
            a acquire = f16107d.acquire();
            return acquire == null ? new a() : acquire;
        }

        public static void c(a aVar) {
            aVar.f16108a = 0;
            aVar.f16109b = null;
            aVar.f16110c = null;
            f16107d.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.e0 e0Var);

        void c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    public void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.f16105a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f16105a.put(e0Var, aVar);
        }
        aVar.f16108a |= 2;
        aVar.f16109b = cVar;
    }

    public void b(RecyclerView.e0 e0Var) {
        a aVar = this.f16105a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f16105a.put(e0Var, aVar);
        }
        aVar.f16108a |= 1;
    }

    public void c(long j10, RecyclerView.e0 e0Var) {
        this.f16106b.m(j10, e0Var);
    }

    public void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.f16105a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f16105a.put(e0Var, aVar);
        }
        aVar.f16110c = cVar;
        aVar.f16108a |= 8;
    }

    public void e(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVar = this.f16105a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f16105a.put(e0Var, aVar);
        }
        aVar.f16109b = cVar;
        aVar.f16108a |= 4;
    }

    public void f() {
        this.f16105a.clear();
        this.f16106b.c();
    }

    public RecyclerView.e0 g(long j10) {
        return this.f16106b.h(j10);
    }

    public boolean h(RecyclerView.e0 e0Var) {
        a aVar = this.f16105a.get(e0Var);
        return (aVar == null || (aVar.f16108a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.e0 e0Var) {
        a aVar = this.f16105a.get(e0Var);
        return (aVar == null || (aVar.f16108a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.e0 e0Var) {
        p(e0Var);
    }

    public final RecyclerView.m.c l(RecyclerView.e0 e0Var, int i10) {
        a r10;
        RecyclerView.m.c cVar;
        int i11 = this.f16105a.i(e0Var);
        if (i11 >= 0 && (r10 = this.f16105a.r(i11)) != null) {
            int i12 = r10.f16108a;
            if ((i12 & i10) != 0) {
                int i13 = (~i10) & i12;
                r10.f16108a = i13;
                if (i10 == 4) {
                    cVar = r10.f16109b;
                } else if (i10 == 8) {
                    cVar = r10.f16110c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i13 & 12) == 0) {
                    this.f16105a.p(i11);
                    a.c(r10);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.m.c m(RecyclerView.e0 e0Var) {
        return l(e0Var, 8);
    }

    public RecyclerView.m.c n(RecyclerView.e0 e0Var) {
        return l(e0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f16105a.size() - 1; size >= 0; size--) {
            RecyclerView.e0 m10 = this.f16105a.m(size);
            a p10 = this.f16105a.p(size);
            int i10 = p10.f16108a;
            if ((i10 & 3) == 3) {
                bVar.b(m10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = p10.f16109b;
                if (cVar == null) {
                    bVar.b(m10);
                } else {
                    bVar.c(m10, cVar, p10.f16110c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(m10, p10.f16109b, p10.f16110c);
            } else if ((i10 & 12) == 12) {
                bVar.d(m10, p10.f16109b, p10.f16110c);
            } else if ((i10 & 4) != 0) {
                bVar.c(m10, p10.f16109b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(m10, p10.f16109b, p10.f16110c);
            }
            a.c(p10);
        }
    }

    public void p(RecyclerView.e0 e0Var) {
        a aVar = this.f16105a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.f16108a &= -2;
    }

    public void q(RecyclerView.e0 e0Var) {
        int q10 = this.f16106b.q() - 1;
        while (true) {
            if (q10 < 0) {
                break;
            } else if (e0Var == this.f16106b.r(q10)) {
                this.f16106b.o(q10);
                break;
            } else {
                q10--;
            }
        }
        a remove = this.f16105a.remove(e0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
