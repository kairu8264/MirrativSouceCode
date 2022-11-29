package ai;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class cr3 implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final Comparator f2919w = new cr3();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int i10 = or3.f7893h;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }
}
