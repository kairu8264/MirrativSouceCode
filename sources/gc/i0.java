package gc;

import ac.d4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.widget.SettingSwitchView;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class i0 extends RecyclerView.e0 implements oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final d4 f32958w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32959x;

    /* renamed from: y  reason: collision with root package name */
    public c f32960y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f32957z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_floating_setting_switch, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new i0((d4) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32961w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32962x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32963y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32961w = aVar;
            this.f32962x = aVar2;
            this.f32963y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            xq.a b10;
            oq.a aVar = this.f32961w;
            vq.a aVar2 = this.f32962x;
            io.a<? extends uq.a> aVar3 = this.f32963y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.t.class), aVar2, aVar3);
        }
    }

    public i0(d4 d4Var) {
        super(d4Var.u());
        this.f32958w = d4Var;
        this.f32959x = wn.g.b(cr.a.f28611a.b(), new b(this, null, null));
    }

    public /* synthetic */ i0(d4 d4Var, jo.h hVar) {
        this(d4Var);
    }

    public final void a(c cVar) {
        jo.p.h(cVar, "floatSettingData");
        this.f32960y = cVar;
        dq.c.c().p(this);
        SettingSwitchView settingSwitchView = this.f32958w.B;
        settingSwitchView.setId(cVar.a());
        settingSwitchView.setText(cVar.c());
        settingSwitchView.setImage(cVar.b());
        d(settingSwitchView.getId());
    }

    public final d4 b() {
        return this.f32958w;
    }

    public final kf.t c() {
        return (kf.t) this.f32959x.getValue();
    }

    public final void d(int i10) {
        SettingSwitchView settingSwitchView = this.f32958w.B;
        if (i10 == xb.o.switch_mic) {
            settingSwitchView.setChecked(!c().r4());
        } else if (i10 == xb.o.switch_screen) {
            settingSwitchView.setChecked(!c().w1());
        } else if (i10 == xb.o.switch_comment) {
            settingSwitchView.setChecked(c().g0());
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.l lVar) {
        jo.p.h(lVar, "event");
        d(this.f32958w.B.getId());
    }

    @dq.l
    public final void onEvent(nd.i iVar) {
        jo.p.h(iVar, "event");
        dq.c.c().r(this);
    }
}
