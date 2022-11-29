package ai;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class ds implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final Comparator f3386w = new ds();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List<String> list = rg.s.f51377e;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
