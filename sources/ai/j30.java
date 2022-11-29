package ai;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0Var.F0(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("custom_close")));
    }
}
