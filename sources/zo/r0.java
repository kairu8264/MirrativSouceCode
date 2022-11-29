package zo;

import uo.c3;

/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final ao.g f63322a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f63323b;

    /* renamed from: c  reason: collision with root package name */
    public final c3<Object>[] f63324c;

    /* renamed from: d  reason: collision with root package name */
    public int f63325d;

    public r0(ao.g gVar, int i10) {
        this.f63322a = gVar;
        this.f63323b = new Object[i10];
        this.f63324c = new c3[i10];
    }

    public final void a(c3<?> c3Var, Object obj) {
        Object[] objArr = this.f63323b;
        int i10 = this.f63325d;
        objArr[i10] = obj;
        c3<Object>[] c3VarArr = this.f63324c;
        this.f63325d = i10 + 1;
        c3VarArr[i10] = c3Var;
    }

    public final void b(ao.g gVar) {
        int length = this.f63324c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            c3<Object> c3Var = this.f63324c[length];
            jo.p.e(c3Var);
            c3Var.z(gVar, this.f63323b[length]);
            if (i10 < 0) {
                return;
            }
            length = i10;
        }
    }
}
