package gc;

import ae.ol;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fa.b;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;
import yd.g1;

/* loaded from: classes2.dex */
public final class g0 extends FrameLayout implements fa.b, oq.a {
    public static final e B = new e(null);
    public static final int C = 8;
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f32936w;

    /* renamed from: x  reason: collision with root package name */
    public final NotificationManager f32937x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f32938y;

    /* renamed from: z  reason: collision with root package name */
    public final ol f32939z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (g0.this.f32937x.isNotificationPolicyAccessGranted()) {
                g0.this.f32937x.setInterruptionFilter(2);
                g0.this.getSettingPreference().I4(2);
                dq.c.c().l(new nd.l());
                return;
            }
            g0.this.A = true;
            dq.c.c().l(nd.g0.f42003a);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Context f32942x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(1);
            this.f32942x = context;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (g0.this.getSettingPreference().b0() == 2 && g0.this.f32937x.isNotificationPolicyAccessGranted()) {
                g0.this.f32937x.setInterruptionFilter(1);
            }
            Object systemService = this.f32942x.getSystemService("notification");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                g0.this.getSettingPreference().I4(1);
                dq.c.c().l(new nd.l());
                return;
            }
            dq.c.c().l(nd.f0.f41962a);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (g0.this.getSettingPreference().b0() == 2 && g0.this.f32937x.isNotificationPolicyAccessGranted()) {
                g0.this.f32937x.setInterruptionFilter(1);
            }
            g0.this.getSettingPreference().I4(0);
            dq.c.c().l(new nd.l());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g0.this.f();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public e() {
        }

        public /* synthetic */ e(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32945w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32946x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32947y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32945w = aVar;
            this.f32946x = aVar2;
            this.f32947y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            xq.a b10;
            oq.a aVar = this.f32945w;
            vq.a aVar2 = this.f32946x;
            io.a<? extends uq.a> aVar3 = this.f32947y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.t.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32948w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32949x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32950y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32948w = aVar;
            this.f32949x = aVar2;
            this.f32950y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f32948w;
            vq.a aVar2 = this.f32949x;
            io.a<? extends uq.a> aVar3 = this.f32950y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context) {
        super(context);
        jo.p.h(context, "context");
        cr.a aVar = cr.a.f28611a;
        this.f32936w = wn.g.b(aVar.b(), new f(this, null, null));
        Object systemService = context.getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f32937x = (NotificationManager) systemService;
        this.f32938y = wn.g.b(aVar.b(), new g(this, null, null));
        ol T = ol.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f32939z = T;
        int b02 = getSettingPreference().b0();
        if (b02 == 0) {
            T.F.setImageResource(xb.n.ic_selected_radio_button);
        } else if (b02 == 1) {
            T.O.setImageResource(xb.n.ic_selected_radio_button);
        } else if (b02 == 2) {
            T.H.setImageResource(xb.n.ic_selected_radio_button);
        }
        ConstraintLayout constraintLayout = T.I;
        jo.p.g(constraintLayout, "binding.notificationNotDisplayContainer");
        g1.a(constraintLayout, new a());
        ConstraintLayout constraintLayout2 = T.M;
        jo.p.g(constraintLayout2, "binding.notificationStopBroadcastContainer");
        g1.a(constraintLayout2, new b(context));
        ConstraintLayout constraintLayout3 = T.E;
        jo.p.g(constraintLayout3, "binding.notSettingNotificationContainer");
        g1.a(constraintLayout3, new c());
        g1.a(this, new d());
    }

    private final fa.c getFloatViewManager() {
        return (fa.c) this.f32938y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf.t getSettingPreference() {
        return (kf.t) this.f32936w.getValue();
    }

    public final void f() {
        Object systemService = getContext().getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (this.A && notificationManager.isNotificationPolicyAccessGranted()) {
            notificationManager.setInterruptionFilter(2);
        }
        getFloatViewManager().c(this);
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return b.a.b(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatSettingNotificationGuardView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(nd.l lVar) {
        jo.p.h(lVar, "event");
        int b02 = getSettingPreference().b0();
        if (b02 == 0) {
            AppCompatImageView appCompatImageView = this.f32939z.H;
            int i10 = xb.n.ic_nonselect_radio_button;
            appCompatImageView.setImageResource(i10);
            this.f32939z.O.setImageResource(i10);
            this.f32939z.F.setImageResource(xb.n.ic_selected_radio_button);
        } else if (b02 == 1) {
            AppCompatImageView appCompatImageView2 = this.f32939z.H;
            int i11 = xb.n.ic_nonselect_radio_button;
            appCompatImageView2.setImageResource(i11);
            this.f32939z.O.setImageResource(xb.n.ic_selected_radio_button);
            this.f32939z.F.setImageResource(i11);
        } else if (b02 != 2) {
            AppCompatImageView appCompatImageView3 = this.f32939z.H;
            int i12 = xb.n.ic_nonselect_radio_button;
            appCompatImageView3.setImageResource(i12);
            this.f32939z.O.setImageResource(i12);
            this.f32939z.F.setImageResource(i12);
        } else {
            this.f32939z.H.setImageResource(xb.n.ic_selected_radio_button);
            AppCompatImageView appCompatImageView4 = this.f32939z.O;
            int i13 = xb.n.ic_nonselect_radio_button;
            appCompatImageView4.setImageResource(i13);
            this.f32939z.F.setImageResource(i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dq.c.c().p(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dq.c.c().r(this);
        super.onDetachedFromWindow();
    }
}
