package ai;

/* loaded from: classes3.dex */
public final class jg3 {
    public static boolean a() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static int b() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }
}
