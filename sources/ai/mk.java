package ai;

import android.view.Surface;

/* loaded from: classes3.dex */
public final class mk implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Surface f6960w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ok f6961x;

    public mk(ok okVar, Surface surface) {
        this.f6961x = okVar;
        this.f6960w = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk pkVar;
        pkVar = this.f6961x.f7837b;
        pkVar.e(this.f6960w);
    }
}
