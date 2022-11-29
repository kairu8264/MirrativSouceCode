package zn;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Comparator;
import jo.p;

/* loaded from: classes4.dex */
public final class d implements Comparator<Comparable<? super Object>> {

    /* renamed from: w  reason: collision with root package name */
    public static final d f63270w = new d();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        p.h(comparable, TopicConstant.EXTEND_LIPMETA_A);
        p.h(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return c.f63269w;
    }
}
