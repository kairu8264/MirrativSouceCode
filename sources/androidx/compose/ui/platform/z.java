package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.KotlinNothingValueException;
import l0.i;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final l0.c1<Configuration> f14687a = l0.r.b(l0.u1.h(), a.f14693w);

    /* renamed from: b  reason: collision with root package name */
    public static final l0.c1<Context> f14688b = l0.r.d(b.f14694w);

    /* renamed from: c  reason: collision with root package name */
    public static final l0.c1<v1.d> f14689c = l0.r.d(c.f14695w);

    /* renamed from: d  reason: collision with root package name */
    public static final l0.c1<androidx.lifecycle.u> f14690d = l0.r.d(d.f14696w);

    /* renamed from: e  reason: collision with root package name */
    public static final l0.c1<y4.e> f14691e = l0.r.d(e.f14697w);

    /* renamed from: f  reason: collision with root package name */
    public static final l0.c1<View> f14692f = l0.r.d(f.f14698w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<Configuration> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14693w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Configuration invoke() {
            z.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<Context> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f14694w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Context invoke() {
            z.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<v1.d> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f14695w = new c();

        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final v1.d invoke() {
            z.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<androidx.lifecycle.u> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f14696w = new d();

        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u invoke() {
            z.l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<y4.e> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f14697w = new e();

        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final y4.e invoke() {
            z.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<View> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f14698w = new f();

        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final View invoke() {
            z.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<Configuration, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l0.s0<Configuration> f14699w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l0.s0<Configuration> s0Var) {
            super(1);
            this.f14699w = s0Var;
        }

        public final void a(Configuration configuration) {
            jo.p.h(configuration, "it");
            z.c(this.f14699w, configuration);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Configuration configuration) {
            a(configuration);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0 f14700w;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s0 f14701a;

            public a(s0 s0Var) {
                this.f14701a = s0Var;
            }

            @Override // l0.z
            public void dispose() {
                this.f14701a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(s0 s0Var) {
            super(1);
            this.f14700w = s0Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f14700w);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14702w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f0 f14703x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f14704y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f14705z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(AndroidComposeView androidComposeView, f0 f0Var, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f14702w = androidComposeView;
            this.f14703x = f0Var;
            this.f14704y = pVar;
            this.f14705z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                o0.a(this.f14702w, this.f14703x, this.f14704y, iVar, ((this.f14705z << 3) & 896) | 72);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14706w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f14707x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f14708y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(AndroidComposeView androidComposeView, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f14706w = androidComposeView;
            this.f14707x = pVar;
            this.f14708y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            z.a(this.f14706w, this.f14707x, iVar, this.f14708y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f14709w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f14710x;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f14711a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ l f14712b;

            public a(Context context, l lVar) {
                this.f14711a = context;
                this.f14712b = lVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f14711a.getApplicationContext().unregisterComponentCallbacks(this.f14712b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, l lVar) {
            super(1);
            this.f14709w = context;
            this.f14710x = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            this.f14709w.getApplicationContext().registerComponentCallbacks(this.f14710x);
            return new a(this.f14709w, this.f14710x);
        }
    }

    /* loaded from: classes.dex */
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.e0<Configuration> f14713w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v1.d f14714x;

        public l(jo.e0<Configuration> e0Var, v1.d dVar) {
            this.f14713w = e0Var;
            this.f14714x = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            jo.p.h(configuration, "configuration");
            Configuration configuration2 = this.f14713w.f38136w;
            this.f14714x.c(configuration2 != null ? configuration2.updateFrom(configuration) : -1);
            this.f14713w.f38136w = configuration;
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f14714x.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f14714x.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        jo.p.h(androidComposeView, "owner");
        jo.p.h(pVar, "content");
        l0.i h10 = iVar.h(1396852028);
        Context context = androidComposeView.getContext();
        h10.x(-492369756);
        Object y10 = h10.y();
        i.a aVar = l0.i.f39065a;
        if (y10 == aVar.a()) {
            y10 = l0.u1.f(context.getResources().getConfiguration(), l0.u1.h());
            h10.q(y10);
        }
        h10.O();
        l0.s0 s0Var = (l0.s0) y10;
        h10.x(1157296644);
        boolean P = h10.P(s0Var);
        Object y11 = h10.y();
        if (P || y11 == aVar.a()) {
            y11 = new g(s0Var);
            h10.q(y11);
        }
        h10.O();
        androidComposeView.setConfigurationChangeObserver((io.l) y11);
        h10.x(-492369756);
        Object y12 = h10.y();
        if (y12 == aVar.a()) {
            jo.p.g(context, "context");
            y12 = new f0(context);
            h10.q(y12);
        }
        h10.O();
        f0 f0Var = (f0) y12;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            h10.x(-492369756);
            Object y13 = h10.y();
            if (y13 == aVar.a()) {
                y13 = t0.a(androidComposeView, viewTreeOwners.b());
                h10.q(y13);
            }
            h10.O();
            s0 s0Var2 = (s0) y13;
            l0.c0.a(wn.v.f59242a, new h(s0Var2), h10, 0);
            jo.p.g(context, "context");
            v1.d m10 = m(context, b(s0Var), h10, 72);
            l0.c1<Configuration> c1Var = f14687a;
            Configuration b10 = b(s0Var);
            jo.p.g(b10, "configuration");
            l0.r.a(new l0.d1[]{c1Var.c(b10), f14688b.c(context), f14690d.c(viewTreeOwners.a()), f14691e.c(viewTreeOwners.b()), u0.h.b().c(s0Var2), f14692f.c(androidComposeView.getView()), f14689c.c(m10)}, s0.c.b(h10, 1471621628, true, new i(androidComposeView, f0Var, pVar, i10)), h10, 56);
            l0.l1 l10 = h10.l();
            if (l10 == null) {
                return;
            }
            l10.a(new j(androidComposeView, pVar, i10));
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final Configuration b(l0.s0<Configuration> s0Var) {
        return s0Var.getValue();
    }

    public static final void c(l0.s0<Configuration> s0Var, Configuration configuration) {
        s0Var.setValue(configuration);
    }

    public static final l0.c1<Configuration> f() {
        return f14687a;
    }

    public static final l0.c1<Context> g() {
        return f14688b;
    }

    public static final l0.c1<v1.d> h() {
        return f14689c;
    }

    public static final l0.c1<androidx.lifecycle.u> i() {
        return f14690d;
    }

    public static final l0.c1<y4.e> j() {
        return f14691e;
    }

    public static final l0.c1<View> k() {
        return f14692f;
    }

    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v1.d m(Context context, Configuration configuration, l0.i iVar, int i10) {
        T t10;
        iVar.x(-485908294);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        i.a aVar = l0.i.f39065a;
        if (y10 == aVar.a()) {
            y10 = new v1.d();
            iVar.q(y10);
        }
        iVar.O();
        v1.d dVar = (v1.d) y10;
        jo.e0 e0Var = new jo.e0();
        iVar.x(-492369756);
        Object y11 = iVar.y();
        if (y11 == aVar.a()) {
            iVar.q(configuration);
            t10 = configuration;
        } else {
            t10 = y11;
        }
        iVar.O();
        e0Var.f38136w = t10;
        iVar.x(-492369756);
        Object y12 = iVar.y();
        if (y12 == aVar.a()) {
            y12 = new l(e0Var, dVar);
            iVar.q(y12);
        }
        iVar.O();
        l0.c0.a(dVar, new k(context, (l) y12), iVar, 8);
        iVar.O();
        return dVar;
    }
}
