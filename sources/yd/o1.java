package yd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequests;
import java.util.List;

/* loaded from: classes2.dex */
public final class o1 extends androidx.recyclerview.widget.t<wn.k<? extends String, ? extends Boolean>, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwitchableEventBannerIconView f61774c;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SwitchableEventBannerIconView f61775w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f61776x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SwitchableEventBannerIconView switchableEventBannerIconView, int i10) {
            super(1);
            this.f61775w = switchableEventBannerIconView;
            this.f61776x = i10;
        }

        public final void a(View view) {
            s1 s1Var;
            jo.p.h(view, "it");
            s1Var = this.f61775w.f25615y;
            if (s1Var != null) {
                s1Var.a(this.f61776x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.e0 {
        public b(View view) {
            super(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(SwitchableEventBannerIconView switchableEventBannerIconView, p1 p1Var) {
        super(p1Var);
        this.f61774c = switchableEventBannerIconView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        List list;
        int size;
        List list2;
        List list3;
        List list4;
        jo.p.h(e0Var, "holder");
        if (i10 == 0) {
            size = 0;
        } else {
            list = this.f61774c.f25614x;
            size = i10 % list.size();
        }
        ImageView imageView = (ImageView) e0Var.itemView.findViewById(nd.z0.L6);
        jo.p.g(imageView, "imageView");
        g1.a(imageView, new a(this.f61774c, size));
        list2 = this.f61774c.f25614x;
        boolean booleanValue = ((Boolean) ((wn.k) list2.get(size)).d()).booleanValue();
        ImageView imageView2 = (ImageView) e0Var.itemView.findViewById(nd.z0.focused_event_image_view);
        jo.p.g(imageView2, "focusedEventView");
        imageView2.setVisibility(booleanValue ? 0 : 8);
        td.a.x(imageView2, Integer.valueOf(nd.y0.Z3));
        View findViewById = e0Var.itemView.findViewById(nd.z0.f42307kc);
        jo.p.g(findViewById, "roundedBorderView");
        findViewById.setVisibility(booleanValue ? 0 : 8);
        if (booleanValue) {
            GlideRequests with = GlideApp.with(this.f61774c.getContext());
            list4 = this.f61774c.f25614x;
            with.load((String) ((wn.k) list4.get(size)).c()).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new xd.d(de.n.b(imageView, 10), de.n.b(imageView, 1), c3.a.d(this.f61774c.getContext(), nd.w0.U0))))).into(imageView);
            return;
        }
        GlideRequests with2 = GlideApp.with(this.f61774c.getContext());
        list3 = this.f61774c.f25614x;
        with2.load((String) ((wn.k) list3.get(size)).c()).centerCrop().into(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(nd.b1.view_holder_switchable_event_banner, viewGroup, false));
    }
}
