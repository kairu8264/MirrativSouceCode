package ai;

/* loaded from: classes3.dex */
public final class qw2 {
    public static <V> s43<V> a(vi.g<V> gVar) {
        final a53 E = a53.E();
        gVar.b(z43.a(), new vi.c(E) { // from class: ai.pw2

            /* renamed from: a  reason: collision with root package name */
            public final a53 f8713a;

            {
                this.f8713a = E;
            }

            @Override // vi.c
            public final void a(vi.g gVar2) {
                a53 a53Var = this.f8713a;
                if (gVar2.q()) {
                    a53Var.cancel(false);
                } else if (gVar2.s()) {
                    a53Var.u(gVar2.o());
                } else {
                    Exception n10 = gVar2.n();
                    if (n10 != null) {
                        a53Var.v(n10);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return E;
    }
}
