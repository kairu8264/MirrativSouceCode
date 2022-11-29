package pd;

/* loaded from: classes2.dex */
public abstract class l0 {

    /* loaded from: classes2.dex */
    public static final class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47056a;

        public a(boolean z10) {
            super(null);
            this.f47056a = z10;
        }

        public final boolean a() {
            return this.f47056a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47056a == ((a) obj).f47056a;
        }

        public int hashCode() {
            boolean z10 = this.f47056a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "AppNewBadgeVisibilityChanged(isVisible=" + this.f47056a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47057a;

        public b(boolean z10) {
            super(null);
            this.f47057a = z10;
        }

        public final boolean a() {
            return this.f47057a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47057a == ((b) obj).f47057a;
        }

        public int hashCode() {
            boolean z10 = this.f47057a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "EmomoNewBadgeVisibilityChanged(isVisible=" + this.f47057a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47058a;

        public c(int i10) {
            super(null);
            this.f47058a = i10;
        }

        public final int a() {
            return this.f47058a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f47058a == ((c) obj).f47058a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47058a);
        }

        public String toString() {
            return "PageChanged(index=" + this.f47058a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47059a;

        public d(boolean z10) {
            super(null);
            this.f47059a = z10;
        }

        public final boolean a() {
            return this.f47059a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47059a == ((d) obj).f47059a;
        }

        public int hashCode() {
            boolean z10 = this.f47059a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "RecommendNewBadgeVisibilityChanged(isVisible=" + this.f47059a + ')';
        }
    }

    public l0() {
    }

    public /* synthetic */ l0(jo.h hVar) {
        this();
    }
}
