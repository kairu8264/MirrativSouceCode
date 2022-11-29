package qf;

import ae.ic;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49051b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49052c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ic f49053a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_app_setting_footer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new b((ic) e10, null);
        }
    }

    /* renamed from: qf.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0743b extends ClickableSpan {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49054w;

        public C0743b(io.a<wn.v> aVar) {
            this.f49054w = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            jo.p.h(view, "widget");
            this.f49054w.invoke();
        }
    }

    public b(ic icVar) {
        super(icVar.u());
        this.f49053a = icVar;
    }

    public /* synthetic */ b(ic icVar, jo.h hVar) {
        this(icVar);
    }

    public final void a(io.a<wn.v> aVar) {
        jo.p.h(aVar, "listener");
        String string = this.f49053a.u().getResources().getString(nd.f1.text_app_add_request_label);
        jo.p.g(string, "binding.root.resources.g…xt_app_add_request_label)");
        AppCompatTextView appCompatTextView = this.f49053a.B;
        SpannableString spannableString = new SpannableString(this.f49053a.u().getResources().getString(nd.f1.text_appsetting_broadcast_appselected_caution2_ios));
        int U = so.o.U(spannableString, string, 0, false, 6, null);
        int length = string.length() + U;
        spannableString.setSpan(new C0743b(aVar), U, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(c3.a.d(this.f49053a.u().getContext(), nd.w0.f42242u0)), U, length, 33);
        appCompatTextView.setText(spannableString);
        this.f49053a.B.setMovementMethod(new LinkMovementMethod());
    }
}
