package com.dena.mirrorman.widget;

import android.content.Context;
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
public final class AutoLinkTextView extends AppCompatTextView {

    /* renamed from: w  reason: collision with root package name */
    public boolean f26337w;

    /* renamed from: x  reason: collision with root package name */
    public final String f26338x;

    /* loaded from: classes3.dex */
    public final class a extends ClickableSpan {

        /* renamed from: w  reason: collision with root package name */
        public final String f26339w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AutoLinkTextView f26340x;

        public a(AutoLinkTextView autoLinkTextView, String str) {
            p.h(str, "url");
            this.f26340x = autoLinkTextView;
            this.f26339w = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            p.h(view, "view");
            n.r(this.f26340x.getContext(), this.f26339w);
        }
    }

    public AutoLinkTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLinkTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.e(context);
        this.f26338x = "((?:https?|ftp):\\/\\/[^\\s\u3000]+)";
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        p.h(charSequence, "text");
        p.h(bufferType, "type");
        this.f26337w = false;
        String obj = charSequence.toString();
        SpannableString spannableString = new SpannableString(obj);
        if (o.H(obj, "https", false, 2, null) || o.H(obj, "ftp", false, 2, null)) {
            Matcher matcher = Pattern.compile(this.f26338x).matcher(obj);
            while (matcher.find()) {
                String group = matcher.group();
                int start = matcher.start();
                int end = matcher.end();
                p.g(group, "url");
                spannableString.setSpan(new a(this, group), start, end, 0);
                this.f26337w = true;
            }
        }
        super.setText(spannableString, bufferType);
        super.setMovementMethod(new LinkMovementMethod());
    }

    public /* synthetic */ AutoLinkTextView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
