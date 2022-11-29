package jf;

/* loaded from: classes2.dex */
public enum j {
    INITIALIZED,
    ACCEPTED,
    CONNECTED,
    CLOSED;

    public final boolean c() {
        return this == ACCEPTED;
    }

    public final boolean e() {
        return this == CLOSED;
    }

    public final boolean h() {
        return this == CONNECTED;
    }
}
