package ph;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public class o {
    public static <TResult> void a(Status status, TResult tresult, vi.h<TResult> hVar) {
        if (status.k0()) {
            hVar.c(tresult);
        } else {
            hVar.b(new ApiException(status));
        }
    }
}
