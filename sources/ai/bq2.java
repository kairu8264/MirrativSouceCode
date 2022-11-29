package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class bq2 extends ja1<dq2> implements vp2<wp2> {
    public bq2(Set<gc1<dq2>> set) {
        super(set);
    }

    @Override // ai.vp2
    public final void K(final hp2<wp2, ?> hp2Var) {
        C0(new ia1(hp2Var) { // from class: ai.xp2

            /* renamed from: a  reason: collision with root package name */
            public final hp2 f12060a;

            {
                this.f12060a = hp2Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                hp2 hp2Var2 = this.f12060a;
                ((dq2) obj).A((wp2) hp2Var2.a(), hp2Var2.b());
            }
        });
    }

    @Override // ai.vp2
    public final void N(final hp2<wp2, ?> hp2Var) {
        C0(new ia1(hp2Var) { // from class: ai.yp2

            /* renamed from: a  reason: collision with root package name */
            public final hp2 f12704a;

            {
                this.f12704a = hp2Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                hp2 hp2Var2 = this.f12704a;
                ((dq2) obj).K((wp2) hp2Var2.a(), hp2Var2.b());
            }
        });
    }

    @Override // ai.vp2
    public final void b0(final hp2<wp2, ?> hp2Var) {
        C0(new ia1(hp2Var) { // from class: ai.aq2

            /* renamed from: a  reason: collision with root package name */
            public final hp2 f1975a;

            {
                this.f1975a = hp2Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                hp2 hp2Var2 = this.f1975a;
                ((dq2) obj).c((wp2) hp2Var2.a(), hp2Var2.b());
            }
        });
    }

    @Override // ai.vp2
    public final void e0(final hp2<wp2, ?> hp2Var, final Throwable th2) {
        C0(new ia1(hp2Var, th2) { // from class: ai.zp2

            /* renamed from: a  reason: collision with root package name */
            public final hp2 f13069a;

            /* renamed from: b  reason: collision with root package name */
            public final Throwable f13070b;

            {
                this.f13069a = hp2Var;
                this.f13070b = th2;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                hp2 hp2Var2 = this.f13069a;
                Throwable th3 = this.f13070b;
                ((dq2) obj).n((wp2) hp2Var2.a(), hp2Var2.b(), th3);
            }
        });
    }
}
