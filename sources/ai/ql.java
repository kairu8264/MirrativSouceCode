package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class ql implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f8996w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ vl f8997x;

    public ql(vl vlVar, View view) {
        this.f8997x = vlVar;
        this.f8996w = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8997x.b(this.f8996w);
    }
}
