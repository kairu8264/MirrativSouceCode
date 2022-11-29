package hb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.Surface;
import com.dena.mirrativ.player.PlayerService;

/* loaded from: classes2.dex */
public class o1 implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public PlayerService f34940w;

    /* renamed from: x  reason: collision with root package name */
    public Surface f34941x;

    /* renamed from: y  reason: collision with root package name */
    public long f34942y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f34943z;

    public void a() {
        PlayerService playerService = this.f34940w;
        if (playerService != null) {
            playerService.N0();
        }
        this.f34940w = null;
    }

    public final long b() {
        PlayerService playerService = this.f34940w;
        return playerService != null ? playerService.S0() : (System.currentTimeMillis() - this.f34942y) / 1000;
    }

    public final PlayerService c() {
        return this.f34940w;
    }

    public final void d(boolean z10) {
        PlayerService playerService;
        this.f34943z = z10;
        if (!z10 || (playerService = this.f34940w) == null) {
            return;
        }
        playerService.S();
    }

    public final void e(long j10) {
        this.f34942y = j10;
    }

    public final void f(Surface surface) {
        PlayerService playerService;
        this.f34941x = surface;
        PlayerService playerService2 = this.f34940w;
        if (playerService2 != null) {
            playerService2.J0(surface);
        }
        if (surface == null || (playerService = this.f34940w) == null) {
            return;
        }
        playerService.x0();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PlayerService playerService;
        jo.p.h(componentName, "name");
        jo.p.h(iBinder, "binder");
        PlayerService playerService2 = (PlayerService) ((mf.a) iBinder).a();
        this.f34940w = playerService2;
        if (playerService2 != null) {
            playerService2.J0(this.f34941x);
            playerService2.x0();
        }
        if (!this.f34943z || (playerService = this.f34940w) == null) {
            return;
        }
        playerService.S();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        jo.p.h(componentName, "name");
        this.f34940w = null;
    }
}
