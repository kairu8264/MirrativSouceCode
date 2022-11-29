package ai;

/* loaded from: classes3.dex */
public final class uo3 extends po3 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f10783f = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Object f10784d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f10785e;

    public uo3(q7 q7Var, Object obj, Object obj2) {
        super(q7Var);
        this.f10784d = obj;
        this.f10785e = obj2;
    }

    public static /* synthetic */ Object p(uo3 uo3Var) {
        return uo3Var.f10785e;
    }

    public static uo3 q(k5 k5Var) {
        return new uo3(new wo3(k5Var), p7.f8322o, f10783f);
    }

    public static uo3 r(q7 q7Var, Object obj, Object obj2) {
        return new uo3(q7Var, obj, obj2);
    }

    @Override // ai.q7
    public final p7 f(int i10, p7 p7Var, long j10) {
        this.f8489c.f(i10, p7Var, j10);
        if (sb.H(p7Var.f8326a, this.f10784d)) {
            p7Var.f8326a = p7.f8322o;
        }
        return p7Var;
    }

    @Override // ai.q7
    public final n7 h(int i10, n7 n7Var, boolean z10) {
        this.f8489c.h(i10, n7Var, z10);
        if (sb.H(n7Var.f7215b, this.f10785e) && z10) {
            n7Var.f7215b = f10783f;
        }
        return n7Var;
    }

    @Override // ai.po3, ai.q7
    public final int i(Object obj) {
        Object obj2;
        q7 q7Var = this.f8489c;
        if (f10783f.equals(obj) && (obj2 = this.f10785e) != null) {
            obj = obj2;
        }
        return q7Var.i(obj);
    }

    @Override // ai.po3, ai.q7
    public final Object j(int i10) {
        Object j10 = this.f8489c.j(i10);
        return sb.H(j10, this.f10785e) ? f10783f : j10;
    }

    public final uo3 s(q7 q7Var) {
        return new uo3(q7Var, this.f10784d, this.f10785e);
    }
}
