package yc;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: yc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1052a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final int f61616a;

        public C1052a(int i10) {
            super(null);
            this.f61616a = i10;
        }

        public final int a() {
            return this.f61616a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1052a) && this.f61616a == ((C1052a) obj).f61616a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f61616a);
        }

        public String toString() {
            return "BeforeYear(year=" + this.f61616a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61617a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final int f61618a;

        public c(int i10) {
            super(null);
            this.f61618a = i10;
        }

        public final int a() {
            return this.f61618a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f61618a == ((c) obj).f61618a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f61618a);
        }

        public String toString() {
            return "Year(year=" + this.f61618a + ')';
        }
    }

    public a() {
    }

    public /* synthetic */ a(jo.h hVar) {
        this();
    }
}
