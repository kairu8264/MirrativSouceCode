package rh;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public class b {
    public static ApiException a(Status status) {
        if (status.U()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
