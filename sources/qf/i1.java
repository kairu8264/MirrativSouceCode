package qf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;
import ud.x1;

/* loaded from: classes3.dex */
public final class i1 extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f49217c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f49218d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f49219a;

    /* renamed from: b  reason: collision with root package name */
    public io.a<wn.v> f49220b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            return new i1(new ComposeView(context, null, 0, 6, null), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x1.a f49221w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i1 f49222x;

        /* loaded from: classes3.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ i1 f49223w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i1 i1Var) {
                super(0);
                this.f49223w = i1Var;
            }

            public final void a() {
                this.f49223w.c().invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a aVar, i1 i1Var) {
            super(2);
            this.f49221w = aVar;
            this.f49222x = i1Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                yd.l0.a(this.f49221w, new a(this.f49222x), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f49224w = new c();

        public c() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public i1(ComposeView composeView) {
        super(composeView);
        this.f49219a = composeView;
        g9.a.f32826a.i("LiveGiftCheerBannerViewHolder create");
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        this.f49220b = c.f49224w;
    }

    public /* synthetic */ i1(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(x1.a aVar) {
        jo.p.h(aVar, "bindModel");
        this.f49219a.setContent(s0.c.c(960256502, true, new b(aVar, this)));
    }

    public final ComposeView b() {
        return this.f49219a;
    }

    public final io.a<wn.v> c() {
        return this.f49220b;
    }

    public final void d(io.a<wn.v> aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f49220b = aVar;
    }
}
