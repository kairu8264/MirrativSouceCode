package yg;

import ai.a44;
import ai.b44;
import ai.tj0;
import ai.z44;
import com.google.android.gms.internal.ads.zzvk;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m0 extends z44 {
    public final /* synthetic */ byte[] K;
    public final /* synthetic */ Map L;
    public final /* synthetic */ tj0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, int i10, String str, b44 b44Var, a44 a44Var, byte[] bArr, Map map, tj0 tj0Var) {
        super(i10, str, b44Var, a44Var);
        this.K = bArr;
        this.L = map;
        this.M = tj0Var;
    }

    @Override // ai.z44
    public final void F(String str) {
        this.M.e(str);
        super.F(str);
    }

    @Override // ai.w34
    public final Map<String, String> t() throws zzvk {
        Map<String, String> map = this.L;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // ai.w34
    public final byte[] u() throws zzvk {
        byte[] bArr = this.K;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // ai.w34
    public final /* bridge */ /* synthetic */ void z(String str) {
        F(str);
    }
}
