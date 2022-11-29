package tc;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class l1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53540b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f53541c = ComposeView.F;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f53542a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            g9.a.f32826a.i("MyChatRequestConfirmationViewHolder create");
            composeView.setViewCompositionStrategy(d2.c.f14419b);
            return new l1(composeView, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f53543w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(2);
            this.f53543w = aVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                m1.a(this.f53543w, iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public l1(ComposeView composeView) {
        super(composeView);
        this.f53542a = composeView;
    }

    public /* synthetic */ l1(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(io.a<wn.v> aVar) {
        jo.p.h(aVar, "onClickRegister");
        this.f53542a.setContent(s0.c.c(1743738530, true, new b(aVar)));
    }

    public final ComposeView b() {
        return this.f53542a;
    }
}
