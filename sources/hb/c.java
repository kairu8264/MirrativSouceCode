package hb;

/* loaded from: classes2.dex */
public abstract class c {

    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static final int f34732c = jf.c.f37907z;

        /* renamed from: a  reason: collision with root package name */
        public final String f34733a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.c f34734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, jf.c cVar) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(cVar, "closetAvatarModel");
            this.f34733a = str;
            this.f34734b = cVar;
        }

        public final jf.c a() {
            return this.f34734b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f34733a, aVar.f34733a) && jo.p.c(this.f34734b, aVar.f34734b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f34733a.hashCode() * 31) + this.f34734b.hashCode();
        }

        public String toString() {
            return "FetchClosetAvatarSucceeded(userId=" + this.f34733a + ", closetAvatarModel=" + this.f34734b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f34735a;

        public b(boolean z10) {
            super(null);
            this.f34735a = z10;
        }

        public final boolean a() {
            return this.f34735a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f34735a == ((b) obj).f34735a;
        }

        public int hashCode() {
            boolean z10 = this.f34735a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "VisibilityChanged(isVisible=" + this.f34735a + ')';
        }
    }

    public c() {
    }

    public /* synthetic */ c(jo.h hVar) {
        this();
    }
}
