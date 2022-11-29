package a1;

/* loaded from: classes.dex */
public interface g {
    static /* synthetic */ void b(g gVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        gVar.c(z10);
    }

    boolean a(int i10);

    void c(boolean z10);
}
