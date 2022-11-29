package gc;

import ac.p4;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import fa.b;
import oq.a;
import uo.q0;
import yd.g1;

/* loaded from: classes2.dex */
public final class z extends FrameLayout implements oq.a, fa.b, q0 {
    public static final b C = new b(null);
    public static final int D = 8;
    public final wn.f A;
    public final p4 B;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ da.j f33113w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f33114x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f33115y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f33116z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            z.this.getFloatViewManager().c(z.this);
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
    public static final class c extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33118w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33119x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33118w = aVar;
            this.f33119x = aVar2;
            this.f33120y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33118w;
            vq.a aVar2 = this.f33119x;
            io.a<? extends uq.a> aVar3 = this.f33120y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33121w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33122x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33121w = aVar;
            this.f33122x = aVar2;
            this.f33123y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            xq.a b10;
            oq.a aVar = this.f33121w;
            vq.a aVar2 = this.f33122x;
            io.a<? extends uq.a> aVar3 = this.f33123y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.w.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33124w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33125x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33124w = aVar;
            this.f33125x = aVar2;
            this.f33126y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            xq.a b10;
            oq.a aVar = this.f33124w;
            vq.a aVar2 = this.f33125x;
            io.a<? extends uq.a> aVar3 = this.f33126y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.t.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33127w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33128x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33127w = aVar;
            this.f33128x = aVar2;
            this.f33129y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33127w;
            vq.a aVar2 = this.f33128x;
            io.a<? extends uq.a> aVar3 = this.f33129y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f33113w = new da.j();
        cr.a aVar = cr.a.f28611a;
        this.f33114x = wn.g.b(aVar.b(), new c(this, null, null));
        this.f33115y = wn.g.b(aVar.b(), new d(this, null, null));
        this.f33116z = wn.g.b(aVar.b(), new e(this, null, null));
        this.A = wn.g.b(aVar.b(), new f(this, null, null));
        p4 T = p4.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.B = T;
        g1.a(this, new a());
        T.I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gc.y
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                z.d(z.this, compoundButton, z10);
            }
        });
        T.I.setChecked(getLiveSettingStore().f());
        T.J.setText(getResources().getString(xb.r.text_collab_maximum, "3"));
        T.B.setOnClickListener(new View.OnClickListener() { // from class: gc.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.f(z.this, view);
            }
        });
        T.C.setOnClickListener(new View.OnClickListener() { // from class: gc.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.g(z.this, view);
            }
        });
        setMaxCollabUserNum(getLiveSettingStore().b());
        setCollab(getLiveSettingStore().f());
    }

    public static final void d(z zVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(zVar, "this$0");
        if (z10 == zVar.getLiveSettingStore().f()) {
            return;
        }
        zVar.getSettingPreference().y5(z10);
        dq.c.c().l(new nd.j(z10));
        zVar.setCollab(z10);
    }

    public static final void f(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        if (zVar.getLiveSettingStore().b() <= 1 || zVar.getLiveSettingStore().b() <= zVar.getCastServiceStore().Q().size()) {
            return;
        }
        int b10 = zVar.getLiveSettingStore().b() - 1;
        zVar.getSettingPreference().S0(b10);
        dq.c.c().l(new ce.o(b10));
        zVar.setMaxCollabUserNum(b10);
    }

    public static final void g(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        if (zVar.getLiveSettingStore().b() < 3) {
            int b10 = zVar.getLiveSettingStore().b() + 1;
            zVar.getSettingPreference().S0(b10);
            dq.c.c().l(new ce.o(b10));
            zVar.setMaxCollabUserNum(b10);
        }
    }

    private final nf.c getCastServiceStore() {
        return (nf.c) this.f33114x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.A.getValue();
    }

    private final nf.w getLiveSettingStore() {
        return (nf.w) this.f33115y.getValue();
    }

    private final kf.t getSettingPreference() {
        return (kf.t) this.f33116z.getValue();
    }

    private final void setCollab(boolean z10) {
        this.B.I.setChecked(z10);
        if (z10) {
            this.B.I.getTrackDrawable().setColorFilter(c3.a.d(getContext(), xb.l.f59943n), PorterDuff.Mode.SRC_IN);
            this.B.I.getThumbDrawable().setColorFilter(c3.a.d(getContext(), xb.l.tealDark), PorterDuff.Mode.SRC_IN);
        } else {
            this.B.I.getTrackDrawable().setColorFilter(c3.a.d(getContext(), xb.l.f59939i), PorterDuff.Mode.SRC_IN);
            this.B.I.getThumbDrawable().setColorFilter(c3.a.d(getContext(), xb.l.f59951x), PorterDuff.Mode.SRC_IN);
        }
        dq.c.c().l(new nd.l());
    }

    private final void setMaxCollabUserNum(int i10) {
        AppCompatTextView appCompatTextView = this.B.H;
        jo.p.g(appCompatTextView, "binding.maxCollabUserNumText");
        appCompatTextView.setText(String.valueOf(i10));
        this.B.B.setEnabled((i10 == 1 || i10 == getCastServiceStore().Q().size()) ? false : true);
        this.B.C.setEnabled(i10 != 3);
        setCollab(getLiveSettingStore().f());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33113w.getCoroutineContext();
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
        return "FloatSettingCollabView";
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
