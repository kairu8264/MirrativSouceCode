package dd;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.p0;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import dd.b;
import dq.l;
import ed.a;
import ha.a;
import jo.p;
import org.greenrobot.eventbus.ThreadMode;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class f implements q0 {
    public final LiveData<ha.a> A;
    public final e0<ContractSummaryResponse> B;
    public final LiveData<ed.a> C;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f29561w;

    /* renamed from: x  reason: collision with root package name */
    public final Resources f29562x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f29563y;

    /* renamed from: z  reason: collision with root package name */
    public final e0<ha.a> f29564z;

    /* loaded from: classes2.dex */
    public static final class a<I, O> implements n.a {
        public a() {
        }

        @Override // n.a
        public final ed.a apply(ContractSummaryResponse contractSummaryResponse) {
            ContractSummaryResponse contractSummaryResponse2 = contractSummaryResponse;
            a.C0302a c0302a = ed.a.B;
            p.g(contractSummaryResponse2, "it");
            return c0302a.a(contractSummaryResponse2, f.this.b());
        }
    }

    public f(q8.a aVar, Resources resources) {
        p.h(aVar, "dispatcher");
        p.h(resources, "resources");
        this.f29561w = aVar;
        this.f29562x = resources;
        this.f29563y = r0.b();
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.f29564z = e0Var;
        this.A = e0Var;
        e0<ContractSummaryResponse> e0Var2 = new e0<>();
        this.B = e0Var2;
        LiveData<ed.a> b10 = p0.b(e0Var2, new a());
        p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.C = b10;
    }

    public final LiveData<ed.a> a() {
        return this.C;
    }

    public final Resources b() {
        return this.f29562x;
    }

    public final LiveData<ha.a> c() {
        return this.A;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f29563y.getCoroutineContext();
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        p.h(aVar, "event");
        this.f29564z.p(a.b.f34695b);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0285b c0285b) {
        p.h(c0285b, "event");
        this.f29564z.p(new a.C0439a(c0285b.a()));
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        p.h(cVar, "event");
        this.f29564z.p(a.d.f34697b);
        this.B.p(cVar.a());
    }
}
