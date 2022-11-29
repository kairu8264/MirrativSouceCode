package ai;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class go3 extends p.e {

    /* renamed from: x  reason: collision with root package name */
    public final WeakReference<ny> f4534x;

    public go3(ny nyVar, byte[] bArr) {
        this.f4534x = new WeakReference<>(nyVar);
    }

    @Override // p.e
    public final void a(ComponentName componentName, p.c cVar) {
        ny nyVar = this.f4534x.get();
        if (nyVar != null) {
            nyVar.f(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ny nyVar = this.f4534x.get();
        if (nyVar != null) {
            nyVar.g();
        }
    }
}
