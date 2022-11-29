package xb;

import ac.z6;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;
import ud.j4;

/* loaded from: classes2.dex */
public final class z extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60120b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f60121c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final z6 f60122a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), p.view_holder_stream_collab_live_gift_comment, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new z((z6) e10, null);
        }
    }

    public z(z6 z6Var) {
        super(z6Var.u());
        this.f60122a = z6Var;
    }

    public /* synthetic */ z(z6 z6Var, jo.h hVar) {
        this(z6Var);
    }

    public final void a(j4 j4Var) {
        jo.p.h(j4Var, "comment");
        ProfileImageView profileImageView = this.f60122a.C;
        jo.p.g(profileImageView, "binding.profileImageView");
        ProfileImageView.b(profileImageView, j4Var.f(), j4Var.g(), null, null, 12, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(j4Var.c());
        spannableString.setSpan(new ForegroundColorSpan(c3.a.d(this.f60122a.u().getContext(), l.f59946r)), 0, j4Var.c().length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) this.f60122a.u().getContext().getString(r.f60075f0, j4Var.i()));
        spannableStringBuilder.append((CharSequence) j4Var.a());
        this.f60122a.B.setText(spannableStringBuilder);
        this.f60122a.o();
    }
}
