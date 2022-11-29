package o1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final e[] f43801a;

    public b(int i10, int i11) {
        e[] eVarArr = new e[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            eVarArr[i12] = new e(i11);
        }
        this.f43801a = eVarArr;
    }

    public final float a(int i10, int i11) {
        return this.f43801a[i10].a(i11);
    }

    public final e b(int i10) {
        return this.f43801a[i10];
    }

    public final void c(int i10, int i11, float f10) {
        this.f43801a[i10].c(i11, f10);
    }
}
