package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class oe2 implements xc2<pe2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f7730a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7731b;

    /* renamed from: c  reason: collision with root package name */
    public final ti0 f7732c;

    public oe2(ti0 ti0Var, t43 t43Var, String str, byte[] bArr) {
        this.f7732c = ti0Var;
        this.f7730a = t43Var;
        this.f7731b = str;
    }

    @Override // ai.xc2
    public final s43<pe2> zza() {
        new mk0();
        final s43 a10 = j43.a(null);
        if (((Boolean) ft.c().c(ox.f7977e4)).booleanValue()) {
            a10 = j43.a(null);
        }
        final s43 a11 = j43.a(null);
        return j43.n(a10, a11).a(new Callable(a10, a11) { // from class: ai.ne2

            /* renamed from: a  reason: collision with root package name */
            public final s43 f7290a;

            /* renamed from: b  reason: collision with root package name */
            public final s43 f7291b;

            {
                this.f7290a = a10;
                this.f7291b = a11;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new pe2((String) this.f7290a.get(), (String) this.f7291b.get());
            }
        }, hk0.f4878a);
    }
}
