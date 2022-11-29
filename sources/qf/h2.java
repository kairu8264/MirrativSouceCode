package qf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49202b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49203c = ComposeView.F;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f49204a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            return new h2(new ComposeView(context, null, 0, 6, null), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ud.w2 f49205w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49206x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ud.w2 w2Var, io.a<wn.v> aVar) {
            super(2);
            this.f49205w = w2Var;
            this.f49206x = aVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                i2.a(null, g2.f49162i.a(this.f49205w.c(), this.f49205w.h(), this.f49205w.f(), this.f49205w.b(), this.f49205w.a(), this.f49205w.i()), this.f49206x, iVar, 64, 1);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public h2(ComposeView composeView) {
        super(composeView);
        this.f49204a = composeView;
        g9.a.f32826a.i("PlayerCommentCheerLevelUpViewHolder create");
        composeView.setViewCompositionStrategy(d2.c.f14419b);
    }

    public /* synthetic */ h2(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(ud.w2 w2Var, io.a<wn.v> aVar) {
        jo.p.h(w2Var, "bindModel");
        jo.p.h(aVar, "onClick");
        this.f49204a.setContent(s0.c.c(-70325922, true, new b(w2Var, aVar)));
    }

    public final ComposeView b() {
        return this.f49204a;
    }
}
