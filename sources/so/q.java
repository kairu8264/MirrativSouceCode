package so;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class q extends p {
    public static final String M0(String str, int i10) {
        jo.p.h(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(po.n.i(i10, str.length()));
            jo.p.g(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final String N0(String str, int i10) {
        jo.p.h(str, "<this>");
        if (i10 >= 0) {
            return S0(str, po.n.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final char O0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character P0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final Character Q0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final CharSequence R0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        jo.p.g(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    public static final String S0(String str, int i10) {
        jo.p.h(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, po.n.i(i10, str.length()));
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final String T0(String str, int i10) {
        jo.p.h(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String substring = str.substring(length - po.n.i(i10, length));
            jo.p.g(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
