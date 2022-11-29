package gc;

import ac.b4;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.widget.SettingButtonView;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class v extends RecyclerView.e0 implements oq.a {
    public static final a C = new a(null);
    public static final int D = 8;
    public gc.c A;
    public ye.c B;

    /* renamed from: w  reason: collision with root package name */
    public final b4 f33097w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f33098x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f33099y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f33100z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_floating_setting_button, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new v((b4) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33101w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33102x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33103y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33101w = aVar;
            this.f33102x = aVar2;
            this.f33103y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            xq.a b10;
            oq.a aVar = this.f33101w;
            vq.a aVar2 = this.f33102x;
            io.a<? extends uq.a> aVar3 = this.f33103y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.m.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33104w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33105x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33106y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33104w = aVar;
            this.f33105x = aVar2;
            this.f33106y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            xq.a b10;
            oq.a aVar = this.f33104w;
            vq.a aVar2 = this.f33105x;
            io.a<? extends uq.a> aVar3 = this.f33106y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.w.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33107w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33108x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33109y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33107w = aVar;
            this.f33108x = aVar2;
            this.f33109y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            xq.a b10;
            oq.a aVar = this.f33107w;
            vq.a aVar2 = this.f33108x;
            io.a<? extends uq.a> aVar3 = this.f33109y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.t.class), aVar2, aVar3);
        }
    }

    public v(b4 b4Var) {
        super(b4Var.u());
        this.f33097w = b4Var;
        cr.a aVar = cr.a.f28611a;
        this.f33098x = wn.g.b(aVar.b(), new b(this, null, null));
        this.f33099y = wn.g.b(aVar.b(), new c(this, null, null));
        this.f33100z = wn.g.b(aVar.b(), new d(this, null, null));
    }

    public /* synthetic */ v(b4 b4Var, jo.h hVar) {
        this(b4Var);
    }

    public static final void c(gc.c cVar, v vVar, Boolean bool) {
        jo.p.h(cVar, "$floatSettingData");
        jo.p.h(vVar, "this$0");
        if (cVar.a() == xb.o.btn_gift_overlay) {
            SettingButtonView settingButtonView = vVar.f33097w.B;
            jo.p.g(bool, "it");
            settingButtonView.setSelected(bool.booleanValue());
        }
    }

    public final void b(final gc.c cVar, ye.c cVar2, androidx.lifecycle.u uVar) {
        jo.p.h(cVar, "floatSettingData");
        jo.p.h(uVar, "lifecycleOwner");
        this.A = cVar;
        this.B = cVar2;
        dq.c.c().p(this);
        SettingButtonView settingButtonView = this.f33097w.B;
        settingButtonView.setId(cVar.a());
        settingButtonView.setText(cVar.c());
        settingButtonView.setImage(cVar.b());
        int a10 = cVar.a();
        if (a10 == xb.o.btn_collab) {
            settingButtonView.setSelected(h().i5());
        } else if (a10 == xb.o.btn_tts) {
            settingButtonView.setSelected(h().f1());
        } else {
            if (a10 == xb.o.btn_memo_broadcast) {
                settingButtonView.setSelected(!TextUtils.isEmpty(f().b1()));
            } else {
                boolean z10 = false;
                if (a10 == xb.o.btn_notification_guard) {
                    if (h().b0() != 2 && h().b0() != 1) {
                        r3 = false;
                    }
                    settingButtonView.setSelected(r3);
                } else if (a10 == xb.o.liveLinkButtonView) {
                    if (cVar2 != null) {
                        z10 = Boolean.valueOf(cVar2.a() != null).booleanValue();
                    }
                    settingButtonView.setSelected(z10);
                }
            }
        }
        g().j().i(uVar, new androidx.lifecycle.f0() { // from class: gc.u
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                v.c(c.this, this, (Boolean) obj);
            }
        });
    }

    public final b4 d() {
        return this.f33097w;
    }

    public final kf.m f() {
        return (kf.m) this.f33098x.getValue();
    }

    public final nf.w g() {
        return (nf.w) this.f33099y.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final kf.t h() {
        return (kf.t) this.f33100z.getValue();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.l lVar) {
        jo.p.h(lVar, "event");
        SettingButtonView settingButtonView = this.f33097w.B;
        gc.c cVar = this.A;
        if (cVar != null) {
            settingButtonView.setText(cVar.c());
        }
        gc.c cVar2 = this.A;
        if (cVar2 != null) {
            settingButtonView.setImage(cVar2.b());
        }
        gc.c cVar3 = this.A;
        Integer valueOf = cVar3 != null ? Integer.valueOf(cVar3.a()) : null;
        int i10 = xb.o.btn_collab;
        if (valueOf != null && valueOf.intValue() == i10) {
            settingButtonView.setSelected(h().i5());
            return;
        }
        int i11 = xb.o.btn_tts;
        if (valueOf != null && valueOf.intValue() == i11) {
            settingButtonView.setSelected(h().f1());
            return;
        }
        int i12 = xb.o.btn_memo_broadcast;
        if (valueOf != null && valueOf.intValue() == i12) {
            settingButtonView.setSelected(!TextUtils.isEmpty(f().b1()));
            return;
        }
        int i13 = xb.o.btn_notification_guard;
        boolean z10 = false;
        if (valueOf != null && valueOf.intValue() == i13) {
            if (h().b0() != 2 && h().b0() != 1) {
                r2 = false;
            }
            settingButtonView.setSelected(r2);
            return;
        }
        int i14 = xb.o.liveLinkButtonView;
        if (valueOf != null && valueOf.intValue() == i14) {
            ye.c cVar4 = this.B;
            if (cVar4 != null) {
                z10 = Boolean.valueOf(cVar4.a() != null).booleanValue();
            }
            settingButtonView.setSelected(z10);
        }
    }

    @dq.l
    public final void onEvent(nd.i iVar) {
        jo.p.h(iVar, "event");
        dq.c.c().r(this);
    }
}
