package vb;

/* loaded from: classes2.dex */
public interface u {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(u uVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRewardPostResultDialogOnDismiss");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            uVar.H2(z10);
        }
    }

    void H2(boolean z10);
}
