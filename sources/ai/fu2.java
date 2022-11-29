package ai;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes3.dex */
public final class fu2 {
    public static pv2 a(Context context, int i10, int i11, String str, String str2, String str3, vt2 vt2Var) {
        return new eu2(context, 1, i11, str, str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, vt2Var).a(50000);
    }
}
