package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class m {
    public static final y1.a a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new y1.a(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        jo.p.g(annotationArr, "annotations");
        int L = xn.o.L(annotationArr);
        if (L >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (jo.p.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    jo.p.g(value, "span.value");
                    arrayList.add(new a.b(new p0(value).k(), spanStart, spanEnd));
                }
                if (i10 == L) {
                    break;
                }
                i10++;
            }
        }
        return new y1.a(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(y1.a aVar) {
        jo.p.h(aVar, "<this>");
        if (aVar.e().isEmpty()) {
            return aVar.g();
        }
        SpannableString spannableString = new SpannableString(aVar.g());
        v0 v0Var = new v0();
        List<a.b<y1.v>> e10 = aVar.e();
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b<y1.v> bVar = e10.get(i10);
            int b10 = bVar.b();
            int c10 = bVar.c();
            v0Var.q();
            v0Var.i(bVar.a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", v0Var.p()), b10, c10, 33);
        }
        return spannableString;
    }
}
