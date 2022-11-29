package ai;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class h1 extends a2 {
    public h1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "NSYe0Ak7CUXd9zFZA3bczJ8pTgBK/kfUu9ICpHR+lQrTNc8+V7Owo49e2WIp0407", "Ux7t0A/7z2bV/IDvLZJgV4tTxr0Vvc1KngWKlG2Szwg=", c64Var, i10, 24);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (!this.f1685b.i()) {
            synchronized (this.f1688e) {
                this.f1688e.J((String) this.f1689f.invoke(null, this.f1685b.c()));
            }
            return;
        }
        c();
    }

    @Override // ai.a2
    public final Void b() throws Exception {
        if (this.f1685b.d()) {
            super.b();
            return null;
        }
        if (this.f1685b.i()) {
            c();
        }
        return null;
    }

    public final void c() {
        AdvertisingIdClient t10 = this.f1685b.t();
        if (t10 == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info a10 = t10.a();
            String a11 = u0.a(a10.getId());
            if (a11 != null) {
                synchronized (this.f1688e) {
                    this.f1688e.J(a11);
                    this.f1688e.K(a10.isLimitAdTrackingEnabled());
                    this.f1688e.X(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // ai.a2, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
