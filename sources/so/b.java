package so;

/* loaded from: classes4.dex */
public class b extends a {
    public static final boolean d(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (z10) {
            char upperCase = Character.toUpperCase(c10);
            char upperCase2 = Character.toUpperCase(c11);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }
}
