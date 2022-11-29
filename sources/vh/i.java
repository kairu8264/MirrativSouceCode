package vh;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final i f57329a = new i();

    public static f b() {
        return f57329a;
    }

    @Override // vh.f
    public final long a() {
        return System.nanoTime();
    }

    @Override // vh.f
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // vh.f
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
