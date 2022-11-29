package ba;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import ba.u;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;

/* loaded from: classes.dex */
public final class v extends q0 implements uo.q0 {
    public final e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final e0<EmomoRunEventResponse> C;
    public final LiveData<EmomoRunEventResponse> D;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f17202y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f17203z;

    public v(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f17202y = aVar;
        this.f17203z = r0.b();
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        e0<EmomoRunEventResponse> e0Var2 = new e0<>();
        this.C = e0Var2;
        this.D = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f17202y.c(this);
        super.d();
    }

    public final LiveData<EmomoRunEventResponse> f() {
        return this.D;
    }

    public final LiveData<ha.a> g() {
        return this.B;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f17203z.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(a.d.f34697b);
        this.C.p(cVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(u.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(new a.C0439a(aVar.a()));
    }
}
