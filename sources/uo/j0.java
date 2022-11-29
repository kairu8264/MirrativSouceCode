package uo;

import ao.g;

/* loaded from: classes4.dex */
public final class j0 {

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.p<ao.g, g.b, ao.g> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f56031w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final ao.g invoke(ao.g gVar, g.b bVar) {
            if (bVar instanceof h0) {
                return gVar.plus(((h0) bVar).C());
            }
            return gVar.plus(bVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.p<ao.g, g.b, ao.g> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.e0<ao.g> f56032w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f56033x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jo.e0<ao.g> e0Var, boolean z10) {
            super(2);
            this.f56032w = e0Var;
            this.f56033x = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, ao.g] */
        @Override // io.p
        /* renamed from: a */
        public final ao.g invoke(ao.g gVar, g.b bVar) {
            if (bVar instanceof h0) {
                g.b bVar2 = this.f56032w.f38136w.get(bVar.getKey());
                if (bVar2 == null) {
                    h0 h0Var = (h0) bVar;
                    if (this.f56033x) {
                        h0Var = h0Var.C();
                    }
                    return gVar.plus(h0Var);
                }
                jo.e0<ao.g> e0Var = this.f56032w;
                e0Var.f38136w = e0Var.f38136w.minusKey(bVar.getKey());
                return gVar.plus(((h0) bVar).I(bVar2));
            }
            return gVar.plus(bVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends jo.q implements io.p<Boolean, g.b, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f56034w = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof h0));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final ao.g a(ao.g gVar, ao.g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.plus(gVar2);
        }
        jo.e0 e0Var = new jo.e0();
        e0Var.f38136w = gVar2;
        ao.h hVar = ao.h.f16651w;
        ao.g gVar3 = (ao.g) gVar.fold(hVar, new b(e0Var, z10));
        if (c11) {
            e0Var.f38136w = ((ao.g) e0Var.f38136w).fold(hVar, a.f56031w);
        }
        return gVar3.plus((ao.g) e0Var.f38136w);
    }

    public static final String b(ao.g gVar) {
        o0 o0Var;
        String X;
        if (u0.c() && (o0Var = (o0) gVar.get(o0.f56073x)) != null) {
            p0 p0Var = (p0) gVar.get(p0.f56075x);
            String str = "coroutine";
            if (p0Var != null && (X = p0Var.X()) != null) {
                str = X;
            }
            return str + '#' + o0Var.X();
        }
        return null;
    }

    public static final boolean c(ao.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f56034w)).booleanValue();
    }

    public static final ao.g d(ao.g gVar, ao.g gVar2) {
        return !c(gVar2) ? gVar.plus(gVar2) : a(gVar, gVar2, false);
    }

    public static final ao.g e(q0 q0Var, ao.g gVar) {
        ao.g a10 = a(q0Var.getCoroutineContext(), gVar, true);
        ao.g plus = u0.c() ? a10.plus(new o0(u0.b().incrementAndGet())) : a10;
        return (a10 == g1.a() || a10.get(ao.e.f16648d) != null) ? plus : plus.plus(g1.a());
    }

    public static final i3<?> f(co.e eVar) {
        while (!(eVar instanceof d1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof i3) {
                return (i3) eVar;
            }
        }
        return null;
    }

    public static final i3<?> g(ao.d<?> dVar, ao.g gVar, Object obj) {
        if (dVar instanceof co.e) {
            if (gVar.get(j3.f56037w) != null) {
                i3<?> f10 = f((co.e) dVar);
                if (f10 != null) {
                    f10.b1(gVar, obj);
                }
                return f10;
            }
            return null;
        }
        return null;
    }
}
