package be;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrorman.customview.RoundedButtonView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s extends androidx.fragment.app.e implements uo.q0 {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final /* synthetic */ da.j N0;
    public b O0;
    public final wn.f P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(String str) {
            jo.p.h(str, "appUserIdLabel");
            s sVar = new s();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_APP_USER_ID_LABEL", str);
            sVar.V2(bundle);
            return sVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(s sVar);

        void h(s sVar);
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return s.this.M2().getString("EXTRA_APP_USER_ID_LABEL");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s.this.n3();
            b C3 = s.this.C3();
            if (C3 != null) {
                C3.a(s.this);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s.this.n3();
            b C3 = s.this.C3();
            if (C3 != null) {
                C3.h(s.this);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public s() {
        super(nd.b1.dialog_fragment_app_user_id_warning);
        this.N0 = new da.j();
        this.P0 = wn.g.a(new c());
    }

    public final String B3() {
        return (String) this.P0.getValue();
    }

    public final b C3() {
        return this.O0;
    }

    public final void D3(b bVar) {
        this.O0 = bVar;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        ae.f1 T = ae.f1.T(view);
        AppCompatTextView appCompatTextView = T.E;
        jo.i0 i0Var = jo.i0.f38149a;
        String string = O0().getString(nd.f1.text_app_user_id_warning_description);
        jo.p.g(string, "resources.getString(R.st…r_id_warning_description)");
        String format = String.format(string, Arrays.copyOf(new Object[]{B3()}, 1));
        jo.p.g(format, "format(format, *args)");
        appCompatTextView.setText(format);
        AppCompatTextView appCompatTextView2 = T.F;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources O0 = O0();
        int i10 = nd.w0.f42231f0;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(O0.getColor(i10, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) B3());
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) O0().getString(nd.f1.text_app_user_id_warning_message_p1));
        jo.p.g(append, "SpannableStringBuilder()…r_id_warning_message_p1))");
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(O0().getColor(i10, null));
        int length3 = append.length();
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length4 = append.length();
        append.append((CharSequence) O0().getString(nd.f1.text_app_user_id_warning_message_p2));
        append.setSpan(styleSpan2, length4, append.length(), 17);
        append.setSpan(foregroundColorSpan2, length3, append.length(), 17);
        appCompatTextView2.setText(append.append((CharSequence) O0().getString(nd.f1.text_app_user_id_warning_message_p3)));
        RoundedButtonView roundedButtonView = T.C;
        jo.p.g(roundedButtonView, "binding.continueButton");
        yd.g1.a(roundedButtonView, new d());
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new e());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        return dialog;
    }
}
