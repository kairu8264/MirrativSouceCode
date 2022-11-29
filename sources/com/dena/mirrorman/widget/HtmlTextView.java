package com.dena.mirrorman.widget;

import android.content.Context;
import android.text.Html;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jo.h;
import jo.p;
import of.n;
import so.o;

/* loaded from: classes3.dex */
public final class HtmlTextView extends AppCompatTextView {

    /* renamed from: y  reason: collision with root package name */
    public static final a f26348y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f26349z = 8;

    /* renamed from: w  reason: collision with root package name */
    public boolean f26350w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f26351x;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends ClickableSpan {

        /* renamed from: w  reason: collision with root package name */
        public final String f26352w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ HtmlTextView f26353x;

        public b(HtmlTextView htmlTextView, String str) {
            p.h(str, "url");
            this.f26353x = htmlTextView;
            this.f26352w = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            p.h(view, "view");
            n.r(this.f26353x.getContext(), this.f26352w);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HtmlTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ HtmlTextView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final SpannableString c(String str) {
        return new SpannableString(Html.fromHtml(str, 0));
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        if (i10 != -1 && i11 != -1) {
            super.onSelectionChanged(i10, i11);
            return;
        }
        CharSequence text = getText();
        if (text instanceof Spannable) {
            Selection.setSelection((Spannable) text, 0, 0);
        }
    }

    public final void setHtml(boolean z10) {
        this.f26351x = z10;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        SpannableString spannableString;
        p.h(charSequence, "text");
        p.h(bufferType, "type");
        String obj = charSequence.toString();
        if (this.f26351x) {
            spannableString = c(obj);
        } else {
            spannableString = new SpannableString(obj);
        }
        if (o.H(obj, "https", false, 2, null) || o.H(obj, "ftp", false, 2, null)) {
            Matcher matcher = Pattern.compile("((?:https?|ftp):\\/\\/[^\\s\u3000]+)").matcher(spannableString.toString());
            while (matcher.find()) {
                String group = matcher.group();
                int start = matcher.start();
                int end = matcher.end();
                p.g(group, "url");
                spannableString.setSpan(new b(this, group), start, end, 0);
                this.f26350w = true;
            }
        }
        super.setText(spannableString, bufferType);
        super.setMovementMethod(new LinkMovementMethod());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        setTextIsSelectable(true);
    }
}
