package ib;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36462a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: ib.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0471b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0471b f36463a = new C0471b();

        public C0471b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final String f36464a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            jo.p.h(str, "casterName");
            this.f36464a = str;
        }

        public final String a() {
            return this.f36464a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f36464a, ((c) obj).f36464a);
        }

        public int hashCode() {
            return this.f36464a.hashCode();
        }

        public String toString() {
            return "NotEnabledLiveNotification(casterName=" + this.f36464a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
