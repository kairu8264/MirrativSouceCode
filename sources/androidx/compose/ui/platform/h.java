package androidx.compose.ui.platform;

import com.dena.mirrorman.clientlog.logs.LogBase;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f14456d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f14457e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static h f14458f;

    /* renamed from: c  reason: collision with root package name */
    public BreakIterator f14459c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(Locale locale) {
            jo.p.h(locale, LogBase.LOCALE);
            if (h.f14458f == null) {
                h.f14458f = new h(locale, null);
            }
            h hVar = h.f14458f;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return hVar;
        }
    }

    public h(Locale locale) {
        l(locale);
    }

    public /* synthetic */ h(Locale locale, jo.h hVar) {
        this(locale);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        if (d().length() > 0 && i10 < d().length()) {
            if (i10 < 0) {
                i10 = 0;
            }
            while (!j(i10) && !k(i10)) {
                BreakIterator breakIterator = this.f14459c;
                if (breakIterator == null) {
                    jo.p.v("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f14459c;
            if (breakIterator2 == null) {
                jo.p.v("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i10);
            if (following == -1 || !i(following)) {
                return null;
            }
            return c(i10, following);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i10) {
        int length = d().length();
        if (length > 0 && i10 > 0) {
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
                BreakIterator breakIterator = this.f14459c;
                if (breakIterator == null) {
                    jo.p.v("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f14459c;
            if (breakIterator2 == null) {
                jo.p.v("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i10);
            if (preceding == -1 || !k(preceding)) {
                return null;
            }
            return c(preceding, i10);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String str) {
        jo.p.h(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.f14459c;
        if (breakIterator == null) {
            jo.p.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final boolean i(int i10) {
        return i10 > 0 && j(i10 + (-1)) && (i10 == d().length() || !j(i10));
    }

    public final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    public final boolean k(int i10) {
        return j(i10) && (i10 == 0 || !j(i10 - 1));
    }

    public final void l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        jo.p.g(wordInstance, "getWordInstance(locale)");
        this.f14459c = wordInstance;
    }
}
