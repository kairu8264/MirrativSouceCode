package androidx.compose.ui.platform;

import com.dena.mirrorman.clientlog.logs.LogBase;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f14390d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f14391e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static c f14392f;

    /* renamed from: c  reason: collision with root package name */
    public BreakIterator f14393c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(Locale locale) {
            jo.p.h(locale, LogBase.LOCALE);
            if (c.f14392f == null) {
                c.f14392f = new c(locale, null);
            }
            c cVar = c.f14392f;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return cVar;
        }
    }

    public c(Locale locale) {
        i(locale);
    }

    public /* synthetic */ c(Locale locale, jo.h hVar) {
        this(locale);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        int length = d().length();
        if (length > 0 && i10 < length) {
            if (i10 < 0) {
                i10 = 0;
            }
            do {
                BreakIterator breakIterator = this.f14393c;
                if (breakIterator == null) {
                    jo.p.v("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f14393c;
                    if (breakIterator2 == null) {
                        jo.p.v("impl");
                        breakIterator2 = null;
                    }
                    i10 = breakIterator2.following(i10);
                } else {
                    BreakIterator breakIterator3 = this.f14393c;
                    if (breakIterator3 == null) {
                        jo.p.v("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i10);
                    if (following == -1) {
                        return null;
                    }
                    return c(i10, following);
                }
            } while (i10 != -1);
            return null;
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
            do {
                BreakIterator breakIterator = this.f14393c;
                if (breakIterator == null) {
                    jo.p.v("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f14393c;
                    if (breakIterator2 == null) {
                        jo.p.v("impl");
                        breakIterator2 = null;
                    }
                    i10 = breakIterator2.preceding(i10);
                } else {
                    BreakIterator breakIterator3 = this.f14393c;
                    if (breakIterator3 == null) {
                        jo.p.v("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i10);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, i10);
                }
            } while (i10 != -1);
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String str) {
        jo.p.h(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.f14393c;
        if (breakIterator == null) {
            jo.p.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final void i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        jo.p.g(characterInstance, "getCharacterInstance(locale)");
        this.f14393c = characterInstance;
    }
}
