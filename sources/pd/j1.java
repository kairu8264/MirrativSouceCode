package pd;

/* loaded from: classes2.dex */
public abstract class j1 {

    /* loaded from: classes2.dex */
    public static final class a extends j1 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47035a;

        public a(long j10) {
            super(null);
            this.f47035a = j10;
        }

        public final long a() {
            return this.f47035a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47035a == ((a) obj).f47035a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47035a);
        }

        public String toString() {
            return "Reloaded(delayMillis=" + this.f47035a + ')';
        }
    }

    public j1() {
    }

    public /* synthetic */ j1(jo.h hVar) {
        this();
    }
}
