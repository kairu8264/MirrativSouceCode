package td;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import jo.i0;
import jo.p;
import k3.d;
import nd.f1;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f53596a = new b();

    @SuppressLint({"SetTextI18n"})
    public static final void a(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            if (num.intValue() > 1) {
                textView.setVisibility(0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append('+');
                sb2.append(num.intValue() - 1);
                textView.setText(sb2.toString());
                return;
            }
            textView.setVisibility(8);
        }
    }

    public static final void b(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num == null || num.intValue() == 0) {
            return;
        }
        Date date = new Date(num.intValue() * 1000);
        Locale c10 = d.a(textView.getContext().getResources().getConfiguration()).c(0);
        if (!p.c(c10, Locale.JAPAN) && !p.c(c10, Locale.JAPANESE)) {
            textView.setText(new SimpleDateFormat("M/d HH:mm〜", c10).format(date));
        } else {
            textView.setText(new SimpleDateFormat("M月d日 HH:mm〜", c10).format(date));
        }
    }

    public static final void c(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            i0 i0Var = i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{num}, 1));
            p.g(format, "format(format, *args)");
            textView.setText(format);
        }
    }

    public static final void d(TextView textView, Integer num, Boolean bool) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            i0 i0Var = i0.f38149a;
            String format = String.format(booleanValue ? "%,dpt" : "%dpt", Arrays.copyOf(new Object[]{num}, 1));
            p.g(format, "format(format, *args)");
            textView.setText(format);
        }
    }

    public static final void e(TextView textView, Long l10) {
        p.h(textView, "textView");
        if (l10 != null) {
            l10.longValue();
            textView.setText(DateFormat.format(textView.getContext().getString(f1.text_profile_join_date_format), l10.longValue() * 1000));
        }
    }

    public static final void f(TextView textView, SpannableString spannableString) {
        p.h(textView, "textView");
        if (spannableString == null) {
            return;
        }
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public static final void g(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            textView.setTextColor(num.intValue());
        }
    }

    public static final void h(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            textView.setTextSize(2, num.intValue());
        }
    }

    public static final void i(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            textView.setTypeface(null, num.intValue());
        }
    }

    public static final void j(TextView textView, String str) {
        p.h(textView, "textView");
        p.h(str, "fontName");
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), str));
    }

    @SuppressLint({"SetTextI18n"})
    public static final void k(TextView textView, String str) {
        p.h(textView, "textView");
        if (str == null) {
            return;
        }
        textView.setText("ID: " + str);
    }

    public static final void l(TextView textView, Integer num) {
        p.h(textView, "textView");
        if (num != null) {
            num.intValue();
            i0 i0Var = i0.f38149a;
            String format = String.format("%,d%s", Arrays.copyOf(new Object[]{num, textView.getContext().getString(f1.text_views)}, 2));
            p.g(format, "format(format, *args)");
            textView.setText(format);
        }
    }

    public static final void m(TextView textView, Long l10) {
        String c10;
        p.h(textView, "textView");
        if (l10 != null) {
            l10.longValue();
            if (l10.longValue() < 3600) {
                c10 = of.c.f45387a.d(l10.longValue());
            } else {
                c10 = of.c.f45387a.c(l10.longValue());
            }
            textView.setText(c10);
        }
    }
}
