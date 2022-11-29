package pi;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class i4 implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public final String f47930w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j4 f47931x;

    public i4(j4 j4Var, String str) {
        this.f47931x = j4Var;
        this.f47930w = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                hi.t0 s02 = hi.s0.s0(iBinder);
                if (s02 == null) {
                    this.f47931x.f47968a.r().v().a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f47931x.f47968a.r().u().a("Install Referrer Service connected");
                this.f47931x.f47968a.a().y(new h4(this, s02, this));
                return;
            } catch (RuntimeException e10) {
                this.f47931x.f47968a.r().v().b("Exception occurred while calling Install Referrer API", e10);
                return;
            }
        }
        this.f47931x.f47968a.r().v().a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f47931x.f47968a.r().u().a("Install Referrer Service disconnected");
    }
}
