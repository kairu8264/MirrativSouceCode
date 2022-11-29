package ai;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class mb implements ga {

    /* renamed from: a  reason: collision with root package name */
    public Message f6862a;

    /* renamed from: b  reason: collision with root package name */
    public nb f6863b;

    public mb() {
    }

    public /* synthetic */ mb(lb lbVar) {
    }

    public final mb a(Message message, nb nbVar) {
        this.f6862a = message;
        this.f6863b = nbVar;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.f6862a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c();
        return sendMessageAtFrontOfQueue;
    }

    public final void c() {
        this.f6862a = null;
        this.f6863b = null;
        nb.b(this);
    }

    @Override // ai.ga
    public final void zza() {
        Message message = this.f6862a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        c();
    }
}
