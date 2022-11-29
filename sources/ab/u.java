package ab;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f839a = new u();

    /* loaded from: classes2.dex */
    public static final class a extends sf.a {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f840x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar, int i10) {
            super(i10);
            this.f840x = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            jo.p.h(view, "textView");
            this.f840x.invoke();
        }
    }

    public final SpannableString a(Context context, String str, String str2, io.a<wn.v> aVar) {
        jo.p.h(context, "context");
        jo.p.h(str, "text");
        jo.p.h(str2, "highlightWord");
        jo.p.h(aVar, "onClickHandler");
        int U = so.o.U(str, str2, 0, false, 6, null);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new a(aVar, c3.a.d(context, wa.c.f58520l)), U, str2.length() + U, 33);
        return spannableString;
    }
}
