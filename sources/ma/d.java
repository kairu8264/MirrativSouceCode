package ma;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import com.dena.mirrativ.mirrativapi.core.MRError;
import io.l;
import ja.n;
import ja.o;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import p.d;
import uo.q0;
import wn.m;
import wn.v;
import xo.w;
import yd.t1;

/* loaded from: classes.dex */
public final class d extends androidx.fragment.app.e implements q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0 = new da.j();
    public final wn.f O0 = wn.g.b(wn.i.SYNCHRONIZED, new f(this, null, null));
    public final wn.f P0 = wn.g.a(new e());
    public final wn.f Q0 = wn.g.a(new b());

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(String str, String str2) {
            p.h(str, "referer");
            p.h(str2, "liveGameId");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_LIVE_GAME_ID", str2);
            dVar.V2(bundle);
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = d.this.M2().getString("EXTRA_KEY_LIVE_GAME_ID");
            p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes.dex */
        public static final class a extends q implements l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f40644w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.f40644w = dVar;
            }

            public final void a(String str) {
                p.h(str, "it");
                new d.a().a().a(this.f40644w.N2(), Uri.parse(str));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f40645w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(0);
                this.f40645w = dVar;
            }

            public final void a() {
                this.f40645w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public c() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                g.a(d.this.F3(), d.this.E3(), new a(d.this), new b(d.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.gifthelp.LiveGameGiftHelpDialogFragment$onViewCreated$1", f = "LiveGameGiftHelpDialogFragment.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: ma.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0595d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40646w;

        /* renamed from: ma.d$d$a */
        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f40648w;

            public a(d dVar) {
                this.f40648w = dVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                t1.a aVar = t1.f61795x;
                Context N2 = this.f40648w.N2();
                p.g(N2, "requireContext()");
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f40648w.U0(n.f37437a);
                    p.g(message, "getString(R.string.error_access)");
                }
                aVar.a(N2, message);
                this.f40648w.n3();
                return v.f59242a;
            }
        }

        public C0595d(ao.d<? super C0595d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0595d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0595d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40646w;
            if (i10 == 0) {
                m.b(obj);
                w<MRError> g10 = d.this.G3().g();
                a aVar = new a(d.this);
                this.f40646w = 1;
                if (g10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = d.this.M2().getString("EXTRA_KEY_REFERER");
            p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40650w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40651x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40650w = componentCallbacks;
            this.f40651x = aVar;
            this.f40652y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ma.h] */
        @Override // io.a
        public final h invoke() {
            ComponentCallbacks componentCallbacks = this.f40650w;
            return gq.a.a(componentCallbacks).c(f0.b(h.class), this.f40651x, this.f40652y);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(1858229002, true, new c()));
        return composeView;
    }

    public final String E3() {
        return (String) this.Q0.getValue();
    }

    public final String F3() {
        return (String) this.P0.getValue();
    }

    public final h G3() {
        return (h) this.O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        int b10;
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        if (O0().getConfiguration().orientation == 1) {
            b10 = de.e.b(this, 380);
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = N2().getSystemService("window");
            p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            b10 = displayMetrics.heightPixels - de.e.b(this, 48);
        }
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 320), b10);
        }
        uo.l.d(this, null, null, new C0595d(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        n3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), o.f37439a);
    }
}
