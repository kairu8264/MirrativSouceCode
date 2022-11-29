package ph;

import android.os.Handler;
import ph.c;

/* loaded from: classes3.dex */
public final class w implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f47563a;

    public w(e eVar) {
        this.f47563a = eVar;
    }

    @Override // ph.c.a
    public final void a(boolean z10) {
        Handler handler;
        Handler handler2;
        e eVar = this.f47563a;
        handler = eVar.L;
        handler2 = eVar.L;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
