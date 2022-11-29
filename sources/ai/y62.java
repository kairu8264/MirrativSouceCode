package ai;

/* loaded from: classes3.dex */
public final class y62 implements e43<u01> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q62 f12469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cf1 f12470b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z62 f12471c;

    public y62(z62 z62Var, q62 q62Var, cf1 cf1Var) {
        this.f12471c = z62Var;
        this.f12469a = q62Var;
        this.f12470b = cf1Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        or0 or0Var;
        final sr h10 = this.f12470b.a().h(th2);
        this.f12470b.b().z(h10);
        or0Var = this.f12471c.f12895b;
        or0Var.h().execute(new Runnable(this, h10) { // from class: ai.x62

            /* renamed from: w  reason: collision with root package name */
            public final y62 f11877w;

            /* renamed from: x  reason: collision with root package name */
            public final sr f11878x;

            {
                this.f11877w = this;
                this.f11878x = h10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o62 o62Var;
                y62 y62Var = this.f11877w;
                sr srVar = this.f11878x;
                o62Var = y62Var.f12471c.f12897d;
                o62Var.e().z(srVar);
            }
        });
        om2.a(h10.f9916w, th2, "NativeAdLoader.onFailure");
        this.f12469a.zza();
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(u01 u01Var) {
        o62 o62Var;
        or0 or0Var;
        u01 u01Var2 = u01Var;
        synchronized (this.f12471c) {
            f91 f10 = u01Var2.f();
            o62Var = this.f12471c.f12897d;
            f10.a(o62Var.c());
            this.f12469a.b(u01Var2);
            or0Var = this.f12471c.f12895b;
            or0Var.h().execute(new Runnable(this) { // from class: ai.w62

                /* renamed from: w  reason: collision with root package name */
                public final y62 f11503w;

                {
                    this.f11503w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o62 o62Var2;
                    o62Var2 = this.f11503w.f12471c.f12897d;
                    o62Var2.d().a();
                }
            });
        }
    }
}
