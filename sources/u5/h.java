package u5;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public l5.i f54408w;

    /* renamed from: x  reason: collision with root package name */
    public String f54409x;

    /* renamed from: y  reason: collision with root package name */
    public WorkerParameters.a f54410y;

    public h(l5.i iVar, String str, WorkerParameters.a aVar) {
        this.f54408w = iVar;
        this.f54409x = str;
        this.f54410y = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f54408w.m().k(this.f54409x, this.f54410y);
    }
}
