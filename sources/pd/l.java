package pd;

/* loaded from: classes2.dex */
public abstract class l {

    /* loaded from: classes2.dex */
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f47052a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.c f47053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, jf.c cVar) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(cVar, "closetAvatarModel");
            this.f47052a = str;
            this.f47053b = cVar;
        }

        public final jf.c a() {
            return this.f47053b;
        }

        public final String b() {
            return this.f47052a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f47052a, aVar.f47052a) && jo.p.c(this.f47053b, aVar.f47053b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47052a.hashCode() * 31) + this.f47053b.hashCode();
        }

        public String toString() {
            return "FetchClosetAvatarSucceeded(userId=" + this.f47052a + ", closetAvatarModel=" + this.f47053b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f47054a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10) {
            super(null);
            jo.p.h(str, "userId");
            this.f47054a = str;
            this.f47055b = i10;
        }

        public final int a() {
            return this.f47055b;
        }

        public final String b() {
            return this.f47054a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f47054a, bVar.f47054a) && this.f47055b == bVar.f47055b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f47054a.hashCode() * 31) + Integer.hashCode(this.f47055b);
        }

        public String toString() {
            return "SetMaxContinuousRecord(userId=" + this.f47054a + ", maxContinuousRecord=" + this.f47055b + ')';
        }
    }

    public l() {
    }

    public /* synthetic */ l(jo.h hVar) {
        this();
    }
}
