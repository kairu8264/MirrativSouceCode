package a2;

import java.text.BreakIterator;
import java.util.Locale;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f362e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f363a;

    /* renamed from: b  reason: collision with root package name */
    public final int f364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f365c;

    /* renamed from: d  reason: collision with root package name */
    public final BreakIterator f366d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public b(CharSequence charSequence, int i10, int i11, Locale locale) {
        p.h(charSequence, "charSequence");
        this.f363a = charSequence;
        boolean z10 = true;
        if (i10 >= 0 && i10 <= charSequence.length()) {
            if ((i11 < 0 || i11 > charSequence.length()) ? false : z10) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                p.g(wordInstance, "getWordInstance(locale)");
                this.f366d = wordInstance;
                this.f364b = Math.max(0, i10 - 50);
                this.f365c = Math.min(charSequence.length(), i11 + 50);
                wordInstance.setText(new z1.b(charSequence, i10, i11));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    public final void a(int i10) {
        int i11 = this.f364b;
        boolean z10 = false;
        if (i10 <= this.f365c && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.f364b + " , " + this.f365c + ']').toString());
    }

    public final int b(int i10, boolean z10) {
        a(i10);
        if (j(i10)) {
            return (!this.f366d.isBoundary(i10) || (h(i10) && z10)) ? this.f366d.preceding(i10) : i10;
        } else if (h(i10)) {
            return this.f366d.preceding(i10);
        } else {
            return -1;
        }
    }

    public final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            return (!this.f366d.isBoundary(i10) || (j(i10) && z10)) ? this.f366d.following(i10) : i10;
        } else if (j(i10)) {
            return this.f366d.following(i10);
        } else {
            return -1;
        }
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !m(i10)) {
            i10 = o(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !l(i10)) {
            i10 = n(i10);
        }
        return i10;
    }

    public final boolean h(int i10) {
        return (i10 <= this.f365c && this.f364b + 1 <= i10) && Character.isLetterOrDigit(Character.codePointBefore(this.f363a, i10));
    }

    public final boolean i(int i10) {
        boolean z10 = true;
        int i11 = this.f364b + 1;
        if (i10 > this.f365c || i11 > i10) {
            z10 = false;
        }
        if (z10) {
            return f362e.a(Character.codePointBefore(this.f363a, i10));
        }
        return false;
    }

    public final boolean j(int i10) {
        return (i10 < this.f365c && this.f364b <= i10) && Character.isLetterOrDigit(Character.codePointAt(this.f363a, i10));
    }

    public final boolean k(int i10) {
        if (i10 < this.f365c && this.f364b <= i10) {
            return f362e.a(Character.codePointAt(this.f363a, i10));
        }
        return false;
    }

    public final boolean l(int i10) {
        return !k(i10) && i(i10);
    }

    public final boolean m(int i10) {
        return k(i10) && !i(i10);
    }

    public final int n(int i10) {
        a(i10);
        return this.f366d.following(i10);
    }

    public final int o(int i10) {
        a(i10);
        return this.f366d.preceding(i10);
    }
}
