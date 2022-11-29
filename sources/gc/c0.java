package gc;

import ae.ob;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;
import androidx.lifecycle.LiveData;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import fa.b;
import oq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class c0 extends FrameLayout implements fa.b, oq.a {
    public static final b B = new b(null);
    public static final int C = 8;
    public final ob A;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f32885w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32886x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f32887y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f32888z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            c0.this.getFloatViewManager().c(c0.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32890w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32891x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32890w = aVar;
            this.f32891x = aVar2;
            this.f32892y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f32890w;
            vq.a aVar2 = this.f32891x;
            io.a<? extends uq.a> aVar3 = this.f32892y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32893w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32894x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32893w = aVar;
            this.f32894x = aVar2;
            this.f32895y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            xq.a b10;
            oq.a aVar = this.f32893w;
            vq.a aVar2 = this.f32894x;
            io.a<? extends uq.a> aVar3 = this.f32895y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.w.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32896w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32897x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32896w = aVar;
            this.f32897x = aVar2;
            this.f32898y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f32896w;
            vq.a aVar2 = this.f32897x;
            io.a<? extends uq.a> aVar3 = this.f32898y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32899w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32900x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32899w = aVar;
            this.f32900x = aVar2;
            this.f32901y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f32899w;
            vq.a aVar2 = this.f32900x;
            io.a<? extends uq.a> aVar3 = this.f32901y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context) {
        super(context);
        jo.p.h(context, "context");
        cr.a aVar = cr.a.f28611a;
        this.f32885w = wn.g.b(aVar.b(), new c(this, null, null));
        this.f32886x = wn.g.b(aVar.b(), new d(this, null, null));
        this.f32887y = wn.g.b(aVar.b(), new e(this, null, null));
        this.f32888z = wn.g.b(aVar.b(), new f(this, null, null));
        ob T = ob.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.A = T;
        g1.a(this, new a());
        T.G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gc.a0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                c0.c(c0.this, compoundButton, z10);
            }
        });
        f();
    }

    public static final void c(c0 c0Var, CompoundButton compoundButton, boolean z10) {
        jo.p.h(c0Var, "this$0");
        c0Var.getCastServiceActionCreator().i(z10);
        MRLogger logger = c0Var.getLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GIFT_OVERLAY);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0")));
        logger.sendLog(builder.build());
    }

    public static final void g(c0 c0Var, Boolean bool) {
        jo.p.h(c0Var, "this$0");
        Switch r02 = c0Var.A.G;
        jo.p.g(bool, "it");
        r02.setChecked(bool.booleanValue());
        if (bool.booleanValue()) {
            c0Var.A.G.getTrackDrawable().setColorFilter(new PorterDuffColorFilter(c3.a.d(c0Var.getContext(), xb.l.f59943n), PorterDuff.Mode.SRC_IN));
            c0Var.A.G.getThumbDrawable().setColorFilter(new PorterDuffColorFilter(c3.a.d(c0Var.getContext(), xb.l.tealDark), PorterDuff.Mode.SRC_IN));
            return;
        }
        c0Var.A.G.getTrackDrawable().setColorFilter(new PorterDuffColorFilter(c3.a.d(c0Var.getContext(), xb.l.f59939i), PorterDuff.Mode.SRC_IN));
        c0Var.A.G.getThumbDrawable().setColorFilter(new PorterDuffColorFilter(c3.a.d(c0Var.getContext(), xb.l.f59951x), PorterDuff.Mode.SRC_IN));
    }

    private final od.b getCastServiceActionCreator() {
        return (od.b) this.f32885w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f32888z.getValue();
    }

    private final nf.w getLiveSettingStore() {
        return (nf.w) this.f32886x.getValue();
    }

    private final MRLogger getLogger() {
        return (MRLogger) this.f32887y.getValue();
    }

    public final void f() {
        LiveData<Boolean> j10 = getLiveSettingStore().j();
        Context context = getContext();
        jo.p.f(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        j10.i((androidx.lifecycle.u) context, new androidx.lifecycle.f0() { // from class: gc.b0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c0.g(c0.this, (Boolean) obj);
            }
        });
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
        return "FloatSettingGiftOverlayView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        getFloatViewManager().c(this);
    }
}
