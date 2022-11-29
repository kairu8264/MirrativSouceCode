package pd;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* loaded from: classes2.dex */
    public static final class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47048a;

        public a(boolean z10) {
            super(null);
            this.f47048a = z10;
        }

        public final boolean a() {
            return this.f47048a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47048a == ((a) obj).f47048a;
        }

        public int hashCode() {
            boolean z10 = this.f47048a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "AnnouncementNewBadgeVisibilityChange(isVisible=" + this.f47048a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47049a;

        public b(boolean z10) {
            super(null);
            this.f47049a = z10;
        }

        public final boolean a() {
            return this.f47049a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47049a == ((b) obj).f47049a;
        }

        public int hashCode() {
            boolean z10 = this.f47049a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CampaignNewBadgeVisibilityChange(isVisible=" + this.f47049a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47050a;

        public c(boolean z10) {
            super(null);
            this.f47050a = z10;
        }

        public final boolean a() {
            return this.f47050a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f47050a == ((c) obj).f47050a;
        }

        public int hashCode() {
            boolean z10 = this.f47050a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "PresentBoxNewBadgeVisibilityChange(isVisible=" + this.f47050a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47051a;

        public d(boolean z10) {
            super(null);
            this.f47051a = z10;
        }

        public final boolean a() {
            return this.f47051a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47051a == ((d) obj).f47051a;
        }

        public int hashCode() {
            boolean z10 = this.f47051a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "YoursNewBadgeVisibilityChange(isVisible=" + this.f47051a + ')';
        }
    }

    public k0() {
    }

    public /* synthetic */ k0(jo.h hVar) {
        this();
    }
}
