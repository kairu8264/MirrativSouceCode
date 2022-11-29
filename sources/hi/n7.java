package hi;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class n7 implements Comparator<u7> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(u7 u7Var, u7 u7Var2) {
        u7 u7Var3 = u7Var;
        u7 u7Var4 = u7Var2;
        l7 l7Var = new l7(u7Var3);
        l7 l7Var2 = new l7(u7Var4);
        while (l7Var.hasNext() && l7Var2.hasNext()) {
            int a10 = m7.a(l7Var.zza() & TagConstant.TAG_CAT_RESERVED, l7Var2.zza() & TagConstant.TAG_CAT_RESERVED);
            if (a10 != 0) {
                return a10;
            }
        }
        return m7.a(u7Var3.g(), u7Var4.g());
    }
}
