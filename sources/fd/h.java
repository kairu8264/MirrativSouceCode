package fd;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import da.j;
import java.util.Arrays;
import jo.f0;
import jo.i0;
import jo.p;
import jo.s;
import nc.i;
import pc.u0;
import so.o;
import uo.q0;

/* loaded from: classes2.dex */
public final class h extends androidx.fragment.app.e implements q0 {
    public final /* synthetic */ j N0 = new j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] Q0 = {f0.d(new s(h.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/DialogFragmentHolidayPurchaseSuccessBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = AutoClearedValue.f25045c | j.f29340x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(int i10) {
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_HOLIDAY_NUM", i10);
            hVar.V2(bundle);
            return hVar;
        }
    }

    public static final void E3(h hVar, View view) {
        p.h(hVar, "this$0");
        hVar.m3();
    }

    public final u0 C3() {
        return (u0) this.O0.b(this, Q0[0]);
    }

    public final SpannableStringBuilder D3() {
        String string = O0().getString(i.text_holiday_purchase_popup_success);
        p.g(string, "resources.getString(R.st…y_purchase_popup_success)");
        String string2 = O0().getString(i.text_holiday_purchase_popup_title_highlight);
        p.g(string2, "resources.getString(R.st…se_popup_title_highlight)");
        int d10 = c3.a.d(N2(), nc.b.f41804x);
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new ForegroundColorSpan(d10), 0, string2.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int U = o.U(string, string2, 0, false, 6, null);
        spannableStringBuilder.replace(U, string2.length() + U, (CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public final void F3(u0 u0Var) {
        this.O0.a(this, Q0[0], u0Var);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), nc.f.dialog_fragment_holiday_purchase_success, null, false);
        p.g(e10, "inflate(LayoutInflater.f…ase_success, null, false)");
        F3((u0) e10);
        C3().F.setOnClickListener(new View.OnClickListener() { // from class: fd.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.E3(h.this, view);
            }
        });
        C3().G.setText(D3());
        int i10 = M2().getInt("EXTRA_HOLIDAY_NUM");
        AppCompatTextView appCompatTextView = C3().D;
        i0 i0Var = i0.f38149a;
        String string = O0().getString(i.text_holiday_purchase_popup_count);
        p.g(string, "resources.getString(R.st…day_purchase_popup_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        p.g(format, "format(format, *args)");
        appCompatTextView.setText(format);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        C3().B.startAnimation(rotateAnimation);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(C3().u());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
