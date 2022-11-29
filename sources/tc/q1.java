package tc;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class q1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53564b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f53565c = ComposeView.F;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f53566a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            g9.a.f32826a.i("MyChatUnderageUnavailableViewHolder create");
            composeView.setViewCompositionStrategy(d2.c.f14419b);
            return new q1(composeView, null);
        }
    }

    public q1(ComposeView composeView) {
        super(composeView);
        this.f53566a = composeView;
    }

    public /* synthetic */ q1(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a() {
        this.f53566a.setContent(e0.f53490a.a());
    }

    public final ComposeView b() {
        return this.f53566a;
    }
}
