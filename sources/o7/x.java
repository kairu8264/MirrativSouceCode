package o7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public boolean f44263a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f44264b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((u) message.obj).c();
                return true;
            }
            return false;
        }
    }

    public synchronized void a(u<?> uVar, boolean z10) {
        if (!this.f44263a && !z10) {
            this.f44263a = true;
            uVar.c();
            this.f44263a = false;
        }
        this.f44264b.obtainMessage(1, uVar).sendToTarget();
    }
}
