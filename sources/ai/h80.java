package ai;

import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes3.dex */
public final class h80 {

    /* renamed from: a  reason: collision with root package name */
    public final k70 f4776a;

    /* renamed from: b  reason: collision with root package name */
    public s43<l70> f4777b;

    public h80(k70 k70Var) {
        this.f4776a = k70Var;
    }

    public final <I, O> k80<I, O> a(String str, q70<I> q70Var, p70<O> p70Var) {
        d();
        return new k80<>(this.f4777b, "google.afma.activeView.handleUpdate", q70Var, p70Var);
    }

    public final void b(final String str, final r30<? super l70> r30Var) {
        d();
        this.f4777b = j43.i(this.f4777b, new p33(str, r30Var) { // from class: ai.f80

            /* renamed from: a  reason: collision with root package name */
            public final String f3963a;

            /* renamed from: b  reason: collision with root package name */
            public final r30 f3964b;

            {
                this.f3963a = str;
                this.f3964b = r30Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                l70 l70Var = (l70) obj;
                l70Var.x0(this.f3963a, this.f3964b);
                return j43.a(l70Var);
            }
        }, hk0.f4883f);
    }

    public final void c(final String str, final r30<? super l70> r30Var) {
        this.f4777b = j43.j(this.f4777b, new bx2(str, r30Var) { // from class: ai.g80

            /* renamed from: a  reason: collision with root package name */
            public final String f4361a;

            /* renamed from: b  reason: collision with root package name */
            public final r30 f4362b;

            {
                this.f4361a = str;
                this.f4362b = r30Var;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                l70 l70Var = (l70) obj;
                l70Var.z0(this.f4361a, this.f4362b);
                return l70Var;
            }
        }, hk0.f4883f);
    }

    public final void d() {
        if (this.f4777b == null) {
            final mk0 mk0Var = new mk0();
            this.f4777b = mk0Var;
            this.f4776a.g(null).b(new qk0(mk0Var) { // from class: ai.d80

                /* renamed from: a  reason: collision with root package name */
                public final mk0 f3173a;

                {
                    this.f3173a = mk0Var;
                }

                @Override // ai.qk0
                public final void a(Object obj) {
                    this.f3173a.d((l70) obj);
                }
            }, new ok0(mk0Var) { // from class: ai.e80

                /* renamed from: a  reason: collision with root package name */
                public final mk0 f3580a;

                {
                    this.f3580a = mk0Var;
                }

                @Override // ai.ok0
                public final void zza() {
                    this.f3580a.e(new zzbtv("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
