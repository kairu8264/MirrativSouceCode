package m2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40531e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final m f40532f = new m(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f40533a;

    /* renamed from: b  reason: collision with root package name */
    public final int f40534b;

    /* renamed from: c  reason: collision with root package name */
    public final int f40535c;

    /* renamed from: d  reason: collision with root package name */
    public final int f40536d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public m(int i10, int i11, int i12, int i13) {
        this.f40533a = i10;
        this.f40534b = i11;
        this.f40535c = i12;
        this.f40536d = i13;
    }

    public final int a() {
        return this.f40536d - this.f40534b;
    }

    public final int b() {
        return this.f40533a;
    }

    public final int c() {
        return this.f40534b;
    }

    public final int d() {
        return this.f40535c - this.f40533a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f40533a == mVar.f40533a && this.f40534b == mVar.f40534b && this.f40535c == mVar.f40535c && this.f40536d == mVar.f40536d;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f40533a) * 31) + Integer.hashCode(this.f40534b)) * 31) + Integer.hashCode(this.f40535c)) * 31) + Integer.hashCode(this.f40536d);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f40533a + ", " + this.f40534b + ", " + this.f40535c + ", " + this.f40536d + ')';
    }
}
