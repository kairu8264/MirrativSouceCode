package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class d61 extends ja1<v41> {
    public d61(Set<gc1<v41>> set) {
        super(set);
    }

    public final void S0(final ye0 ye0Var, final String str, final String str2) {
        C0(new ia1(ye0Var, str, str2) { // from class: ai.b61

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f2250a;

            /* renamed from: b  reason: collision with root package name */
            public final String f2251b;

            /* renamed from: c  reason: collision with root package name */
            public final String f2252c;

            {
                this.f2250a = ye0Var;
                this.f2251b = str;
                this.f2252c = str2;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((v41) obj).B(this.f2250a, this.f2251b, this.f2252c);
            }
        });
    }

    public final void a() {
        C0(c61.f2741a);
    }

    public final void b() {
        C0(z51.f12888a);
    }

    public final void d() {
        C0(a61.f1754a);
    }

    public final void zza() {
        C0(x51.f11871a);
    }

    public final void zzb() {
        C0(y51.f12454a);
    }
}
