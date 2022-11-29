package qf;

import ae.o9;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class d0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49097b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49098c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final o9 f49099a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            o9 T = o9.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new d0(T, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0 f49100w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f49101x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, String str) {
            super(1);
            this.f49100w = e0Var;
            this.f49101x = str;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e0 e0Var = this.f49100w;
            if (e0Var != null) {
                e0Var.a(this.f49101x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public d0(o9 o9Var) {
        super(o9Var.u());
        this.f49099a = o9Var;
    }

    public /* synthetic */ d0(o9 o9Var, jo.h hVar) {
        this(o9Var);
    }

    public final void a(String str, String str2, String str3, boolean z10, e0 e0Var) {
        jo.p.h(str, "poseId");
        AppCompatImageView appCompatImageView = this.f49099a.C;
        jo.p.g(appCompatImageView, "binding.poseImageView");
        de.f.e(appCompatImageView, str2, null);
        this.f49099a.E.setText(str3);
        this.f49099a.D.setVisibility(z10 ? 0 : 8);
        View u10 = this.f49099a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(e0Var, str));
    }
}
