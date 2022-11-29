package n1;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<v, w> f41430a;

    /* renamed from: b  reason: collision with root package name */
    public final y f41431b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41432c;

    public g(Map<v, w> map, y yVar) {
        jo.p.h(map, "changes");
        jo.p.h(yVar, "pointerInputEvent");
        this.f41430a = map;
        this.f41431b = yVar;
    }

    public final Map<v, w> a() {
        return this.f41430a;
    }

    public final MotionEvent b() {
        return this.f41431b.a();
    }

    public final boolean c() {
        return this.f41432c;
    }

    public final boolean d(long j10) {
        z zVar;
        List<z> b10 = this.f41431b.b();
        int size = b10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                zVar = null;
                break;
            }
            zVar = b10.get(i10);
            if (v.d(zVar.c(), j10)) {
                break;
            }
            i10++;
        }
        z zVar2 = zVar;
        if (zVar2 != null) {
            return zVar2.d();
        }
        return false;
    }

    public final void e(boolean z10) {
        this.f41432c = z10;
    }
}
