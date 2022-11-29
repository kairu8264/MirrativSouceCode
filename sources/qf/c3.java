package qf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;
import ud.h4;

/* loaded from: classes3.dex */
public final class c3 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49089b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49090c = ComposeView.F;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f49091a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            return new c3(new ComposeView(context, null, 0, 6, null), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h4 f49092w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49093x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h4 h4Var, io.a<wn.v> aVar) {
            super(2);
            this.f49092w = h4Var;
            this.f49093x = aVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                d3.a(null, b3.f49065i.a(this.f49092w.c(), this.f49092w.f(), this.f49092w.g(), this.f49092w.i(), this.f49092w.a(), this.f49092w.j()), this.f49093x, iVar, 64, 1);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public c3(ComposeView composeView) {
        super(composeView);
        this.f49091a = composeView;
        g9.a.f32826a.i("StreamCommentCheerleaderEnterViewHolder create");
        composeView.setViewCompositionStrategy(d2.c.f14419b);
    }

    public /* synthetic */ c3(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(h4 h4Var, io.a<wn.v> aVar) {
        jo.p.h(h4Var, "bindModel");
        jo.p.h(aVar, "onClick");
        this.f49091a.setContent(s0.c.c(265147327, true, new b(h4Var, aVar)));
    }

    public final ComposeView b() {
        return this.f49091a;
    }
}
