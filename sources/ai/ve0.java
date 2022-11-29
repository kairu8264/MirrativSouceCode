package ai;

/* loaded from: classes3.dex */
public final class ve0 extends xe0 {

    /* renamed from: w  reason: collision with root package name */
    public final String f11035w;

    /* renamed from: x  reason: collision with root package name */
    public final int f11036x;

    public ve0(String str, int i10) {
        this.f11035w = str;
        this.f11036x = i10;
    }

    @Override // ai.ye0
    public final int b() {
        return this.f11036x;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ve0)) {
            ve0 ve0Var = (ve0) obj;
            if (rh.n.a(this.f11035w, ve0Var.f11035w) && rh.n.a(Integer.valueOf(this.f11036x), Integer.valueOf(ve0Var.f11036x))) {
                return true;
            }
        }
        return false;
    }

    @Override // ai.ye0
    public final String zzb() {
        return this.f11035w;
    }
}
