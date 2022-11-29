package ai;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e62 implements h71 {

    /* renamed from: w  reason: collision with root package name */
    public final AtomicReference<iv> f3548w = new AtomicReference<>();

    public final void a(iv ivVar) {
        this.f3548w.set(ivVar);
    }

    @Override // ai.h71
    public final void p(final hs hsVar) {
        hi2.a(this.f3548w, new gi2(hsVar) { // from class: ai.d62

            /* renamed from: a  reason: collision with root package name */
            public final hs f3159a;

            {
                this.f3159a = hsVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((iv) obj).d4(this.f3159a);
            }
        });
    }
}
