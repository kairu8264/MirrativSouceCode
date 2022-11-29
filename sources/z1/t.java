package z1;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final wn.k<Integer, Integer> f62495a = new wn.k<>(0, 0);

    public static final wn.k<Integer, Integer> c(s sVar) {
        b2.f[] d10;
        int i10 = 0;
        int i11 = 0;
        for (b2.f fVar : d(sVar)) {
            if (fVar.b() < 0) {
                i10 = Math.max(i10, Math.abs(fVar.b()));
            }
            if (fVar.c() < 0) {
                i11 = Math.max(i10, Math.abs(fVar.c()));
            }
        }
        if (i10 == 0 && i11 == 0) {
            return f62495a;
        }
        return new wn.k<>(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static final b2.f[] d(s sVar) {
        if (sVar.z() instanceof Spanned) {
            b2.f[] fVarArr = (b2.f[]) ((Spanned) sVar.z()).getSpans(0, sVar.z().length(), b2.f.class);
            jo.p.g(fVarArr, "lineHeightStyleSpans");
            return fVarArr.length == 0 ? new b2.f[0] : fVarArr;
        }
        return new b2.f[0];
    }

    public static final TextDirectionHeuristic e(int i10) {
        if (i10 == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            jo.p.g(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        } else if (i10 == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            jo.p.g(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        } else if (i10 == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            jo.p.g(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i10 == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            jo.p.g(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i10 == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            jo.p.g(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i10 != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            jo.p.g(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            jo.p.g(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }

    public static final wn.k<Integer, Integer> f(s sVar) {
        if (!sVar.c() && !sVar.A()) {
            TextPaint paint = sVar.d().getPaint();
            CharSequence text = sVar.d().getText();
            jo.p.g(paint, "paint");
            jo.p.g(text, "text");
            Rect c10 = i.c(paint, text, sVar.d().getLineStart(0), sVar.d().getLineEnd(0));
            int lineAscent = sVar.d().getLineAscent(0);
            int i10 = c10.top;
            int topPadding = i10 < lineAscent ? lineAscent - i10 : sVar.d().getTopPadding();
            if (sVar.h() != 1) {
                int lineCount = sVar.d().getLineCount() - 1;
                c10 = i.c(paint, text, sVar.d().getLineStart(lineCount), sVar.d().getLineEnd(lineCount));
            }
            int lineDescent = sVar.d().getLineDescent(sVar.d().getLineCount() - 1);
            int i11 = c10.bottom;
            int bottomPadding = i11 > lineDescent ? i11 - lineDescent : sVar.d().getBottomPadding();
            if (topPadding == 0 && bottomPadding == 0) {
                return f62495a;
            }
            return new wn.k<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
        }
        return new wn.k<>(0, 0);
    }
}
