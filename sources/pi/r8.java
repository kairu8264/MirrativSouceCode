package pi;

import android.content.ComponentName;

/* loaded from: classes3.dex */
public final class r8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ComponentName f48198w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ v8 f48199x;

    public r8(v8 v8Var, ComponentName componentName) {
        this.f48199x = v8Var;
        this.f48198w = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w8.M(this.f48199x.f48290y, this.f48198w);
    }
}
