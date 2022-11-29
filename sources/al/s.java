package al;

/* loaded from: classes2.dex */
public enum s {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f13877id;

    s(int i10) {
        this.f13877id = i10;
    }

    public static s a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int c() {
        return this.f13877id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f13877id);
    }
}
