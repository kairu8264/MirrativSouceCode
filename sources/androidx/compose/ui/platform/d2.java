package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface d2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14411a = a.f14412a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f14412a = new a();

        public final d2 a() {
            return b.f14413b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d2 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f14413b = new b();

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.platform.a f14414w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ View$OnAttachStateChangeListenerC0052b f14415x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ u3.b f14416y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.platform.a aVar, View$OnAttachStateChangeListenerC0052b view$OnAttachStateChangeListenerC0052b, u3.b bVar) {
                super(0);
                this.f14414w = aVar;
                this.f14415x = view$OnAttachStateChangeListenerC0052b;
                this.f14416y = bVar;
            }

            public final void a() {
                this.f14414w.removeOnAttachStateChangeListener(this.f14415x);
                u3.a.e(this.f14414w, this.f14416y);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* renamed from: androidx.compose.ui.platform.d2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC0052b implements View.OnAttachStateChangeListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.platform.a f14417w;

            public View$OnAttachStateChangeListenerC0052b(androidx.compose.ui.platform.a aVar) {
                this.f14417w = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                jo.p.h(view, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                jo.p.h(view, "v");
                if (u3.a.d(this.f14417w)) {
                    return;
                }
                this.f14417w.e();
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements u3.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.platform.a f14418a;

            public c(androidx.compose.ui.platform.a aVar) {
                this.f14418a = aVar;
            }
        }

        @Override // androidx.compose.ui.platform.d2
        public io.a<wn.v> a(androidx.compose.ui.platform.a aVar) {
            jo.p.h(aVar, "view");
            View$OnAttachStateChangeListenerC0052b view$OnAttachStateChangeListenerC0052b = new View$OnAttachStateChangeListenerC0052b(aVar);
            aVar.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC0052b);
            c cVar = new c(aVar);
            u3.a.a(aVar, cVar);
            return new a(aVar, view$OnAttachStateChangeListenerC0052b, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d2 {

        /* renamed from: b  reason: collision with root package name */
        public static final c f14419b = new c();

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.platform.a f14420w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ View$OnAttachStateChangeListenerC0053c f14421x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.platform.a aVar, View$OnAttachStateChangeListenerC0053c view$OnAttachStateChangeListenerC0053c) {
                super(0);
                this.f14420w = aVar;
                this.f14421x = view$OnAttachStateChangeListenerC0053c;
            }

            public final void a() {
                this.f14420w.removeOnAttachStateChangeListener(this.f14421x);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ jo.e0<io.a<wn.v>> f14422w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jo.e0<io.a<wn.v>> e0Var) {
                super(0);
                this.f14422w = e0Var;
            }

            public final void a() {
                this.f14422w.f38136w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* renamed from: androidx.compose.ui.platform.d2$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC0053c implements View.OnAttachStateChangeListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.platform.a f14423w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ jo.e0<io.a<wn.v>> f14424x;

            public View$OnAttachStateChangeListenerC0053c(androidx.compose.ui.platform.a aVar, jo.e0<io.a<wn.v>> e0Var) {
                this.f14423w = aVar;
                this.f14424x = e0Var;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [T, io.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                jo.p.h(view, "v");
                androidx.lifecycle.u a10 = androidx.lifecycle.w0.a(this.f14423w);
                androidx.compose.ui.platform.a aVar = this.f14423w;
                if (a10 != null) {
                    jo.p.g(a10, "checkNotNull(ViewTreeLif…                        }");
                    jo.e0<io.a<wn.v>> e0Var = this.f14424x;
                    androidx.compose.ui.platform.a aVar2 = this.f14423w;
                    androidx.lifecycle.o g10 = a10.g();
                    jo.p.g(g10, "lco.lifecycle");
                    e0Var.f38136w = f2.b(aVar2, g10);
                    this.f14423w.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                jo.p.h(view, "v");
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.d2$c$a] */
        @Override // androidx.compose.ui.platform.d2
        public io.a<wn.v> a(androidx.compose.ui.platform.a aVar) {
            jo.p.h(aVar, "view");
            if (aVar.isAttachedToWindow()) {
                androidx.lifecycle.u a10 = androidx.lifecycle.w0.a(aVar);
                if (a10 != null) {
                    jo.p.g(a10, "checkNotNull(ViewTreeLif…eOwner\"\n                }");
                    androidx.lifecycle.o g10 = a10.g();
                    jo.p.g(g10, "lco.lifecycle");
                    return f2.b(aVar, g10);
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }
            jo.e0 e0Var = new jo.e0();
            View$OnAttachStateChangeListenerC0053c view$OnAttachStateChangeListenerC0053c = new View$OnAttachStateChangeListenerC0053c(aVar, e0Var);
            aVar.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC0053c);
            e0Var.f38136w = new a(aVar, view$OnAttachStateChangeListenerC0053c);
            return new b(e0Var);
        }
    }

    io.a<wn.v> a(androidx.compose.ui.platform.a aVar);
}
