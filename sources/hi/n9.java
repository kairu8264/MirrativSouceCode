package hi;

/* loaded from: classes3.dex */
public final class n9 implements ia {

    /* renamed from: b  reason: collision with root package name */
    public static final u9 f35875b = new l9();

    /* renamed from: a  reason: collision with root package name */
    public final u9 f35876a;

    public n9() {
        u9 u9Var;
        u9[] u9VarArr = new u9[2];
        u9VarArr[0] = p8.c();
        try {
            u9Var = (u9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            u9Var = f35875b;
        }
        u9VarArr[1] = u9Var;
        m9 m9Var = new m9(u9VarArr);
        b9.f(m9Var, "messageInfoFactory");
        this.f35876a = m9Var;
    }

    public static boolean b(s9 s9Var) {
        return s9Var.b() == 1;
    }

    @Override // hi.ia
    public final <T> ha<T> a(Class<T> cls) {
        ja.g(cls);
        s9 a10 = this.f35876a.a(cls);
        if (a10.zzb()) {
            if (t8.class.isAssignableFrom(cls)) {
                return aa.j(ja.b(), j8.b(), a10.zza());
            }
            return aa.j(ja.b0(), j8.a(), a10.zza());
        } else if (t8.class.isAssignableFrom(cls)) {
            if (b(a10)) {
                return z9.F(cls, a10, ca.b(), j9.d(), ja.b(), j8.b(), r9.b());
            }
            return z9.F(cls, a10, ca.b(), j9.d(), ja.b(), null, r9.b());
        } else if (b(a10)) {
            return z9.F(cls, a10, ca.a(), j9.c(), ja.b0(), j8.a(), r9.a());
        } else {
            return z9.F(cls, a10, ca.a(), j9.c(), ja.a(), null, r9.a());
        }
    }
}
