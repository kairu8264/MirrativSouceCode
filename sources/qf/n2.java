package qf;

import ae.yh;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class n2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49305b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49306c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final yh f49307a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_save_slot, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new n2((yh) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Closet, wn.v> f49308w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Closet f49309x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super Closet, wn.v> lVar, Closet closet) {
            super(1);
            this.f49308w = lVar;
            this.f49309x = closet;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49308w.invoke(this.f49309x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public n2(yh yhVar) {
        super(yhVar.u());
        this.f49307a = yhVar;
    }

    public /* synthetic */ n2(yh yhVar, jo.h hVar) {
        this(yhVar);
    }

    public final void a(Closet closet, io.l<? super Closet, wn.v> lVar) {
        String format;
        jo.p.h(closet, Referer.CLOSET);
        jo.p.h(lVar, "onClickListener");
        this.f49307a.B.setEnabled(closet.isUsed());
        AppCompatTextView appCompatTextView = this.f49307a.D;
        if (closet.getName().length() > 0) {
            format = closet.getName();
        } else {
            jo.i0 i0Var = jo.i0.f38149a;
            String string = this.f49307a.u().getContext().getString(nd.f1.S1);
            jo.p.g(string, "binding.root.context.get…t_emomo_slot_with_number)");
            format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(closet.getClosetId())}, 1));
            jo.p.g(format, "format(format, *args)");
        }
        appCompatTextView.setText(format);
        if (closet.isUsed()) {
            this.f49307a.C.setVisibility(0);
            yh yhVar = this.f49307a;
            AppCompatTextView appCompatTextView2 = yhVar.F;
            jo.i0 i0Var2 = jo.i0.f38149a;
            String string2 = yhVar.u().getContext().getString(nd.f1.V1);
            jo.p.g(string2, "binding.root.context.get…ng.text_emomo_updated_at)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{new SimpleDateFormat("yyyy/M/d", Locale.getDefault()).format(new Date(Long.parseLong(closet.getUpdatedAt()) * 1000))}, 1));
            jo.p.g(format2, "format(format, *args)");
            appCompatTextView2.setText(format2);
            GlideRequest<Drawable> placeholder = GlideApp.with(this.f49307a.C).load(closet.getAvatarFaceImageUrl()).placeholder(nd.y0.V1);
            AppCompatImageView appCompatImageView = this.f49307a.C;
            jo.p.g(appCompatImageView, "binding.slotOneIcon");
            int b10 = de.n.b(appCompatImageView, 2);
            Context context = this.f49307a.C.getContext();
            int i10 = nd.w0.U0;
            placeholder.apply((e8.a<?>) e8.h.bitmapTransform(new xd.a(b10, c3.a.d(context, i10)))).into(this.f49307a.C);
            AppCompatTextView appCompatTextView3 = this.f49307a.F;
            appCompatTextView3.setTextColor(c3.a.d(appCompatTextView3.getContext(), i10));
            yh yhVar2 = this.f49307a;
            yhVar2.D.setTextColor(c3.a.d(yhVar2.F.getContext(), i10));
        } else {
            this.f49307a.C.setVisibility(8);
            AppCompatTextView appCompatTextView4 = this.f49307a.F;
            appCompatTextView4.setText(appCompatTextView4.getResources().getString(nd.f1.text_emomo_no_data));
            AppCompatTextView appCompatTextView5 = this.f49307a.F;
            Context context2 = appCompatTextView5.getContext();
            int i11 = nd.w0.Y;
            appCompatTextView5.setTextColor(c3.a.d(context2, i11));
            yh yhVar3 = this.f49307a;
            yhVar3.D.setTextColor(c3.a.d(yhVar3.F.getContext(), i11));
        }
        View view = this.f49307a.E;
        jo.p.g(view, "binding.slotOneTouchView");
        yd.g1.a(view, new b(lVar, closet));
    }
}
