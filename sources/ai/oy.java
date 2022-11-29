package ai;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class oy {

    /* renamed from: a  reason: collision with root package name */
    public MotionEvent f8153a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b  reason: collision with root package name */
    public MotionEvent f8154b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c  reason: collision with root package name */
    public final Context f8155c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f8156d;

    /* renamed from: e  reason: collision with root package name */
    public final qy f8157e;

    public oy(Context context, ScheduledExecutorService scheduledExecutorService, qy qyVar, byte[] bArr) {
        this.f8155c = context;
        this.f8156d = scheduledExecutorService;
        this.f8157e = qyVar;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f8153a.getEventTime()) {
            this.f8153a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f8154b.getEventTime()) {
        } else {
            this.f8154b = MotionEvent.obtain(motionEvent);
        }
    }

    public final s43<String> b() {
        return (z33) j43.h(z33.E(j43.a(null)), bz.f2628c.e().longValue(), TimeUnit.MILLISECONDS, this.f8156d);
    }
}
