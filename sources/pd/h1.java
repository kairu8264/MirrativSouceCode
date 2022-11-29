package pd;

/* loaded from: classes2.dex */
public abstract class h1 {

    /* loaded from: classes2.dex */
    public static final class a extends h1 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46909a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46910a;

        public b(int i10) {
            super(null);
            this.f46910a = i10;
        }

        public final int a() {
            return this.f46910a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f46910a == ((b) obj).f46910a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46910a);
        }

        public String toString() {
            return "UpdateDemographicLastShownTime(demographicLastShownTime=" + this.f46910a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46911a;

        public c(int i10) {
            super(null);
            this.f46911a = i10;
        }

        public final int a() {
            return this.f46911a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f46911a == ((c) obj).f46911a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46911a);
        }

        public String toString() {
            return "UpdateSeasonResultPopUpLastShowMonth(month=" + this.f46911a + ')';
        }
    }

    public h1() {
    }

    public /* synthetic */ h1(jo.h hVar) {
        this();
    }
}
