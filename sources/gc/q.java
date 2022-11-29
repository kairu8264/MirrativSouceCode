package gc;

import ac.s1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrativ.streaming.floating.control.FloatingControlEditView;
import com.dena.mirrativ.streaming.floating.setting.FloatingSettingRecyclerView;
import com.dena.mirrorman.clientlog.logs.Live;
import fa.b;
import hf.c;
import java.util.ArrayList;
import java.util.List;
import nd.o0;
import oq.a;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class q extends FrameLayout implements fa.b, FloatingControlEditView.f, oq.a {
    public static final h J = new h(null);
    public static final int K = 8;
    public final wn.f A;
    public final wn.f B;
    public final s1 C;
    public final List<View> D;
    public final ye.c E;
    public ViewTreeObserver.OnGlobalLayoutListener F;
    public boolean G;
    public View H;
    public boolean I;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f33067w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f33068x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f33069y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f33070z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.m();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.p();
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
            q.this.o();
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
            q.this.r();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.n();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.s();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {
        public h() {
        }

        public /* synthetic */ h(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.n();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33079w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33080x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33081y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33079w = aVar;
            this.f33080x = aVar2;
            this.f33081y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f33079w;
            vq.a aVar2 = this.f33080x;
            io.a<? extends uq.a> aVar3 = this.f33081y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33082w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33083x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33084y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33082w = aVar;
            this.f33083x = aVar2;
            this.f33084y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f33082w;
            vq.a aVar2 = this.f33083x;
            io.a<? extends uq.a> aVar3 = this.f33084y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33085w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33086x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33087y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33085w = aVar;
            this.f33086x = aVar2;
            this.f33087y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            xq.a b10;
            oq.a aVar = this.f33085w;
            vq.a aVar2 = this.f33086x;
            io.a<? extends uq.a> aVar3 = this.f33087y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.m.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33088w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33089x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33090y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33088w = aVar;
            this.f33089x = aVar2;
            this.f33090y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33088w;
            vq.a aVar2 = this.f33089x;
            io.a<? extends uq.a> aVar3 = this.f33090y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.s();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, ye.c cVar, long j10, boolean z10, boolean z11) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(cVar, "recordRequestParams");
        this.f33067w = z10;
        this.f33068x = z11;
        cr.a aVar = cr.a.f28611a;
        this.f33069y = wn.g.b(aVar.b(), new j(this, null, null));
        this.f33070z = wn.g.b(aVar.b(), new k(this, null, null));
        this.A = wn.g.b(aVar.b(), new l(this, null, null));
        this.B = wn.g.b(aVar.b(), new m(this, null, null));
        s1 T = s1.T(LayoutInflater.from(getContext()), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.C = T;
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = cVar;
        ScrollView scrollView = T.G;
        jo.p.g(scrollView, "binding.editContent");
        arrayList.add(scrollView);
        View view = T.C;
        jo.p.g(view, "binding.backToNormal");
        arrayList.add(view);
        AppCompatImageView appCompatImageView = T.F;
        jo.p.g(appCompatImageView, "binding.closeControl");
        g1.a(appCompatImageView, new a());
        RelativeLayout relativeLayout = T.O;
        jo.p.g(relativeLayout, "binding.playstop");
        g1.a(relativeLayout, new b());
        View findViewById = findViewById(xb.o.viewerlist);
        jo.p.g(findViewById, "findViewById<View>(R.id.viewerlist)");
        g1.a(findViewById, new c());
        View findViewById2 = findViewById(xb.o.share);
        jo.p.g(findViewById2, "findViewById<View>(R.id.share)");
        g1.a(findViewById2, new d());
        AppCompatTextView appCompatTextView = T.L;
        jo.p.g(appCompatTextView, "binding.liveTitle");
        g1.a(appCompatTextView, new e());
        View view2 = T.C;
        jo.p.g(view2, "binding.backToNormal");
        g1.a(view2, new f());
        ImageButton imageButton = T.D;
        jo.p.g(imageButton, "binding.btnHelp");
        g1.a(imageButton, new g());
        T.F.requestFocus();
        T.H.setOnActionListener(this);
        if (z10) {
            T.L.setVisibility(8);
            T.K.setVisibility(8);
        }
        View findViewById3 = findViewById(xb.o.float_setting);
        jo.p.g(findViewById3, "findViewById(R.id.float_setting)");
        FloatingSettingRecyclerView floatingSettingRecyclerView = (FloatingSettingRecyclerView) findViewById3;
        floatingSettingRecyclerView.setRecordRequestParams(cVar);
        floatingSettingRecyclerView.J();
        setTime(j10);
        this.F = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: gc.o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                q.d(q.this);
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.F);
    }

    public static final void d(q qVar) {
        jo.p.h(qVar, "this$0");
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        jo.p.f(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        ((WindowManager.LayoutParams) layoutParams).y = Math.max(de.n.b(qVar, 20), (qVar.getHeight() - qVar.getFloatViewLayoutHeight()) / 2);
    }

    private final od.b getCastServiceActionCreator() {
        return (od.b) this.f33069y.getValue();
    }

    private final String getEditedTitle() {
        String valueOf = String.valueOf(this.C.H.getTitle());
        if (TextUtils.isEmpty(valueOf)) {
            String string = getContext().getString(xb.r.text_no_title);
            jo.p.g(string, "context.getString(R.string.text_no_title)");
            return string;
        }
        return valueOf;
    }

    private final hf.r getFeatureHelper() {
        return (hf.r) this.f33070z.getValue();
    }

    private final fa.c getFloatViewManager() {
        return (fa.c) this.B.getValue();
    }

    private final kf.m getLivePreference() {
        return (kf.m) this.A.getValue();
    }

    private final void setCompoundDrawableVisible(boolean z10) {
        if (z10) {
            AppCompatTextView appCompatTextView = this.C.L;
            jo.p.g(appCompatTextView, "binding.liveTitle");
            Resources resources = getResources();
            jo.p.g(resources, "resources");
            of.t.c(appCompatTextView, resources, 8388613, xb.q.ic_edit_title);
        } else {
            AppCompatTextView appCompatTextView2 = this.C.L;
            jo.p.g(appCompatTextView2, "binding.liveTitle");
            of.t.a(appCompatTextView2);
        }
        AppCompatTextView appCompatTextView3 = this.C.L;
        jo.p.g(appCompatTextView3, "binding.liveTitle");
        of.t.e(appCompatTextView3, 8388613, 0);
    }

    private final void setEditing(boolean z10) {
        if (this.G != z10) {
            if (z10) {
                s1 s1Var = this.C;
                s1Var.H.setTitle(s1Var.L.getText());
            } else {
                String editedTitle = getEditedTitle();
                this.C.L.setText(editedTitle);
                setSelectedApp(this.C.H.getSelectedApp());
                q(editedTitle, getLivePreference().b1(), this.C.H.getSelectedApp());
            }
        }
        this.G = z10;
        of.t.f(this.D, z10 ? 0 : 4);
        this.C.N.setVisibility(z10 ? 4 : 0);
    }

    private final void setTime(long j10) {
        String string = getContext().getString(xb.r.text_casting_time);
        jo.p.g(string, "context.getString(R.string.text_casting_time)");
        if (j10 >= 1) {
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - j10;
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            string = string + ' ' + of.n.f(currentTimeMillis);
        }
        this.C.Q.setText(string);
    }

    public static final void t(q qVar) {
        jo.p.h(qVar, "this$0");
        if (qVar.H == null || qVar.I) {
            return;
        }
        qVar.I = true;
    }

    @Override // com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.f
    public void a() {
        if (this.G) {
            l();
        }
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
        return 32;
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        if (this.f33068x) {
            if (this.f33067w) {
                return getResources().getDimensionPixelSize(xb.m.float_control_height_portrait_closed);
            }
            return getResources().getDimensionPixelSize(xb.m.float_control_height_portrait);
        } else if (this.f33067w) {
            return getResources().getDimensionPixelSize(xb.m.float_control_height_landscape_closed);
        } else {
            return getResources().getDimensionPixelSize(xb.m.float_control_height_landscape);
        }
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        if (this.f33068x) {
            return getResources().getDimensionPixelSize(xb.m.float_control_width_portrait);
        }
        return getResources().getDimensionPixelSize(xb.m.float_control_width_landscape);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatControlView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void l() {
        setEditing(false);
    }

    public final void m() {
        if (this.G) {
            setEditing(false);
        }
        if (this.I) {
            s();
        }
        dq.c.c().l(new nd.t());
    }

    public final void n() {
        setEditing(true);
    }

    public final void o() {
        dq.c.c().l(new nd.x());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.C.H.q();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.F);
        super.onDetachedFromWindow();
    }

    public final void p() {
        dq.c.c().l(new nd.m());
    }

    public final void q(String str, String str2, jf.w wVar) {
        if (wVar != null) {
            dq.c.c().l(new nd.s(str, str2, wVar));
        }
    }

    public final void r() {
        getCastServiceActionCreator().U(true);
        dq.c.c().l(new o0(Live.SHARE_TYPE_SETTING_IN_BROADCASTING, ""));
        m();
    }

    public final void s() {
        View view = this.H;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(xb.p.view_help_setting, (ViewGroup) null);
            this.H = inflate;
            if (inflate != null) {
                g1.a(inflate, new n());
            }
            if (!getFeatureHelper().d()) {
                View view2 = this.H;
                View findViewById = view2 != null ? view2.findViewById(xb.o.help_collab_text) : null;
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            View view3 = this.H;
            ViewTreeObserver viewTreeObserver = view3 != null ? view3.getViewTreeObserver() : null;
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: gc.p
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        q.t(q.this);
                    }
                });
            }
            addView(this.H);
            return;
        }
        removeView(view);
        this.H = null;
        this.I = false;
    }

    public final void setAppInfoList(List<c.a> list) {
        FloatingControlEditView floatingControlEditView = this.C.H;
        jo.p.e(list);
        floatingControlEditView.setAppInfoList(list);
    }

    public final void setAppsVisible(boolean z10) {
        if (z10) {
            this.C.H.setAppsVisibility(0);
            return;
        }
        this.C.B.setVisibility(8);
        this.C.H.setAppsVisibility(8);
    }

    public final void setSelectedApp(jf.w wVar) {
        jo.p.e(wVar);
        if (TextUtils.isEmpty(wVar.b())) {
            this.C.B.setVisibility(8);
            setCompoundDrawableVisible(true);
        } else {
            this.C.B.setVisibility(0);
            AppCompatImageView appCompatImageView = this.C.B;
            jo.p.g(appCompatImageView, "binding.appIcon");
            td.a.o(appCompatImageView, wVar.a(), 0, 4, null);
            AppCompatImageView appCompatImageView2 = this.C.B;
            jo.p.g(appCompatImageView2, "binding.appIcon");
            g1.a(appCompatImageView2, new i());
            setCompoundDrawableVisible(false);
        }
        this.C.H.setSelectedApp(wVar);
    }

    public final void setTitle(String str) {
        this.C.L.setText(str);
        this.C.H.setTitle(str);
    }

    public final void setTotalViewerNum(int i10) {
        AppCompatTextView appCompatTextView = this.C.R;
        appCompatTextView.setText(getContext().getResources().getString(xb.r.text_total_viewers) + ' ' + i10);
    }
}
