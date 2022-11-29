package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class fy extends gy {

    /* renamed from: w  reason: collision with root package name */
    public final wg.f f4246w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4247x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4248y;

    public fy(wg.f fVar, String str, String str2) {
        this.f4246w = fVar;
        this.f4247x = str;
        this.f4248y = str2;
    }

    @Override // ai.hy
    public final void U(yh.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f4246w.a((View) yh.b.z0(aVar));
    }

    @Override // ai.hy
    public final void a() {
        this.f4246w.b();
    }

    @Override // ai.hy
    public final String b() {
        return this.f4248y;
    }

    @Override // ai.hy
    public final void c() {
        this.f4246w.zzb();
    }

    @Override // ai.hy
    public final String zzb() {
        return this.f4247x;
    }
}
