package wn;

/* loaded from: classes4.dex */
public final class d implements Comparable<d> {
    public static final a A = new a(null);
    public static final d B = e.a();

    /* renamed from: w  reason: collision with root package name */
    public final int f59216w;

    /* renamed from: x  reason: collision with root package name */
    public final int f59217x;

    /* renamed from: y  reason: collision with root package name */
    public final int f59218y;

    /* renamed from: z  reason: collision with root package name */
    public final int f59219z;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public d(int i10, int i11, int i12) {
        this.f59216w = i10;
        this.f59217x = i11;
        this.f59218y = i12;
        this.f59219z = c(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(d dVar) {
        jo.p.h(dVar, "other");
        return this.f59219z - dVar.f59219z;
    }

    public final int c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new po.i(0, 255).t(i10) && new po.i(0, 255).t(i11) && new po.i(0, 255).t(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f59219z == dVar.f59219z;
    }

    public int hashCode() {
        return this.f59219z;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f59216w);
        sb2.append('.');
        sb2.append(this.f59217x);
        sb2.append('.');
        sb2.append(this.f59218y);
        return sb2.toString();
    }
}
