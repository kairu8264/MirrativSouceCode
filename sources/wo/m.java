package wo;

/* loaded from: classes4.dex */
public final class m<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f59279b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public static final c f59280c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Object f59281a;

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f59282a;

        public a(Throwable th2) {
            this.f59282a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && jo.p.c(this.f59282a, ((a) obj).f59282a);
        }

        public int hashCode() {
            Throwable th2 = this.f59282a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Override // wo.m.c
        public String toString() {
            return "Closed(" + this.f59282a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final <E> Object a(Throwable th2) {
            return m.c(new a(th2));
        }

        public final <E> Object b() {
            return m.c(m.f59280c);
        }

        public final <E> Object c(E e10) {
            return m.c(e10);
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ m(Object obj) {
        this.f59281a = obj;
    }

    public static final /* synthetic */ m b(Object obj) {
        return new m(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof m) && jo.p.c(obj, ((m) obj2).l());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f59282a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T g(Object obj) {
        Throwable th2;
        if (obj instanceof c) {
            if (!(obj instanceof a) || (th2 = ((a) obj).f59282a) == null) {
                throw new IllegalStateException(jo.p.o("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
            }
            throw th2;
        }
        return obj;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof a;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof c);
    }

    public static String k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f59281a, obj);
    }

    public int hashCode() {
        return h(this.f59281a);
    }

    public final /* synthetic */ Object l() {
        return this.f59281a;
    }

    public String toString() {
        return k(this.f59281a);
    }
}
