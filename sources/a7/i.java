package a7;

/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f580a;

    /* renamed from: b  reason: collision with root package name */
    public final a f581b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f582c;

    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public i(String str, a aVar, boolean z10) {
        this.f580a = str;
        this.f581b = aVar;
        this.f582c = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        if (!fVar.p()) {
            f7.d.c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new u6.l(this);
    }

    public a b() {
        return this.f581b;
    }

    public String c() {
        return this.f580a;
    }

    public boolean d() {
        return this.f582c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f581b + '}';
    }
}
