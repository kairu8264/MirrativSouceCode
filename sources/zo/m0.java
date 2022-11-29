package zo;

/* loaded from: classes4.dex */
public final /* synthetic */ class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f63308a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f63308a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
