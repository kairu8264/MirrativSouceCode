package hi;

/* loaded from: classes3.dex */
public final class m9 implements u9 {

    /* renamed from: a  reason: collision with root package name */
    public final u9[] f35856a;

    public m9(u9... u9VarArr) {
        this.f35856a = u9VarArr;
    }

    @Override // hi.u9
    public final s9 a(Class<?> cls) {
        u9[] u9VarArr = this.f35856a;
        for (int i10 = 0; i10 < 2; i10++) {
            u9 u9Var = u9VarArr[i10];
            if (u9Var.b(cls)) {
                return u9Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // hi.u9
    public final boolean b(Class<?> cls) {
        u9[] u9VarArr = this.f35856a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (u9VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
