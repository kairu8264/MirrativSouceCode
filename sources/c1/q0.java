package c1;

/* loaded from: classes.dex */
public abstract class q0 {

    /* loaded from: classes.dex */
    public static final class a extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final u0 f18736a;

        public final u0 a() {
            return this.f18736a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f18736a, ((a) obj).f18736a);
        }

        public int hashCode() {
            return this.f18736a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final b1.h f18737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b1.h hVar) {
            super(null);
            jo.p.h(hVar, "rect");
            this.f18737a = hVar;
        }

        public final b1.h a() {
            return this.f18737a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f18737a, ((b) obj).f18737a);
        }

        public int hashCode() {
            return this.f18737a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final b1.j f18738a;

        /* renamed from: b  reason: collision with root package name */
        public final u0 f18739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b1.j jVar) {
            super(null);
            jo.p.h(jVar, "roundRect");
            u0 u0Var = null;
            this.f18738a = jVar;
            if (!r0.a(jVar)) {
                u0Var = n.a();
                u0Var.m(jVar);
            }
            this.f18739b = u0Var;
        }

        public final b1.j a() {
            return this.f18738a;
        }

        public final u0 b() {
            return this.f18739b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f18738a, ((c) obj).f18738a);
        }

        public int hashCode() {
            return this.f18738a.hashCode();
        }
    }

    public q0() {
    }

    public /* synthetic */ q0(jo.h hVar) {
        this();
    }
}
