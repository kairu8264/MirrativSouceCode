package ai;

/* loaded from: classes3.dex */
public abstract class in3 {
    public static in3 b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new dn3(cls.getSimpleName());
        }
        return new fn3(cls.getSimpleName());
    }

    public abstract void a(String str);
}
