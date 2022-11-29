package ai;

/* loaded from: classes3.dex */
public final class wr3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11728a;

    /* renamed from: b  reason: collision with root package name */
    public final w6[] f11729b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11730c;

    /* renamed from: d  reason: collision with root package name */
    public final br3[] f11731d;

    public wr3(w6[] w6VarArr, br3[] br3VarArr, Object obj, byte[] bArr) {
        this.f11729b = w6VarArr;
        this.f11731d = (br3[]) br3VarArr.clone();
        this.f11730c = obj;
        this.f11728a = w6VarArr.length;
    }

    public final boolean a(int i10) {
        return this.f11729b[i10] != null;
    }

    public final boolean b(wr3 wr3Var, int i10) {
        return wr3Var != null && sb.H(this.f11729b[i10], wr3Var.f11729b[i10]) && sb.H(this.f11731d[i10], wr3Var.f11731d[i10]);
    }
}
