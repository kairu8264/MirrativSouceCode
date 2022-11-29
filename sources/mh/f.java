package mh;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
public final class f extends ei.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f41149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, Looper looper) {
        super(looper);
        this.f41149a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d.d(this.f41149a, message);
    }
}
