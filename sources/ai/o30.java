package ai;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        if (map.keySet().contains(TtmlNode.START)) {
            rp0Var2.i0().i();
        } else if (map.keySet().contains("stop")) {
            rp0Var2.i0().j();
        } else if (map.keySet().contains("cancel")) {
            rp0Var2.i0().k();
        }
    }
}
