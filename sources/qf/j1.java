package qf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;
import ud.x1;

/* loaded from: classes3.dex */
public final class j1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49240b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49241c = ComposeView.F;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f49242a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            return new j1(new ComposeView(context, null, 0, 6, null), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x1.d f49243w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.d dVar) {
            super(2);
            this.f49243w = dVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                pf.a.a(this.f49243w, iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public j1(ComposeView composeView) {
        super(composeView);
        this.f49242a = composeView;
        g9.a.f32826a.i("LiveGiftCheerRankViewHolder create");
        composeView.setViewCompositionStrategy(d2.c.f14419b);
    }

    public /* synthetic */ j1(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(x1.d dVar) {
        jo.p.h(dVar, "bindModel");
        this.f49242a.setContent(s0.c.c(-686709002, true, new b(dVar)));
    }

    public final ComposeView b() {
        return this.f49242a;
    }
}
