package com.dena.mirrorman.net.api.response.live;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import c3.a;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.MRUrl;
import java.io.Serializable;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jo.p;
import nd.f1;
import nd.w0;
import nd.y0;
import so.o;

/* loaded from: classes2.dex */
public final class ReceivedDiamonds implements Serializable {
    public static final int $stable = 0;
    private final Integer calculatedAt;
    private final int isEligible;

    public ReceivedDiamonds(Integer num, int i10) {
        this.calculatedAt = num;
        this.isEligible = i10;
    }

    public static /* synthetic */ ReceivedDiamonds copy$default(ReceivedDiamonds receivedDiamonds, Integer num, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = receivedDiamonds.calculatedAt;
        }
        if ((i11 & 2) != 0) {
            i10 = receivedDiamonds.isEligible;
        }
        return receivedDiamonds.copy(num, i10);
    }

    private final SpannableStringBuilder getSpannableStringBuilder(Context context) {
        int d10 = a.d(context, w0.receive_date_text_color);
        if (this.calculatedAt == null) {
            String string = context.getString(f1.text_result_orb_info1_highlight);
            p.g(string, "context.getString(R.stri…sult_orb_info1_highlight)");
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(d10), 0, string.length(), 33);
            String string2 = context.getString(f1.text_result_orb_info1);
            p.g(string2, "context.getString(R.string.text_result_orb_info1)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            int U = o.U(string2, string, 0, false, 6, null);
            spannableStringBuilder.replace(U, string.length() + U, (CharSequence) spannableString);
            return spannableStringBuilder;
        } else if (this.isEligible > 0) {
            String obj = DateFormat.format(context.getString(f1.text_result_orb_info2_dateformat), new Date(this.calculatedAt.intValue() * 1000)).toString();
            SpannableString spannableString2 = new SpannableString(obj);
            spannableString2.setSpan(new ForegroundColorSpan(d10), 0, obj.length(), 33);
            String string3 = context.getString(f1.text_result_orb_info2, obj);
            p.g(string3, "context.getString(R.stri…sult_orb_info2, dateText)");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string3);
            int U2 = o.U(string3, obj, 0, false, 6, null);
            spannableStringBuilder2.replace(U2, obj.length() + U2, (CharSequence) spannableString2);
            return spannableStringBuilder2;
        } else {
            String string4 = context.getString(f1.text_result_orb_info3);
            p.g(string4, "context.getString(R.string.text_result_orb_info3)");
            return new SpannableStringBuilder(string4);
        }
    }

    public final Integer component1() {
        return this.calculatedAt;
    }

    public final int component2() {
        return this.isEligible;
    }

    public final ReceivedDiamonds copy(Integer num, int i10) {
        return new ReceivedDiamonds(num, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReceivedDiamonds) {
            ReceivedDiamonds receivedDiamonds = (ReceivedDiamonds) obj;
            return p.c(this.calculatedAt, receivedDiamonds.calculatedAt) && this.isEligible == receivedDiamonds.isEligible;
        }
        return false;
    }

    public final Integer getCalculatedAt() {
        return this.calculatedAt;
    }

    public final SpannableStringBuilder getDisplayString(final Context context) {
        p.h(context, "context");
        String string = context.getString(f1.text_cast_result_what_is_diamond);
        p.g(string, "context.getString(R.stri…t_result_what_is_diamond)");
        SpannableStringBuilder spannableStringBuilder = getSpannableStringBuilder(context);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.dena.mirrorman.net.api.response.live.ReceivedDiamonds$getDisplayString$1$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                p.h(view, "view");
                WebViewActivity.a aVar = WebViewActivity.X;
                Context context2 = view.getContext();
                p.g(context2, "view.context");
                view.getContext().startActivity(WebViewActivity.a.b(aVar, context2, MRUrl.Diamond.INSTANCE.getUrl(), false, false, 12, null));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                p.h(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(a.d(context, w0.f42242u0));
            }
        }, length, string.length() + length, 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) "ヘルプ");
        Matcher matcher = Pattern.compile("ヘルプ").matcher(spannableStringBuilder);
        Drawable f10 = a.f(context, y0.ic_help);
        if (f10 != null) {
            while (matcher.find()) {
                f10.setBounds(0, 0, f10.getIntrinsicWidth(), f10.getIntrinsicHeight());
                spannableStringBuilder.setSpan(new ImageSpan(f10, 0), matcher.start(), matcher.end(), 0);
            }
        }
        return spannableStringBuilder;
    }

    public int hashCode() {
        Integer num = this.calculatedAt;
        return ((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.isEligible);
    }

    public final int isEligible() {
        return this.isEligible;
    }

    public String toString() {
        return "ReceivedDiamonds(calculatedAt=" + this.calculatedAt + ", isEligible=" + this.isEligible + ')';
    }
}
