package uk;

import android.os.Bundle;
import oi.a;
import tk.a;

/* loaded from: classes.dex */
public final class e implements a.InterfaceC0684a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f55973a;

    public e(f fVar) {
        this.f55973a = fVar;
    }

    @Override // pi.d6
    public final void a(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (str == null || str.equals("crash") || !b.h(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        bVar = this.f55973a.f55974a;
        bVar.a(3, bundle2);
    }
}
