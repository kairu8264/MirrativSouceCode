package zn;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Comparator;
import jo.p;

/* loaded from: classes4.dex */
public final class c implements Comparator<Comparable<? super Object>> {

    /* renamed from: w  reason: collision with root package name */
    public static final c f63269w = new c();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        p.h(comparable, TopicConstant.EXTEND_LIPMETA_A);
        p.h(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return d.f63270w;
    }
}
