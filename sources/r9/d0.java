package r9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.glide.GlideApp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d0 extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f50144c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f50145d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.k0 f50146a;

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Closet, wn.v> f50147b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_emomo_closet, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d0((s9.k0) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(s9.k0 k0Var) {
        super(k0Var.u());
        jo.p.h(k0Var, "binding");
        this.f50146a = k0Var;
    }

    public static final void c(Closet closet, d0 d0Var, View view) {
        jo.p.h(closet, "$closet");
        jo.p.h(d0Var, "this$0");
        if (closet.isUsed()) {
            closet.setNameEdit(true);
            d0Var.g(closet.getNameEdit());
            io.l<? super Closet, wn.v> lVar = d0Var.f50147b;
            if (lVar != null) {
                lVar.invoke(closet);
            }
        }
    }

    public final void b(final Closet closet) {
        jo.p.h(closet, Referer.CLOSET);
        Context context = this.f50146a.u().getContext();
        h(closet.isUsed(), closet.getNameEdit());
        if (closet.getActive()) {
            this.f50146a.B.setVisibility(0);
        } else {
            this.f50146a.B.setVisibility(8);
        }
        if (closet.isUsed()) {
            if (closet.getName().length() > 0) {
                this.f50146a.G.setText(closet.getName());
                this.f50146a.G.setTextColor(context.getResources().getColor(q9.d.f48822z));
            } else {
                AppCompatTextView appCompatTextView = this.f50146a.G;
                jo.i0 i0Var = jo.i0.f38149a;
                String string = context.getString(q9.i.I);
                jo.p.g(string, "context.getString(R.stri…t_emomo_slot_with_number)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(closet.getClosetId())}, 1));
                jo.p.g(format, "format(format, *args)");
                appCompatTextView.setText(format);
                this.f50146a.G.setTextColor(context.getResources().getColor(q9.d.B));
            }
            AppCompatTextView appCompatTextView2 = this.f50146a.I;
            jo.i0 i0Var2 = jo.i0.f38149a;
            String string2 = context.getString(q9.i.J);
            jo.p.g(string2, "context.getString(R.string.text_emomo_updated_at)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{new SimpleDateFormat("yyyy/M/d", Locale.getDefault()).format(new Date(Long.parseLong(closet.getUpdatedAt()) * 1000))}, 1));
            jo.p.g(format2, "format(format, *args)");
            appCompatTextView2.setText(format2);
        } else {
            this.f50146a.G.setText(context.getString(q9.i.text_emomo_not_created));
            this.f50146a.G.setTextColor(context.getResources().getColor(q9.d.B));
            this.f50146a.I.setText("");
        }
        e8.h hVar = new e8.h();
        jo.p.g(context, "context");
        e8.h transforms = hVar.transforms(new v7.i(), new v7.y(of.t.b(context, 24)));
        jo.p.g(transforms, "RequestOptions().transfo…ntext, 24))\n            )");
        e8.h hVar2 = transforms;
        GlideApp.with(context).load(closet.getAvatarBackgroundImageUrl()).apply((e8.a<?>) hVar2).into(this.f50146a.D);
        GlideApp.with(context).load(closet.getAvatarBodyImageUrl()).apply((e8.a<?>) hVar2).into(this.f50146a.E);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: r9.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.c(Closet.this, this, view);
            }
        };
        this.f50146a.F.setOnClickListener(onClickListener);
        this.f50146a.G.setOnClickListener(onClickListener);
    }

    public final s9.k0 d() {
        return this.f50146a;
    }

    public final void f(io.l<? super Closet, wn.v> lVar) {
        this.f50147b = lVar;
    }

    public final void g(boolean z10) {
        s9.k0 k0Var = this.f50146a;
        if (z10) {
            k0Var.G.setVisibility(4);
            k0Var.F.setVisibility(4);
            return;
        }
        k0Var.G.setVisibility(0);
        k0Var.F.setVisibility(0);
    }

    public final void h(boolean z10, boolean z11) {
        g(z11);
        s9.k0 k0Var = this.f50146a;
        if (z10) {
            k0Var.J.setVisibility(4);
            k0Var.C.setVisibility(4);
            k0Var.D.setVisibility(0);
            k0Var.E.setVisibility(0);
            return;
        }
        k0Var.J.setVisibility(0);
        k0Var.C.setVisibility(0);
        k0Var.D.setVisibility(4);
        k0Var.E.setVisibility(4);
        k0Var.F.setVisibility(4);
    }
}
