package y;

/* loaded from: classes.dex */
public abstract class c {

    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final q1.a f60685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.a aVar) {
            super(null);
            jo.p.h(aVar, "alignmentLine");
            this.f60685a = aVar;
        }

        @Override // y.c
        public int a(q1.q0 q0Var) {
            jo.p.h(q0Var, "placeable");
            return q0Var.L(this.f60685a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f60685a, ((a) obj).f60685a);
        }

        public int hashCode() {
            return this.f60685a.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.f60685a + ')';
        }
    }

    public c() {
    }

    public /* synthetic */ c(jo.h hVar) {
        this();
    }

    public abstract int a(q1.q0 q0Var);
}
