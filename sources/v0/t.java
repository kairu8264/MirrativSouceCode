package v0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f56530a = new Object();

    public static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    public static final void e(int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
    }
}
