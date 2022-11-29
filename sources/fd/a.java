package fd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import jf.o0;
import jo.i0;
import jo.p;
import nc.i;
import so.o;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0351a f31951h = new C0351a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f31952i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final SpannableStringBuilder f31953a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31954b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31955c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31956d;

    /* renamed from: e  reason: collision with root package name */
    public final String f31957e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f31958f;

    /* renamed from: g  reason: collision with root package name */
    public final String f31959g;

    /* renamed from: fd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0351a {
        public C0351a() {
        }

        public /* synthetic */ C0351a(jo.h hVar) {
            this();
        }

        public final a a(Context context, o0 o0Var) {
            SpannableStringBuilder b10;
            Drawable f10;
            Drawable drawable;
            String string;
            String str;
            String string2;
            p.h(context, "context");
            p.h(o0Var, "purchaseHoliday");
            if (o0Var.f()) {
                b10 = c(context);
            } else {
                b10 = b(context);
            }
            String valueOf = String.valueOf(o0Var.h());
            i0 i0Var = i0.f38149a;
            String string3 = context.getString(i.text_holiday_purchase_popup_count);
            p.g(string3, "context.getString(R.stri…day_purchase_popup_count)");
            String format = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(o0Var.a())}, 1));
            p.g(format, "format(format, *args)");
            boolean f11 = o0Var.f();
            String string4 = context.getString(i.text_holiday_purchase_popup_description2, String.valueOf(o0Var.e()));
            p.g(string4, "context.getString(R.stri…maxHolidayNum.toString())");
            if (o0Var.f()) {
                f10 = c3.a.f(context, nc.d.rectangle_corner20_yelloworange);
            } else {
                f10 = c3.a.f(context, nc.d.rectangle_corner32_pinkishgray);
            }
            if (o0Var.c()) {
                string2 = context.getString(i.text_holiday_purchase_error_state_using);
            } else if (!o0Var.b()) {
                if (o0Var.j()) {
                    drawable = f10;
                    string = context.getString(i.text_holiday_purchase_error_state_bought, new SimpleDateFormat("M/d(E) HH:mm", Locale.JAPANESE).format(new Date(o0Var.g() * 1000)));
                } else {
                    drawable = f10;
                    string = !o0Var.i() ? context.getString(i.text_holiday_purchase_error_not_continuous_streamer) : "";
                }
                str = string;
                p.g(str, "when {\n                 …e -> \"\"\n                }");
                return new a(b10, valueOf, format, f11, string4, drawable, str);
            } else {
                string2 = context.getString(i.text_holiday_purchase_error_state_limit2, String.valueOf(o0Var.e()));
            }
            str = string2;
            drawable = f10;
            p.g(str, "when {\n                 …e -> \"\"\n                }");
            return new a(b10, valueOf, format, f11, string4, drawable, str);
        }

        public final SpannableStringBuilder b(Context context) {
            String string = context.getString(i.text_holiday_purchase_popup_title_disable);
            p.g(string, "context.getString(R.stri…hase_popup_title_disable)");
            return new SpannableStringBuilder(string);
        }

        public final SpannableStringBuilder c(Context context) {
            String string = context.getString(i.text_holiday_purchase_popup_title);
            p.g(string, "context.getString(R.stri…day_purchase_popup_title)");
            String string2 = context.getString(i.text_holiday_purchase_popup_title_highlight);
            p.g(string2, "context.getString(R.stri…se_popup_title_highlight)");
            int d10 = c3.a.d(context, nc.b.f41804x);
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new ForegroundColorSpan(d10), 0, string2.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int U = o.U(string, string2, 0, false, 6, null);
            spannableStringBuilder.replace(U, string2.length() + U, (CharSequence) spannableString);
            return spannableStringBuilder;
        }
    }

    public a(SpannableStringBuilder spannableStringBuilder, String str, String str2, boolean z10, String str3, Drawable drawable, String str4) {
        p.h(spannableStringBuilder, "title");
        p.h(str, "priceText");
        p.h(str2, "countText");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "errorText");
        this.f31953a = spannableStringBuilder;
        this.f31954b = str;
        this.f31955c = str2;
        this.f31956d = z10;
        this.f31957e = str3;
        this.f31958f = drawable;
        this.f31959g = str4;
    }

    public final Drawable a() {
        return this.f31958f;
    }

    public final String b() {
        return this.f31955c;
    }

    public final String c() {
        return this.f31957e;
    }

    public final String d() {
        return this.f31959g;
    }

    public final String e() {
        return this.f31954b;
    }

    public final SpannableStringBuilder f() {
        return this.f31953a;
    }

    public final boolean g() {
        return this.f31956d;
    }
}
