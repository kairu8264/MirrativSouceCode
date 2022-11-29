package kk;

/* loaded from: classes3.dex */
public abstract class c implements k<Character> {

    /* loaded from: classes3.dex */
    public static abstract class a extends c {
        @Override // kk.k
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final char f38834a;

        public b(char c10) {
            this.f38834a = c10;
        }

        @Override // kk.c
        public boolean e(char c10) {
            return c10 == this.f38834a;
        }

        public String toString() {
            return "CharMatcher.is('" + c.g(this.f38834a) + "')";
        }
    }

    /* renamed from: kk.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0548c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f38835a;

        public AbstractC0548c(String str) {
            this.f38835a = (String) j.i(str);
        }

        public final String toString() {
            return this.f38835a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends AbstractC0548c {

        /* renamed from: b  reason: collision with root package name */
        public static final d f38836b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // kk.c
        public int c(CharSequence charSequence, int i10) {
            j.k(i10, charSequence.length());
            return -1;
        }

        @Override // kk.c
        public boolean e(char c10) {
            return false;
        }
    }

    public static c d(char c10) {
        return new b(c10);
    }

    public static c f() {
        return d.f38836b;
    }

    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        j.k(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
