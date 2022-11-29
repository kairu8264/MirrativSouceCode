package n6;

import j6.e;
import j6.j;
import j6.p;
import n6.c;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f41589a;

    /* renamed from: b  reason: collision with root package name */
    public final j f41590b;

    /* loaded from: classes.dex */
    public static final class a implements c.a {
        @Override // n6.c.a
        public c a(d dVar, j jVar) {
            return new b(dVar, jVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, j jVar) {
        this.f41589a = dVar;
        this.f41590b = jVar;
    }

    @Override // n6.c
    public void a() {
        j jVar = this.f41590b;
        if (jVar instanceof p) {
            this.f41589a.e(((p) jVar).a());
        } else if (jVar instanceof e) {
            this.f41589a.k(jVar.a());
        }
    }
}
