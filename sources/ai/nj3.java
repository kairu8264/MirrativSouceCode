package ai;

/* loaded from: classes3.dex */
public final class nj3 implements vj3 {

    /* renamed from: a  reason: collision with root package name */
    public final vj3[] f7371a;

    public nj3(vj3... vj3VarArr) {
        this.f7371a = vj3VarArr;
    }

    @Override // ai.vj3
    public final boolean a(Class<?> cls) {
        vj3[] vj3VarArr = this.f7371a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (vj3VarArr[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // ai.vj3
    public final uj3 b(Class<?> cls) {
        vj3[] vj3VarArr = this.f7371a;
        for (int i10 = 0; i10 < 2; i10++) {
            vj3 vj3Var = vj3VarArr[i10];
            if (vj3Var.a(cls)) {
                return vj3Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
