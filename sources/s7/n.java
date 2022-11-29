package s7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final m7.e f52264a;

        /* renamed from: b  reason: collision with root package name */
        public final List<m7.e> f52265b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f52266c;

        public a(m7.e eVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public a(m7.e eVar, List<m7.e> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f52264a = (m7.e) i8.j.d(eVar);
            this.f52265b = (List) i8.j.d(list);
            this.f52266c = (com.bumptech.glide.load.data.d) i8.j.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, m7.h hVar);
}
