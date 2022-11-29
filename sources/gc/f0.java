package gc;

import ac.h7;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrativ.streaming.floating.setting.FloatingCopyPasteView;
import fa.b;
import gc.i;
import oq.a;
import yd.g1;

@SuppressLint({"SetTextI18n"})
/* loaded from: classes2.dex */
public final class f0 extends FrameLayout implements oq.a, fa.b {
    public static final e E = new e(null);
    public static final int F = 8;
    public final InputMethodManager A;
    public FloatingCopyPasteView B;
    public gc.i C;
    public boolean D;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f32917w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32918x;

    /* renamed from: y  reason: collision with root package name */
    public final h7 f32919y;

    /* renamed from: z  reason: collision with root package name */
    public final String f32920z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f0.this.u();
            f0.this.q();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jo.p.h(editable, "s");
            f0.this.D = true;
            AppCompatTextView appCompatTextView = f0.this.f32919y.H;
            appCompatTextView.setText(de.l.a(editable.toString()) + f0.this.f32920z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f0.this.q();
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
            if (f0.this.D) {
                String obj = f0.this.f32919y.F.getText().toString();
                if (of.s.f45426a.c(obj)) {
                    obj = "";
                }
                f0.this.s(obj);
                dq.c.c().l(new nd.l());
                f0.this.D = false;
            }
            f0.this.u();
            f0.this.q();
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
    public static final class f implements FloatingCopyPasteView.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ EditText f32926b;

        public f(EditText editText) {
            this.f32926b = editText;
        }

        @Override // com.dena.mirrativ.streaming.floating.setting.FloatingCopyPasteView.a
        public void a() {
            of.n nVar = of.n.f45411a;
            Context context = f0.this.getContext();
            jo.p.g(context, "context");
            nVar.t(context, this.f32926b);
            f0.this.q();
        }

        @Override // com.dena.mirrativ.streaming.floating.setting.FloatingCopyPasteView.a
        public void b() {
            of.n nVar = of.n.f45411a;
            Context context = f0.this.getContext();
            jo.p.g(context, "context");
            nVar.g(context, this.f32926b);
            f0.this.q();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32927w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32928x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32929y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32927w = aVar;
            this.f32928x = aVar2;
            this.f32929y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            xq.a b10;
            oq.a aVar = this.f32927w;
            vq.a aVar2 = this.f32928x;
            io.a<? extends uq.a> aVar3 = this.f32929y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.m.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32930w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32931x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32930w = aVar;
            this.f32931x = aVar2;
            this.f32932y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f32930w;
            vq.a aVar2 = this.f32931x;
            io.a<? extends uq.a> aVar3 = this.f32932y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements i.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f32934b;

        public i(RelativeLayout relativeLayout) {
            this.f32934b = relativeLayout;
        }

        @Override // gc.i.a
        public void a() {
            gc.i iVar = f0.this.C;
            if (iVar != null) {
                iVar.h(this.f32934b);
            }
            f0.this.C = null;
        }

        @Override // gc.i.a
        public void b() {
            f0.this.D = false;
            gc.i iVar = f0.this.C;
            if (iVar != null) {
                iVar.h(this.f32934b);
            }
            f0.this.C = null;
            f0.this.p();
        }

        @Override // gc.i.a
        public void c() {
            gc.i iVar = f0.this.C;
            if (iVar != null) {
                iVar.h(this.f32934b);
            }
            f0.this.C = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(context);
        jo.p.h(context, "context");
        cr.a aVar = cr.a.f28611a;
        this.f32917w = wn.g.b(aVar.b(), new g(this, null, null));
        this.f32918x = wn.g.b(aVar.b(), new h(this, null, null));
        h7 T = h7.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f32919y = T;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('/');
        Resources resources = context.getResources();
        int i10 = xb.r.limit_memo_broadcast;
        sb2.append(resources.getString(i10));
        String sb3 = sb2.toString();
        this.f32920z = sb3;
        Object systemService = context.getSystemService("input_method");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.A = (InputMethodManager) systemService;
        g1.a(this, new a());
        T.F.addTextChangedListener(new b());
        EditText editText = T.F;
        Integer valueOf = Integer.valueOf(getResources().getString(i10));
        jo.p.g(valueOf, "valueOf(resources.getStr…ng.limit_memo_broadcast))");
        editText.setFilters(new sf.b[]{new sf.b(valueOf.intValue())});
        T.F.setOnLongClickListener(new View.OnLongClickListener() { // from class: gc.e0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean c10;
                c10 = f0.c(f0.this, view);
                return c10;
            }
        });
        EditText editText2 = T.F;
        jo.p.g(editText2, "binding.edittextMemoBroadcast");
        g1.a(editText2, new c());
        T.F.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gc.d0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f0.d(f0.this, view, z10);
            }
        });
        dq.c.c().l(new nd.l());
        AppCompatTextView appCompatTextView = T.I;
        jo.p.g(appCompatTextView, "binding.saveMemoBroadcast");
        g1.a(appCompatTextView, new d());
        AppCompatTextView appCompatTextView2 = T.H;
        appCompatTextView2.setText(de.l.a(getLivePreference().b1()) + sb3);
        T.F.setText(getLivePreference().b1());
        of.j.e(of.j.f45405a, context, T.F, 0, 4, null);
    }

    public static final boolean c(f0 f0Var, View view) {
        jo.p.h(f0Var, "this$0");
        f0Var.t();
        return false;
    }

    public static final void d(f0 f0Var, View view, boolean z10) {
        jo.p.h(f0Var, "this$0");
        if (z10) {
            EditText editText = f0Var.f32919y.F;
            editText.setSelection(editText.length(), f0Var.f32919y.F.length());
            f0Var.A.toggleSoftInput(1, 1);
            f0Var.A.showSoftInput(view, 1);
            return;
        }
        f0Var.A.hideSoftInputFromWindow(view.getWindowToken(), 1);
    }

    private final fa.c getFloatViewManager() {
        return (fa.c) this.f32918x.getValue();
    }

    private final kf.m getLivePreference() {
        return (kf.m) this.f32917w.getValue();
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
        return "FloatSettingMemoView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        p();
    }

    public final void p() {
        of.j.f45405a.c(getContext(), this.f32919y.F);
        getFloatViewManager().c(this);
    }

    public final void q() {
        FloatingCopyPasteView floatingCopyPasteView = this.B;
        if (floatingCopyPasteView == null) {
            return;
        }
        floatingCopyPasteView.setVisibility(8);
    }

    public final void r(String str, String str2, jf.w wVar) {
        dq.c.c().l(new nd.s(str, str2, wVar));
    }

    public final void s(String str) {
        r(getLivePreference().getTitle(), str, new jf.w(getLivePreference().h(), getLivePreference().R(), getLivePreference().D1(), getLivePreference().e5()));
    }

    public final void t() {
        EditText editText = this.f32919y.F;
        jo.p.g(editText, "binding.edittextMemoBroadcast");
        FloatingCopyPasteView floatingCopyPasteView = this.f32919y.E;
        this.B = floatingCopyPasteView;
        if (floatingCopyPasteView != null) {
            floatingCopyPasteView.setVisibility(0);
        }
        FloatingCopyPasteView floatingCopyPasteView2 = this.B;
        if (floatingCopyPasteView2 != null) {
            floatingCopyPasteView2.e(new f(editText));
        }
    }

    public final void u() {
        if (this.D) {
            if (this.C == null) {
                RelativeLayout relativeLayout = this.f32919y.B;
                jo.p.g(relativeLayout, "binding.body");
                Context context = getContext();
                jo.p.g(context, "context");
                gc.i iVar = new gc.i(context, xb.r.f60092x0, true);
                this.C = iVar;
                iVar.d(new i(relativeLayout));
                gc.i iVar2 = this.C;
                if (iVar2 != null) {
                    iVar2.m(relativeLayout);
                    return;
                }
                return;
            }
            return;
        }
        p();
    }
}
