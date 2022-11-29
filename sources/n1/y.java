package n1;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final long f41547a;

    /* renamed from: b  reason: collision with root package name */
    public final List<z> f41548b;

    /* renamed from: c  reason: collision with root package name */
    public final MotionEvent f41549c;

    public y(long j10, List<z> list, MotionEvent motionEvent) {
        jo.p.h(list, "pointers");
        jo.p.h(motionEvent, "motionEvent");
        this.f41547a = j10;
        this.f41548b = list;
        this.f41549c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f41549c;
    }

    public final List<z> b() {
        return this.f41548b;
    }
}
