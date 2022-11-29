package uk;

import android.os.Bundle;
import oi.a;
import tk.a;

/* loaded from: classes.dex */
public final class c implements a.InterfaceC0684a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f55968a;

    public c(d dVar) {
        this.f55968a = dVar;
    }

    @Override // pi.d6
    public final void a(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (this.f55968a.f55969a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.c(str2));
            bVar = this.f55968a.f55970b;
            bVar.a(2, bundle2);
        }
    }
}
