package dk;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* loaded from: classes3.dex */
public final class n extends g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ IBinder f29698x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q f29699y;

    public n(q qVar, IBinder iBinder) {
        this.f29699y = qVar;
        this.f29698x = iBinder;
    }

    @Override // dk.g
    public final void a() {
        m mVar;
        List<Runnable> list;
        List list2;
        r rVar = this.f29699y.f29701w;
        mVar = rVar.f29711i;
        rVar.f29716n = (IInterface) mVar.a(this.f29698x);
        r.o(this.f29699y.f29701w);
        this.f29699y.f29701w.f29709g = false;
        list = this.f29699y.f29701w.f29706d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f29699y.f29701w.f29706d;
        list2.clear();
    }
}
