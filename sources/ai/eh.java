package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class eh implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ IOException f3663w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ih f3664x;

    public eh(ih ihVar, IOException iOException) {
        this.f3664x = ihVar;
        this.f3663w = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jh jhVar;
        jhVar = this.f3664x.A;
        jhVar.c(this.f3663w);
    }
}
