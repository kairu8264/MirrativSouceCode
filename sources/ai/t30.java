package ai;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t30 implements r30<rp0> {

    /* renamed from: a  reason: collision with root package name */
    public final u30 f10087a;

    public t30(u30 u30Var, byte[] bArr) {
        this.f10087a = u30Var;
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("transparentBackground"));
        boolean equals2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            uj0.d("Fail to parse float", e10);
        }
        this.f10087a.a(equals);
        this.f10087a.b(equals2, f10);
        rp0Var2.n0(equals);
    }
}
