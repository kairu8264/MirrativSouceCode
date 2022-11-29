package uo;

/* loaded from: classes4.dex */
public final class l1 implements x1 {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f56052w;

    public l1(boolean z10) {
        this.f56052w = z10;
    }

    @Override // uo.x1
    public p2 f() {
        return null;
    }

    @Override // uo.x1
    public boolean isActive() {
        return this.f56052w;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
