package j2;

import c1.c0;
import c1.u;
import jo.p;
import jo.q;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37095a = a.f37096a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f37096a = new a();

        public final h a(long j10) {
            return (j10 > c0.f18634b.e() ? 1 : (j10 == c0.f18634b.e() ? 0 : -1)) != 0 ? new j2.b(j10, null) : b.f37097b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: b  reason: collision with root package name */
        public static final b f37097b = new b();

        @Override // j2.h
        public long a() {
            return c0.f18634b.e();
        }

        @Override // j2.h
        public u d() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<h> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final h invoke() {
            return h.this;
        }
    }

    long a();

    default h b(io.a<? extends h> aVar) {
        p.h(aVar, "other");
        return !p.c(this, b.f37097b) ? this : aVar.invoke();
    }

    default h c(h hVar) {
        p.h(hVar, "other");
        return hVar.d() != null ? hVar : d() != null ? this : hVar.b(new c());
    }

    u d();
}
