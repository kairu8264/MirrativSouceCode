package ai;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
public final class gc extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hc f4385a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(hc hcVar, Looper looper) {
        super(looper);
        this.f4385a = hcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f4385a.d(message);
    }
}
