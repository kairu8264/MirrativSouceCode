package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class rb1 extends ja1<tb1> implements tb1 {
    public rb1(Set<gc1<tb1>> set) {
        super(set);
    }

    @Override // ai.tb1
    public final void c() {
        C0(qb1.f8865a);
    }

    @Override // ai.tb1
    public final void d() {
        C0(pb1.f8369a);
    }

    @Override // ai.tb1
    public final void l0(final String str, final String str2) {
        C0(new ia1(str, str2) { // from class: ai.ob1

            /* renamed from: a  reason: collision with root package name */
            public final String f7707a;

            /* renamed from: b  reason: collision with root package name */
            public final String f7708b;

            {
                this.f7707a = str;
                this.f7708b = str2;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((tb1) obj).l0(this.f7707a, this.f7708b);
            }
        });
    }

    @Override // ai.tb1
    public final void t(final String str) {
        C0(new ia1(str) { // from class: ai.nb1

            /* renamed from: a  reason: collision with root package name */
            public final String f7252a;

            {
                this.f7252a = str;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((tb1) obj).t(this.f7252a);
            }
        });
    }

    @Override // ai.tb1
    public final void v(final String str) {
        C0(new ia1(str) { // from class: ai.mb1

            /* renamed from: a  reason: collision with root package name */
            public final String f6864a;

            {
                this.f6864a = str;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((tb1) obj).v(this.f6864a);
            }
        });
    }
}
