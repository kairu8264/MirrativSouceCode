package m3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class d implements Spannable {

    /* renamed from: z  reason: collision with root package name */
    public static final Object f40571z = new Object();

    /* renamed from: w  reason: collision with root package name */
    public final Spannable f40572w;

    /* renamed from: x  reason: collision with root package name */
    public final a f40573x;

    /* renamed from: y  reason: collision with root package name */
    public final PrecomputedText f40574y;

    public a a() {
        return this.f40573x;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f40572w;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f40572w.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f40572w.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f40572w.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f40572w.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f40574y.getSpans(i10, i11, cls);
        }
        return (T[]) this.f40572w.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f40572w.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f40572w.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f40574y.removeSpan(obj);
                return;
            } else {
                this.f40572w.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f40574y.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.f40572w.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f40572w.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f40572w.toString();
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f40575a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f40576b;

        /* renamed from: c  reason: collision with root package name */
        public final int f40577c;

        /* renamed from: d  reason: collision with root package name */
        public final int f40578d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f40579e;

        /* renamed from: m3.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0589a {

            /* renamed from: a  reason: collision with root package name */
            public final TextPaint f40580a;

            /* renamed from: b  reason: collision with root package name */
            public TextDirectionHeuristic f40581b;

            /* renamed from: c  reason: collision with root package name */
            public int f40582c;

            /* renamed from: d  reason: collision with root package name */
            public int f40583d;

            public C0589a(TextPaint textPaint) {
                this.f40580a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f40582c = 1;
                    this.f40583d = 1;
                } else {
                    this.f40583d = 0;
                    this.f40582c = 0;
                }
                if (i10 >= 18) {
                    this.f40581b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f40581b = null;
                }
            }

            public a a() {
                return new a(this.f40580a, this.f40581b, this.f40582c, this.f40583d);
            }

            public C0589a b(int i10) {
                this.f40582c = i10;
                return this;
            }

            public C0589a c(int i10) {
                this.f40583d = i10;
                return this;
            }

            public C0589a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f40581b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f40579e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f40579e = null;
            }
            this.f40575a = textPaint;
            this.f40576b = textDirectionHeuristic;
            this.f40577c = i10;
            this.f40578d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 23 || (this.f40577c == aVar.b() && this.f40578d == aVar.c())) && this.f40575a.getTextSize() == aVar.e().getTextSize() && this.f40575a.getTextScaleX() == aVar.e().getTextScaleX() && this.f40575a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i10 < 21 || (this.f40575a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f40575a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) && this.f40575a.getFlags() == aVar.e().getFlags()) {
                    if (i10 >= 24) {
                        if (!this.f40575a.getTextLocales().equals(aVar.e().getTextLocales())) {
                            return false;
                        }
                    } else if (i10 >= 17 && !this.f40575a.getTextLocale().equals(aVar.e().getTextLocale())) {
                        return false;
                    }
                    return this.f40575a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f40575a.getTypeface().equals(aVar.e().getTypeface());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.f40577c;
        }

        public int c() {
            return this.f40578d;
        }

        public TextDirectionHeuristic d() {
            return this.f40576b;
        }

        public TextPaint e() {
            return this.f40575a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a(aVar)) {
                    return Build.VERSION.SDK_INT < 18 || this.f40576b == aVar.d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return n3.c.b(Float.valueOf(this.f40575a.getTextSize()), Float.valueOf(this.f40575a.getTextScaleX()), Float.valueOf(this.f40575a.getTextSkewX()), Float.valueOf(this.f40575a.getLetterSpacing()), Integer.valueOf(this.f40575a.getFlags()), this.f40575a.getTextLocales(), this.f40575a.getTypeface(), Boolean.valueOf(this.f40575a.isElegantTextHeight()), this.f40576b, Integer.valueOf(this.f40577c), Integer.valueOf(this.f40578d));
            }
            if (i10 >= 21) {
                return n3.c.b(Float.valueOf(this.f40575a.getTextSize()), Float.valueOf(this.f40575a.getTextScaleX()), Float.valueOf(this.f40575a.getTextSkewX()), Float.valueOf(this.f40575a.getLetterSpacing()), Integer.valueOf(this.f40575a.getFlags()), this.f40575a.getTextLocale(), this.f40575a.getTypeface(), Boolean.valueOf(this.f40575a.isElegantTextHeight()), this.f40576b, Integer.valueOf(this.f40577c), Integer.valueOf(this.f40578d));
            }
            if (i10 >= 18) {
                return n3.c.b(Float.valueOf(this.f40575a.getTextSize()), Float.valueOf(this.f40575a.getTextScaleX()), Float.valueOf(this.f40575a.getTextSkewX()), Integer.valueOf(this.f40575a.getFlags()), this.f40575a.getTextLocale(), this.f40575a.getTypeface(), this.f40576b, Integer.valueOf(this.f40577c), Integer.valueOf(this.f40578d));
            }
            if (i10 >= 17) {
                return n3.c.b(Float.valueOf(this.f40575a.getTextSize()), Float.valueOf(this.f40575a.getTextScaleX()), Float.valueOf(this.f40575a.getTextSkewX()), Integer.valueOf(this.f40575a.getFlags()), this.f40575a.getTextLocale(), this.f40575a.getTypeface(), this.f40576b, Integer.valueOf(this.f40577c), Integer.valueOf(this.f40578d));
            }
            return n3.c.b(Float.valueOf(this.f40575a.getTextSize()), Float.valueOf(this.f40575a.getTextScaleX()), Float.valueOf(this.f40575a.getTextSkewX()), Integer.valueOf(this.f40575a.getFlags()), this.f40575a.getTypeface(), this.f40576b, Integer.valueOf(this.f40577c), Integer.valueOf(this.f40578d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f40575a.getTextSize());
            sb2.append(", textScaleX=" + this.f40575a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f40575a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                sb2.append(", letterSpacing=" + this.f40575a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f40575a.isElegantTextHeight());
            }
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f40575a.getTextLocales());
            } else if (i10 >= 17) {
                sb2.append(", textLocale=" + this.f40575a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f40575a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f40575a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f40576b);
            sb2.append(", breakStrategy=" + this.f40577c);
            sb2.append(", hyphenationFrequency=" + this.f40578d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f40575a = params.getTextPaint();
            this.f40576b = params.getTextDirection();
            this.f40577c = params.getBreakStrategy();
            this.f40578d = params.getHyphenationFrequency();
            this.f40579e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
