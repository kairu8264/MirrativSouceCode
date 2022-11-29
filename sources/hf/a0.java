package hf;

import com.dena.mirrorman.net.api.response.user.UserMe;

/* loaded from: classes2.dex */
public interface a0 {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ Object a(a0 a0Var, String str, boolean z10, ao.d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return a0Var.a(str, z10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    Object a(String str, boolean z10, ao.d<? super UserMe> dVar);
}
