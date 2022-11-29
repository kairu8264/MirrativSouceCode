package ai;

/* loaded from: classes3.dex */
public final class je3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ui3<je3> f5712a = new ie3();

    public static int a(int i10) {
        if (i10 != 1) {
            return i10 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return i10 != 4 ? 0 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }
}
