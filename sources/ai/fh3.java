package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class fh3 implements Comparator<oh3> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(oh3 oh3Var, oh3 oh3Var2) {
        oh3 oh3Var3 = oh3Var;
        oh3 oh3Var4 = oh3Var2;
        ih3 it = oh3Var3.iterator();
        ih3 it2 = oh3Var4.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = Integer.compare(it.zza() & TagConstant.TAG_CAT_RESERVED, it2.zza() & TagConstant.TAG_CAT_RESERVED);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(oh3Var3.p(), oh3Var4.p());
    }
}
