package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class v91 extends ja1<xb> implements s20 {
    public v91(Set<gc1<xb>> set) {
        super(set);
    }

    @Override // ai.s20
    public final synchronized void w0(final String str, final String str2) {
        C0(new ia1(str, str2) { // from class: ai.u91

            /* renamed from: a  reason: collision with root package name */
            public final String f10659a;

            /* renamed from: b  reason: collision with root package name */
            public final String f10660b;

            {
                this.f10659a = str;
                this.f10660b = str2;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((xb) obj).v(this.f10659a, this.f10660b);
            }
        });
    }
}
