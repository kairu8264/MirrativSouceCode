package ab;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import l0.l1;
import x0.f;

/* loaded from: classes2.dex */
public final class v {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<Context, TextView> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SpannableString f841w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f842x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f843y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Typeface f844z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SpannableString spannableString, int i10, float f10, Typeface typeface) {
            super(1);
            this.f841w = spannableString;
            this.f842x = i10;
            this.f843y = f10;
            this.f844z = typeface;
        }

        @Override // io.l
        /* renamed from: a */
        public final TextView invoke(Context context) {
            jo.p.h(context, "it");
            TextView textView = new TextView(context);
            SpannableString spannableString = this.f841w;
            int i10 = this.f842x;
            float f10 = this.f843y;
            Typeface typeface = this.f844z;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
            textView.setTextColor(c3.a.d(textView.getContext(), i10));
            textView.setTextSize(f10);
            textView.setTypeface(typeface);
            return textView;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ Typeface A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SpannableString f845w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f846x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f847y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f848z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SpannableString spannableString, x0.f fVar, int i10, float f10, Typeface typeface, int i11, int i12) {
            super(2);
            this.f845w = spannableString;
            this.f846x = fVar;
            this.f847y = i10;
            this.f848z = f10;
            this.A = typeface;
            this.B = i11;
            this.C = i12;
        }

        public final void a(l0.i iVar, int i10) {
            v.a(this.f845w, this.f846x, this.f847y, this.f848z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(SpannableString spannableString, x0.f fVar, int i10, float f10, Typeface typeface, l0.i iVar, int i11, int i12) {
        Typeface typeface2;
        int i13;
        jo.p.h(spannableString, "text");
        l0.i h10 = iVar.h(1697682470);
        f.a aVar = (i12 & 2) != 0 ? x0.f.f59359u : fVar;
        float f11 = (i12 & 8) != 0 ? 14.0f : f10;
        if ((i12 & 16) != 0) {
            Typeface typeface3 = Typeface.DEFAULT;
            jo.p.g(typeface3, "DEFAULT");
            i13 = i11 & (-57345);
            typeface2 = typeface3;
        } else {
            typeface2 = typeface;
            i13 = i11;
        }
        o2.e.a(new a(spannableString, i10, f11, typeface2), aVar, null, h10, i13 & 112, 4);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(spannableString, aVar, i10, f11, typeface2, i11, i12));
    }
}
