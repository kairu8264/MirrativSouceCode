package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class k42 implements wg.f {

    /* renamed from: a  reason: collision with root package name */
    public wg.f f6078a;

    @Override // wg.f
    public final synchronized void a(View view) {
        wg.f fVar = this.f6078a;
        if (fVar != null) {
            fVar.a(view);
        }
    }

    @Override // wg.f
    public final synchronized void b() {
        wg.f fVar = this.f6078a;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final synchronized void c(wg.f fVar) {
        this.f6078a = fVar;
    }

    @Override // wg.f
    public final synchronized void zzb() {
        wg.f fVar = this.f6078a;
        if (fVar != null) {
            fVar.zzb();
        }
    }
}
