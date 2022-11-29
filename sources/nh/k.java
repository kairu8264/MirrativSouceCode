package nh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes3.dex */
public final class k extends di.f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f43557a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f43558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f43558b = dVar;
        this.f43557a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int g10 = this.f43558b.g(this.f43557a);
        if (this.f43558b.j(g10)) {
            this.f43558b.o(this.f43557a, g10);
        }
    }
}
