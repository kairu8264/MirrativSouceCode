package ai;

/* loaded from: classes3.dex */
public final class pj3 implements qk3 {

    /* renamed from: b  reason: collision with root package name */
    public static final vj3 f8446b = new mj3();

    /* renamed from: a  reason: collision with root package name */
    public final vj3 f8447a;

    public pj3() {
        vj3 vj3Var;
        vj3[] vj3VarArr = new vj3[2];
        vj3VarArr[0] = mi3.c();
        try {
            vj3Var = (vj3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            vj3Var = f8446b;
        }
        vj3VarArr[1] = vj3Var;
        nj3 nj3Var = new nj3(vj3VarArr);
        bj3.b(nj3Var, "messageInfoFactory");
        this.f8447a = nj3Var;
    }

    public static boolean b(uj3 uj3Var) {
        return uj3Var.b() == 1;
    }

    @Override // ai.qk3
    public final <T> ok3<T> a(Class<T> cls) {
        rk3.A(cls);
        uj3 b10 = this.f8447a.b(cls);
        if (b10.zza()) {
            if (ri3.class.isAssignableFrom(cls)) {
                return bk3.a(rk3.c(), gi3.a(), b10.zzb());
            }
            return bk3.a(rk3.a(), gi3.b(), b10.zzb());
        } else if (ri3.class.isAssignableFrom(cls)) {
            if (b(b10)) {
                return ak3.J(cls, b10, dk3.b(), kj3.e(), rk3.c(), gi3.a(), tj3.b());
            }
            return ak3.J(cls, b10, dk3.b(), kj3.e(), rk3.c(), null, tj3.b());
        } else if (b(b10)) {
            return ak3.J(cls, b10, dk3.a(), kj3.d(), rk3.a(), gi3.b(), tj3.a());
        } else {
            return ak3.J(cls, b10, dk3.a(), kj3.d(), rk3.b(), null, tj3.a());
        }
    }
}
