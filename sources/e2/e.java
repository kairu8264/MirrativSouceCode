package e2;

/* loaded from: classes.dex */
public final class e {
    public static final boolean b(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }
}
