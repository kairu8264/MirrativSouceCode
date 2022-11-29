package j2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37099c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final i f37100d = new i(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f37101a;

    /* renamed from: b  reason: collision with root package name */
    public final float f37102b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a() {
            return i.f37100d;
        }
    }

    public i() {
        this(0.0f, 0.0f, 3, null);
    }

    public i(float f10, float f11) {
        this.f37101a = f10;
        this.f37102b = f11;
    }

    public final float b() {
        return this.f37101a;
    }

    public final float c() {
        return this.f37102b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f37101a == iVar.f37101a) {
                return (this.f37102b > iVar.f37102b ? 1 : (this.f37102b == iVar.f37102b ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f37101a) * 31) + Float.hashCode(this.f37102b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f37101a + ", skewX=" + this.f37102b + ')';
    }

    public /* synthetic */ i(float f10, float f11, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
