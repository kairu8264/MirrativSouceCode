package ai;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class j7 {

    /* renamed from: a */
    public final Context f5638a;

    /* renamed from: b */
    public final Handler f5639b;

    /* renamed from: c */
    public final f7 f5640c;

    /* renamed from: d */
    public final AudioManager f5641d;

    /* renamed from: e */
    public i7 f5642e;

    /* renamed from: f */
    public int f5643f;

    /* renamed from: g */
    public int f5644g;

    /* renamed from: h */
    public boolean f5645h;

    public j7(Context context, Handler handler, f7 f7Var) {
        Context applicationContext = context.getApplicationContext();
        this.f5638a = applicationContext;
        this.f5639b = handler;
        this.f5640c = f7Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        u9.e(audioManager);
        this.f5641d = audioManager;
        this.f5643f = 3;
        this.f5644g = h(audioManager, 3);
        this.f5645h = i(audioManager, this.f5643f);
        i7 i7Var = new i7(this, null);
        try {
            applicationContext.registerReceiver(i7Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f5642e = i7Var;
        } catch (RuntimeException e10) {
            oa.a("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static /* synthetic */ void f(j7 j7Var) {
        j7Var.g();
    }

    public static int h(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i10);
            oa.a("StreamVolumeManager", sb2.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean i(AudioManager audioManager, int i10) {
        if (sb.f9778a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return h(audioManager, i10) == 0;
    }

    public final void b(int i10) {
        j7 j7Var;
        f3 T;
        f3 f3Var;
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (this.f5643f == 3) {
            return;
        }
        this.f5643f = 3;
        g();
        b7 b7Var = (b7) this.f5640c;
        j7Var = b7Var.f2258w.f3559l;
        T = e7.T(j7Var);
        f3Var = b7Var.f2258w.F;
        if (T.equals(f3Var)) {
            return;
        }
        b7Var.f2258w.F = T;
        copyOnWriteArraySet = b7Var.f2258w.f3555h;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((k6) it.next()).r(T);
        }
    }

    public final int c() {
        if (sb.f9778a >= 28) {
            return this.f5641d.getStreamMinVolume(this.f5643f);
        }
        return 0;
    }

    public final int d() {
        return this.f5641d.getStreamMaxVolume(this.f5643f);
    }

    public final void e() {
        i7 i7Var = this.f5642e;
        if (i7Var != null) {
            try {
                this.f5638a.unregisterReceiver(i7Var);
            } catch (RuntimeException e10) {
                oa.a("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f5642e = null;
        }
    }

    public final void g() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        int h10 = h(this.f5641d, this.f5643f);
        boolean i10 = i(this.f5641d, this.f5643f);
        if (this.f5644g == h10 && this.f5645h == i10) {
            return;
        }
        this.f5644g = h10;
        this.f5645h = i10;
        copyOnWriteArraySet = ((b7) this.f5640c).f2258w.f3555h;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((k6) it.next()).s(h10, i10);
        }
    }
}
