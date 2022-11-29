package z1;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class g {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        jo.p.h(charSequence, "text");
        jo.p.h(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new b(charSequence, 0, charSequence.length()));
        PriorityQueue<wn.k> priorityQueue = new PriorityQueue(10, f.f62453w);
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new wn.k(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                wn.k kVar = (wn.k) priorityQueue.peek();
                if (kVar != null && ((Number) kVar.d()).intValue() - ((Number) kVar.c()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new wn.k(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float f10 = 0.0f;
        for (wn.k kVar2 : priorityQueue) {
            f10 = Math.max(f10, Layout.getDesiredWidth(charSequence, ((Number) kVar2.a()).intValue(), ((Number) kVar2.b()).intValue(), textPaint));
        }
        return f10;
    }

    public static final int d(wn.k kVar, wn.k kVar2) {
        return (((Number) kVar.d()).intValue() - ((Number) kVar.c()).intValue()) - (((Number) kVar2.d()).intValue() - ((Number) kVar2.c()).intValue());
    }

    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (!(f10 == 0.0f) && (charSequence instanceof Spanned)) {
            if (!(textPaint.getLetterSpacing() == 0.0f)) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (j.a(spanned, b2.d.class) || j.a(spanned, b2.c.class)) {
                return true;
            }
        }
        return false;
    }
}
