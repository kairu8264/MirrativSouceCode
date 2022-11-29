package ud;

import java.util.Arrays;
import ud.a;

/* loaded from: classes2.dex */
public final class a0 implements a {
    public final androidx.lifecycle.e0<Boolean> A;

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f54727w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54728x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54729y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54730z;

    public a0() {
        this(null, 1, null);
    }

    public a0(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54727w = enumC0862a;
        this.f54728x = new androidx.lifecycle.e0<>("");
        this.f54729y = new androidx.lifecycle.e0<>("");
        this.f54730z = new androidx.lifecycle.e0<>("");
        this.A = new androidx.lifecycle.e0<>(Boolean.FALSE);
    }

    public final void a(jf.q qVar) {
        jo.p.h(qVar, "gift");
        this.f54728x.p(qVar.h());
        androidx.lifecycle.e0<String> e0Var = this.f54729y;
        jo.i0 i0Var = jo.i0.f38149a;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(qVar.e())}, 1));
        jo.p.g(format, "format(format, *args)");
        e0Var.p(format);
        this.f54730z.p(qVar.i());
        this.A.p(Boolean.valueOf(qVar.q() != ve.d.EMOMO_RUN_SCORE));
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.f54729y;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f54728x;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f54730z;
    }

    public final androidx.lifecycle.e0<Boolean> e() {
        return this.A;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54727w;
    }

    public /* synthetic */ a0(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.EMOMO_RUN_GIFT : enumC0862a);
    }
}
