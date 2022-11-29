package k6;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38437a = new a();

        public a() {
            super(null);
        }

        public String toString() {
            return "Dimension.Original";
        }
    }

    /* renamed from: k6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0535b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f38438a;

        public C0535b(int i10) {
            super(null);
            this.f38438a = i10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0535b) && this.f38438a == ((C0535b) obj).f38438a;
        }

        public int hashCode() {
            return this.f38438a;
        }

        public String toString() {
            return String.valueOf(this.f38438a);
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
